package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.DropDownButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDropDownButton extends StObject {
  
  /* static member */
  def extend(proto: js.Object): DropDownButton
  
  /* static member */
  var fn: DropDownButton
}
object TypeofDropDownButton {
  
  inline def apply(extend: js.Object => DropDownButton, fn: DropDownButton): TypeofDropDownButton = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDropDownButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDropDownButton] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => DropDownButton): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: DropDownButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
