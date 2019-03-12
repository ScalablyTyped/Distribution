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

object SpreadsheetOptions {
  @scala.inline
  def apply(
    activeSheet: java.lang.String = null,
    change: /* e */ SpreadsheetChangeEvent => scala.Unit = null,
    changeFormat: /* e */ SpreadsheetChangeFormatEvent => scala.Unit = null,
    columnWidth: scala.Int | scala.Double = null,
    columns: scala.Int | scala.Double = null,
    defaultCellStyle: SpreadsheetDefaultCellStyle = null,
    deleteColumn: /* e */ SpreadsheetDeleteColumnEvent => scala.Unit = null,
    deleteRow: /* e */ SpreadsheetDeleteRowEvent => scala.Unit = null,
    excel: SpreadsheetExcel = null,
    excelExport: /* e */ SpreadsheetExcelExportEvent => scala.Unit = null,
    excelImport: /* e */ SpreadsheetExcelImportEvent => scala.Unit = null,
    headerHeight: scala.Int | scala.Double = null,
    headerWidth: scala.Int | scala.Double = null,
    hideColumn: /* e */ SpreadsheetHideColumnEvent => scala.Unit = null,
    hideRow: /* e */ SpreadsheetHideRowEvent => scala.Unit = null,
    insertColumn: /* e */ SpreadsheetInsertColumnEvent => scala.Unit = null,
    insertRow: /* e */ SpreadsheetInsertRowEvent => scala.Unit = null,
    insertSheet: /* e */ SpreadsheetInsertSheetEvent => scala.Unit = null,
    name: java.lang.String = null,
    pdf: SpreadsheetPdf = null,
    pdfExport: /* e */ SpreadsheetPdfExportEvent => scala.Unit = null,
    removeSheet: /* e */ SpreadsheetRemoveSheetEvent => scala.Unit = null,
    renameSheet: /* e */ SpreadsheetRenameSheetEvent => scala.Unit = null,
    render: /* e */ SpreadsheetRenderEvent => scala.Unit = null,
    rowHeight: scala.Int | scala.Double = null,
    rows: scala.Int | scala.Double = null,
    select: /* e */ SpreadsheetSelectEvent => scala.Unit = null,
    selectSheet: /* e */ SpreadsheetSelectSheetEvent => scala.Unit = null,
    sheets: js.Array[SpreadsheetSheet] = null,
    sheetsbar: js.UndefOr[scala.Boolean] = js.undefined,
    toolbar: scala.Boolean | SpreadsheetToolbar = null,
    unhideColumn: /* e */ SpreadsheetUnhideColumnEvent => scala.Unit = null,
    unhideRow: /* e */ SpreadsheetUnhideRowEvent => scala.Unit = null
  ): SpreadsheetOptions = {
    val __obj = js.Dynamic.literal()
    if (activeSheet != null) __obj.updateDynamic("activeSheet")(activeSheet)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (changeFormat != null) __obj.updateDynamic("changeFormat")(js.Any.fromFunction1(changeFormat))
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (defaultCellStyle != null) __obj.updateDynamic("defaultCellStyle")(defaultCellStyle)
    if (deleteColumn != null) __obj.updateDynamic("deleteColumn")(js.Any.fromFunction1(deleteColumn))
    if (deleteRow != null) __obj.updateDynamic("deleteRow")(js.Any.fromFunction1(deleteRow))
    if (excel != null) __obj.updateDynamic("excel")(excel)
    if (excelExport != null) __obj.updateDynamic("excelExport")(js.Any.fromFunction1(excelExport))
    if (excelImport != null) __obj.updateDynamic("excelImport")(js.Any.fromFunction1(excelImport))
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (headerWidth != null) __obj.updateDynamic("headerWidth")(headerWidth.asInstanceOf[js.Any])
    if (hideColumn != null) __obj.updateDynamic("hideColumn")(js.Any.fromFunction1(hideColumn))
    if (hideRow != null) __obj.updateDynamic("hideRow")(js.Any.fromFunction1(hideRow))
    if (insertColumn != null) __obj.updateDynamic("insertColumn")(js.Any.fromFunction1(insertColumn))
    if (insertRow != null) __obj.updateDynamic("insertRow")(js.Any.fromFunction1(insertRow))
    if (insertSheet != null) __obj.updateDynamic("insertSheet")(js.Any.fromFunction1(insertSheet))
    if (name != null) __obj.updateDynamic("name")(name)
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(js.Any.fromFunction1(pdfExport))
    if (removeSheet != null) __obj.updateDynamic("removeSheet")(js.Any.fromFunction1(removeSheet))
    if (renameSheet != null) __obj.updateDynamic("renameSheet")(js.Any.fromFunction1(renameSheet))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectSheet != null) __obj.updateDynamic("selectSheet")(js.Any.fromFunction1(selectSheet))
    if (sheets != null) __obj.updateDynamic("sheets")(sheets)
    if (!js.isUndefined(sheetsbar)) __obj.updateDynamic("sheetsbar")(sheetsbar)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (unhideColumn != null) __obj.updateDynamic("unhideColumn")(js.Any.fromFunction1(unhideColumn))
    if (unhideRow != null) __obj.updateDynamic("unhideRow")(js.Any.fromFunction1(unhideRow))
    __obj.asInstanceOf[SpreadsheetOptions]
  }
}

