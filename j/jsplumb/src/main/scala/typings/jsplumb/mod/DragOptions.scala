package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragOptions extends js.Object {
  var containment: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.undefined
  var start: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.undefined
  var stop: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object DragOptions {
  @scala.inline
  def apply(
    containment: String = null,
    cursor: String = null,
    drag: /* params */ DragEventCallbackOptions => Unit = null,
    start: /* params */ DragEventCallbackOptions => Unit = null,
    stop: /* params */ DragEventCallbackOptions => Unit = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): DragOptions = {
    val __obj = js.Dynamic.literal()
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragOptions]
  }
}

