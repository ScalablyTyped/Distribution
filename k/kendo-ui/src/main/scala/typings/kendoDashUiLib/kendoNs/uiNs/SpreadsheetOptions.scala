package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpreadsheetOptions extends js.Object {
  var activeSheet: js.UndefOr[java.lang.String] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ SpreadsheetChangeEvent, scala.Unit]] = js.undefined
  var changeFormat: js.UndefOr[js.Function1[/* e */ SpreadsheetChangeFormatEvent, scala.Unit]] = js.undefined
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  var columns: js.UndefOr[scala.Double] = js.undefined
  var defaultCellStyle: js.UndefOr[SpreadsheetDefaultCellStyle] = js.undefined
  var deleteColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetDeleteColumnEvent, scala.Unit]] = js.undefined
  var deleteRow: js.UndefOr[js.Function1[/* e */ SpreadsheetDeleteRowEvent, scala.Unit]] = js.undefined
  var excel: js.UndefOr[SpreadsheetExcel] = js.undefined
  var excelExport: js.UndefOr[js.Function1[/* e */ SpreadsheetExcelExportEvent, scala.Unit]] = js.undefined
  var excelImport: js.UndefOr[js.Function1[/* e */ SpreadsheetExcelImportEvent, scala.Unit]] = js.undefined
  var headerHeight: js.UndefOr[scala.Double] = js.undefined
  var headerWidth: js.UndefOr[scala.Double] = js.undefined
  var hideColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetHideColumnEvent, scala.Unit]] = js.undefined
  var hideRow: js.UndefOr[js.Function1[/* e */ SpreadsheetHideRowEvent, scala.Unit]] = js.undefined
  var insertColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertColumnEvent, scala.Unit]] = js.undefined
  var insertRow: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertRowEvent, scala.Unit]] = js.undefined
  var insertSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertSheetEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pdf: js.UndefOr[SpreadsheetPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ SpreadsheetPdfExportEvent, scala.Unit]] = js.undefined
  var removeSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetRemoveSheetEvent, scala.Unit]] = js.undefined
  var renameSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetRenameSheetEvent, scala.Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* e */ SpreadsheetRenderEvent, scala.Unit]] = js.undefined
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ SpreadsheetSelectEvent, scala.Unit]] = js.undefined
  var selectSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetSelectSheetEvent, scala.Unit]] = js.undefined
  var sheets: js.UndefOr[js.Array[SpreadsheetSheet]] = js.undefined
  var sheetsbar: js.UndefOr[scala.Boolean] = js.undefined
  var toolbar: js.UndefOr[scala.Boolean | SpreadsheetToolbar] = js.undefined
  var unhideColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetUnhideColumnEvent, scala.Unit]] = js.undefined
  var unhideRow: js.UndefOr[js.Function1[/* e */ SpreadsheetUnhideRowEvent, scala.Unit]] = js.undefined
}

