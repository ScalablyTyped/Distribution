package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetOptions extends js.Object {
  
  var activeSheet: js.UndefOr[String] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ SpreadsheetChangeEvent, Unit]] = js.native
  
  var changeFormat: js.UndefOr[js.Function1[/* e */ SpreadsheetChangeFormatEvent, Unit]] = js.native
  
  var changing: js.UndefOr[js.Function1[/* e */ SpreadsheetChangingEvent, Unit]] = js.native
  
  var columnWidth: js.UndefOr[Double] = js.native
  
  var columns: js.UndefOr[Double] = js.native
  
  var copy: js.UndefOr[js.Function1[/* e */ SpreadsheetCopyEvent, Unit]] = js.native
  
  var cut: js.UndefOr[js.Function1[/* e */ SpreadsheetCutEvent, Unit]] = js.native
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ SpreadsheetDataBindingEvent, Unit]] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ SpreadsheetDataBoundEvent, Unit]] = js.native
  
  var defaultCellStyle: js.UndefOr[SpreadsheetDefaultCellStyle] = js.native
  
  var deleteColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetDeleteColumnEvent, Unit]] = js.native
  
  var deleteRow: js.UndefOr[js.Function1[/* e */ SpreadsheetDeleteRowEvent, Unit]] = js.native
  
  var excel: js.UndefOr[SpreadsheetExcel] = js.native
  
  var excelExport: js.UndefOr[js.Function1[/* e */ SpreadsheetExcelExportEvent, Unit]] = js.native
  
  var excelImport: js.UndefOr[js.Function1[/* e */ SpreadsheetExcelImportEvent, Unit]] = js.native
  
  var headerHeight: js.UndefOr[Double] = js.native
  
  var headerWidth: js.UndefOr[Double] = js.native
  
  var hideColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetHideColumnEvent, Unit]] = js.native
  
  var hideRow: js.UndefOr[js.Function1[/* e */ SpreadsheetHideRowEvent, Unit]] = js.native
  
  var insertColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertColumnEvent, Unit]] = js.native
  
  var insertRow: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertRowEvent, Unit]] = js.native
  
  var insertSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertSheetEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var paste: js.UndefOr[js.Function1[/* e */ SpreadsheetPasteEvent, Unit]] = js.native
  
  var pdf: js.UndefOr[SpreadsheetPdf] = js.native
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ SpreadsheetPdfExportEvent, Unit]] = js.native
  
  var removeSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetRemoveSheetEvent, Unit]] = js.native
  
  var renameSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetRenameSheetEvent, Unit]] = js.native
  
  var render: js.UndefOr[js.Function1[/* e */ SpreadsheetRenderEvent, Unit]] = js.native
  
  var rowHeight: js.UndefOr[Double] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ SpreadsheetSelectEvent, Unit]] = js.native
  
  var selectSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetSelectSheetEvent, Unit]] = js.native
  
  var sheets: js.UndefOr[js.Array[SpreadsheetSheet]] = js.native
  
  var sheetsbar: js.UndefOr[Boolean] = js.native
  
  var toolbar: js.UndefOr[Boolean | SpreadsheetToolbar] = js.native
  
  var unhideColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetUnhideColumnEvent, Unit]] = js.native
  
  var unhideRow: js.UndefOr[js.Function1[/* e */ SpreadsheetUnhideRowEvent, Unit]] = js.native
}
object SpreadsheetOptions {
  
