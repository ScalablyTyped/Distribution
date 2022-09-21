package typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTriggerPubsubExecutionRequest] = js.undefined
  
  /**
    * Required. Name of the workflow for which an execution should be created. Format: projects/{project\}/locations/{location\}/workflows/{workflow\}
    */
  var workflow: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkflowsTriggerpubsubexecution](x: Self) {
    
    inline def setRequestBody(value: SchemaTriggerPubsubExecutionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWorkflow(value: String): Self = StObject.set(x, "workflow", value.asInstanceOf[js.Any])
    
    inline def setWorkflowUndefined: Self = StObject.set(x, "workflow", js.undefined)
  }
}
