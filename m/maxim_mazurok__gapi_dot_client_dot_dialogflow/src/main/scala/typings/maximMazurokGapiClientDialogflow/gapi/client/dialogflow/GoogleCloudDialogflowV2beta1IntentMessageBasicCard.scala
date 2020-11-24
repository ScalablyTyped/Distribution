package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageBasicCard extends js.Object {
  
  /** Optional. The collection of card buttons. */
  var buttons: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton]] = js.native
  
  /** Required, unless image is present. The body text of the card. */
  var formattedText: js.UndefOr[String] = js.native
  
  /** Optional. The image for the card. */
  var image: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageImage] = js.native
  
  /** Optional. The subtitle of the card. */
  var subtitle: js.UndefOr[String] = js.native
  
  /** Optional. The title of the card. */
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageBasicCard {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageBasicCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageBasicCard]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageBasicCardOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageBasicCard] (val x: Self) extends AnyVal {
    
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
    def setButtonsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setFormattedText(value: String): Self = this.set("formattedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedText: Self = this.set("formattedText", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2beta1IntentMessageImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
