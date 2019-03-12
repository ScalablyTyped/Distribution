package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delta extends js.Object {
  var downAction: js.UndefOr[js.Function1[/* downPoint */ mapsjsLib.mapsjsMod.point, _]] = js.undefined
  var dragEnabled: scala.Boolean
  var moveAction: js.UndefOr[js.Function1[/* movePoint */ mapsjsLib.mapsjsMod.point, scala.Unit]] = js.undefined
  var upAction: js.UndefOr[js.Function1[/* upPoint */ mapsjsLib.mapsjsMod.point, scala.Unit]] = js.undefined
  var useElementInsteadOfNewGestureOverlay: scala.Boolean
  var wheelAction: js.UndefOr[js.Function1[/* delta */ scala.Double, scala.Unit]] = js.undefined
}

object Anon_Delta {
  @scala.inline
  def apply(
    dragEnabled: scala.Boolean,
    useElementInsteadOfNewGestureOverlay: scala.Boolean,
    downAction: /* downPoint */ mapsjsLib.mapsjsMod.point => _ = null,
    moveAction: /* movePoint */ mapsjsLib.mapsjsMod.point => scala.Unit = null,
    upAction: /* upPoint */ mapsjsLib.mapsjsMod.point => scala.Unit = null,
    wheelAction: /* delta */ scala.Double => scala.Unit = null
  ): Anon_Delta = {
    val __obj = js.Dynamic.literal(dragEnabled = dragEnabled, useElementInsteadOfNewGestureOverlay = useElementInsteadOfNewGestureOverlay)
    if (downAction != null) __obj.updateDynamic("downAction")(js.Any.fromFunction1(downAction))
    if (moveAction != null) __obj.updateDynamic("moveAction")(js.Any.fromFunction1(moveAction))
    if (upAction != null) __obj.updateDynamic("upAction")(js.Any.fromFunction1(upAction))
    if (wheelAction != null) __obj.updateDynamic("wheelAction")(js.Any.fromFunction1(wheelAction))
    __obj.asInstanceOf[Anon_Delta]
  }
}

