package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConversationmodelsDeploy
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The conversation model to deploy. Format: `projects//conversationModels/`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2DeployConversationModelRequest] = js.undefined
}
object ParamsResourceProjectsConversationmodelsDeploy {
  
  inline def apply(): ParamsResourceProjectsConversationmodelsDeploy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConversationmodelsDeploy]
  }
  
  extension [Self <: ParamsResourceProjectsConversationmodelsDeploy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2DeployConversationModelRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
