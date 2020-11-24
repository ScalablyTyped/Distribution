package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion extends js.Object {
  
  /** Predefined client side actions that user can choose */
  var action: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction] = js.native
  
  /** Predefined replies for user to select instead of typing */
  var reply: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion] (val x: Self) extends AnyVal {
    
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
    def setAction(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setReply(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply): Self = this.set("reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReply: Self = this.set("reply", js.undefined)
  }
}
