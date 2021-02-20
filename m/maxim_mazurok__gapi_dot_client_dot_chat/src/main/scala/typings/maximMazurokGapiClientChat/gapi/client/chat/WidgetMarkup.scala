package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetMarkup extends StObject {
  
  /** A list of buttons. Buttons is also oneof data and only one of these fields should be set. */
  var buttons: js.UndefOr[js.Array[Button]] = js.native
  
  /** Display an image in this widget. */
  var image: js.UndefOr[Image] = js.native
  
  /** Display a key value item in this widget. */
  var keyValue: js.UndefOr[KeyValue] = js.native
  
  /** Display a text paragraph in this widget. */
  var textParagraph: js.UndefOr[TextParagraph] = js.native
}
object WidgetMarkup {
  
  @scala.inline
  def apply(): WidgetMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetMarkup]
  }
  
  @scala.inline
  implicit class WidgetMarkupMutableBuilder[Self <: WidgetMarkup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: Button*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    @scala.inline
    def setTextParagraph(value: TextParagraph): Self = StObject.set(x, "textParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextParagraphUndefined: Self = StObject.set(x, "textParagraph", js.undefined)
  }
}
