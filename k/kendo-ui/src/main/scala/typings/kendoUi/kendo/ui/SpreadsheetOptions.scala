package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetOptions extends StObject {
  
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
  implicit class SpreadsheetOptionsMutableBuilder[Self <: SpreadsheetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveSheet(value: String): Self = StObject.set(x, "activeSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSheetUndefined: Self = StObject.set(x, "activeSheet", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ SpreadsheetChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeFormat(value: /* e */ SpreadsheetChangeFormatEvent => Unit): Self = StObject.set(x, "changeFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeFormatUndefined: Self = StObject.set(x, "changeFormat", js.undefined)
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setChanging(value: /* e */ SpreadsheetChangingEvent => Unit): Self = StObject.set(x, "changing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangingUndefined: Self = StObject.set(x, "changing", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setCopy(value: /* e */ SpreadsheetCopyEvent => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setCut(value: /* e */ SpreadsheetCutEvent => Unit): Self = StObject.set(x, "cut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ SpreadsheetDataBindingEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ SpreadsheetDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDefaultCellStyle(value: SpreadsheetDefaultCellStyle): Self = StObject.set(x, "defaultCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCellStyleUndefined: Self = StObject.set(x, "defaultCellStyle", js.undefined)
    
    @scala.inline
    def setDeleteColumn(value: /* e */ SpreadsheetDeleteColumnEvent => Unit): Self = StObject.set(x, "deleteColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteColumnUndefined: Self = StObject.set(x, "deleteColumn", js.undefined)
    
    @scala.inline
    def setDeleteRow(value: /* e */ SpreadsheetDeleteRowEvent => Unit): Self = StObject.set(x, "deleteRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteRowUndefined: Self = StObject.set(x, "deleteRow", js.undefined)
    
    @scala.inline
    def setExcel(value: SpreadsheetExcel): Self = StObject.set(x, "excel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelExport(value: /* e */ SpreadsheetExcelExportEvent => Unit): Self = StObject.set(x, "excelExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcelExportUndefined: Self = StObject.set(x, "excelExport", js.undefined)
    
    @scala.inline
    def setExcelImport(value: /* e */ SpreadsheetExcelImportEvent => Unit): Self = StObject.set(x, "excelImport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcelImportUndefined: Self = StObject.set(x, "excelImport", js.undefined)
    
    @scala.inline
    def setExcelUndefined: Self = StObject.set(x, "excel", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
    
    @scala.inline
    def setHeaderWidth(value: Double): Self = StObject.set(x, "headerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderWidthUndefined: Self = StObject.set(x, "headerWidth", js.undefined)
    
    @scala.inline
    def setHideColumn(value: /* e */ SpreadsheetHideColumnEvent => Unit): Self = StObject.set(x, "hideColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideColumnUndefined: Self = StObject.set(x, "hideColumn", js.undefined)
    
    @scala.inline
    def setHideRow(value: /* e */ SpreadsheetHideRowEvent => Unit): Self = StObject.set(x, "hideRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideRowUndefined: Self = StObject.set(x, "hideRow", js.undefined)
    
    @scala.inline
    def setInsertColumn(value: /* e */ SpreadsheetInsertColumnEvent => Unit): Self = StObject.set(x, "insertColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertColumnUndefined: Self = StObject.set(x, "insertColumn", js.undefined)
    
    @scala.inline
    def setInsertRow(value: /* e */ SpreadsheetInsertRowEvent => Unit): Self = StObject.set(x, "insertRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertRowUndefined: Self = StObject.set(x, "insertRow", js.undefined)
    
    @scala.inline
    def setInsertSheet(value: /* e */ SpreadsheetInsertSheetEvent => Unit): Self = StObject.set(x, "insertSheet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertSheetUndefined: Self = StObject.set(x, "insertSheet", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPaste(value: /* e */ SpreadsheetPasteEvent => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    @scala.inline
    def setPdf(value: SpreadsheetPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfExport(value: /* e */ SpreadsheetPdfExportEvent => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    @scala.inline
    def setRemoveSheet(value: /* e */ SpreadsheetRemoveSheetEvent => Unit): Self = StObject.set(x, "removeSheet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSheetUndefined: Self = StObject.set(x, "removeSheet", js.undefined)
    
    @scala.inline
    def setRenameSheet(value: /* e */ SpreadsheetRenameSheetEvent => Unit): Self = StObject.set(x, "renameSheet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameSheetUndefined: Self = StObject.set(x, "renameSheet", js.undefined)
    
    @scala.inline
    def setRender(value: /* e */ SpreadsheetRenderEvent => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ SpreadsheetSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectSheet(value: /* e */ SpreadsheetSelectSheetEvent => Unit): Self = StObject.set(x, "selectSheet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectSheetUndefined: Self = StObject.set(x, "selectSheet", js.undefined)
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSheets(value: js.Array[SpreadsheetSheet]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: SpreadsheetSheet*): Self = StObject.set(x, "sheets", js.Array(value :_*))
    
    @scala.inline
    def setSheetsbar(value: Boolean): Self = StObject.set(x, "sheetsbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsbarUndefined: Self = StObject.set(x, "sheetsbar", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean | SpreadsheetToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setUnhideColumn(value: /* e */ SpreadsheetUnhideColumnEvent => Unit): Self = StObject.set(x, "unhideColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnhideColumnUndefined: Self = StObject.set(x, "unhideColumn", js.undefined)
    
    @scala.inline
    def setUnhideRow(value: /* e */ SpreadsheetUnhideRowEvent => Unit): Self = StObject.set(x, "unhideRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnhideRowUndefined: Self = StObject.set(x, "unhideRow", js.undefined)
  }
}
