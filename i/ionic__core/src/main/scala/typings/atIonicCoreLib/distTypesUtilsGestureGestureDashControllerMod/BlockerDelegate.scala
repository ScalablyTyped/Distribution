package typings
package atIonicCoreLib.distTypesUtilsGestureGestureDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockerDelegate extends js.Object {
  var ctrl: js.UndefOr[js.Any] = js.undefined
  var disable: js.Any
  var disableScroll: js.Any
  var id: js.Any
  def block(): scala.Unit
  def destroy(): scala.Unit
  def unblock(): scala.Unit
}

object BlockerDelegate {
  @scala.inline
  def apply(
    block: () => scala.Unit,
    destroy: () => scala.Unit,
    disable: js.Any,
    disableScroll: js.Any,
    id: js.Any,
    unblock: () => scala.Unit,
    ctrl: js.Any = null
  ): BlockerDelegate = {
    val __obj = js.Dynamic.literal(block = js.Any.fromFunction0(block), destroy = js.Any.fromFunction0(destroy), disable = disable, disableScroll = disableScroll, id = id, unblock = js.Any.fromFunction0(unblock))
    if (ctrl != null) __obj.updateDynamic("ctrl")(ctrl)
    __obj.asInstanceOf[BlockerDelegate]
  }
}

