package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPopup extends StObject {
  
  /* static member */
  var TabKeyTrap: js.Any
  
  /* static member */
  def extend(proto: js.Object): Popup
  
  /* static member */
  var fn: Popup
}
object TypeofPopup {
  
  inline def apply(TabKeyTrap: js.Any, extend: js.Object => Popup, fn: Popup): TypeofPopup = {
    val __obj = js.Dynamic.literal(TabKeyTrap = TabKeyTrap.asInstanceOf[js.Any], extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPopup]
  }
  
  extension [Self <: TypeofPopup](x: Self) {
    
    inline def setExtend(value: js.Object => Popup): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Popup): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setTabKeyTrap(value: js.Any): Self = StObject.set(x, "TabKeyTrap", value.asInstanceOf[js.Any])
  }
}
