package typings.materializecssMaterialize.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tooltip
  extends StObject
     with Component[TooltipOptions]
     with Openable {
  
  /**
    * If tooltip is hovered.
    */
  var isHovered: Boolean
}
object Tooltip {
  
  inline def apply(
    close: () => Unit,
    destroy: () => Unit,
    el: Element,
    isHovered: Boolean,
    isOpen: Boolean,
    open: () => Unit,
    options: TooltipOptions
  ): Tooltip = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
    
    inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
  }
}
