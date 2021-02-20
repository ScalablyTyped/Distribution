package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ComboBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofComboBox extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ComboBox = js.native
  
  /* static member */
  var fn: ComboBox = js.native
}
object TypeofComboBox {
  
  @scala.inline
  def apply(extend: js.Object => ComboBox, fn: ComboBox): TypeofComboBox = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofComboBox]
  }
  
  @scala.inline
  implicit class TypeofComboBoxMutableBuilder[Self <: TypeofComboBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => ComboBox): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: ComboBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
