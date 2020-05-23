package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip
  extends Component[TooltipOptions]
     with Openable {
  /**
    * If tooltip is hovered.
    */
  var isHovered: Boolean
}

object Tooltip {
  @scala.inline
  def apply(
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
}

