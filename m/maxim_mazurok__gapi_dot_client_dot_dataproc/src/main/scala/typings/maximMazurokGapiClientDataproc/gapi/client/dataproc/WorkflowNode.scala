package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowNode extends StObject {
  
  /** Output only. The error detail. */
  var error: js.UndefOr[String] = js.undefined
  
  /** Output only. The job id; populated after the node enters RUNNING state. */
  var jobId: js.UndefOr[String] = js.undefined
  
  /** Output only. Node's prerequisite nodes. */
  var prerequisiteStepIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. The node state. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. The name of the node. */
  var stepId: js.UndefOr[String] = js.undefined
}
object WorkflowNode {
  
  @scala.inline
  def apply(): WorkflowNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowNode]
  }
  
  @scala.inline
  implicit class WorkflowNodeMutableBuilder[Self <: WorkflowNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setPrerequisiteStepIds(value: js.Array[String]): Self = StObject.set(x, "prerequisiteStepIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrerequisiteStepIdsUndefined: Self = StObject.set(x, "prerequisiteStepIds", js.undefined)
    
    @scala.inline
    def setPrerequisiteStepIdsVarargs(value: String*): Self = StObject.set(x, "prerequisiteStepIds", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
