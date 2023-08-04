package mx.com.interview.spring.springexercise.service;

import mx.com.interview.spring.springexercise.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee getEmployee(String id){
        return Employee.builder()
                .id("1023")
                .name("Name")
                .address("Some Address 1")
                .email("some@email.com")
                .build();
    }


}
