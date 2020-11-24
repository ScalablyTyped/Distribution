package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction extends js.Object {
  
  /** Suggested client side action: Dial a phone number */
  var dial: js.UndefOr[
    GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDial
  ] = js.native
  
  /** Suggested client side action: Open a URI on device */
  var openUrl: js.UndefOr[
    GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUri
  ] = js.native
  
  /**
    * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested action. This data will be also forwarded to webhook to allow performing custom business
    * logic.
    */
  var postbackData: js.UndefOr[String] = js.native
  
  /** Suggested client side action: Share user location */
  var shareLocation: js.UndefOr[js.Any] = js.native
  
  /** Text to display alongside the action. */
  var text: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction] (val x: Self) extends AnyVal {
    
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
    def setDial(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDial): Self = this.set("dial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDial: Self = this.set("dial", js.undefined)
    
    @scala.inline
    def setOpenUrl(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUri): Self = this.set("openUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenUrl: Self = this.set("openUrl", js.undefined)
    
    @scala.inline
    def setPostbackData(value: String): Self = this.set("postbackData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostbackData: Self = this.set("postbackData", js.undefined)
    
    @scala.inline
    def setShareLocation(value: js.Any): Self = this.set("shareLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareLocation: Self = this.set("shareLocation", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
