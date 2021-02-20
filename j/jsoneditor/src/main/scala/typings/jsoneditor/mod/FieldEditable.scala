package typings.jsoneditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldEditable extends StObject {
  
  var field: Boolean = js.native
  
  var value: Boolean = js.native
}
object FieldEditable {
  
  @scala.inline
  def apply(field: Boolean, value: Boolean): FieldEditable = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldEditable]
  }
  
  @scala.inline
  implicit class FieldEditableMutableBuilder[Self <: FieldEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: Boolean): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
