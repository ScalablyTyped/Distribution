package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.NumericTextBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNumericTextBox extends StObject {
  
  /* static member */
  def extend(proto: js.Object): NumericTextBox = js.native
  
  /* static member */
  var fn: NumericTextBox = js.native
}
object TypeofNumericTextBox {
  
  @scala.inline
  def apply(extend: js.Object => NumericTextBox, fn: NumericTextBox): TypeofNumericTextBox = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNumericTextBox]
  }
  
  @scala.inline
  implicit class TypeofNumericTextBoxMutableBuilder[Self <: TypeofNumericTextBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => NumericTextBox): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: NumericTextBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
