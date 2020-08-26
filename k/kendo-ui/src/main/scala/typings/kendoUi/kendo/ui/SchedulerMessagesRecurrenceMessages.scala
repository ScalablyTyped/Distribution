package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesRecurrenceMessages extends js.Object {
  var deleteRecurring: js.UndefOr[String] = js.native
  var deleteWindowOccurrence: js.UndefOr[String] = js.native
  var deleteWindowSeries: js.UndefOr[String] = js.native
  var deleteWindowTitle: js.UndefOr[String] = js.native
  var editRecurring: js.UndefOr[String] = js.native
  var editWindowOccurrence: js.UndefOr[String] = js.native
  var editWindowSeries: js.UndefOr[String] = js.native
  var editWindowTitle: js.UndefOr[String] = js.native
}

object SchedulerMessagesRecurrenceMessages {
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceMessages]
  }
  @scala.inline
  implicit class SchedulerMessagesRecurrenceMessagesOps[Self <: SchedulerMessagesRecurrenceMessages] (val x: Self) extends AnyVal {
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
    def setDeleteRecurring(value: String): Self = this.set("deleteRecurring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteRecurring: Self = this.set("deleteRecurring", js.undefined)
    @scala.inline
    def setDeleteWindowOccurrence(value: String): Self = this.set("deleteWindowOccurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteWindowOccurrence: Self = this.set("deleteWindowOccurrence", js.undefined)
    @scala.inline
    def setDeleteWindowSeries(value: String): Self = this.set("deleteWindowSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteWindowSeries: Self = this.set("deleteWindowSeries", js.undefined)
    @scala.inline
    def setDeleteWindowTitle(value: String): Self = this.set("deleteWindowTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteWindowTitle: Self = this.set("deleteWindowTitle", js.undefined)
    @scala.inline
    def setEditRecurring(value: String): Self = this.set("editRecurring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditRecurring: Self = this.set("editRecurring", js.undefined)
    @scala.inline
    def setEditWindowOccurrence(value: String): Self = this.set("editWindowOccurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditWindowOccurrence: Self = this.set("editWindowOccurrence", js.undefined)
    @scala.inline
    def setEditWindowSeries(value: String): Self = this.set("editWindowSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditWindowSeries: Self = this.set("editWindowSeries", js.undefined)
    @scala.inline
    def setEditWindowTitle(value: String): Self = this.set("editWindowTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditWindowTitle: Self = this.set("editWindowTitle", js.undefined)
  }
  
}

