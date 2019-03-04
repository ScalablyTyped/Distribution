package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxDragstartEvent extends ListBoxEvent {
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  var items: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object ListBoxDragstartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ListBox,
    draggableEvent: js.Any = null,
    items: kendoDashUiLib.JQuery = null
  ): ListBoxDragstartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (draggableEvent != null) __obj.updateDynamic("draggableEvent")(draggableEvent)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ListBoxDragstartEvent]
  }
}

