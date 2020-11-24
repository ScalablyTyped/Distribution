package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse extends js.Object {
  
  /** Merge behavior for `messages`. */
  var mergeBehavior: js.UndefOr[String] = js.native
  
  /** The list of rich message responses to present to the user. */
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessage]] = js.native
}
object GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponseOps[Self <: GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse] (val x: Self) extends AnyVal {
    
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
    def setMergeBehavior(value: String): Self = this.set("mergeBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeBehavior: Self = this.set("mergeBehavior", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: GoogleCloudDialogflowCxV3beta1ResponseMessage*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
  }
}
