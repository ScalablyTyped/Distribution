package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceMessages extends js.Object {
  var deleteRecurring: js.UndefOr[String] = js.undefined
  var deleteWindowOccurrence: js.UndefOr[String] = js.undefined
  var deleteWindowSeries: js.UndefOr[String] = js.undefined
  var deleteWindowTitle: js.UndefOr[String] = js.undefined
  var editRecurring: js.UndefOr[String] = js.undefined
  var editWindowOccurrence: js.UndefOr[String] = js.undefined
  var editWindowSeries: js.UndefOr[String] = js.undefined
  var editWindowTitle: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesRecurrenceMessages {
  @scala.inline
  def apply(
    deleteRecurring: String = null,
    deleteWindowOccurrence: String = null,
    deleteWindowSeries: String = null,
    deleteWindowTitle: String = null,
    editRecurring: String = null,
    editWindowOccurrence: String = null,
    editWindowSeries: String = null,
    editWindowTitle: String = null
  ): SchedulerMessagesRecurrenceMessages = {
    val __obj = js.Dynamic.literal()
    if (deleteRecurring != null) __obj.updateDynamic("deleteRecurring")(deleteRecurring.asInstanceOf[js.Any])
    if (deleteWindowOccurrence != null) __obj.updateDynamic("deleteWindowOccurrence")(deleteWindowOccurrence.asInstanceOf[js.Any])
    if (deleteWindowSeries != null) __obj.updateDynamic("deleteWindowSeries")(deleteWindowSeries.asInstanceOf[js.Any])
    if (deleteWindowTitle != null) __obj.updateDynamic("deleteWindowTitle")(deleteWindowTitle.asInstanceOf[js.Any])
    if (editRecurring != null) __obj.updateDynamic("editRecurring")(editRecurring.asInstanceOf[js.Any])
    if (editWindowOccurrence != null) __obj.updateDynamic("editWindowOccurrence")(editWindowOccurrence.asInstanceOf[js.Any])
    if (editWindowSeries != null) __obj.updateDynamic("editWindowSeries")(editWindowSeries.asInstanceOf[js.Any])
    if (editWindowTitle != null) __obj.updateDynamic("editWindowTitle")(editWindowTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessagesRecurrenceMessages]
  }
}

