package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormItem extends StObject {
  
  var attributes: js.UndefOr[js.Any] = js.undefined
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var editor: js.UndefOr[String | js.Function] = js.undefined
  
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[FormItem]] = js.undefined
  
  var label: js.UndefOr[String | FormItemLabel] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var validation: js.UndefOr[js.Any] = js.undefined
}
object FormItem {
  
  inline def apply(): FormItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItem]
  }
  
  extension [Self <: FormItem](x: Self) {
    
    inline def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setEditor(value: String | js.Function): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorOptions(value: js.Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
    
    inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItems(value: js.Array[FormItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FormItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setLabel(value: String | FormItemLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidation(value: js.Any): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
