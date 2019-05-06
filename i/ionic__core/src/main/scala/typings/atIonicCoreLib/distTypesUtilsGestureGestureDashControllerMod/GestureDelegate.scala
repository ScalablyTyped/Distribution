package typings
package atIonicCoreLib.distTypesUtilsGestureGestureDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureDelegate extends js.Object {
  var ctrl: js.UndefOr[js.Any] = js.undefined
  var disableScroll: js.Any
  var id: js.Any
  var name: js.Any
  var priority: js.Any
  def canStart(): scala.Boolean
  def capture(): scala.Boolean
  def destroy(): scala.Unit
  def release(): scala.Unit
  def start(): scala.Boolean
}

object GestureDelegate {
  @scala.inline
  def apply(
    canStart: () => scala.Boolean,
    capture: () => scala.Boolean,
    destroy: () => scala.Unit,
    disableScroll: js.Any,
    id: js.Any,
    name: js.Any,
    priority: js.Any,
    release: () => scala.Unit,
    start: () => scala.Boolean,
    ctrl: js.Any = null
  ): GestureDelegate = {
    val __obj = js.Dynamic.literal(canStart = js.Any.fromFunction0(canStart), capture = js.Any.fromFunction0(capture), destroy = js.Any.fromFunction0(destroy), disableScroll = disableScroll, id = id, name = name, priority = priority, release = js.Any.fromFunction0(release), start = js.Any.fromFunction0(start))
    if (ctrl != null) __obj.updateDynamic("ctrl")(ctrl)
    __obj.asInstanceOf[GestureDelegate]
  }
}

