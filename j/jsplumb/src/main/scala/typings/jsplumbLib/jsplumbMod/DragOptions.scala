package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragOptions extends js.Object {
  var containment: js.UndefOr[java.lang.String] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, scala.Unit]] = js.undefined
  var start: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, scala.Unit]] = js.undefined
  var stop: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, scala.Unit]] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object DragOptions {
  @scala.inline
  def apply(
    containment: java.lang.String = null,
    cursor: java.lang.String = null,
    drag: /* params */ DragEventCallbackOptions => scala.Unit = null,
    start: /* params */ DragEventCallbackOptions => scala.Unit = null,
    stop: /* params */ DragEventCallbackOptions => scala.Unit = null,
    zIndex: scala.Int | scala.Double = null
  ): DragOptions = {
    val __obj = js.Dynamic.literal()
    if (containment != null) __obj.updateDynamic("containment")(containment)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragOptions]
  }
}

