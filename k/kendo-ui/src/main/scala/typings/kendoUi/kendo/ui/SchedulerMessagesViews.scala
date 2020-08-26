package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesViews extends js.Object {
  var agenda: js.UndefOr[String] = js.native
  var day: js.UndefOr[String] = js.native
  var month: js.UndefOr[String] = js.native
  var week: js.UndefOr[String] = js.native
}

object SchedulerMessagesViews {
  @scala.inline
  def apply(): SchedulerMessagesViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesViews]
  }
  @scala.inline
  implicit class SchedulerMessagesViewsOps[Self <: SchedulerMessagesViews] (val x: Self) extends AnyVal {
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
    def setAgenda(value: String): Self = this.set("agenda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgenda: Self = this.set("agenda", js.undefined)
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setWeek(value: String): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
  }
  
}

