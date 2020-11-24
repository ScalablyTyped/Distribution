package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Execution represents a collection of Steps. For instance, it could
  * represent: - a mobile test executed across a range of device configurations
  * - a jenkins job with a build step followed by a test step  The maximum size
  * of an execution message is 1 MiB.  An Execution can be updated until its
  * state is set to COMPLETE at which point it becomes immutable.
  */
@js.native
trait SchemaExecution extends js.Object {
  
  /**
    * The time when the Execution status transitioned to COMPLETE.  This value
    * will be set automatically when state transitions to COMPLETE.  - In
    * response: set if the execution state is COMPLETE. - In create/update
    * request: never set
    */
  var completionTime: js.UndefOr[SchemaTimestamp] = js.native
  
  /**
    * The time when the Execution was created.  This value will be set
    * automatically when CreateExecution is called.  - In response: always set
    * - In create/update request: never set
    */
  var creationTime: js.UndefOr[SchemaTimestamp] = js.native
  
  /**
    * A unique identifier within a History for this Execution.  Returns
    * INVALID_ARGUMENT if this field is set or overwritten by the caller.  - In
    * response always set - In create/update request: never set
    */
  var executionId: js.UndefOr[String] = js.native
  
  /**
    * Classify the result, for example into SUCCESS or FAILURE  - In response:
    * present if set by create/update request - In create/update request:
    * optional
    */
  var outcome: js.UndefOr[SchemaOutcome] = js.native
  
  /**
    * Lightweight information about execution request.  - In response: present
    * if set by create - In create: optional - In update: optional
    */
  var specification: js.UndefOr[SchemaSpecification] = js.native
  
  /**
    * The initial state is IN_PROGRESS.  The only legal state transitions is
    * from IN_PROGRESS to COMPLETE.  A PRECONDITION_FAILED will be returned if
    * an invalid transition is requested.  The state can only be set to
    * COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set
    * to COMPLETE multiple times.  If the state is set to COMPLETE, all the
    * in-progress steps within the execution will be set as COMPLETE. If the
    * outcome of the step is not set, the outcome will be set to INCONCLUSIVE.
    * - In response always set - In create/update request: optional
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * TestExecution Matrix ID that the TestExecutionService uses.  - In
    * response: present if set by create - In create: optional - In update:
    * never set
    */
  var testExecutionMatrixId: js.UndefOr[String] = js.native
}
object SchemaExecution {
  
  @scala.inline
  def apply(): SchemaExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecution]
  }
  
  @scala.inline
  implicit class SchemaExecutionOps[Self <: SchemaExecution] (val x: Self) extends AnyVal {
    
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
    def setCompletionTime(value: SchemaTimestamp): Self = this.set("completionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionTime: Self = this.set("completionTime", js.undefined)
    
    @scala.inline
    def setCreationTime(value: SchemaTimestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = this.set("executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    
    @scala.inline
    def setOutcome(value: SchemaOutcome): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    
    @scala.inline
    def setSpecification(value: SchemaSpecification): Self = this.set("specification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecification: Self = this.set("specification", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTestExecutionMatrixId(value: String): Self = this.set("testExecutionMatrixId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestExecutionMatrixId: Self = this.set("testExecutionMatrixId", js.undefined)
  }
}
