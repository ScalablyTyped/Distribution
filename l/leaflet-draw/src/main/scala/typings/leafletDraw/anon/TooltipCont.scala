package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipCont extends StObject {
  
  var tooltip: Cont
}
object TooltipCont {
  
  inline def apply(tooltip: Cont): TooltipCont = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipCont]
  }
  
  extension [Self <: TooltipCont](x: Self) {
    
    inline def setTooltip(value: Cont): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
