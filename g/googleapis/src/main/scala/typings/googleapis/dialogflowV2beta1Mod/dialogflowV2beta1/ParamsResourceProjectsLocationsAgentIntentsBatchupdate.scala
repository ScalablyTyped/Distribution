package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentIntentsBatchupdate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the agent to update or create intents in. Supported formats: - `projects//agent` - `projects//locations//agent`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsAgentIntentsBatchupdate {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentIntentsBatchupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentIntentsBatchupdate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentIntentsBatchupdate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
