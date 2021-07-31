package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetSheet extends StObject {
  
  var activeCell: js.UndefOr[String] = js.undefined
  
  var columns: js.UndefOr[js.Array[SpreadsheetSheetColumn]] = js.undefined
  
  var dataSource: js.UndefOr[DataSource] = js.undefined
  
  var filter: js.UndefOr[SpreadsheetSheetFilter] = js.undefined
  
  var frozenColumns: js.UndefOr[Double] = js.undefined
  
  var frozenRows: js.UndefOr[Double] = js.undefined
  
  var mergedCells: js.UndefOr[js.Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var rows: js.UndefOr[js.Array[SpreadsheetSheetRow]] = js.undefined
  
  var selection: js.UndefOr[String] = js.undefined
  
  var showGridLines: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[SpreadsheetSheetSort] = js.undefined
}
object SpreadsheetSheet {
  
  @scala.inline
  def apply(): SpreadsheetSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheet]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetMutableBuilder[Self <: SpreadsheetSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveCell(value: String): Self = StObject.set(x, "activeCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveCellUndefined: Self = StObject.set(x, "activeCell", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[SpreadsheetSheetColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: SpreadsheetSheetColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setFilter(value: SpreadsheetSheetFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFrozenColumns(value: Double): Self = StObject.set(x, "frozenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrozenColumnsUndefined: Self = StObject.set(x, "frozenColumns", js.undefined)
    
    @scala.inline
    def setFrozenRows(value: Double): Self = StObject.set(x, "frozenRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrozenRowsUndefined: Self = StObject.set(x, "frozenRows", js.undefined)
    
    @scala.inline
    def setMergedCells(value: js.Any): Self = StObject.set(x, "mergedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergedCellsUndefined: Self = StObject.set(x, "mergedCells", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[SpreadsheetSheetRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SpreadsheetSheetRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setShowGridLines(value: Boolean): Self = StObject.set(x, "showGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridLinesUndefined: Self = StObject.set(x, "showGridLines", js.undefined)
    
    @scala.inline
    def setSort(value: SpreadsheetSheetSort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
