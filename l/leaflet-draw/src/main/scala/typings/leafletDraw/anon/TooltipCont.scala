package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipCont extends StObject {
  
  var tooltip: Cont = js.native
}
object TooltipCont {
  
  @scala.inline
  def apply(tooltip: Cont): TooltipCont = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipCont]
  }
  
  @scala.inline
  implicit class TooltipContMutableBuilder[Self <: TooltipCont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltip(value: Cont): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
