package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard extends StObject {
  
  /** Required. Card content. */
  var cardContent: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent] = js.undefined
  
  /** Required. Orientation of the card. */
  var cardOrientation: js.UndefOr[String] = js.undefined
  
  /** Required if orientation is horizontal. Image preview alignment for standalone cards with horizontal layout. */
  var thumbnailImageAlignment: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardContent(value: GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent): Self = StObject.set(x, "cardContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardContentUndefined: Self = StObject.set(x, "cardContent", js.undefined)
    
    @scala.inline
    def setCardOrientation(value: String): Self = StObject.set(x, "cardOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardOrientationUndefined: Self = StObject.set(x, "cardOrientation", js.undefined)
    
    @scala.inline
    def setThumbnailImageAlignment(value: String): Self = StObject.set(x, "thumbnailImageAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailImageAlignmentUndefined: Self = StObject.set(x, "thumbnailImageAlignment", js.undefined)
  }
}
