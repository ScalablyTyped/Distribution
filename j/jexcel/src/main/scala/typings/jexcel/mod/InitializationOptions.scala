package typings.jexcel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.jexcel.anon.Colspan
import typings.jexcel.jexcelStrings.center
import typings.jexcel.jexcelStrings.left
import typings.jexcel.jexcelStrings.right
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializationOptions extends js.Object {
  
  /** Allow comments over the cells: bool */
  var allowComments: js.UndefOr[Boolean] = js.native
  
  /** Allow delete a column: bool */
  var allowDeleteColumn: js.UndefOr[Boolean] = js.native
  
  /** Allow delete a row: bool */
  var allowDeleteRow: js.UndefOr[Boolean] = js.native
  
  /** Allow table export: bool */
  var allowExport: js.UndefOr[Boolean] = js.native
  
  /** Allow insert a new column: bool */
  var allowInsertColumn: js.UndefOr[Boolean] = js.native
  
  /** Allow insert a new row: bool */
  var allowInsertRow: js.UndefOr[Boolean] = js.native
  
  /** Allow user to create a new column: bool */
  var allowManualInsertColumn: js.UndefOr[Boolean] = js.native
  
  /** Allow user to insert a new row: bool */
  var allowManualInsertRow: js.UndefOr[Boolean] = js.native
  
  /** Allow rename a column: bool */
  var allowRenameColumn: js.UndefOr[Boolean] = js.native
  
  /** Auto increment actions when using the dragging corner */
  var autoIncrement: js.UndefOr[js.Any] = js.native
  
  /** Allow column dragging: bool */
  var columnDrag: js.UndefOr[Boolean] = js.native
  
  /** Allow column resizing: bool */
  var columnResize: js.UndefOr[Boolean] = js.native
  
  /** Allow column sorting: bool */
  var columnSorting: js.UndefOr[Boolean] = js.native
  
  /** Column type, title, width, align, dropdown options, text wrapping, mask, etc.: object */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  
  /** Context menu content: function() { return customMenu } */
  // tslint:disable-next-line ban-types
  var contextMenu: js.UndefOr[js.Function] = js.native
  
  /** When is true copy and export will bring formula results, if false will bring formulas: boolean */
  var copyCompatibility: js.UndefOr[Boolean] = js.native
  
  /** Load a external CSV file from this URL: string */
  var csv: js.UndefOr[String] = js.native
  
  /** Default delimiter for the CSV file: string */
  var csvDelimiter: js.UndefOr[String] = js.native
  
  /** Default filename for a download method: string */
  var csvFileName: js.UndefOr[String] = js.native
  
  /** Load header titles from the CSV file: bool */
  var csvHeaders: js.UndefOr[Boolean] = js.native
  
  /** Load this data into the javascript table: array */
  var data: js.UndefOr[
    js.Array[
      (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ title in string | number ]: jexcel.jexcel.CellValue}
    */ typings.jexcel.jexcelStrings.InitializationOptions with TopLevel[js.Any]) | js.Array[CellValue]
    ]
  ] = js.native
  
  /** Default align for a new column: [center, left, right] */
  var defaultColAlign: js.UndefOr[center | left | right] = js.native
  
  /** Default width for a new column: integer */
  var defaultColWidth: js.UndefOr[Double] = js.native
  
  /** Allow table edition: bool */
  var editable: js.UndefOr[Boolean] = js.native
  
  /** Include header titles on download: bool */
  var includeHeadersOnDownload: js.UndefOr[Boolean] = js.native
  
  /** Activate the table lazyloading */
  var lazyLoading: js.UndefOr[Boolean] = js.native
  
  /** Activate the loading spin */
  var loadingSpin: js.UndefOr[Boolean] = js.native
  
  /** Cells to be merged in the table initialization: object */
  var mergeCells: js.UndefOr[Record[String, _]] = js.native
  
  /** Meta information: object */
  var meta: js.UndefOr[Record[String, _]] = js.native
  
  /** Minimum table dimensions: [cols, rows] */
  var minDimensions: js.UndefOr[js.Array[Double] | (js.Tuple2[js.UndefOr[Double], Double])] = js.native
  
  /** Minimum number of spare cols: [integer] */
  var minSpareCols: js.UndefOr[js.Array[Double]] = js.native
  
  /** Minimum number of spare rows: [integer] */
  var minSpareRows: js.UndefOr[js.Array[Double]] = js.native
  
  /** Define the nested headers, including title, colspan, etc: object */
  var nestedHeaders: js.UndefOr[js.Array[js.Array[Colspan]]] = js.native
  
  /** Break the table by pages */
  var pagination: js.UndefOr[Double] = js.native
  
  /** Number of records per page: 25,50,75,100 for example. */
  var paginationOptions: js.UndefOr[js.Array[Double]] = js.native
  
  /** Enable execution of formulas inside the table */
  var parseFormulas: js.UndefOr[js.Any] = js.native
  
  /** Allow row dragging: bool */
  var rowDrag: js.UndefOr[Boolean] = js.native
  
  /** Allow row resizing: bool */
  var rowResize: js.UndefOr[Boolean] = js.native
  
  /** Row properties: height.: object */
  var rows: js.UndefOr[Record[String, _]] = js.native
  
  /** Allow selection copy: bool */
  var selectionCopy: js.UndefOr[Boolean] = js.native
  
  /**
    * Cells style in the table initialization: object
    * key: cellIndex. (e.g.) "A1", "C20"
    * value: css value. (e.g.) "background-color: orange;"
    */
  var style: js.UndefOr[StringDictionary[String]] = js.native
  
  /** Force the max height of the table: CSS String */
  var tableHeight: js.UndefOr[String] = js.native
  
  /** Allow table overflow: bool */
  var tableOverflow: js.UndefOr[Boolean] = js.native
  
  /** Force the max width of the table: CSS String */
  var tableWidth: js.UndefOr[String] = js.native
  
  /** All messages to be customized */
  var text: js.UndefOr[Record[String, _]] = js.native
  
  /** Add custom toolbars: object */
  var toolbar: js.UndefOr[js.Array[Record[String, _]]] = js.native
  
  /** Method to config custom script execution. NOTE: This does not work with lazyLoading, Pagination or Search options. */
  var updateTable: js.UndefOr[
    js.Function7[
      /* instance */ js.Any, 
      /* cell */ js.Any, 
      /* col */ js.Any, 
      /* row */ js.Any, 
      /* val */ js.Any, 
      /* label */ js.Any, 
      /* cellName */ js.Any, 
      Unit
    ]
  ] = js.native
  
  /** Load a external json file from this URL: string */
  var url: js.UndefOr[String] = js.native
  
  /** Global text wrapping: bool */
  var wordWrap: js.UndefOr[Boolean] = js.native
}
object InitializationOptions {
  
