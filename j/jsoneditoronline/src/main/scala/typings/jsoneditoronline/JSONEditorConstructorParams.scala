package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorConstructorParams extends StObject {
  
  var field: js.UndefOr[String] = js.undefined
  
  var fieldEditable: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object JSONEditorConstructorParams {
  
  @scala.inline
  def apply(): JSONEditorConstructorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorConstructorParams]
  }
  
  @scala.inline
  implicit class JSONEditorConstructorParamsMutableBuilder[Self <: JSONEditorConstructorParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldEditable(value: Boolean): Self = StObject.set(x, "fieldEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldEditableUndefined: Self = StObject.set(x, "fieldEditable", js.undefined)
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
