package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetMarkup extends StObject {
  
  /** buttons is also oneof data and only one of these fields should be set. */
  var buttons: js.UndefOr[js.Array[Button]] = js.undefined
  
  var dateTimePicker: js.UndefOr[DateTimePicker] = js.undefined
  
  var divider: js.UndefOr[Any] = js.undefined
  
  var grid: js.UndefOr[Grid] = js.undefined
  
  /** The horizontal alignment of this widget. */
  var horizontalAlignment: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[Image] = js.undefined
  
  var imageKeyValue: js.UndefOr[ImageKeyValue] = js.undefined
  
  var keyValue: js.UndefOr[KeyValue] = js.undefined
  
  /** Input Widgets */
  var menu: js.UndefOr[Menu] = js.undefined
  
  var selectionControl: js.UndefOr[SelectionControl] = js.undefined
  
  var textField: js.UndefOr[TextField] = js.undefined
  
  var textKeyValue: js.UndefOr[TextKeyValue] = js.undefined
  
  /** Read-only Widgets */
  var textParagraph: js.UndefOr[TextParagraph] = js.undefined
}
object WidgetMarkup {
  
  inline def apply(): WidgetMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetMarkup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WidgetMarkup] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: Button*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDateTimePicker(value: DateTimePicker): Self = StObject.set(x, "dateTimePicker", value.asInstanceOf[js.Any])
    
    inline def setDateTimePickerUndefined: Self = StObject.set(x, "dateTimePicker", js.undefined)
    
    inline def setDivider(value: Any): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    inline def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageKeyValue(value: ImageKeyValue): Self = StObject.set(x, "imageKeyValue", value.asInstanceOf[js.Any])
    
    inline def setImageKeyValueUndefined: Self = StObject.set(x, "imageKeyValue", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    inline def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setSelectionControl(value: SelectionControl): Self = StObject.set(x, "selectionControl", value.asInstanceOf[js.Any])
    
    inline def setSelectionControlUndefined: Self = StObject.set(x, "selectionControl", js.undefined)
    
    inline def setTextField(value: TextField): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
    
    inline def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
    
    inline def setTextKeyValue(value: TextKeyValue): Self = StObject.set(x, "textKeyValue", value.asInstanceOf[js.Any])
    
    inline def setTextKeyValueUndefined: Self = StObject.set(x, "textKeyValue", js.undefined)
    
    inline def setTextParagraph(value: TextParagraph): Self = StObject.set(x, "textParagraph", value.asInstanceOf[js.Any])
    
    inline def setTextParagraphUndefined: Self = StObject.set(x, "textParagraph", js.undefined)
  }
}
