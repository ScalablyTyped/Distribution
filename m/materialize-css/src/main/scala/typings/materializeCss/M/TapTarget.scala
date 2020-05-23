package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapTarget extends Component[TapTargetOptions] {
  /**
    * If the tap target is open
    */
  var isOpen: Boolean
  /**
    * Close Tap Target
    */
  def close(): Unit
  /**
    * Open Tap Target
    */
  def open(): Unit
}

object TapTarget {
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    el: Element,
    isOpen: Boolean,
    open: () => Unit,
    options: TapTargetOptions
  ): TapTarget = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapTarget]
  }
}

