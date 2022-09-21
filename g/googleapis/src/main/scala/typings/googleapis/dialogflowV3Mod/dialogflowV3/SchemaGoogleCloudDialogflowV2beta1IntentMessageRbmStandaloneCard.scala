package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard extends StObject {
  
  /**
    * Required. Card content.
    */
  var cardContent: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCardContent] = js.undefined
  
  /**
    * Required. Orientation of the card.
    */
  var cardOrientation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required if orientation is horizontal. Image preview alignment for standalone cards with horizontal layout.
    */
  var thumbnailImageAlignment: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard](x: Self) {
    
    inline def setCardContent(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCardContent): Self = StObject.set(x, "cardContent", value.asInstanceOf[js.Any])
    
    inline def setCardContentUndefined: Self = StObject.set(x, "cardContent", js.undefined)
    
    inline def setCardOrientation(value: String): Self = StObject.set(x, "cardOrientation", value.asInstanceOf[js.Any])
    
    inline def setCardOrientationNull: Self = StObject.set(x, "cardOrientation", null)
    
    inline def setCardOrientationUndefined: Self = StObject.set(x, "cardOrientation", js.undefined)
    
    inline def setThumbnailImageAlignment(value: String): Self = StObject.set(x, "thumbnailImageAlignment", value.asInstanceOf[js.Any])
    
    inline def setThumbnailImageAlignmentNull: Self = StObject.set(x, "thumbnailImageAlignment", null)
    
    inline def setThumbnailImageAlignmentUndefined: Self = StObject.set(x, "thumbnailImageAlignment", js.undefined)
  }
}
