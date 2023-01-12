package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Popover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPopover extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Popover
  
  /* static member */
  var fn: Popover
}
object TypeofPopover {
  
  inline def apply(extend: js.Object => Popover, fn: Popover): TypeofPopover = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPopover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPopover] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Popover): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Popover): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
