package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorConstructorParams extends StObject {
  
  var field: js.UndefOr[String] = js.undefined
  
  var fieldEditable: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object JSONEditorConstructorParams {
  
  inline def apply(): JSONEditorConstructorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorConstructorParams]
  }
  
  extension [Self <: JSONEditorConstructorParams](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldEditable(value: Boolean): Self = StObject.set(x, "fieldEditable", value.asInstanceOf[js.Any])
    
    inline def setFieldEditableUndefined: Self = StObject.set(x, "fieldEditable", js.undefined)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
