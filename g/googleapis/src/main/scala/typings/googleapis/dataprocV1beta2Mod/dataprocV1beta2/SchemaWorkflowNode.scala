package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The workflow node.
  */
@js.native
trait SchemaWorkflowNode extends js.Object {
  
  /**
    * Output only. The error detail.
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * Output only. The job id; populated after the node enters RUNNING state.
    */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * Output only. Node&#39;s prerequisite nodes.
    */
  var prerequisiteStepIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Output only. The node state.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Output only. The name of the node.
    */
  var stepId: js.UndefOr[String] = js.native
}
object SchemaWorkflowNode {
  
  @scala.inline
  def apply(): SchemaWorkflowNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowNode]
  }
  
  @scala.inline
  implicit class SchemaWorkflowNodeOps[Self <: SchemaWorkflowNode] (val x: Self) extends AnyVal {
    
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setPrerequisiteStepIdsVarargs(value: String*): Self = this.set("prerequisiteStepIds", js.Array(value :_*))
    
    @scala.inline
    def setPrerequisiteStepIds(value: js.Array[String]): Self = this.set("prerequisiteStepIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerequisiteStepIds: Self = this.set("prerequisiteStepIds", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = this.set("stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepId: Self = this.set("stepId", js.undefined)
  }
}
