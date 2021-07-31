package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ConversationEvent extends StObject {
  
  /** The unique identifier of the conversation this notification refers to. Format: `projects//conversations/`. */
  var conversation: js.UndefOr[String] = js.undefined
  
  /** More detailed information about an error. Only set for type UNRECOVERABLE_ERROR_IN_PHONE_CALL. */
  var errorStatus: js.UndefOr[GoogleRpcStatus] = js.undefined
  
  /** Payload of NEW_MESSAGE event. */
  var newMessagePayload: js.UndefOr[GoogleCloudDialogflowV2Message] = js.undefined
  
  /** The type of the event that this notification refers to. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ConversationEvent {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ConversationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ConversationEvent]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ConversationEventMutableBuilder[Self <: GoogleCloudDialogflowV2ConversationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversation(value: String): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
    
    @scala.inline
    def setErrorStatus(value: GoogleRpcStatus): Self = StObject.set(x, "errorStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStatusUndefined: Self = StObject.set(x, "errorStatus", js.undefined)
    
    @scala.inline
    def setNewMessagePayload(value: GoogleCloudDialogflowV2Message): Self = StObject.set(x, "newMessagePayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewMessagePayloadUndefined: Self = StObject.set(x, "newMessagePayload", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
