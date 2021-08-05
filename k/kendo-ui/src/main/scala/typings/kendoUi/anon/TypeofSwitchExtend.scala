package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.Switch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSwitchExtend extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Switch
  
  /* static member */
  var fn: Switch
}
object TypeofSwitchExtend {
  
  inline def apply(extend: js.Object => Switch, fn: Switch): TypeofSwitchExtend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSwitchExtend]
  }
  
  extension [Self <: TypeofSwitchExtend](x: Self) {
    
    inline def setExtend(value: js.Object => Switch): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Switch): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
