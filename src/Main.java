import java.util.Scanner;  
  
// Main.java  
public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int numStudents = 0;  
        System.out.print("Enter the number of students: ");  
        numStudents = scanner.nextInt();  
  
        Student[] students = new Student[numStudents];  
  
        for (int i = 0; i < numStudents; i++) {  
            System.out.print("Enter student ID for student " + (i + 1) + ": ");  
            String studentID = scanner.next();  
            System.out.print("Enter student name for student " + (i + 1) + ": ");  
            String studentName = scanner.next();  
            System.out.print("Enter the number of extra activities for student " + (i + 1) + ": ");  
            int numExtraActivities = scanner.nextInt();  
  
            students[i] = new Student(studentID, studentName, numExtraActivities);  
  
            for (int j = 0; j < numExtraActivities; j++) {  
                System.out.print("Enter extra activity " + (j + 1) + " for student " + (i + 1) + ": ");  
                students[i].addExtraActivity(j, scanner.next());  
            }  
        }  
  
        System.out.println("Student Details:");  
        for (Student student : students) {  
            System.out.println(student);  
        }  
  
        scanner.close();  
    }  
}