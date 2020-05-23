package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableChangeEvent extends SortableEvent {
  var action: js.UndefOr[String] = js.undefined
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  var item: js.UndefOr[JQuery] = js.undefined
  var newIndex: js.UndefOr[Double] = js.undefined
  var oldIndex: js.UndefOr[Double] = js.undefined
}

object SortableChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Sortable,
    action: String = null,
    draggableEvent: js.Any = null,
    item: JQuery = null,
    newIndex: js.UndefOr[Double] = js.undefined,
    oldIndex: js.UndefOr[Double] = js.undefined
  ): SortableChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (draggableEvent != null) __obj.updateDynamic("draggableEvent")(draggableEvent.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (!js.isUndefined(newIndex)) __obj.updateDynamic("newIndex")(newIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oldIndex)) __obj.updateDynamic("oldIndex")(oldIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableChangeEvent]
  }
}

