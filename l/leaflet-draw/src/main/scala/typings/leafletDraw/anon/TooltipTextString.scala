package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipTextString extends StObject {
  
  var tooltip: TextString = js.native
}
object TooltipTextString {
  
  @scala.inline
  def apply(tooltip: TextString): TooltipTextString = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipTextString]
  }
  
  @scala.inline
  implicit class TooltipTextStringMutableBuilder[Self <: TooltipTextString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltip(value: TextString): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
