package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipEnd extends StObject {
  
  var tooltip: End
}
object TooltipEnd {
  
  inline def apply(tooltip: End): TooltipEnd = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipEnd]
  }
  
  extension [Self <: TooltipEnd](x: Self) {
    
    inline def setTooltip(value: End): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
