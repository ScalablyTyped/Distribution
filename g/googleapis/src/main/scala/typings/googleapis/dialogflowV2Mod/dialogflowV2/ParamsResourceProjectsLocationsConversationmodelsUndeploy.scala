package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationmodelsUndeploy
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The conversation model to undeploy. Format: `projects//conversationModels/`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2UndeployConversationModelRequest] = js.undefined
}
object ParamsResourceProjectsLocationsConversationmodelsUndeploy {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationmodelsUndeploy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationmodelsUndeploy]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationmodelsUndeploy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2UndeployConversationModelRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
