package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipEnd extends StObject {
  
  var tooltip: End = js.native
}
object TooltipEnd {
  
  @scala.inline
  def apply(tooltip: End): TooltipEnd = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipEnd]
  }
  
  @scala.inline
  implicit class TooltipEndMutableBuilder[Self <: TooltipEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltip(value: End): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
