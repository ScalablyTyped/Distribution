package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a single test to be executed in a single environment.
  */
@js.native
trait SchemaTestExecution extends js.Object {
  
  /**
    * Output only. How the host machine(s) are configured.
    */
  var environment: js.UndefOr[SchemaEnvironment] = js.native
  
  /**
    * Output only. Unique id set by the backend.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Output only. Id of the containing TestMatrix.
    */
  var matrixId: js.UndefOr[String] = js.native
  
  /**
    * Output only. The cloud project that owns the test execution.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Output only. Indicates the current progress of the test execution (e.g.,
    * FINISHED).
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Output only. Additional details about the running test.
    */
  var testDetails: js.UndefOr[SchemaTestDetails] = js.native
  
  /**
    * Output only. How to run the test.
    */
  var testSpecification: js.UndefOr[SchemaTestSpecification] = js.native
  
  /**
    * Output only. The time this test execution was initially created.
    */
  var timestamp: js.UndefOr[String] = js.native
  
  /**
    * Output only. Where the results for this execution are written.
    */
  var toolResultsStep: js.UndefOr[SchemaToolResultsStep] = js.native
}
object SchemaTestExecution {
  
  @scala.inline
  def apply(): SchemaTestExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestExecution]
  }
  
  @scala.inline
  implicit class SchemaTestExecutionOps[Self <: SchemaTestExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnvironment(value: SchemaEnvironment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMatrixId(value: String): Self = this.set("matrixId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatrixId: Self = this.set("matrixId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTestDetails(value: SchemaTestDetails): Self = this.set("testDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestDetails: Self = this.set("testDetails", js.undefined)
    
    @scala.inline
    def setTestSpecification(value: SchemaTestSpecification): Self = this.set("testSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSpecification: Self = this.set("testSpecification", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setToolResultsStep(value: SchemaToolResultsStep): Self = this.set("toolResultsStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolResultsStep: Self = this.set("toolResultsStep", js.undefined)
  }
}