  @scala.inline
  def apply(): InitializationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializationOptions]
  }
  
  @scala.inline
  implicit class InitializationOptionsOps[Self <: InitializationOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowComments(value: Boolean): Self = this.set("allowComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowComments: Self = this.set("allowComments", js.undefined)
    
    @scala.inline
    def setAllowDeleteColumn(value: Boolean): Self = this.set("allowDeleteColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeleteColumn: Self = this.set("allowDeleteColumn", js.undefined)
    
    @scala.inline
    def setAllowDeleteRow(value: Boolean): Self = this.set("allowDeleteRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeleteRow: Self = this.set("allowDeleteRow", js.undefined)
    
    @scala.inline
    def setAllowExport(value: Boolean): Self = this.set("allowExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExport: Self = this.set("allowExport", js.undefined)
    
    @scala.inline
    def setAllowInsertColumn(value: Boolean): Self = this.set("allowInsertColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInsertColumn: Self = this.set("allowInsertColumn", js.undefined)
    
    @scala.inline
    def setAllowInsertRow(value: Boolean): Self = this.set("allowInsertRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInsertRow: Self = this.set("allowInsertRow", js.undefined)
    
    @scala.inline
    def setAllowManualInsertColumn(value: Boolean): Self = this.set("allowManualInsertColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowManualInsertColumn: Self = this.set("allowManualInsertColumn", js.undefined)
    
    @scala.inline
    def setAllowManualInsertRow(value: Boolean): Self = this.set("allowManualInsertRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowManualInsertRow: Self = this.set("allowManualInsertRow", js.undefined)
    
    @scala.inline
    def setAllowRenameColumn(value: Boolean): Self = this.set("allowRenameColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRenameColumn: Self = this.set("allowRenameColumn", js.undefined)
    
    @scala.inline
    def setAutoIncrement(value: js.Any): Self = this.set("autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoIncrement: Self = this.set("autoIncrement", js.undefined)
    
    @scala.inline
    def setColumnDrag(value: Boolean): Self = this.set("columnDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnDrag: Self = this.set("columnDrag", js.undefined)
    
    @scala.inline
    def setColumnResize(value: Boolean): Self = this.set("columnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnResize: Self = this.set("columnResize", js.undefined)
    
    @scala.inline
    def setColumnSorting(value: Boolean): Self = this.set("columnSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSorting: Self = this.set("columnSorting", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setContextMenu(value: js.Function): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setCopyCompatibility(value: Boolean): Self = this.set("copyCompatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyCompatibility: Self = this.set("copyCompatibility", js.undefined)
    
    @scala.inline
    def setCsv(value: String): Self = this.set("csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
    
    @scala.inline
    def setCsvDelimiter(value: String): Self = this.set("csvDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvDelimiter: Self = this.set("csvDelimiter", js.undefined)
    
    @scala.inline
    def setCsvFileName(value: String): Self = this.set("csvFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvFileName: Self = this.set("csvFileName", js.undefined)
    
    @scala.inline
    def setCsvHeaders(value: Boolean): Self = this.set("csvHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvHeaders: Self = this.set("csvHeaders", js.undefined)
    
    @scala.inline
    def setDataVarargs(
      value: ((/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ title in string | number ]: jexcel.jexcel.CellValue}
      */ typings.jexcel.jexcelStrings.InitializationOptions with TopLevel[js.Any]) | js.Array[CellValue])*
    ): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(
      value: js.Array[
          (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ title in string | number ]: jexcel.jexcel.CellValue}
      */ typings.jexcel.jexcelStrings.InitializationOptions with TopLevel[js.Any]) | js.Array[CellValue]
        ]
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDefaultColAlign(value: center | left | right): Self = this.set("defaultColAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultColAlign: Self = this.set("defaultColAlign", js.undefined)
    
    @scala.inline
    def setDefaultColWidth(value: Double): Self = this.set("defaultColWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultColWidth: Self = this.set("defaultColWidth", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setIncludeHeadersOnDownload(value: Boolean): Self = this.set("includeHeadersOnDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeHeadersOnDownload: Self = this.set("includeHeadersOnDownload", js.undefined)
    
    @scala.inline
    def setLazyLoading(value: Boolean): Self = this.set("lazyLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazyLoading: Self = this.set("lazyLoading", js.undefined)
    
    @scala.inline
    def setLoadingSpin(value: Boolean): Self = this.set("loadingSpin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingSpin: Self = this.set("loadingSpin", js.undefined)
    
    @scala.inline
    def setMergeCells(value: Record[String, _]): Self = this.set("mergeCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeCells: Self = this.set("mergeCells", js.undefined)
    
    @scala.inline
    def setMeta(value: Record[String, _]): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setMinDimensionsVarargs(value: Double*): Self = this.set("minDimensions", js.Array(value :_*))
    
    @scala.inline
    def setMinDimensions(value: js.Array[Double] | (js.Tuple2[js.UndefOr[Double], Double])): Self = this.set("minDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDimensions: Self = this.set("minDimensions", js.undefined)
    
    @scala.inline
    def setMinSpareColsVarargs(value: Double*): Self = this.set("minSpareCols", js.Array(value :_*))
    
    @scala.inline
    def setMinSpareCols(value: js.Array[Double]): Self = this.set("minSpareCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSpareCols: Self = this.set("minSpareCols", js.undefined)
    
    @scala.inline
    def setMinSpareRowsVarargs(value: Double*): Self = this.set("minSpareRows", js.Array(value :_*))
    
    @scala.inline
    def setMinSpareRows(value: js.Array[Double]): Self = this.set("minSpareRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSpareRows: Self = this.set("minSpareRows", js.undefined)
    
    @scala.inline
    def setNestedHeadersVarargs(value: js.Array[Colspan]*): Self = this.set("nestedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setNestedHeaders(value: js.Array[js.Array[Colspan]]): Self = this.set("nestedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedHeaders: Self = this.set("nestedHeaders", js.undefined)
    
    @scala.inline
    def setPagination(value: Double): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setPaginationOptionsVarargs(value: Double*): Self = this.set("paginationOptions", js.Array(value :_*))
    
    @scala.inline
    def setPaginationOptions(value: js.Array[Double]): Self = this.set("paginationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationOptions: Self = this.set("paginationOptions", js.undefined)
    
    @scala.inline
    def setParseFormulas(value: js.Any): Self = this.set("parseFormulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseFormulas: Self = this.set("parseFormulas", js.undefined)
    
    @scala.inline
    def setRowDrag(value: Boolean): Self = this.set("rowDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDrag: Self = this.set("rowDrag", js.undefined)
    
    @scala.inline
    def setRowResize(value: Boolean): Self = this.set("rowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowResize: Self = this.set("rowResize", js.undefined)
    
    @scala.inline
    def setRows(value: Record[String, _]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSelectionCopy(value: Boolean): Self = this.set("selectionCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionCopy: Self = this.set("selectionCopy", js.undefined)
    
    @scala.inline
    def setStyle(value: StringDictionary[String]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTableHeight(value: String): Self = this.set("tableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeight: Self = this.set("tableHeight", js.undefined)
    
    @scala.inline
    def setTableOverflow(value: Boolean): Self = this.set("tableOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableOverflow: Self = this.set("tableOverflow", js.undefined)
    
    @scala.inline
    def setTableWidth(value: String): Self = this.set("tableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableWidth: Self = this.set("tableWidth", js.undefined)
    
    @scala.inline
    def setText(value: Record[String, _]): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(value: (Record[String, js.Any])*): Self = this.set("toolbar", js.Array(value :_*))
    
    @scala.inline
    def setToolbar(value: js.Array[Record[String, _]]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setUpdateTable(
      value: (/* instance */ js.Any, /* cell */ js.Any, /* col */ js.Any, /* row */ js.Any, /* val */ js.Any, /* label */ js.Any, /* cellName */ js.Any) => Unit
    ): Self = this.set("updateTable", js.Any.fromFunction7(value))
    
    @scala.inline
    def deleteUpdateTable: Self = this.set("updateTable", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
}
