package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableEndEvent extends SortableEvent {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  var item: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var newIndex: js.UndefOr[scala.Double] = js.undefined
  var oldIndex: js.UndefOr[scala.Double] = js.undefined
}

object SortableEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Sortable,
    action: java.lang.String = null,
    draggableEvent: js.Any = null,
    item: kendoDashUiLib.JQuery = null,
    newIndex: scala.Int | scala.Double = null,
    oldIndex: scala.Int | scala.Double = null
  ): SortableEndEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (action != null) __obj.updateDynamic("action")(action)
    if (draggableEvent != null) __obj.updateDynamic("draggableEvent")(draggableEvent)
    if (item != null) __obj.updateDynamic("item")(item)
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    if (oldIndex != null) __obj.updateDynamic("oldIndex")(oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableEndEvent]
  }
}

