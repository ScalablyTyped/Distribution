package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1ConversationEvent extends StObject {
  
  /** Required. The unique identifier of the conversation this notification refers to. Format: `projects//conversations/`. */
  var conversation: js.UndefOr[String] = js.undefined
  
  /** Optional. More detailed information about an error. Only set for type UNRECOVERABLE_ERROR_IN_PHONE_CALL. */
  var errorStatus: js.UndefOr[GoogleRpcStatus] = js.undefined
  
  /** Payload of NEW_MESSAGE event. */
  var newMessagePayload: js.UndefOr[GoogleCloudDialogflowV2beta1Message] = js.undefined
  
  /** Required. The type of the event that this notification refers to. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1ConversationEvent {
  
  inline def apply(): GoogleCloudDialogflowV2beta1ConversationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1ConversationEvent]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1ConversationEvent](x: Self) {
    
    inline def setConversation(value: String): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    inline def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
    
    inline def setErrorStatus(value: GoogleRpcStatus): Self = StObject.set(x, "errorStatus", value.asInstanceOf[js.Any])
    
    inline def setErrorStatusUndefined: Self = StObject.set(x, "errorStatus", js.undefined)
    
    inline def setNewMessagePayload(value: GoogleCloudDialogflowV2beta1Message): Self = StObject.set(x, "newMessagePayload", value.asInstanceOf[js.Any])
    
    inline def setNewMessagePayloadUndefined: Self = StObject.set(x, "newMessagePayload", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
