package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesRecurrenceEditorDaily extends js.Object {
  var interval: js.UndefOr[String] = js.native
  var repeatEvery: js.UndefOr[String] = js.native
}

object SchedulerMessagesRecurrenceEditorDaily {
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorDaily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorDaily]
  }
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorDailyOps[Self <: SchedulerMessagesRecurrenceEditorDaily] (val x: Self) extends AnyVal {
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
    def setInterval(value: String): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setRepeatEvery(value: String): Self = this.set("repeatEvery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatEvery: Self = this.set("repeatEvery", js.undefined)
  }
  
}

