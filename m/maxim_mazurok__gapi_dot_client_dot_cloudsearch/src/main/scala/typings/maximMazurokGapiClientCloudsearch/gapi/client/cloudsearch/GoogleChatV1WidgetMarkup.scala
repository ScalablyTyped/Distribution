package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1WidgetMarkup extends StObject {
  
  /** A list of buttons. Buttons is also oneof data and only one of these fields should be set. */
  var buttons: js.UndefOr[js.Array[GoogleChatV1WidgetMarkupButton]] = js.undefined
  
  /** Display an image in this widget. */
  var image: js.UndefOr[GoogleChatV1WidgetMarkupImage] = js.undefined
  
  /** Display a key value item in this widget. */
  var keyValue: js.UndefOr[GoogleChatV1WidgetMarkupKeyValue] = js.undefined
  
  /** Display a text paragraph in this widget. */
  var textParagraph: js.UndefOr[GoogleChatV1WidgetMarkupTextParagraph] = js.undefined
}
object GoogleChatV1WidgetMarkup {
  
  inline def apply(): GoogleChatV1WidgetMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1WidgetMarkup]
  }
  
  extension [Self <: GoogleChatV1WidgetMarkup](x: Self) {
    
    inline def setButtons(value: js.Array[GoogleChatV1WidgetMarkupButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: GoogleChatV1WidgetMarkupButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setImage(value: GoogleChatV1WidgetMarkupImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setKeyValue(value: GoogleChatV1WidgetMarkupKeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    inline def setTextParagraph(value: GoogleChatV1WidgetMarkupTextParagraph): Self = StObject.set(x, "textParagraph", value.asInstanceOf[js.Any])
    
    inline def setTextParagraphUndefined: Self = StObject.set(x, "textParagraph", js.undefined)
  }
}
