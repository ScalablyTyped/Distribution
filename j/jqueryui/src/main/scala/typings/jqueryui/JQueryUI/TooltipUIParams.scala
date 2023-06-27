package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipUIParams extends StObject {
  
  var tooltip: JQuery
}
object TooltipUIParams {
  
  inline def apply(tooltip: JQuery): TooltipUIParams = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipUIParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipUIParams] (val x: Self) extends AnyVal {
    
    inline def setTooltip(value: JQuery): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
