package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetOptions extends StObject {
  
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
  
  inline def apply(): SpreadsheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetOptions]
  }
  
  extension [Self <: SpreadsheetOptions](x: Self) {
    
    inline def setActiveSheet(value: String): Self = StObject.set(x, "activeSheet", value.asInstanceOf[js.Any])
    
    inline def setActiveSheetUndefined: Self = StObject.set(x, "activeSheet", js.undefined)
    
    inline def setChange(value: /* e */ SpreadsheetChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeFormat(value: /* e */ SpreadsheetChangeFormatEvent => Unit): Self = StObject.set(x, "changeFormat", js.Any.fromFunction1(value))
    
    inline def setChangeFormatUndefined: Self = StObject.set(x, "changeFormat", js.undefined)
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setChanging(value: /* e */ SpreadsheetChangingEvent => Unit): Self = StObject.set(x, "changing", js.Any.fromFunction1(value))
    
    inline def setChangingUndefined: Self = StObject.set(x, "changing", js.undefined)
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setCopy(value: /* e */ SpreadsheetCopyEvent => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCut(value: /* e */ SpreadsheetCutEvent => Unit): Self = StObject.set(x, "cut", js.Any.fromFunction1(value))
    
    inline def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
    
    inline def setDataBinding(value: /* e */ SpreadsheetDataBindingEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: /* e */ SpreadsheetDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDefaultCellStyle(value: SpreadsheetDefaultCellStyle): Self = StObject.set(x, "defaultCellStyle", value.asInstanceOf[js.Any])
    
    inline def setDefaultCellStyleUndefined: Self = StObject.set(x, "defaultCellStyle", js.undefined)
    
    inline def setDeleteColumn(value: /* e */ SpreadsheetDeleteColumnEvent => Unit): Self = StObject.set(x, "deleteColumn", js.Any.fromFunction1(value))
    
    inline def setDeleteColumnUndefined: Self = StObject.set(x, "deleteColumn", js.undefined)
    
    inline def setDeleteRow(value: /* e */ SpreadsheetDeleteRowEvent => Unit): Self = StObject.set(x, "deleteRow", js.Any.fromFunction1(value))
    
    inline def setDeleteRowUndefined: Self = StObject.set(x, "deleteRow", js.undefined)
    
    inline def setExcel(value: SpreadsheetExcel): Self = StObject.set(x, "excel", value.asInstanceOf[js.Any])
    
    inline def setExcelExport(value: /* e */ SpreadsheetExcelExportEvent => Unit): Self = StObject.set(x, "excelExport", js.Any.fromFunction1(value))
    
    inline def setExcelExportUndefined: Self = StObject.set(x, "excelExport", js.undefined)
    
    inline def setExcelImport(value: /* e */ SpreadsheetExcelImportEvent => Unit): Self = StObject.set(x, "excelImport", js.Any.fromFunction1(value))
    
    inline def setExcelImportUndefined: Self = StObject.set(x, "excelImport", js.undefined)
    
    inline def setExcelUndefined: Self = StObject.set(x, "excel", js.undefined)
    
    inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
    
    inline def setHeaderWidth(value: Double): Self = StObject.set(x, "headerWidth", value.asInstanceOf[js.Any])
    
    inline def setHeaderWidthUndefined: Self = StObject.set(x, "headerWidth", js.undefined)
    
    inline def setHideColumn(value: /* e */ SpreadsheetHideColumnEvent => Unit): Self = StObject.set(x, "hideColumn", js.Any.fromFunction1(value))
    
    inline def setHideColumnUndefined: Self = StObject.set(x, "hideColumn", js.undefined)
    
    inline def setHideRow(value: /* e */ SpreadsheetHideRowEvent => Unit): Self = StObject.set(x, "hideRow", js.Any.fromFunction1(value))
    
    inline def setHideRowUndefined: Self = StObject.set(x, "hideRow", js.undefined)
    
    inline def setInsertColumn(value: /* e */ SpreadsheetInsertColumnEvent => Unit): Self = StObject.set(x, "insertColumn", js.Any.fromFunction1(value))
    
    inline def setInsertColumnUndefined: Self = StObject.set(x, "insertColumn", js.undefined)
    
    inline def setInsertRow(value: /* e */ SpreadsheetInsertRowEvent => Unit): Self = StObject.set(x, "insertRow", js.Any.fromFunction1(value))
    
    inline def setInsertRowUndefined: Self = StObject.set(x, "insertRow", js.undefined)
    
    inline def setInsertSheet(value: /* e */ SpreadsheetInsertSheetEvent => Unit): Self = StObject.set(x, "insertSheet", js.Any.fromFunction1(value))
    
    inline def setInsertSheetUndefined: Self = StObject.set(x, "insertSheet", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPaste(value: /* e */ SpreadsheetPasteEvent => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
    
    inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    inline def setPdf(value: SpreadsheetPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfExport(value: /* e */ SpreadsheetPdfExportEvent => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1(value))
    
    inline def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setRemoveSheet(value: /* e */ SpreadsheetRemoveSheetEvent => Unit): Self = StObject.set(x, "removeSheet", js.Any.fromFunction1(value))
    
    inline def setRemoveSheetUndefined: Self = StObject.set(x, "removeSheet", js.undefined)
    
    inline def setRenameSheet(value: /* e */ SpreadsheetRenameSheetEvent => Unit): Self = StObject.set(x, "renameSheet", js.Any.fromFunction1(value))
    
    inline def setRenameSheetUndefined: Self = StObject.set(x, "renameSheet", js.undefined)
    
    inline def setRender(value: /* e */ SpreadsheetRenderEvent => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSelect(value: /* e */ SpreadsheetSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectSheet(value: /* e */ SpreadsheetSelectSheetEvent => Unit): Self = StObject.set(x, "selectSheet", js.Any.fromFunction1(value))
    
    inline def setSelectSheetUndefined: Self = StObject.set(x, "selectSheet", js.undefined)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSheets(value: js.Array[SpreadsheetSheet]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
    
    inline def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
    
    inline def setSheetsVarargs(value: SpreadsheetSheet*): Self = StObject.set(x, "sheets", js.Array(value :_*))
    
    inline def setSheetsbar(value: Boolean): Self = StObject.set(x, "sheetsbar", value.asInstanceOf[js.Any])
    
    inline def setSheetsbarUndefined: Self = StObject.set(x, "sheetsbar", js.undefined)
    
    inline def setToolbar(value: Boolean | SpreadsheetToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setUnhideColumn(value: /* e */ SpreadsheetUnhideColumnEvent => Unit): Self = StObject.set(x, "unhideColumn", js.Any.fromFunction1(value))
    
    inline def setUnhideColumnUndefined: Self = StObject.set(x, "unhideColumn", js.undefined)
    
    inline def setUnhideRow(value: /* e */ SpreadsheetUnhideRowEvent => Unit): Self = StObject.set(x, "unhideRow", js.Any.fromFunction1(value))
    
    inline def setUnhideRowUndefined: Self = StObject.set(x, "unhideRow", js.undefined)
  }
}
