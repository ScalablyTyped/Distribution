package typings.atIonicCore.distTypesUtilsGestureGestureDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureDelegate extends js.Object {
  var ctrl: js.UndefOr[js.Any] = js.undefined
  var disableScroll: js.Any
  var id: js.Any
  var name: js.Any
  var priority: js.Any
  def canStart(): Boolean
  def capture(): Boolean
  def destroy(): Unit
  def release(): Unit
  def start(): Boolean
}

object GestureDelegate {
  @scala.inline
  def apply(
    canStart: () => Boolean,
    capture: () => Boolean,
    destroy: () => Unit,
    disableScroll: js.Any,
    id: js.Any,
    name: js.Any,
    priority: js.Any,
    release: () => Unit,
    start: () => Boolean,
    ctrl: js.Any = null
  ): GestureDelegate = {
    val __obj = js.Dynamic.literal(canStart = js.Any.fromFunction0(canStart), capture = js.Any.fromFunction0(capture), destroy = js.Any.fromFunction0(destroy), disableScroll = disableScroll, id = id, name = name, priority = priority, release = js.Any.fromFunction0(release), start = js.Any.fromFunction0(start))
    if (ctrl != null) __obj.updateDynamic("ctrl")(ctrl)
    __obj.asInstanceOf[GestureDelegate]
  }
}

