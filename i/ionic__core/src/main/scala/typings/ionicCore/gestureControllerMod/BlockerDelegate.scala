package typings.ionicCore.gestureControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockerDelegate extends js.Object {
  var ctrl: js.UndefOr[js.Any] = js.undefined
  var disable: js.Any
  var disableScroll: js.Any
  var id: js.Any
  def block(): Unit
  def destroy(): Unit
  def unblock(): Unit
}

object BlockerDelegate {
  @scala.inline
  def apply(
    block: () => Unit,
    destroy: () => Unit,
    disable: js.Any,
    disableScroll: js.Any,
    id: js.Any,
    unblock: () => Unit,
    ctrl: js.Any = null
  ): BlockerDelegate = {
    val __obj = js.Dynamic.literal(block = js.Any.fromFunction0(block), destroy = js.Any.fromFunction0(destroy), disable = disable.asInstanceOf[js.Any], disableScroll = disableScroll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], unblock = js.Any.fromFunction0(unblock))
    if (ctrl != null) __obj.updateDynamic("ctrl")(ctrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockerDelegate]
  }
}

