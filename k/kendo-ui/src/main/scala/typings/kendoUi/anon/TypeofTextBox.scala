package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.TextBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTextBox extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TextBox = js.native
  
  /* static member */
  var fn: TextBox = js.native
}
object TypeofTextBox {
  
  @scala.inline
  def apply(extend: js.Object => TextBox, fn: TextBox): TypeofTextBox = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTextBox]
  }
  
  @scala.inline
  implicit class TypeofTextBoxMutableBuilder[Self <: TypeofTextBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => TextBox): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: TextBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
