package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard extends StObject {
  
  /** Required. The cards in the carousel. A carousel must have at least 2 cards and at most 10. */
  var cardContents: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent]] = js.undefined
  
  /** Required. The width of the cards in the carousel. */
  var cardWidth: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard] (val x: Self) extends AnyVal {
    
    inline def setCardContents(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent]): Self = StObject.set(x, "cardContents", value.asInstanceOf[js.Any])
    
    inline def setCardContentsUndefined: Self = StObject.set(x, "cardContents", js.undefined)
    
    inline def setCardContentsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent*): Self = StObject.set(x, "cardContents", js.Array(value*))
    
    inline def setCardWidth(value: String): Self = StObject.set(x, "cardWidth", value.asInstanceOf[js.Any])
    
    inline def setCardWidthUndefined: Self = StObject.set(x, "cardWidth", js.undefined)
  }
}
