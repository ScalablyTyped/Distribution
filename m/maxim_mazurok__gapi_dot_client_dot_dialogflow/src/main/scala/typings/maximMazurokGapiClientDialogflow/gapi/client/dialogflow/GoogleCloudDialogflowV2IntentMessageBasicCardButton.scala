package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageBasicCardButton extends js.Object {
  
  /** Required. Action to take when a user taps on the button. */
  var openUriAction: js.UndefOr[GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction] = js.native
  
  /** Required. The title of the button. */
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageBasicCardButton {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageBasicCardButton]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageBasicCardButtonOps[Self <: GoogleCloudDialogflowV2IntentMessageBasicCardButton] (val x: Self) extends AnyVal {
    
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
    def setOpenUriAction(value: GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction): Self = this.set("openUriAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenUriAction: Self = this.set("openUriAction", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
