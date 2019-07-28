package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableEndEvent extends SortableEvent {
  var action: js.UndefOr[String] = js.undefined
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  var item: js.UndefOr[JQuery] = js.undefined
  var newIndex: js.UndefOr[Double] = js.undefined
  var oldIndex: js.UndefOr[Double] = js.undefined
}

object SortableEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Sortable,
    action: String = null,
    draggableEvent: js.Any = null,
    item: JQuery = null,
    newIndex: Int | Double = null,
    oldIndex: Int | Double = null
  ): SortableEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (action != null) __obj.updateDynamic("action")(action)
    if (draggableEvent != null) __obj.updateDynamic("draggableEvent")(draggableEvent)
    if (item != null) __obj.updateDynamic("item")(item)
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    if (oldIndex != null) __obj.updateDynamic("oldIndex")(oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableEndEvent]
  }
}

