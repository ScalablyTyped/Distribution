package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineChangeEvent extends TimelineEvent {
  var dataItem: js.UndefOr[Model] = js.undefined
  var eventContainer: js.UndefOr[JQuery] = js.undefined
}

object TimelineChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Timeline,
    dataItem: Model = null,
    eventContainer: JQuery = null
  ): TimelineChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem.asInstanceOf[js.Any])
    if (eventContainer != null) __obj.updateDynamic("eventContainer")(eventContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineChangeEvent]
  }
}

