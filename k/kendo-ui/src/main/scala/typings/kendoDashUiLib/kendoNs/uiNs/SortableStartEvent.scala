package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableStartEvent extends SortableEvent {
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  var item: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object SortableStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Sortable,
    draggableEvent: js.Any = null,
    item: kendoDashUiLib.JQuery = null
  ): SortableStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (draggableEvent != null) __obj.updateDynamic("draggableEvent")(draggableEvent)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[SortableStartEvent]
  }
}

