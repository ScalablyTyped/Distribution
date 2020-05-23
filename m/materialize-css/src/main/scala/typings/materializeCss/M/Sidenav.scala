package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sidenav
  extends Component[SidenavOptions]
     with Openable {
  /**
    * Describes if Sidenav is being dragged
    */
  var isDragged: Boolean
  /**
    * Describes if sidenav is fixed
    */
  var isFixed: Boolean
}

object Sidenav {
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    el: Element,
    isDragged: Boolean,
    isFixed: Boolean,
    isOpen: Boolean,
    open: () => Unit,
    options: SidenavOptions
  ): Sidenav = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sidenav]
  }
}

