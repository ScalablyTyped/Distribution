package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetSheetSort extends js.Object {
  var columns: js.UndefOr[js.Array[SpreadsheetSheetSortColumn]] = js.native
  var ref: js.UndefOr[String] = js.native
}

object SpreadsheetSheetSort {
  @scala.inline
  def apply(): SpreadsheetSheetSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetSort]
  }
  @scala.inline
  implicit class SpreadsheetSheetSortOps[Self <: SpreadsheetSheetSort] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: SpreadsheetSheetSortColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[SpreadsheetSheetSortColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
  
}

