package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modal
  extends Component[ModalOptions]
     with Openable {
  /**
    * ID of the modal element
    */
  var id: String
}

object Modal {
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    el: Element,
    id: String,
    isOpen: Boolean,
    open: () => Unit,
    options: ModalOptions
  ): Modal = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modal]
  }
}

