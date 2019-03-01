package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteSelectEvent extends AutoCompleteEvent {
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var item: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object AutoCompleteSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: AutoComplete,
    dataItem: js.Any = null,
    item: kendoDashUiLib.JQuery = null
  ): AutoCompleteSelectEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[AutoCompleteSelectEvent]
  }
}

