package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableStartEvent extends SortableEvent {
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  var item: js.UndefOr[JQuery] = js.undefined
}

object SortableStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Sortable,
    draggableEvent: js.Any = null,
    item: JQuery = null
  ): SortableStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (draggableEvent != null) __obj.updateDynamic("draggableEvent")(draggableEvent)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[SortableStartEvent]
  }
}

