package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Switch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSwitch extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Switch = js.native
  
  /* static member */
  var fn: Switch = js.native
}
object TypeofSwitch {
  
  @scala.inline
  def apply(extend: js.Object => Switch, fn: Switch): TypeofSwitch = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSwitch]
  }
  
  @scala.inline
  implicit class TypeofSwitchMutableBuilder[Self <: TypeofSwitch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Switch): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Switch): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
