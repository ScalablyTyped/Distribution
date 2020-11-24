package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard extends js.Object {
  
  /** Required. Card content. */
  var cardContent: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent] = js.native
  
  /** Required. Orientation of the card. */
  var cardOrientation: js.UndefOr[String] = js.native
  
  /** Required if orientation is horizontal. Image preview alignment for standalone cards with horizontal layout. */
  var thumbnailImageAlignment: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard] (val x: Self) extends AnyVal {
    
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
    def setCardContent(value: GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent): Self = this.set("cardContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardContent: Self = this.set("cardContent", js.undefined)
    
    @scala.inline
    def setCardOrientation(value: String): Self = this.set("cardOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardOrientation: Self = this.set("cardOrientation", js.undefined)
    
    @scala.inline
    def setThumbnailImageAlignment(value: String): Self = this.set("thumbnailImageAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailImageAlignment: Self = this.set("thumbnailImageAlignment", js.undefined)
  }
}
