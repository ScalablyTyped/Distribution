package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesRecurrenceEditorMonthly extends js.Object {
  var day: js.UndefOr[String] = js.native
  var interval: js.UndefOr[String] = js.native
  var repeatEvery: js.UndefOr[String] = js.native
  var repeatOn: js.UndefOr[String] = js.native
}

object SchedulerMessagesRecurrenceEditorMonthly {
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorMonthly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorMonthly]
  }
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorMonthlyOps[Self <: SchedulerMessagesRecurrenceEditorMonthly] (val x: Self) extends AnyVal {
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
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setInterval(value: String): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setRepeatEvery(value: String): Self = this.set("repeatEvery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatEvery: Self = this.set("repeatEvery", js.undefined)
    @scala.inline
    def setRepeatOn(value: String): Self = this.set("repeatOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatOn: Self = this.set("repeatOn", js.undefined)
  }
  
}

