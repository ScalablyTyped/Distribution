package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableOptions extends js.Object {
  var autoScroll: js.UndefOr[scala.Boolean] = js.undefined
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ SortableCancelEvent, scala.Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ SortableChangeEvent, scala.Unit]] = js.undefined
  var connectWith: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String | kendoDashUiLib.JQuery] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var cursorOffset: js.UndefOr[SortableCursorOffset] = js.undefined
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[js.Function1[/* e */ SortableEndEvent, scala.Unit]] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var handler: js.UndefOr[java.lang.String] = js.undefined
  var hint: js.UndefOr[js.Function | java.lang.String | kendoDashUiLib.JQuery] = js.undefined
  var holdToDrag: js.UndefOr[scala.Boolean] = js.undefined
  var ignore: js.UndefOr[java.lang.String] = js.undefined
  var move: js.UndefOr[js.Function1[/* e */ SortableMoveEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[js.Function | java.lang.String | kendoDashUiLib.JQuery] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ SortableStartEvent, scala.Unit]] = js.undefined
}

object SortableOptions {
  @scala.inline
  def apply(
    autoScroll: js.UndefOr[scala.Boolean] = js.undefined,
    axis: java.lang.String = null,
    cancel: /* e */ SortableCancelEvent => scala.Unit = null,
    change: /* e */ SortableChangeEvent => scala.Unit = null,
    connectWith: java.lang.String = null,
    container: java.lang.String | kendoDashUiLib.JQuery = null,
    cursor: java.lang.String = null,
    cursorOffset: SortableCursorOffset = null,
    disabled: java.lang.String = null,
    end: /* e */ SortableEndEvent => scala.Unit = null,
    filter: java.lang.String = null,
    handler: java.lang.String = null,
    hint: js.Function | java.lang.String | kendoDashUiLib.JQuery = null,
    holdToDrag: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: java.lang.String = null,
    move: /* e */ SortableMoveEvent => scala.Unit = null,
    name: java.lang.String = null,
    placeholder: js.Function | java.lang.String | kendoDashUiLib.JQuery = null,
    start: /* e */ SortableStartEvent => scala.Unit = null
  ): SortableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (connectWith != null) __obj.updateDynamic("connectWith")(connectWith)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (cursorOffset != null) __obj.updateDynamic("cursorOffset")(cursorOffset)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction1(end))
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(holdToDrag)) __obj.updateDynamic("holdToDrag")(holdToDrag)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction1(move))
    if (name != null) __obj.updateDynamic("name")(name)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    __obj.asInstanceOf[SortableOptions]
  }
}

