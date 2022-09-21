package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2CreateConversationModelOperationMetadata extends StObject {
  
  /** The resource name of the conversation model. Format: `projects//conversationModels/` */
  var conversationModel: js.UndefOr[String] = js.undefined
  
  /** Timestamp when the request to create conversation model is submitted. The time is measured on server side. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** State of CreateConversationModel operation. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2CreateConversationModelOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowV2CreateConversationModelOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2CreateConversationModelOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowV2CreateConversationModelOperationMetadata](x: Self) {
    
    inline def setConversationModel(value: String): Self = StObject.set(x, "conversationModel", value.asInstanceOf[js.Any])
    
    inline def setConversationModelUndefined: Self = StObject.set(x, "conversationModel", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
