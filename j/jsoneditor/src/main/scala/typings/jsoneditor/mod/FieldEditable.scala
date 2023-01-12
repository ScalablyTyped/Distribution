package typings.jsoneditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldEditable extends StObject {
  
  var field: Boolean
  
  var value: Boolean
}
object FieldEditable {
  
  inline def apply(field: Boolean, value: Boolean): FieldEditable = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldEditable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldEditable] (val x: Self) extends AnyVal {
    
    inline def setField(value: Boolean): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
