package typings.kendoUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookSheetFreezePane extends js.Object {
  var colSplit: js.UndefOr[Double] = js.native
  var rowSplit: js.UndefOr[Double] = js.native
}

object WorkbookSheetFreezePane {
  @scala.inline
  def apply(): WorkbookSheetFreezePane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSheetFreezePane]
  }
  @scala.inline
  implicit class WorkbookSheetFreezePaneOps[Self <: WorkbookSheetFreezePane] (val x: Self) extends AnyVal {
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
    def setColSplit(value: Double): Self = this.set("colSplit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSplit: Self = this.set("colSplit", js.undefined)
    @scala.inline
    def setRowSplit(value: Double): Self = this.set("rowSplit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSplit: Self = this.set("rowSplit", js.undefined)
  }
  
}

