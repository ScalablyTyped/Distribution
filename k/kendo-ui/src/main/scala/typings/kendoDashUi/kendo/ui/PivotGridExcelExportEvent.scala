package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridExcelExportEvent extends PivotGridEvent {
  var data: js.UndefOr[js.Any] = js.undefined
  var workbook: js.UndefOr[js.Any] = js.undefined
}

object PivotGridExcelExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: PivotGrid,
    data: js.Any = null,
    workbook: js.Any = null
  ): PivotGridExcelExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (workbook != null) __obj.updateDynamic("workbook")(workbook.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridExcelExportEvent]
  }
}

