package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetOptions extends js.Object {
  var activeSheet: js.UndefOr[String] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ SpreadsheetChangeEvent, Unit]] = js.undefined
  var changeFormat: js.UndefOr[js.Function1[/* e */ SpreadsheetChangeFormatEvent, Unit]] = js.undefined
  var changing: js.UndefOr[js.Function1[/* e */ SpreadsheetChangingEvent, Unit]] = js.undefined
  var columnWidth: js.UndefOr[Double] = js.undefined
  var columns: js.UndefOr[Double] = js.undefined
  var copy: js.UndefOr[js.Function1[/* e */ SpreadsheetCopyEvent, Unit]] = js.undefined
  var cut: js.UndefOr[js.Function1[/* e */ SpreadsheetCutEvent, Unit]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ SpreadsheetDataBindingEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ SpreadsheetDataBoundEvent, Unit]] = js.undefined
  var defaultCellStyle: js.UndefOr[SpreadsheetDefaultCellStyle] = js.undefined
  var deleteColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetDeleteColumnEvent, Unit]] = js.undefined
  var deleteRow: js.UndefOr[js.Function1[/* e */ SpreadsheetDeleteRowEvent, Unit]] = js.undefined
  var excel: js.UndefOr[SpreadsheetExcel] = js.undefined
  var excelExport: js.UndefOr[js.Function1[/* e */ SpreadsheetExcelExportEvent, Unit]] = js.undefined
  var excelImport: js.UndefOr[js.Function1[/* e */ SpreadsheetExcelImportEvent, Unit]] = js.undefined
  var headerHeight: js.UndefOr[Double] = js.undefined
  var headerWidth: js.UndefOr[Double] = js.undefined
  var hideColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetHideColumnEvent, Unit]] = js.undefined
  var hideRow: js.UndefOr[js.Function1[/* e */ SpreadsheetHideRowEvent, Unit]] = js.undefined
  var insertColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertColumnEvent, Unit]] = js.undefined
  var insertRow: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertRowEvent, Unit]] = js.undefined
  var insertSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertSheetEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var paste: js.UndefOr[js.Function1[/* e */ SpreadsheetPasteEvent, Unit]] = js.undefined
  var pdf: js.UndefOr[SpreadsheetPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ SpreadsheetPdfExportEvent, Unit]] = js.undefined
  var removeSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetRemoveSheetEvent, Unit]] = js.undefined
  var renameSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetRenameSheetEvent, Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* e */ SpreadsheetRenderEvent, Unit]] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ SpreadsheetSelectEvent, Unit]] = js.undefined
  var selectSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetSelectSheetEvent, Unit]] = js.undefined
  var sheets: js.UndefOr[js.Array[SpreadsheetSheet]] = js.undefined
  var sheetsbar: js.UndefOr[Boolean] = js.undefined
  var toolbar: js.UndefOr[Boolean | SpreadsheetToolbar] = js.undefined
  var unhideColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetUnhideColumnEvent, Unit]] = js.undefined
  var unhideRow: js.UndefOr[js.Function1[/* e */ SpreadsheetUnhideRowEvent, Unit]] = js.undefined
}

