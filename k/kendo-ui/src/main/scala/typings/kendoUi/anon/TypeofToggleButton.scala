package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ToggleButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofToggleButton extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ToggleButton
  
  /* static member */
  var fn: ToggleButton
}
object TypeofToggleButton {
  
  inline def apply(extend: js.Object => ToggleButton, fn: ToggleButton): TypeofToggleButton = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofToggleButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofToggleButton] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ToggleButton): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ToggleButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
