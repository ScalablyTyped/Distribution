package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableCancelEvent extends SortableEvent {
  var item: js.UndefOr[JQuery] = js.undefined
}

object SortableCancelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Sortable,
    item: JQuery = null
  ): SortableCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[SortableCancelEvent]
  }
}

