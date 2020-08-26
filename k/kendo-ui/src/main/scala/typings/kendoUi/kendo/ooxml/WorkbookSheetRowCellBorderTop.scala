package typings.kendoUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookSheetRowCellBorderTop extends js.Object {
  var color: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
}

object WorkbookSheetRowCellBorderTop {
  @scala.inline
  def apply(): WorkbookSheetRowCellBorderTop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSheetRowCellBorderTop]
  }
  @scala.inline
  implicit class WorkbookSheetRowCellBorderTopOps[Self <: WorkbookSheetRowCellBorderTop] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

