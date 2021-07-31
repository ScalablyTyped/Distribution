package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.MaskedTextBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMaskedTextBox extends StObject {
  
  /* static member */
  def extend(proto: js.Object): MaskedTextBox
  
  /* static member */
  var fn: MaskedTextBox
}
object TypeofMaskedTextBox {
  
  @scala.inline
  def apply(extend: js.Object => MaskedTextBox, fn: MaskedTextBox): TypeofMaskedTextBox = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMaskedTextBox]
  }
  
  @scala.inline
  implicit class TypeofMaskedTextBoxMutableBuilder[Self <: TypeofMaskedTextBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => MaskedTextBox): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: MaskedTextBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
