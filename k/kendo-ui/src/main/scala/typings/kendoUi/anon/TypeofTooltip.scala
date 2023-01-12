package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTooltip extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Tooltip
  
  /* static member */
  var fn: Tooltip
}
object TypeofTooltip {
  
  inline def apply(extend: js.Object => Tooltip, fn: Tooltip): TypeofTooltip = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTooltip] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Tooltip): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Tooltip): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
