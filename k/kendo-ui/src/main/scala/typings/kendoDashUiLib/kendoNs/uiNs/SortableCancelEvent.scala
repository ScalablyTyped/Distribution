package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableCancelEvent extends SortableEvent {
  var item: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object SortableCancelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Sortable,
    item: kendoDashUiLib.JQuery = null
  ): SortableCancelEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[SortableCancelEvent]
  }
}

