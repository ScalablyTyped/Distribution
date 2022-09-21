package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedColumnsColumnWidgets extends StObject {
  
  /** ButtonList widget. */
  var buttonList: js.UndefOr[AppsDynamiteSharedButtonList] = js.undefined
  
  /** DateTimePicker widget. */
  var dateTimePicker: js.UndefOr[AppsDynamiteSharedDateTimePicker] = js.undefined
  
  /** DecoratedText widget. */
  var decoratedText: js.UndefOr[AppsDynamiteSharedDecoratedText] = js.undefined
  
  /** Image widget. */
  var image: js.UndefOr[AppsDynamiteSharedImage] = js.undefined
  
  /** SelectionInput widget. */
  var selectionInput: js.UndefOr[AppsDynamiteSharedSelectionInput] = js.undefined
  
  /** TextInput widget. */
  var textInput: js.UndefOr[AppsDynamiteSharedTextInput] = js.undefined
  
  /** Text paragraph widget. */
  var textParagraph: js.UndefOr[AppsDynamiteSharedTextParagraph] = js.undefined
}
object AppsDynamiteSharedColumnsColumnWidgets {
  
  inline def apply(): AppsDynamiteSharedColumnsColumnWidgets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedColumnsColumnWidgets]
  }
  
  extension [Self <: AppsDynamiteSharedColumnsColumnWidgets](x: Self) {
    
    inline def setButtonList(value: AppsDynamiteSharedButtonList): Self = StObject.set(x, "buttonList", value.asInstanceOf[js.Any])
    
    inline def setButtonListUndefined: Self = StObject.set(x, "buttonList", js.undefined)
    
    inline def setDateTimePicker(value: AppsDynamiteSharedDateTimePicker): Self = StObject.set(x, "dateTimePicker", value.asInstanceOf[js.Any])
    
    inline def setDateTimePickerUndefined: Self = StObject.set(x, "dateTimePicker", js.undefined)
    
    inline def setDecoratedText(value: AppsDynamiteSharedDecoratedText): Self = StObject.set(x, "decoratedText", value.asInstanceOf[js.Any])
    
    inline def setDecoratedTextUndefined: Self = StObject.set(x, "decoratedText", js.undefined)
    
    inline def setImage(value: AppsDynamiteSharedImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSelectionInput(value: AppsDynamiteSharedSelectionInput): Self = StObject.set(x, "selectionInput", value.asInstanceOf[js.Any])
    
    inline def setSelectionInputUndefined: Self = StObject.set(x, "selectionInput", js.undefined)
    
    inline def setTextInput(value: AppsDynamiteSharedTextInput): Self = StObject.set(x, "textInput", value.asInstanceOf[js.Any])
    
    inline def setTextInputUndefined: Self = StObject.set(x, "textInput", js.undefined)
    
    inline def setTextParagraph(value: AppsDynamiteSharedTextParagraph): Self = StObject.set(x, "textParagraph", value.asInstanceOf[js.Any])
    
    inline def setTextParagraphUndefined: Self = StObject.set(x, "textParagraph", js.undefined)
  }
}
