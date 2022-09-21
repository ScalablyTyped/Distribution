package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard extends StObject {
  
  /**
    * Required. The cards in the carousel. A carousel must have at least 2 cards and at most 10.
    */
  var cardContents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCardContent]] = js.undefined
  
  /**
    * Required. The width of the cards in the carousel.
    */
  var cardWidth: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard](x: Self) {
    
    inline def setCardContents(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCardContent]): Self = StObject.set(x, "cardContents", value.asInstanceOf[js.Any])
    
    inline def setCardContentsUndefined: Self = StObject.set(x, "cardContents", js.undefined)
    
    inline def setCardContentsVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCardContent*): Self = StObject.set(x, "cardContents", js.Array(value*))
    
    inline def setCardWidth(value: String): Self = StObject.set(x, "cardWidth", value.asInstanceOf[js.Any])
    
    inline def setCardWidthNull: Self = StObject.set(x, "cardWidth", null)
    
    inline def setCardWidthUndefined: Self = StObject.set(x, "cardWidth", js.undefined)
  }
}
