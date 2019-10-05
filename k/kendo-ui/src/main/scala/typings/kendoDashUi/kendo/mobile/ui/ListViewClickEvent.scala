package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewClickEvent extends ListViewEvent {
  var button: js.UndefOr[Button] = js.undefined
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var item: js.UndefOr[JQuery] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object ListViewClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ListView,
    button: Button = null,
    dataItem: js.Any = null,
    item: JQuery = null,
    target: JQuery = null
  ): ListViewClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (button != null) __obj.updateDynamic("button")(button)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (item != null) __obj.updateDynamic("item")(item)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ListViewClickEvent]
  }
}

