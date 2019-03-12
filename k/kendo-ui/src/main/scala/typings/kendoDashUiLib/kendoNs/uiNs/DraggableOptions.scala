package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableOptions extends js.Object {
  var autoScroll: js.UndefOr[scala.Boolean] = js.undefined
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var cursorOffset: js.UndefOr[js.Any] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ DraggableEvent, scala.Unit]] = js.undefined
  var dragcancel: js.UndefOr[js.Function1[/* e */ DraggableEvent, scala.Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ DraggableEvent, scala.Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ DraggableEvent, scala.Unit]] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var hint: js.UndefOr[js.Function | kendoDashUiLib.JQuery] = js.undefined
  var hold: js.UndefOr[js.Function1[/* e */ DraggableEvent, scala.Unit]] = js.undefined
  var holdToDrag: js.UndefOr[scala.Boolean] = js.undefined
  var ignore: js.UndefOr[java.lang.String] = js.undefined
}

object DraggableOptions {
  @scala.inline
  def apply(
    autoScroll: js.UndefOr[scala.Boolean] = js.undefined,
    axis: java.lang.String = null,
    container: kendoDashUiLib.JQuery = null,
    cursorOffset: js.Any = null,
    distance: scala.Int | scala.Double = null,
    drag: /* e */ DraggableEvent => scala.Unit = null,
    dragcancel: /* e */ DraggableEvent => scala.Unit = null,
    dragend: /* e */ DraggableEvent => scala.Unit = null,
    dragstart: /* e */ DraggableEvent => scala.Unit = null,
    filter: java.lang.String = null,
    group: java.lang.String = null,
    hint: js.Function | kendoDashUiLib.JQuery = null,
    hold: /* e */ DraggableEvent => scala.Unit = null,
    holdToDrag: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: java.lang.String = null
  ): DraggableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (container != null) __obj.updateDynamic("container")(container)
    if (cursorOffset != null) __obj.updateDynamic("cursorOffset")(cursorOffset)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragcancel != null) __obj.updateDynamic("dragcancel")(js.Any.fromFunction1(dragcancel))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1(dragend))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1(dragstart))
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (group != null) __obj.updateDynamic("group")(group)
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (hold != null) __obj.updateDynamic("hold")(js.Any.fromFunction1(hold))
    if (!js.isUndefined(holdToDrag)) __obj.updateDynamic("holdToDrag")(holdToDrag)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    __obj.asInstanceOf[DraggableOptions]
  }
}

