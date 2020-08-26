package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.ooxml.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridExcelExportEvent extends GridEvent {
  var data: js.UndefOr[js.Any] = js.native
  var workbook: js.UndefOr[Workbook] = js.native
}

object GridExcelExportEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridExcelExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridExcelExportEvent]
  }
  @scala.inline
  implicit class GridExcelExportEventOps[Self <: GridExcelExportEvent] (val x: Self) extends AnyVal {
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
    def setWorkbook(value: Workbook): Self = this.set("workbook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkbook: Self = this.set("workbook", js.undefined)
  }
  
}

