package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetMarkup extends StObject {
  
  /** A list of buttons. Buttons is also oneof data and only one of these fields should be set. */
  var buttons: js.UndefOr[js.Array[Button]] = js.undefined
  
  /** Display an image in this widget. */
  var image: js.UndefOr[Image] = js.undefined
  
  /** Display a key value item in this widget. */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
  
  /** Display a text paragraph in this widget. */
  var textParagraph: js.UndefOr[TextParagraph] = js.undefined
}
object WidgetMarkup {
  
  inline def apply(): WidgetMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetMarkup]
  }
  
  extension [Self <: WidgetMarkup](x: Self) {
    
    inline def setButtons(value: js.Array[Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: Button*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    inline def setTextParagraph(value: TextParagraph): Self = StObject.set(x, "textParagraph", value.asInstanceOf[js.Any])
    
    inline def setTextParagraphUndefined: Self = StObject.set(x, "textParagraph", js.undefined)
  }
}
