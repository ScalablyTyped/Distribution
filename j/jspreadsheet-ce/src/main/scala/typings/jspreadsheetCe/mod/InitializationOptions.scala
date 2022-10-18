package typings.jspreadsheetCe.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jspreadsheetCe.anon.Colspan
import typings.jspreadsheetCe.jspreadsheetCeStrings.center
import typings.jspreadsheetCe.jspreadsheetCeStrings.left
import typings.jspreadsheetCe.jspreadsheetCeStrings.right
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializationOptions extends StObject {
  
  /** Allow comments over the cells: bool */
  var allowComments: js.UndefOr[Boolean] = js.undefined
  
  /** Allow delete a column: bool */
  var allowDeleteColumn: js.UndefOr[Boolean] = js.undefined
  
  /** Allow delete a row: bool */
  var allowDeleteRow: js.UndefOr[Boolean] = js.undefined
  
  /** Allow table export: bool */
  var allowExport: js.UndefOr[Boolean] = js.undefined
  
  /** Allow insert a new column: bool */
  var allowInsertColumn: js.UndefOr[Boolean] = js.undefined
  
  /** Allow insert a new row: bool */
  var allowInsertRow: js.UndefOr[Boolean] = js.undefined
  
  /** Allow user to create a new column: bool */
  var allowManualInsertColumn: js.UndefOr[Boolean] = js.undefined
  
  /** Allow user to insert a new row: bool */
  var allowManualInsertRow: js.UndefOr[Boolean] = js.undefined
  
  /** Allow rename a column: bool */
  var allowRenameColumn: js.UndefOr[Boolean] = js.undefined
  
  /** Auto increment actions when using the dragging corner */
  var autoIncrement: js.UndefOr[Any] = js.undefined
  
  /** Allow column dragging: bool */
  var columnDrag: js.UndefOr[Boolean] = js.undefined
  
  /** Allow column resizing: bool */
  var columnResize: js.UndefOr[Boolean] = js.undefined
  
  /** Allow column sorting: bool */
  var columnSorting: js.UndefOr[Boolean] = js.undefined
  
  /** Column type, title, width, align, dropdown options, text wrapping, mask, etc.: object */
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  
  /** Context menu content: function() { return customMenu } */
  // tslint:disable-next-line ban-types
  var contextMenu: js.UndefOr[js.Function] = js.undefined
  
  /** When is true copy and export will bring formula results, if false will bring formulas: boolean */
  var copyCompatibility: js.UndefOr[Boolean] = js.undefined
  
  /** Load a external CSV file from this URL: string */
  var csv: js.UndefOr[String] = js.undefined
  
  /** Default delimiter for the CSV file: string */
  var csvDelimiter: js.UndefOr[String] = js.undefined
  
  /** Default filename for a download method: string */
  var csvFileName: js.UndefOr[String] = js.undefined
  
  /** Load header titles from the CSV file: bool */
  var csvHeaders: js.UndefOr[Boolean] = js.undefined
  
  /** Load this data into the javascript table: array */
  var data: js.UndefOr[
    js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: {[ title in string | number ]: jspreadsheet-ce.jspreadsheet-ce.CellValue} */ js.Any) | js.Array[CellValue]
    ]
  ] = js.undefined
  
  /** Default align for a new column: [center, left, right] */
  var defaultColAlign: js.UndefOr[center | left | right] = js.undefined
  
  /** Default width for a new column: integer */
  var defaultColWidth: js.UndefOr[Double] = js.undefined
  
  /** Allow table edition: bool */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /** Allow freezing columns: number */
  var freezeColumns: js.UndefOr[Double] = js.undefined
  
  /** Include header titles on download: bool */
  var includeHeadersOnDownload: js.UndefOr[Boolean] = js.undefined
  
  /** Activate the table lazyloading */
  var lazyLoading: js.UndefOr[Boolean] = js.undefined
  
  /** Activate the loading spin */
  var loadingSpin: js.UndefOr[Boolean] = js.undefined
  
  /** Cells to be merged in the table initialization: object */
  var mergeCells: js.UndefOr[Record[String, Any]] = js.undefined
  
  /** Meta information: object */
  var meta: js.UndefOr[Record[String, Any]] = js.undefined
  
  /** Minimum table dimensions: [cols, rows] */
  var minDimensions: js.UndefOr[js.Array[Double] | (js.Tuple2[Double | Unit, Double])] = js.undefined
  
  /** Minimum number of spare cols: [integer] */
  var minSpareCols: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Minimum number of spare rows: [integer] */
  var minSpareRows: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Define the nested headers, including title, colspan, etc: object */
  var nestedHeaders: js.UndefOr[js.Array[js.Array[Colspan]]] = js.undefined
  
  /** Break the table by pages */
  var pagination: js.UndefOr[Double] = js.undefined
  
  /** Number of records per page: 25,50,75,100 for example. */
  var paginationOptions: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Enable execution of formulas inside the table */
  var parseFormulas: js.UndefOr[Any] = js.undefined
  
  /** Allow row dragging: bool */
  var rowDrag: js.UndefOr[Boolean] = js.undefined
  
  /** Allow row resizing: bool */
  var rowResize: js.UndefOr[Boolean] = js.undefined
  
  /** Row properties: height.: object */
  var rows: js.UndefOr[Record[String, Any]] = js.undefined
  
  /** Allow selection copy: bool */
  var selectionCopy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Cells style in the table initialization: object
    * key: cellIndex. (e.g.) "A1", "C20"
    * value: css value. (e.g.) "background-color: orange;"
    */
  var style: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** Force the max height of the table: CSS String */
  var tableHeight: js.UndefOr[String] = js.undefined
  
  /** Allow table overflow: bool */
  var tableOverflow: js.UndefOr[Boolean] = js.undefined
  
  /** Force the max width of the table: CSS String */
  var tableWidth: js.UndefOr[String] = js.undefined
  
  /** All messages to be customized */
  var text: js.UndefOr[Record[String, Any]] = js.undefined
  
  /** Add custom toolbars: object */
  var toolbar: js.UndefOr[js.Array[Record[String, Any]]] = js.undefined
  
  /** Method to config custom script execution. NOTE: This does not work with lazyLoading, Pagination or Search options. */
  var updateTable: js.UndefOr[
    js.Function7[
      /* instance */ Any, 
      /* cell */ Any, 
      /* col */ Any, 
      /* row */ Any, 
      /* val */ Any, 
      /* label */ Any, 
      /* cellName */ Any, 
      Unit
    ]
  ] = js.undefined
  
  /** Load a external json file from this URL: string */
  var url: js.UndefOr[String] = js.undefined
  
  /** Global text wrapping: bool */
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}
object InitializationOptions {
  
