package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetSheet extends js.Object {
  
  var activeCell: js.UndefOr[String] = js.native
  
  var columns: js.UndefOr[js.Array[SpreadsheetSheetColumn]] = js.native
  
  var dataSource: js.UndefOr[DataSource] = js.native
  
  var filter: js.UndefOr[SpreadsheetSheetFilter] = js.native
  
  var frozenColumns: js.UndefOr[Double] = js.native
  
  var frozenRows: js.UndefOr[Double] = js.native
  
  var mergedCells: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[js.Array[SpreadsheetSheetRow]] = js.native
  
  var selection: js.UndefOr[String] = js.native
  
  var showGridLines: js.UndefOr[Boolean] = js.native
  
  var sort: js.UndefOr[SpreadsheetSheetSort] = js.native
}
object SpreadsheetSheet {
  
  @scala.inline
  def apply(): SpreadsheetSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheet]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetOps[Self <: SpreadsheetSheet] (val x: Self) extends AnyVal {
    
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
    def setActiveCell(value: String): Self = this.set("activeCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveCell: Self = this.set("activeCell", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: SpreadsheetSheetColumn*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[SpreadsheetSheetColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setFilter(value: SpreadsheetSheetFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
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
    def setRowsVarargs(value: SpreadsheetSheetRow*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[SpreadsheetSheetRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSelection(value: String): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setShowGridLines(value: Boolean): Self = this.set("showGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGridLines: Self = this.set("showGridLines", js.undefined)
    
    @scala.inline
    def setSort(value: SpreadsheetSheetSort): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
