package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageBasicCard extends StObject {
  
  /** Optional. The collection of card buttons. */
  var buttons: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton]] = js.undefined
  
  /** Required, unless image is present. The body text of the card. */
  var formattedText: js.UndefOr[String] = js.undefined
  
  /** Optional. The image for the card. */
  var image: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageImage] = js.undefined
  
  /** Optional. The subtitle of the card. */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /** Optional. The title of the card. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageBasicCard {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageBasicCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageBasicCard]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1IntentMessageBasicCard](x: Self) {
    
    inline def setButtons(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setFormattedText(value: String): Self = StObject.set(x, "formattedText", value.asInstanceOf[js.Any])
    
    inline def setFormattedTextUndefined: Self = StObject.set(x, "formattedText", js.undefined)
    
    inline def setImage(value: GoogleCloudDialogflowV2beta1IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
