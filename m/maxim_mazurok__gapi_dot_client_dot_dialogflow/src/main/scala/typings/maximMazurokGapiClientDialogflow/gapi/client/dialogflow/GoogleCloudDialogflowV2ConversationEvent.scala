package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2ConversationEvent extends js.Object {
  
  /** The unique identifier of the conversation this notification refers to. Format: `projects//conversations/`. */
  var conversation: js.UndefOr[String] = js.native
  
  /** More detailed information about an error. Only set for type UNRECOVERABLE_ERROR_IN_PHONE_CALL. */
  var errorStatus: js.UndefOr[GoogleRpcStatus] = js.native
  
  /** Payload of NEW_MESSAGE event. */
  var newMessagePayload: js.UndefOr[GoogleCloudDialogflowV2Message] = js.native
  
  /** The type of the event that this notification refers to. */
  var `type`: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2ConversationEvent {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ConversationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ConversationEvent]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ConversationEventOps[Self <: GoogleCloudDialogflowV2ConversationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConversation(value: String): Self = this.set("conversation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversation: Self = this.set("conversation", js.undefined)
    
    @scala.inline
    def setErrorStatus(value: GoogleRpcStatus): Self = this.set("errorStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorStatus: Self = this.set("errorStatus", js.undefined)
    
    @scala.inline
    def setNewMessagePayload(value: GoogleCloudDialogflowV2Message): Self = this.set("newMessagePayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewMessagePayload: Self = this.set("newMessagePayload", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
