package typings.mapsjs

import typings.mapsjs.mod.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelta extends js.Object {
  var downAction: js.UndefOr[js.Function1[/* downPoint */ point, _]] = js.undefined
  var dragEnabled: Boolean
  var moveAction: js.UndefOr[js.Function1[/* movePoint */ point, Unit]] = js.undefined
  var upAction: js.UndefOr[js.Function1[/* upPoint */ point, Unit]] = js.undefined
  var useElementInsteadOfNewGestureOverlay: Boolean
  var wheelAction: js.UndefOr[js.Function1[/* delta */ Double, Unit]] = js.undefined
}

object AnonDelta {
  @scala.inline
  def apply(
    dragEnabled: Boolean,
    useElementInsteadOfNewGestureOverlay: Boolean,
    downAction: /* downPoint */ point => _ = null,
    moveAction: /* movePoint */ point => Unit = null,
    upAction: /* upPoint */ point => Unit = null,
    wheelAction: /* delta */ Double => Unit = null
  ): AnonDelta = {
    val __obj = js.Dynamic.literal(dragEnabled = dragEnabled.asInstanceOf[js.Any], useElementInsteadOfNewGestureOverlay = useElementInsteadOfNewGestureOverlay.asInstanceOf[js.Any])
    if (downAction != null) __obj.updateDynamic("downAction")(js.Any.fromFunction1(downAction))
    if (moveAction != null) __obj.updateDynamic("moveAction")(js.Any.fromFunction1(moveAction))
    if (upAction != null) __obj.updateDynamic("upAction")(js.Any.fromFunction1(upAction))
    if (wheelAction != null) __obj.updateDynamic("wheelAction")(js.Any.fromFunction1(wheelAction))
    __obj.asInstanceOf[AnonDelta]
  }
}

