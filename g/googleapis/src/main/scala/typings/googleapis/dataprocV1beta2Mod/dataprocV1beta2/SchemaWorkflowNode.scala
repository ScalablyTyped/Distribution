package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkflowNode extends StObject {
  
  /**
    * Output only. The error detail.
    */
  var error: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The job id; populated after the node enters RUNNING state.
    */
  var jobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Node's prerequisite nodes.
    */
  var prerequisiteStepIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The node state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the node.
    */
  var stepId: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkflowNode {
  
  inline def apply(): SchemaWorkflowNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowNode]
  }
  
  extension [Self <: SchemaWorkflowNode](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdNull: Self = StObject.set(x, "jobId", null)
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setPrerequisiteStepIds(value: js.Array[String]): Self = StObject.set(x, "prerequisiteStepIds", value.asInstanceOf[js.Any])
    
    inline def setPrerequisiteStepIdsNull: Self = StObject.set(x, "prerequisiteStepIds", null)
    
    inline def setPrerequisiteStepIdsUndefined: Self = StObject.set(x, "prerequisiteStepIds", js.undefined)
    
    inline def setPrerequisiteStepIdsVarargs(value: String*): Self = StObject.set(x, "prerequisiteStepIds", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdNull: Self = StObject.set(x, "stepId", null)
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
