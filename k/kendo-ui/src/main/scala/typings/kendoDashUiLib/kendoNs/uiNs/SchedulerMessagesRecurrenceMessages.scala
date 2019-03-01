package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceMessages extends js.Object {
  var deleteRecurring: js.UndefOr[java.lang.String] = js.undefined
  var deleteWindowOccurrence: js.UndefOr[java.lang.String] = js.undefined
  var deleteWindowSeries: js.UndefOr[java.lang.String] = js.undefined
  var deleteWindowTitle: js.UndefOr[java.lang.String] = js.undefined
  var editRecurring: js.UndefOr[java.lang.String] = js.undefined
  var editWindowOccurrence: js.UndefOr[java.lang.String] = js.undefined
  var editWindowSeries: js.UndefOr[java.lang.String] = js.undefined
  var editWindowTitle: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerMessagesRecurrenceMessages {
  @scala.inline
  def apply(
    deleteRecurring: java.lang.String = null,
    deleteWindowOccurrence: java.lang.String = null,
    deleteWindowSeries: java.lang.String = null,
    deleteWindowTitle: java.lang.String = null,
    editRecurring: java.lang.String = null,
    editWindowOccurrence: java.lang.String = null,
    editWindowSeries: java.lang.String = null,
    editWindowTitle: java.lang.String = null
  ): SchedulerMessagesRecurrenceMessages = {
    val __obj = js.Dynamic.literal()
    if (deleteRecurring != null) __obj.updateDynamic("deleteRecurring")(deleteRecurring)
    if (deleteWindowOccurrence != null) __obj.updateDynamic("deleteWindowOccurrence")(deleteWindowOccurrence)
    if (deleteWindowSeries != null) __obj.updateDynamic("deleteWindowSeries")(deleteWindowSeries)
    if (deleteWindowTitle != null) __obj.updateDynamic("deleteWindowTitle")(deleteWindowTitle)
    if (editRecurring != null) __obj.updateDynamic("editRecurring")(editRecurring)
    if (editWindowOccurrence != null) __obj.updateDynamic("editWindowOccurrence")(editWindowOccurrence)
    if (editWindowSeries != null) __obj.updateDynamic("editWindowSeries")(editWindowSeries)
    if (editWindowTitle != null) __obj.updateDynamic("editWindowTitle")(editWindowTitle)
    __obj.asInstanceOf[SchedulerMessagesRecurrenceMessages]
  }
}

