package typings.kendoUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookSheet extends js.Object {
  var columns: js.UndefOr[js.Array[WorkbookSheetColumn]] = js.native
  var filter: js.UndefOr[WorkbookSheetFilter] = js.native
  var freezePane: js.UndefOr[WorkbookSheetFreezePane] = js.native
  var frozenColumns: js.UndefOr[Double] = js.native
  var frozenRows: js.UndefOr[Double] = js.native
  var mergedCells: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[String] = js.native
  var rows: js.UndefOr[js.Array[WorkbookSheetRow]] = js.native
  var showGridLines: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
}

object WorkbookSheet {
  @scala.inline
  def apply(): WorkbookSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSheet]
  }
  @scala.inline
  implicit class WorkbookSheetOps[Self <: WorkbookSheet] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: WorkbookSheetColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[WorkbookSheetColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setFilter(value: WorkbookSheetFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFreezePane(value: WorkbookSheetFreezePane): Self = this.set("freezePane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreezePane: Self = this.set("freezePane", js.undefined)
    @scala.inline
    def setFrozenColumns(value: Double): Self = this.set("frozenColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenColumns: Self = this.set("frozenColumns", js.undefined)
    @scala.inline
    def setFrozenRows(value: Double): Self = this.set("frozenRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenRows: Self = this.set("frozenRows", js.undefined)
    @scala.inline
    def setMergedCells(value: js.Any): Self = this.set("mergedCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergedCells: Self = this.set("mergedCells", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRowsVarargs(value: WorkbookSheetRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[WorkbookSheetRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setShowGridLines(value: Boolean): Self = this.set("showGridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGridLines: Self = this.set("showGridLines", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

