package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipText extends StObject {
  
  var tooltip: Text
}
object TooltipText {
  
  @scala.inline
  def apply(tooltip: Text): TooltipText = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipText]
  }
  
  @scala.inline
  implicit class TooltipTextMutableBuilder[Self <: TooltipText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltip(value: Text): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
