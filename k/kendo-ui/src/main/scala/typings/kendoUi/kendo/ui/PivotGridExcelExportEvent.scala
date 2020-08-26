package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGridExcelExportEvent extends PivotGridEvent {
  var data: js.UndefOr[js.Any] = js.native
  var workbook: js.UndefOr[js.Any] = js.native
}

object PivotGridExcelExportEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PivotGrid): PivotGridExcelExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridExcelExportEvent]
  }
  @scala.inline
  implicit class PivotGridExcelExportEventOps[Self <: PivotGridExcelExportEvent] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setWorkbook(value: js.Any): Self = this.set("workbook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkbook: Self = this.set("workbook", js.undefined)
  }
  
}

