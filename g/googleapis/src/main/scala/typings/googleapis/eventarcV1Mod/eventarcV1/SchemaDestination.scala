package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestination extends StObject {
  
  /**
    * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format: `projects/{project\}/locations/{location\}/functions/{function\}`
    */
  var cloudFunction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud Run fully-managed resource that receives the events. The resource should be in the same project as the trigger.
    */
  var cloudRun: js.UndefOr[SchemaCloudRun] = js.undefined
  
  /**
    * A GKE service capable of receiving events. The service should be running in the same project as the trigger.
    */
  var gke: js.UndefOr[SchemaGKE] = js.undefined
  
  /**
    * The resource name of the Workflow whose Executions are triggered by the events. The Workflow resource should be deployed in the same project as the trigger. Format: `projects/{project\}/locations/{location\}/workflows/{workflow\}`
    */
  var workflow: js.UndefOr[String | Null] = js.undefined
}
object SchemaDestination {
  
  inline def apply(): SchemaDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestination]
  }
  
  extension [Self <: SchemaDestination](x: Self) {
    
    inline def setCloudFunction(value: String): Self = StObject.set(x, "cloudFunction", value.asInstanceOf[js.Any])
    
    inline def setCloudFunctionNull: Self = StObject.set(x, "cloudFunction", null)
    
    inline def setCloudFunctionUndefined: Self = StObject.set(x, "cloudFunction", js.undefined)
    
    inline def setCloudRun(value: SchemaCloudRun): Self = StObject.set(x, "cloudRun", value.asInstanceOf[js.Any])
    
    inline def setCloudRunUndefined: Self = StObject.set(x, "cloudRun", js.undefined)
    
    inline def setGke(value: SchemaGKE): Self = StObject.set(x, "gke", value.asInstanceOf[js.Any])
    
    inline def setGkeUndefined: Self = StObject.set(x, "gke", js.undefined)
    
    inline def setWorkflow(value: String): Self = StObject.set(x, "workflow", value.asInstanceOf[js.Any])
    
    inline def setWorkflowNull: Self = StObject.set(x, "workflow", null)
    
    inline def setWorkflowUndefined: Self = StObject.set(x, "workflow", js.undefined)
  }
}
