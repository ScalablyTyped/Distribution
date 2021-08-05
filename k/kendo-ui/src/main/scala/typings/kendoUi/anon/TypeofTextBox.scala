package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.TextBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTextBox extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TextBox
  
  /* static member */
  var fn: TextBox
}
object TypeofTextBox {
  
  inline def apply(extend: js.Object => TextBox, fn: TextBox): TypeofTextBox = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTextBox]
  }
  
  extension [Self <: TypeofTextBox](x: Self) {
    
    inline def setExtend(value: js.Object => TextBox): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: TextBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
