package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListSelectEvent extends DropDownListEvent {
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var item: js.UndefOr[JQuery] = js.undefined
}

object DropDownListSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: DropDownList,
    dataItem: js.Any = null,
    item: JQuery = null
  ): DropDownListSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[DropDownListSelectEvent]
  }
}

