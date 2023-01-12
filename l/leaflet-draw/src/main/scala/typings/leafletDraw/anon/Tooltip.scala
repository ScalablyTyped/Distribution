package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tooltip extends StObject {
  
  var tooltip: Start
}
object Tooltip {
  
  inline def apply(tooltip: Start): Tooltip = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
    
    inline def setTooltip(value: Start): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
