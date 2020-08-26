package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridExcelExporterCallbacks
  extends /**
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
  var cellExported: js.UndefOr[js.Function] = js.native
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
  var cellExporting: js.UndefOr[js.Function] = js.native
  /**
    * A function to call when exporting fails.
    * Use error to obtain reference of the error object.
    *
    */
  var error: js.UndefOr[js.Function] = js.native
  /**
    * A function to call before the Excel file is downloaded.
    * Function takes arguments sender and args.
    * Use args.grid to get reference to the igGrid widget.
    * Use args.workbook to get reference to the Excel workbook.
    * Use args.worksheet to get reference to the Excel worksheet.
    * Return false in order to cancel downloading the file.
    *
    */
  var exportEnding: js.UndefOr[js.Function] = js.native
  /**
    * Cancel="true" A function to call before exporting starts.
    * Function takes arguments sender and args.
    * Use args.grid to get reference to igGrid widget.
    * Return false in order to cancel exporting.
    *
    */
  var exportStarting: js.UndefOr[js.Function] = js.native
  /**
    * A function to call after a header cell is exported.
    * Function takes arguments sender and args.
    * Use args.headerText to get the igGrid column header text.
    * Use args.columnKey to get the igGrid column key.
    * Use args.columnIndex to get the igGrid column index.
    *
    */
  var headerCellExported: js.UndefOr[js.Function] = js.native
  /**
    * A function to call before the header cell is exported.
    * Function takes arguments sender and args.
    * Use args.headerText to get or set the igGrid column header text.
    * Use args.columnKey to get the igGrid column key.
    * Use args.columnIndex to get the igGrid column index.
    * Return false in order to cancel exporting the cell.
    *
    */
  var headerCellExporting: js.UndefOr[js.Function] = js.native
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
  var rowExported: js.UndefOr[js.Function] = js.native
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
  var rowExporting: js.UndefOr[js.Function] = js.native
  /**
    * A function to call when saving the file succeeds.
    * Use data to get the reference of saved object.
    *
    */
  var success: js.UndefOr[js.Function] = js.native
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
  var summaryExported: js.UndefOr[js.Function] = js.native
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
  var summaryExporting: js.UndefOr[js.Function] = js.native
}

object GridExcelExporterCallbacks {
  @scala.inline
  def apply(): GridExcelExporterCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridExcelExporterCallbacks]
  }
  @scala.inline
  implicit class GridExcelExporterCallbacksOps[Self <: GridExcelExporterCallbacks] (val x: Self) extends AnyVal {
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
    def setCellExported(value: js.Function): Self = this.set("cellExported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellExported: Self = this.set("cellExported", js.undefined)
    @scala.inline
    def setCellExporting(value: js.Function): Self = this.set("cellExporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellExporting: Self = this.set("cellExporting", js.undefined)
    @scala.inline
    def setError(value: js.Function): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExportEnding(value: js.Function): Self = this.set("exportEnding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportEnding: Self = this.set("exportEnding", js.undefined)
    @scala.inline
    def setExportStarting(value: js.Function): Self = this.set("exportStarting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportStarting: Self = this.set("exportStarting", js.undefined)
    @scala.inline
    def setHeaderCellExported(value: js.Function): Self = this.set("headerCellExported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCellExported: Self = this.set("headerCellExported", js.undefined)
    @scala.inline
    def setHeaderCellExporting(value: js.Function): Self = this.set("headerCellExporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCellExporting: Self = this.set("headerCellExporting", js.undefined)
    @scala.inline
    def setRowExported(value: js.Function): Self = this.set("rowExported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowExported: Self = this.set("rowExported", js.undefined)
    @scala.inline
    def setRowExporting(value: js.Function): Self = this.set("rowExporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowExporting: Self = this.set("rowExporting", js.undefined)
    @scala.inline
    def setSuccess(value: js.Function): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setSummaryExported(value: js.Function): Self = this.set("summaryExported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryExported: Self = this.set("summaryExported", js.undefined)
    @scala.inline
    def setSummaryExporting(value: js.Function): Self = this.set("summaryExporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryExporting: Self = this.set("summaryExporting", js.undefined)
  }
  
}

