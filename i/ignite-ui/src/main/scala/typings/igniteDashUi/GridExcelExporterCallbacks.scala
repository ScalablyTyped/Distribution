package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridExcelExporterCallbacks
  extends /**
	 * Option for GridExcelExporterCallbacks
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
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for GridExcelExporterCallbacks
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    cellExported: js.Function = null,
    cellExporting: js.Function = null,
    error: js.Function = null,
    exportEnding: js.Function = null,
    exportStarting: js.Function = null,
    headerCellExported: js.Function = null,
    headerCellExporting: js.Function = null,
    rowExported: js.Function = null,
    rowExporting: js.Function = null,
    success: js.Function = null,
    summaryExported: js.Function = null,
    summaryExporting: js.Function = null
  ): GridExcelExporterCallbacks = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cellExported != null) __obj.updateDynamic("cellExported")(cellExported.asInstanceOf[js.Any])
    if (cellExporting != null) __obj.updateDynamic("cellExporting")(cellExporting.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (exportEnding != null) __obj.updateDynamic("exportEnding")(exportEnding.asInstanceOf[js.Any])
    if (exportStarting != null) __obj.updateDynamic("exportStarting")(exportStarting.asInstanceOf[js.Any])
    if (headerCellExported != null) __obj.updateDynamic("headerCellExported")(headerCellExported.asInstanceOf[js.Any])
    if (headerCellExporting != null) __obj.updateDynamic("headerCellExporting")(headerCellExporting.asInstanceOf[js.Any])
    if (rowExported != null) __obj.updateDynamic("rowExported")(rowExported.asInstanceOf[js.Any])
    if (rowExporting != null) __obj.updateDynamic("rowExporting")(rowExporting.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (summaryExported != null) __obj.updateDynamic("summaryExported")(summaryExported.asInstanceOf[js.Any])
    if (summaryExporting != null) __obj.updateDynamic("summaryExporting")(summaryExporting.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridExcelExporterCallbacks]
  }
}

