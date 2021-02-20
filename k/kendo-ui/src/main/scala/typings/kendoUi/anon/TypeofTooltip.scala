package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTooltip extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Tooltip = js.native
  
  /* static member */
  var fn: Tooltip = js.native
}
object TypeofTooltip {
  
  @scala.inline
  def apply(extend: js.Object => Tooltip, fn: Tooltip): TypeofTooltip = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTooltip]
  }
  
  @scala.inline
  implicit class TypeofTooltipMutableBuilder[Self <: TypeofTooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Tooltip): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Tooltip): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
