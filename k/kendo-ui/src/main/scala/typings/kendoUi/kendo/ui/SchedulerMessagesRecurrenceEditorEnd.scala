package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesRecurrenceEditorEnd extends js.Object {
  var after: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var mobileLabel: js.UndefOr[String] = js.native
  var never: js.UndefOr[String] = js.native
  var occurrence: js.UndefOr[String] = js.native
  var on: js.UndefOr[String] = js.native
}

object SchedulerMessagesRecurrenceEditorEnd {
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorEnd]
  }
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorEndOps[Self <: SchedulerMessagesRecurrenceEditorEnd] (val x: Self) extends AnyVal {
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
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMobileLabel(value: String): Self = this.set("mobileLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileLabel: Self = this.set("mobileLabel", js.undefined)
    @scala.inline
    def setNever(value: String): Self = this.set("never", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNever: Self = this.set("never", js.undefined)
    @scala.inline
    def setOccurrence(value: String): Self = this.set("occurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrence: Self = this.set("occurrence", js.undefined)
    @scala.inline
    def setOn(value: String): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
  }
  
}

