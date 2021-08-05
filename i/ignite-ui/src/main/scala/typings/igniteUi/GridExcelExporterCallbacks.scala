package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridExcelExporterCallbacks
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A function to call after the cell is exported.
    * Function takes arguments sender and args.
    * Use args.columnKey to get the igGrid column key of the cell.
    * Use args.columnIndex to get the igGrid column index of the cell.
    * Use args.cellValue to get the igGrid cell value.
    * Use args.rowId to get key or index of row.
    * Use args.xlRow to get reference to the worksheet row.
    * Use args.grid to get reference to the igGrid widget.
    *
    */
  var cellExported: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Cancel="true" A function to call before the cell is exported.
    * Function takes arguments sender and args.
    * Use args.columnKey to get the igGrid column key of the cell.
    * Use args.columnIndex to get the igGrid column index of the cell.
    * Use args.cellValue to get or set the igGrid cell value.
    * Use args.rowId to get key or index of row.
    * Use args.xlRow to get reference to the worksheet row.
    * Use args.grid to get reference to the igGrid widget.
    * Return false in order to cancel exporting the cell.
    *
    */
  var cellExporting: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to call when exporting fails.
    * Use error to obtain reference of the error object.
    *
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to call before the Excel file is downloaded.
    * Function takes arguments sender and args.
    * Use args.grid to get reference to the igGrid widget.
    * Use args.workbook to get reference to the Excel workbook.
    * Use args.worksheet to get reference to the Excel worksheet.
    * Return false in order to cancel downloading the file.
    *
    */
  var exportEnding: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Cancel="true" A function to call before exporting starts.
    * Function takes arguments sender and args.
    * Use args.grid to get reference to igGrid widget.
    * Return false in order to cancel exporting.
    *
    */
  var exportStarting: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to call after a header cell is exported.
    * Function takes arguments sender and args.
    * Use args.headerText to get the igGrid column header text.
    * Use args.columnKey to get the igGrid column key.
    * Use args.columnIndex to get the igGrid column index.
    *
    */
  var headerCellExported: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to call before the header cell is exported.
    * Function takes arguments sender and args.
    * Use args.headerText to get or set the igGrid column header text.
    * Use args.columnKey to get the igGrid column key.
    * Use args.columnIndex to get the igGrid column index.
    * Return false in order to cancel exporting the cell.
    *
    */
  var headerCellExporting: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Cancel="true" A function to call after the row is exported.
    * Function takes arguments sender and args.
    * Use args.rowId to get key or index of row.
    * Use args.element to get row TR element.
    * Use args.xlRow to get reference to the worksheet row.
    * Use args.grid to get reference to the igGrid widget.
    * Note: When exporting igHierarchicalGrid this callback is available only for the root grid rows.
    *
    */
  var rowExported: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to call before the row is exported.
    * Function takes arguments sender and args.
    * Use args.rowId to get key or index of row.
    * Use args.element to get row TR element.
    * Use args.xlRow to get reference to the worksheet row.
    * Use args.grid to get reference to the igGrid widget.
    * Return false in order to cancel exporting the row.
    * Note: When exporting igHierarchicalGrid this callback is available only for the root grid rows.
    *
    */
  var rowExporting: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to call when saving the file succeeds.
    * Use data to get the reference of saved object.
    *
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to call after the summary is exported.
    * Function takes arguments sender and args.
    * Use args.headerText to get the igGrid column header text.
    * Use args.columnKey to get the igGrid column key.
    * Use args.columnIndex to get the igGrid column index.
    * Use args.summary to get a reference to the summary object.
    * Use args.xlRowIndex to get the Excel worksheet row index.
    *
    */
  var summaryExported: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to call before the summary is exported.
    * Function takes arguments sender and args.
    * Use args.headerText to get the igGrid column header text.
    * Use args.columnKey to get the igGrid column key.
    * Use args.columnIndex to get the igGrid column index.
    * Use args.summary to get a reference to the summary object.
    * Use args.xlRowIndex to get reference to worksheet row index.
    * Return false in order to cancel exporting the summary.
    *
    */
  var summaryExporting: js.UndefOr[js.Function] = js.undefined
}
object GridExcelExporterCallbacks {
  
  inline def apply(): GridExcelExporterCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridExcelExporterCallbacks]
  }
  
  extension [Self <: GridExcelExporterCallbacks](x: Self) {
    
    inline def setCellExported(value: js.Function): Self = StObject.set(x, "cellExported", value.asInstanceOf[js.Any])
    
    inline def setCellExportedUndefined: Self = StObject.set(x, "cellExported", js.undefined)
    
    inline def setCellExporting(value: js.Function): Self = StObject.set(x, "cellExporting", value.asInstanceOf[js.Any])
    
    inline def setCellExportingUndefined: Self = StObject.set(x, "cellExporting", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExportEnding(value: js.Function): Self = StObject.set(x, "exportEnding", value.asInstanceOf[js.Any])
    
    inline def setExportEndingUndefined: Self = StObject.set(x, "exportEnding", js.undefined)
    
    inline def setExportStarting(value: js.Function): Self = StObject.set(x, "exportStarting", value.asInstanceOf[js.Any])
    
    inline def setExportStartingUndefined: Self = StObject.set(x, "exportStarting", js.undefined)
    
    inline def setHeaderCellExported(value: js.Function): Self = StObject.set(x, "headerCellExported", value.asInstanceOf[js.Any])
    
    inline def setHeaderCellExportedUndefined: Self = StObject.set(x, "headerCellExported", js.undefined)
    
    inline def setHeaderCellExporting(value: js.Function): Self = StObject.set(x, "headerCellExporting", value.asInstanceOf[js.Any])
    
    inline def setHeaderCellExportingUndefined: Self = StObject.set(x, "headerCellExporting", js.undefined)
    
    inline def setRowExported(value: js.Function): Self = StObject.set(x, "rowExported", value.asInstanceOf[js.Any])
    
    inline def setRowExportedUndefined: Self = StObject.set(x, "rowExported", js.undefined)
    
    inline def setRowExporting(value: js.Function): Self = StObject.set(x, "rowExporting", value.asInstanceOf[js.Any])
    
    inline def setRowExportingUndefined: Self = StObject.set(x, "rowExporting", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setSummaryExported(value: js.Function): Self = StObject.set(x, "summaryExported", value.asInstanceOf[js.Any])
    
    inline def setSummaryExportedUndefined: Self = StObject.set(x, "summaryExported", js.undefined)
    
    inline def setSummaryExporting(value: js.Function): Self = StObject.set(x, "summaryExporting", value.asInstanceOf[js.Any])
    
    inline def setSummaryExportingUndefined: Self = StObject.set(x, "summaryExporting", js.undefined)
  }
}
