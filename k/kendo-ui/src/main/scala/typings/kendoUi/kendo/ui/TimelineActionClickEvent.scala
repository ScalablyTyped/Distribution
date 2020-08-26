package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineActionClickEvent extends TimelineEvent {
  var dataItem: js.UndefOr[Model] = js.native
  var element: js.UndefOr[JQuery] = js.native
}

object TimelineActionClickEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Timeline): TimelineActionClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineActionClickEvent]
  }
  @scala.inline
  implicit class TimelineActionClickEventOps[Self <: TimelineActionClickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataItem(value: Model): Self = this.set("dataItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataItem: Self = this.set("dataItem", js.undefined)
    @scala.inline
    def setElement(value: JQuery): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
  }
  
}

