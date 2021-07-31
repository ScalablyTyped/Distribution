package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a single test to be executed in a single environment.
  */
trait SchemaTestExecution extends StObject {
  
  /**
    * Output only. How the host machine(s) are configured.
    */
  var environment: js.UndefOr[SchemaEnvironment] = js.undefined
  
  /**
    * Output only. Unique id set by the backend.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Id of the containing TestMatrix.
    */
  var matrixId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The cloud project that owns the test execution.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Indicates the current progress of the test execution (e.g.,
    * FINISHED).
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Additional details about the running test.
    */
  var testDetails: js.UndefOr[SchemaTestDetails] = js.undefined
  
  /**
    * Output only. How to run the test.
    */
  var testSpecification: js.UndefOr[SchemaTestSpecification] = js.undefined
  
  /**
    * Output only. The time this test execution was initially created.
    */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Where the results for this execution are written.
    */
  var toolResultsStep: js.UndefOr[SchemaToolResultsStep] = js.undefined
}
object SchemaTestExecution {
  
  @scala.inline
  def apply(): SchemaTestExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestExecution]
  }
  
  @scala.inline
  implicit class SchemaTestExecutionMutableBuilder[Self <: SchemaTestExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: SchemaEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMatrixId(value: String): Self = StObject.set(x, "matrixId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixIdUndefined: Self = StObject.set(x, "matrixId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTestDetails(value: SchemaTestDetails): Self = StObject.set(x, "testDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestDetailsUndefined: Self = StObject.set(x, "testDetails", js.undefined)
    
    @scala.inline
    def setTestSpecification(value: SchemaTestSpecification): Self = StObject.set(x, "testSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSpecificationUndefined: Self = StObject.set(x, "testSpecification", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setToolResultsStep(value: SchemaToolResultsStep): Self = StObject.set(x, "toolResultsStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolResultsStepUndefined: Self = StObject.set(x, "toolResultsStep", js.undefined)
  }
}
