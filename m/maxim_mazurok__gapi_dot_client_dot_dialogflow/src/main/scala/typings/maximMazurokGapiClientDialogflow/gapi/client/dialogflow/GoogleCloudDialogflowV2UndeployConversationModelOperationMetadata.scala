package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2UndeployConversationModelOperationMetadata extends StObject {
  
  /** The resource name of the conversation model. Format: `projects//conversationModels/` */
  var conversationModel: js.UndefOr[String] = js.undefined
  
  /** Timestamp when the request to undeploy conversation model was submitted. The time is measured on server side. */
  var createTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2UndeployConversationModelOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowV2UndeployConversationModelOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2UndeployConversationModelOperationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2UndeployConversationModelOperationMetadata] (val x: Self) extends AnyVal {
    
    inline def setConversationModel(value: String): Self = StObject.set(x, "conversationModel", value.asInstanceOf[js.Any])
    
    inline def setConversationModelUndefined: Self = StObject.set(x, "conversationModel", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
  }
}
