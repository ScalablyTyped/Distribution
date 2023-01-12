package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.NumericTextBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofNumericTextBox extends StObject {
  
  /* static member */
  def extend(proto: js.Object): NumericTextBox
  
  /* static member */
  var fn: NumericTextBox
}
object TypeofNumericTextBox {
  
  inline def apply(extend: js.Object => NumericTextBox, fn: NumericTextBox): TypeofNumericTextBox = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNumericTextBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofNumericTextBox] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => NumericTextBox): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: NumericTextBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
