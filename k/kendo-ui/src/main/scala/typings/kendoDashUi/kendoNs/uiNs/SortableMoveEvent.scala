package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableMoveEvent extends SortableEvent {
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  var item: js.UndefOr[JQuery] = js.undefined
  var list: js.UndefOr[Sortable] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object SortableMoveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Sortable,
    draggableEvent: js.Any = null,
    item: JQuery = null,
    list: Sortable = null,
    target: JQuery = null
  ): SortableMoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (draggableEvent != null) __obj.updateDynamic("draggableEvent")(draggableEvent)
    if (item != null) __obj.updateDynamic("item")(item)
    if (list != null) __obj.updateDynamic("list")(list)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[SortableMoveEvent]
  }
}

