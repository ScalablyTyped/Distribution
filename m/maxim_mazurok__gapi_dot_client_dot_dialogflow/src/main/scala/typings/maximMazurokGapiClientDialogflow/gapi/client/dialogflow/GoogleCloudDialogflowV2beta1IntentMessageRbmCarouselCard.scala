package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard extends js.Object {
  
  /** Required. The cards in the carousel. A carousel must have at least 2 cards and at most 10. */
  var cardContents: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent]] = js.native
  
  /** Required. The width of the cards in the carousel. */
  var cardWidth: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard] (val x: Self) extends AnyVal {
    
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
    def setCardContentsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent*): Self = this.set("cardContents", js.Array(value :_*))
    
    @scala.inline
    def setCardContents(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent]): Self = this.set("cardContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardContents: Self = this.set("cardContents", js.undefined)
    
    @scala.inline
    def setCardWidth(value: String): Self = this.set("cardWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardWidth: Self = this.set("cardWidth", js.undefined)
  }
}