  @scala.inline
  def apply(): SpreadsheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetOptions]
  }
  
  @scala.inline
  implicit class SpreadsheetOptionsOps[Self <: SpreadsheetOptions] (val x: Self) extends AnyVal {
    
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
    def setActiveSheet(value: String): Self = this.set("activeSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveSheet: Self = this.set("activeSheet", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ SpreadsheetChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setChangeFormat(value: /* e */ SpreadsheetChangeFormatEvent => Unit): Self = this.set("changeFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChangeFormat: Self = this.set("changeFormat", js.undefined)
    
    @scala.inline
    def setChanging(value: /* e */ SpreadsheetChangingEvent => Unit): Self = this.set("changing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChanging: Self = this.set("changing", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCopy(value: /* e */ SpreadsheetCopyEvent => Unit): Self = this.set("copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setCut(value: /* e */ SpreadsheetCutEvent => Unit): Self = this.set("cut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCut: Self = this.set("cut", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ SpreadsheetDataBindingEvent => Unit): Self = this.set("dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ SpreadsheetDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDefaultCellStyle(value: SpreadsheetDefaultCellStyle): Self = this.set("defaultCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCellStyle: Self = this.set("defaultCellStyle", js.undefined)
    
    @scala.inline
    def setDeleteColumn(value: /* e */ SpreadsheetDeleteColumnEvent => Unit): Self = this.set("deleteColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeleteColumn: Self = this.set("deleteColumn", js.undefined)
    
    @scala.inline
    def setDeleteRow(value: /* e */ SpreadsheetDeleteRowEvent => Unit): Self = this.set("deleteRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeleteRow: Self = this.set("deleteRow", js.undefined)
    
    @scala.inline
    def setExcel(value: SpreadsheetExcel): Self = this.set("excel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcel: Self = this.set("excel", js.undefined)
    
    @scala.inline
    def setExcelExport(value: /* e */ SpreadsheetExcelExportEvent => Unit): Self = this.set("excelExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExcelExport: Self = this.set("excelExport", js.undefined)
    
    @scala.inline
    def setExcelImport(value: /* e */ SpreadsheetExcelImportEvent => Unit): Self = this.set("excelImport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExcelImport: Self = this.set("excelImport", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setHeaderWidth(value: Double): Self = this.set("headerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderWidth: Self = this.set("headerWidth", js.undefined)
    
    @scala.inline
    def setHideColumn(value: /* e */ SpreadsheetHideColumnEvent => Unit): Self = this.set("hideColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHideColumn: Self = this.set("hideColumn", js.undefined)
    
    @scala.inline
    def setHideRow(value: /* e */ SpreadsheetHideRowEvent => Unit): Self = this.set("hideRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHideRow: Self = this.set("hideRow", js.undefined)
    
    @scala.inline
    def setInsertColumn(value: /* e */ SpreadsheetInsertColumnEvent => Unit): Self = this.set("insertColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertColumn: Self = this.set("insertColumn", js.undefined)
    
    @scala.inline
    def setInsertRow(value: /* e */ SpreadsheetInsertRowEvent => Unit): Self = this.set("insertRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertRow: Self = this.set("insertRow", js.undefined)
    
    @scala.inline
    def setInsertSheet(value: /* e */ SpreadsheetInsertSheetEvent => Unit): Self = this.set("insertSheet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertSheet: Self = this.set("insertSheet", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPaste(value: /* e */ SpreadsheetPasteEvent => Unit): Self = this.set("paste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    
    @scala.inline
    def setPdf(value: SpreadsheetPdf): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setPdfExport(value: /* e */ SpreadsheetPdfExportEvent => Unit): Self = this.set("pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePdfExport: Self = this.set("pdfExport", js.undefined)
    
    @scala.inline
    def setRemoveSheet(value: /* e */ SpreadsheetRemoveSheetEvent => Unit): Self = this.set("removeSheet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveSheet: Self = this.set("removeSheet", js.undefined)
    
    @scala.inline
    def setRenameSheet(value: /* e */ SpreadsheetRenameSheetEvent => Unit): Self = this.set("renameSheet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenameSheet: Self = this.set("renameSheet", js.undefined)
    
    @scala.inline
    def setRender(value: /* e */ SpreadsheetRenderEvent => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ SpreadsheetSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectSheet(value: /* e */ SpreadsheetSelectSheetEvent => Unit): Self = this.set("selectSheet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectSheet: Self = this.set("selectSheet", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: SpreadsheetSheet*): Self = this.set("sheets", js.Array(value :_*))
    
    @scala.inline
    def setSheets(value: js.Array[SpreadsheetSheet]): Self = this.set("sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheets: Self = this.set("sheets", js.undefined)
    
    @scala.inline
    def setSheetsbar(value: Boolean): Self = this.set("sheetsbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetsbar: Self = this.set("sheetsbar", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean | SpreadsheetToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setUnhideColumn(value: /* e */ SpreadsheetUnhideColumnEvent => Unit): Self = this.set("unhideColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnhideColumn: Self = this.set("unhideColumn", js.undefined)
    
    @scala.inline
    def setUnhideRow(value: /* e */ SpreadsheetUnhideRowEvent => Unit): Self = this.set("unhideRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnhideRow: Self = this.set("unhideRow", js.undefined)
  }
}