object SpreadsheetOptions {
  @scala.inline
  def apply(
    activeSheet: String = null,
    change: /* e */ SpreadsheetChangeEvent => Unit = null,
    changeFormat: /* e */ SpreadsheetChangeFormatEvent => Unit = null,
    changing: /* e */ SpreadsheetChangingEvent => Unit = null,
    columnWidth: js.UndefOr[Double] = js.undefined,
    columns: js.UndefOr[Double] = js.undefined,
    copy: /* e */ SpreadsheetCopyEvent => Unit = null,
    cut: /* e */ SpreadsheetCutEvent => Unit = null,
    dataBinding: /* e */ SpreadsheetDataBindingEvent => Unit = null,
    dataBound: /* e */ SpreadsheetDataBoundEvent => Unit = null,
    defaultCellStyle: SpreadsheetDefaultCellStyle = null,
    deleteColumn: /* e */ SpreadsheetDeleteColumnEvent => Unit = null,
    deleteRow: /* e */ SpreadsheetDeleteRowEvent => Unit = null,
    excel: SpreadsheetExcel = null,
    excelExport: /* e */ SpreadsheetExcelExportEvent => Unit = null,
    excelImport: /* e */ SpreadsheetExcelImportEvent => Unit = null,
    headerHeight: js.UndefOr[Double] = js.undefined,
    headerWidth: js.UndefOr[Double] = js.undefined,
    hideColumn: /* e */ SpreadsheetHideColumnEvent => Unit = null,
    hideRow: /* e */ SpreadsheetHideRowEvent => Unit = null,
    insertColumn: /* e */ SpreadsheetInsertColumnEvent => Unit = null,
    insertRow: /* e */ SpreadsheetInsertRowEvent => Unit = null,
    insertSheet: /* e */ SpreadsheetInsertSheetEvent => Unit = null,
    name: String = null,
    paste: /* e */ SpreadsheetPasteEvent => Unit = null,
    pdf: SpreadsheetPdf = null,
    pdfExport: /* e */ SpreadsheetPdfExportEvent => Unit = null,
    removeSheet: /* e */ SpreadsheetRemoveSheetEvent => Unit = null,
    renameSheet: /* e */ SpreadsheetRenameSheetEvent => Unit = null,
    render: /* e */ SpreadsheetRenderEvent => Unit = null,
    rowHeight: js.UndefOr[Double] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined,
    select: /* e */ SpreadsheetSelectEvent => Unit = null,
    selectSheet: /* e */ SpreadsheetSelectSheetEvent => Unit = null,
    sheets: js.Array[SpreadsheetSheet] = null,
    sheetsbar: js.UndefOr[Boolean] = js.undefined,
    toolbar: Boolean | SpreadsheetToolbar = null,
    unhideColumn: /* e */ SpreadsheetUnhideColumnEvent => Unit = null,
    unhideRow: /* e */ SpreadsheetUnhideRowEvent => Unit = null
  ): SpreadsheetOptions = {
    val __obj = js.Dynamic.literal()
    if (activeSheet != null) __obj.updateDynamic("activeSheet")(activeSheet.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (changeFormat != null) __obj.updateDynamic("changeFormat")(js.Any.fromFunction1(changeFormat))
    if (changing != null) __obj.updateDynamic("changing")(js.Any.fromFunction1(changing))
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction1(copy))
    if (cut != null) __obj.updateDynamic("cut")(js.Any.fromFunction1(cut))
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (defaultCellStyle != null) __obj.updateDynamic("defaultCellStyle")(defaultCellStyle.asInstanceOf[js.Any])
    if (deleteColumn != null) __obj.updateDynamic("deleteColumn")(js.Any.fromFunction1(deleteColumn))
    if (deleteRow != null) __obj.updateDynamic("deleteRow")(js.Any.fromFunction1(deleteRow))
    if (excel != null) __obj.updateDynamic("excel")(excel.asInstanceOf[js.Any])
    if (excelExport != null) __obj.updateDynamic("excelExport")(js.Any.fromFunction1(excelExport))
    if (excelImport != null) __obj.updateDynamic("excelImport")(js.Any.fromFunction1(excelImport))
    if (!js.isUndefined(headerHeight)) __obj.updateDynamic("headerHeight")(headerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerWidth)) __obj.updateDynamic("headerWidth")(headerWidth.get.asInstanceOf[js.Any])
    if (hideColumn != null) __obj.updateDynamic("hideColumn")(js.Any.fromFunction1(hideColumn))
    if (hideRow != null) __obj.updateDynamic("hideRow")(js.Any.fromFunction1(hideRow))
    if (insertColumn != null) __obj.updateDynamic("insertColumn")(js.Any.fromFunction1(insertColumn))
    if (insertRow != null) __obj.updateDynamic("insertRow")(js.Any.fromFunction1(insertRow))
    if (insertSheet != null) __obj.updateDynamic("insertSheet")(js.Any.fromFunction1(insertSheet))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1(paste))
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(js.Any.fromFunction1(pdfExport))
    if (removeSheet != null) __obj.updateDynamic("removeSheet")(js.Any.fromFunction1(removeSheet))
    if (renameSheet != null) __obj.updateDynamic("renameSheet")(js.Any.fromFunction1(renameSheet))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(rowHeight)) __obj.updateDynamic("rowHeight")(rowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectSheet != null) __obj.updateDynamic("selectSheet")(js.Any.fromFunction1(selectSheet))
    if (sheets != null) __obj.updateDynamic("sheets")(sheets.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetsbar)) __obj.updateDynamic("sheetsbar")(sheetsbar.get.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (unhideColumn != null) __obj.updateDynamic("unhideColumn")(js.Any.fromFunction1(unhideColumn))
    if (unhideRow != null) __obj.updateDynamic("unhideRow")(js.Any.fromFunction1(unhideRow))
    __obj.asInstanceOf[SpreadsheetOptions]
  }
}

