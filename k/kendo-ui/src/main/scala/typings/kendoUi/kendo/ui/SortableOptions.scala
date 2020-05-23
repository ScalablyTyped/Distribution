package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableOptions extends js.Object {
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  var axis: js.UndefOr[String] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ SortableCancelEvent, Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ SortableChangeEvent, Unit]] = js.undefined
  var connectWith: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String | JQuery] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var cursorOffset: js.UndefOr[SortableCursorOffset] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[js.Function1[/* e */ SortableEndEvent, Unit]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var handler: js.UndefOr[String] = js.undefined
  var hint: js.UndefOr[js.Function | String | JQuery] = js.undefined
  var holdToDrag: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[String] = js.undefined
  var move: js.UndefOr[js.Function1[/* e */ SortableMoveEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[js.Function | String | JQuery] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ SortableStartEvent, Unit]] = js.undefined
}

object SortableOptions {
  @scala.inline
  def apply(
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    axis: String = null,
    cancel: /* e */ SortableCancelEvent => Unit = null,
    change: /* e */ SortableChangeEvent => Unit = null,
    connectWith: String = null,
    container: String | JQuery = null,
    cursor: String = null,
    cursorOffset: SortableCursorOffset = null,
    disabled: String = null,
    end: /* e */ SortableEndEvent => Unit = null,
    filter: String = null,
    handler: String = null,
    hint: js.Function | String | JQuery = null,
    holdToDrag: js.UndefOr[Boolean] = js.undefined,
    ignore: String = null,
    move: /* e */ SortableMoveEvent => Unit = null,
    name: String = null,
    placeholder: js.Function | String | JQuery = null,
    start: /* e */ SortableStartEvent => Unit = null
  ): SortableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.get.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (connectWith != null) __obj.updateDynamic("connectWith")(connectWith.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cursorOffset != null) __obj.updateDynamic("cursorOffset")(cursorOffset.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction1(end))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(holdToDrag)) __obj.updateDynamic("holdToDrag")(holdToDrag.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction1(move))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    __obj.asInstanceOf[SortableOptions]
  }
}

