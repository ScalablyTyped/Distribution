package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineActionClickEvent extends TimelineEvent {
  var dataItem: js.UndefOr[Model] = js.undefined
  var element: js.UndefOr[JQuery] = js.undefined
}

object TimelineActionClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Timeline,
    dataItem: Model = null,
    element: JQuery = null
  ): TimelineActionClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[TimelineActionClickEvent]
  }
}

