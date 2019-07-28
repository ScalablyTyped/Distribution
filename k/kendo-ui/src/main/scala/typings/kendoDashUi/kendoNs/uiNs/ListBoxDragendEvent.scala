package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxDragendEvent extends ListBoxEvent {
  var dataItems: js.UndefOr[js.Any] = js.undefined
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
}

object ListBoxDragendEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ListBox,
    dataItems: js.Any = null,
    draggableEvent: js.Any = null,
    items: js.Any = null
  ): ListBoxDragendEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (dataItems != null) __obj.updateDynamic("dataItems")(dataItems)
    if (draggableEvent != null) __obj.updateDynamic("draggableEvent")(draggableEvent)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ListBoxDragendEvent]
  }
}

