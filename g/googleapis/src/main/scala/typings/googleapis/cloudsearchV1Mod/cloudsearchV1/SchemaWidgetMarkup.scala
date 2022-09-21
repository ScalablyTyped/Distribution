package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWidgetMarkup extends StObject {
  
  /**
    * buttons is also oneof data and only one of these fields should be set.
    */
  var buttons: js.UndefOr[js.Array[SchemaButton]] = js.undefined
  
  var dateTimePicker: js.UndefOr[SchemaDateTimePicker] = js.undefined
  
  var divider: js.UndefOr[SchemaDivider] = js.undefined
  
  var grid: js.UndefOr[SchemaGrid] = js.undefined
  
  /**
    * The horizontal alignment of this widget.
    */
  var horizontalAlignment: js.UndefOr[String | Null] = js.undefined
  
  var image: js.UndefOr[SchemaImage] = js.undefined
  
  var imageKeyValue: js.UndefOr[SchemaImageKeyValue] = js.undefined
  
  var keyValue: js.UndefOr[SchemaKeyValue] = js.undefined
  
  /**
    * Input Widgets
    */
  var menu: js.UndefOr[SchemaMenu] = js.undefined
  
  var selectionControl: js.UndefOr[SchemaSelectionControl] = js.undefined
  
  var textField: js.UndefOr[SchemaTextField] = js.undefined
  
  var textKeyValue: js.UndefOr[SchemaTextKeyValue] = js.undefined
  
  /**
    * Read-only Widgets
    */
  var textParagraph: js.UndefOr[SchemaTextParagraph] = js.undefined
}
object SchemaWidgetMarkup {
  
  inline def apply(): SchemaWidgetMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWidgetMarkup]
  }
  
  extension [Self <: SchemaWidgetMarkup](x: Self) {
    
    inline def setButtons(value: js.Array[SchemaButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: SchemaButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDateTimePicker(value: SchemaDateTimePicker): Self = StObject.set(x, "dateTimePicker", value.asInstanceOf[js.Any])
    
    inline def setDateTimePickerUndefined: Self = StObject.set(x, "dateTimePicker", js.undefined)
    
    inline def setDivider(value: SchemaDivider): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    inline def setGrid(value: SchemaGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentNull: Self = StObject.set(x, "horizontalAlignment", null)
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageKeyValue(value: SchemaImageKeyValue): Self = StObject.set(x, "imageKeyValue", value.asInstanceOf[js.Any])
    
    inline def setImageKeyValueUndefined: Self = StObject.set(x, "imageKeyValue", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setKeyValue(value: SchemaKeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    inline def setMenu(value: SchemaMenu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setSelectionControl(value: SchemaSelectionControl): Self = StObject.set(x, "selectionControl", value.asInstanceOf[js.Any])
    
    inline def setSelectionControlUndefined: Self = StObject.set(x, "selectionControl", js.undefined)
    
    inline def setTextField(value: SchemaTextField): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
    
    inline def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
    
    inline def setTextKeyValue(value: SchemaTextKeyValue): Self = StObject.set(x, "textKeyValue", value.asInstanceOf[js.Any])
    
    inline def setTextKeyValueUndefined: Self = StObject.set(x, "textKeyValue", js.undefined)
    
    inline def setTextParagraph(value: SchemaTextParagraph): Self = StObject.set(x, "textParagraph", value.asInstanceOf[js.Any])
    
    inline def setTextParagraphUndefined: Self = StObject.set(x, "textParagraph", js.undefined)
  }
}