  inline def apply(): InitializationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializationOptions]
  }
  
  extension [Self <: InitializationOptions](x: Self) {
    
    inline def setAllowComments(value: Boolean): Self = StObject.set(x, "allowComments", value.asInstanceOf[js.Any])
    
    inline def setAllowCommentsUndefined: Self = StObject.set(x, "allowComments", js.undefined)
    
    inline def setAllowDeleteColumn(value: Boolean): Self = StObject.set(x, "allowDeleteColumn", value.asInstanceOf[js.Any])
    
    inline def setAllowDeleteColumnUndefined: Self = StObject.set(x, "allowDeleteColumn", js.undefined)
    
    inline def setAllowDeleteRow(value: Boolean): Self = StObject.set(x, "allowDeleteRow", value.asInstanceOf[js.Any])
    
    inline def setAllowDeleteRowUndefined: Self = StObject.set(x, "allowDeleteRow", js.undefined)
    
    inline def setAllowExport(value: Boolean): Self = StObject.set(x, "allowExport", value.asInstanceOf[js.Any])
    
    inline def setAllowExportUndefined: Self = StObject.set(x, "allowExport", js.undefined)
    
    inline def setAllowInsertColumn(value: Boolean): Self = StObject.set(x, "allowInsertColumn", value.asInstanceOf[js.Any])
    
    inline def setAllowInsertColumnUndefined: Self = StObject.set(x, "allowInsertColumn", js.undefined)
    
    inline def setAllowInsertRow(value: Boolean): Self = StObject.set(x, "allowInsertRow", value.asInstanceOf[js.Any])
    
    inline def setAllowInsertRowUndefined: Self = StObject.set(x, "allowInsertRow", js.undefined)
    
    inline def setAllowManualInsertColumn(value: Boolean): Self = StObject.set(x, "allowManualInsertColumn", value.asInstanceOf[js.Any])
    
    inline def setAllowManualInsertColumnUndefined: Self = StObject.set(x, "allowManualInsertColumn", js.undefined)
    
    inline def setAllowManualInsertRow(value: Boolean): Self = StObject.set(x, "allowManualInsertRow", value.asInstanceOf[js.Any])
    
    inline def setAllowManualInsertRowUndefined: Self = StObject.set(x, "allowManualInsertRow", js.undefined)
    
    inline def setAllowRenameColumn(value: Boolean): Self = StObject.set(x, "allowRenameColumn", value.asInstanceOf[js.Any])
    
    inline def setAllowRenameColumnUndefined: Self = StObject.set(x, "allowRenameColumn", js.undefined)
    
    inline def setAutoIncrement(value: Any): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    inline def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    inline def setColumnDrag(value: Boolean): Self = StObject.set(x, "columnDrag", value.asInstanceOf[js.Any])
    
    inline def setColumnDragUndefined: Self = StObject.set(x, "columnDrag", js.undefined)
    
    inline def setColumnResize(value: Boolean): Self = StObject.set(x, "columnResize", value.asInstanceOf[js.Any])
    
    inline def setColumnResizeUndefined: Self = StObject.set(x, "columnResize", js.undefined)
    
    inline def setColumnSorting(value: Boolean): Self = StObject.set(x, "columnSorting", value.asInstanceOf[js.Any])
    
    inline def setColumnSortingUndefined: Self = StObject.set(x, "columnSorting", js.undefined)
    
    inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setContextMenu(value: js.Function): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setCopyCompatibility(value: Boolean): Self = StObject.set(x, "copyCompatibility", value.asInstanceOf[js.Any])
    
    inline def setCopyCompatibilityUndefined: Self = StObject.set(x, "copyCompatibility", js.undefined)
    
    inline def setCsv(value: String): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvDelimiter(value: String): Self = StObject.set(x, "csvDelimiter", value.asInstanceOf[js.Any])
    
    inline def setCsvDelimiterUndefined: Self = StObject.set(x, "csvDelimiter", js.undefined)
    
    inline def setCsvFileName(value: String): Self = StObject.set(x, "csvFileName", value.asInstanceOf[js.Any])
    
    inline def setCsvFileNameUndefined: Self = StObject.set(x, "csvFileName", js.undefined)
    
    inline def setCsvHeaders(value: Boolean): Self = StObject.set(x, "csvHeaders", value.asInstanceOf[js.Any])
    
    inline def setCsvHeadersUndefined: Self = StObject.set(x, "csvHeaders", js.undefined)
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    inline def setData(
      value: js.Array[
          (/* import warning: importer.ImportType#apply Failed type conversion: {[ title in string | number ]: jspreadsheet-ce.jspreadsheet-ce.CellValue} */ js.Any) | js.Array[CellValue]
        ]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(
      value: ((/* import warning: importer.ImportType#apply Failed type conversion: {[ title in string | number ]: jspreadsheet-ce.jspreadsheet-ce.CellValue} */ js.Any) | js.Array[CellValue])*
    ): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDefaultColAlign(value: center | left | right): Self = StObject.set(x, "defaultColAlign", value.asInstanceOf[js.Any])
    
    inline def setDefaultColAlignUndefined: Self = StObject.set(x, "defaultColAlign", js.undefined)
    
    inline def setDefaultColWidth(value: Double): Self = StObject.set(x, "defaultColWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultColWidthUndefined: Self = StObject.set(x, "defaultColWidth", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFreezeColumns(value: Double): Self = StObject.set(x, "freezeColumns", value.asInstanceOf[js.Any])
    
    inline def setFreezeColumnsUndefined: Self = StObject.set(x, "freezeColumns", js.undefined)
    
    inline def setIncludeHeadersOnDownload(value: Boolean): Self = StObject.set(x, "includeHeadersOnDownload", value.asInstanceOf[js.Any])
    
    inline def setIncludeHeadersOnDownloadUndefined: Self = StObject.set(x, "includeHeadersOnDownload", js.undefined)
    
    inline def setLazyLoading(value: Boolean): Self = StObject.set(x, "lazyLoading", value.asInstanceOf[js.Any])
    
    inline def setLazyLoadingUndefined: Self = StObject.set(x, "lazyLoading", js.undefined)
    
    inline def setLoadingSpin(value: Boolean): Self = StObject.set(x, "loadingSpin", value.asInstanceOf[js.Any])
    
    inline def setLoadingSpinUndefined: Self = StObject.set(x, "loadingSpin", js.undefined)
    
    inline def setMergeCells(value: Record[String, Any]): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
    
    inline def setMergeCellsUndefined: Self = StObject.set(x, "mergeCells", js.undefined)
    
    inline def setMeta(value: Record[String, Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setMinDimensions(value: js.Array[Double] | (js.Tuple2[Double | Unit, Double])): Self = StObject.set(x, "minDimensions", value.asInstanceOf[js.Any])
    
    inline def setMinDimensionsUndefined: Self = StObject.set(x, "minDimensions", js.undefined)
    
    inline def setMinDimensionsVarargs(value: Double*): Self = StObject.set(x, "minDimensions", js.Array(value*))
    
    inline def setMinSpareCols(value: js.Array[Double]): Self = StObject.set(x, "minSpareCols", value.asInstanceOf[js.Any])
    
    inline def setMinSpareColsUndefined: Self = StObject.set(x, "minSpareCols", js.undefined)
    
    inline def setMinSpareColsVarargs(value: Double*): Self = StObject.set(x, "minSpareCols", js.Array(value*))
    
    inline def setMinSpareRows(value: js.Array[Double]): Self = StObject.set(x, "minSpareRows", value.asInstanceOf[js.Any])
    
    inline def setMinSpareRowsUndefined: Self = StObject.set(x, "minSpareRows", js.undefined)
    
    inline def setMinSpareRowsVarargs(value: Double*): Self = StObject.set(x, "minSpareRows", js.Array(value*))
    
    inline def setNestedHeaders(value: js.Array[js.Array[Colspan]]): Self = StObject.set(x, "nestedHeaders", value.asInstanceOf[js.Any])
    
    inline def setNestedHeadersUndefined: Self = StObject.set(x, "nestedHeaders", js.undefined)
    
    inline def setNestedHeadersVarargs(value: js.Array[Colspan]*): Self = StObject.set(x, "nestedHeaders", js.Array(value*))
    
    inline def setPagination(value: Double): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationOptions(value: js.Array[Double]): Self = StObject.set(x, "paginationOptions", value.asInstanceOf[js.Any])
    
    inline def setPaginationOptionsUndefined: Self = StObject.set(x, "paginationOptions", js.undefined)
    
    inline def setPaginationOptionsVarargs(value: Double*): Self = StObject.set(x, "paginationOptions", js.Array(value*))
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setParseFormulas(value: Any): Self = StObject.set(x, "parseFormulas", value.asInstanceOf[js.Any])
    
    inline def setParseFormulasUndefined: Self = StObject.set(x, "parseFormulas", js.undefined)
    
    inline def setRowDrag(value: Boolean): Self = StObject.set(x, "rowDrag", value.asInstanceOf[js.Any])
    
    inline def setRowDragUndefined: Self = StObject.set(x, "rowDrag", js.undefined)
    
    inline def setRowResize(value: Boolean): Self = StObject.set(x, "rowResize", value.asInstanceOf[js.Any])
    
    inline def setRowResizeUndefined: Self = StObject.set(x, "rowResize", js.undefined)
    
    inline def setRows(value: Record[String, Any]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSelectionCopy(value: Boolean): Self = StObject.set(x, "selectionCopy", value.asInstanceOf[js.Any])
    
    inline def setSelectionCopyUndefined: Self = StObject.set(x, "selectionCopy", js.undefined)
    
    inline def setStyle(value: StringDictionary[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTableHeight(value: String): Self = StObject.set(x, "tableHeight", value.asInstanceOf[js.Any])
    
    inline def setTableHeightUndefined: Self = StObject.set(x, "tableHeight", js.undefined)
    
    inline def setTableOverflow(value: Boolean): Self = StObject.set(x, "tableOverflow", value.asInstanceOf[js.Any])
    
    inline def setTableOverflowUndefined: Self = StObject.set(x, "tableOverflow", js.undefined)
    
    inline def setTableWidth(value: String): Self = StObject.set(x, "tableWidth", value.asInstanceOf[js.Any])
    
    inline def setTableWidthUndefined: Self = StObject.set(x, "tableWidth", js.undefined)
    
    inline def setText(value: Record[String, Any]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setToolbar(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setToolbarVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "toolbar", js.Array(value*))
    
    inline def setUpdateTable(
      value: (/* instance */ Any, /* cell */ Any, /* col */ Any, /* row */ Any, /* val */ Any, /* label */ Any, /* cellName */ Any) => Unit
    ): Self = StObject.set(x, "updateTable", js.Any.fromFunction7(value))
    
    inline def setUpdateTableUndefined: Self = StObject.set(x, "updateTable", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
