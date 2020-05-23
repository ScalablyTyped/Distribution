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
import scala.scalajs.js.annotation._

trait InitializationOptions extends js.Object {
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
  var autoIncrement: js.UndefOr[js.Any] = js.undefined
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
      (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ title in string | number ]: jexcel.jexcel.CellValue}
    */ typings.jexcel.jexcelStrings.InitializationOptions with TopLevel[js.Any]) | js.Array[CellValue]
    ]
  ] = js.undefined
  /** Default align for a new column: [center, left, right] */
  var defaultColAlign: js.UndefOr[center | left | right] = js.undefined
  /** Default width for a new column: integer */
  var defaultColWidth: js.UndefOr[Double] = js.undefined
  /** Allow table edition: bool */
  var editable: js.UndefOr[Boolean] = js.undefined
  /** Fullscreen mode */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /** Include header titles on download: bool */
  var includeHeadersOnDownload: js.UndefOr[Boolean] = js.undefined
  /** Activate the table lazyloading */
  var lazyLoading: js.UndefOr[Boolean] = js.undefined
  /** Activate the loading spin */
  var loadingSpin: js.UndefOr[Boolean] = js.undefined
  /** Cells to be merged in the table initialization: object */
  var mergeCells: js.UndefOr[Record[String, _]] = js.undefined
  /** Meta information: object */
  var meta: js.UndefOr[Record[String, _]] = js.undefined
  /** Minimum table dimensions: [cols, rows] */
  var minDimensions: js.UndefOr[js.Array[Double] | (js.Tuple2[js.UndefOr[Double], Double])] = js.undefined
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
  var parseFormulas: js.UndefOr[js.Any] = js.undefined
  /** Allow row dragging: bool */
  var rowDrag: js.UndefOr[Boolean] = js.undefined
  /** Allow row resizing: bool */
  var rowResize: js.UndefOr[Boolean] = js.undefined
  /** Row properties: height.: object */
  var rows: js.UndefOr[Record[String, _]] = js.undefined
  /** Allow search in the table */
  var search: js.UndefOr[Boolean] = js.undefined
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
  var text: js.UndefOr[Record[String, _]] = js.undefined
  /** Add custom toolbars: object */
  var toolbar: js.UndefOr[js.Array[Record[String, _]]] = js.undefined
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
  ] = js.undefined
  /** Load a external json file from this URL: string */
  var url: js.UndefOr[String] = js.undefined
  /** Global text wrapping: bool */
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}

object InitializationOptions {
  @scala.inline
  def apply(
    allowComments: js.UndefOr[Boolean] = js.undefined,
    allowDeleteColumn: js.UndefOr[Boolean] = js.undefined,
    allowDeleteRow: js.UndefOr[Boolean] = js.undefined,
    allowExport: js.UndefOr[Boolean] = js.undefined,
    allowInsertColumn: js.UndefOr[Boolean] = js.undefined,
    allowInsertRow: js.UndefOr[Boolean] = js.undefined,
    allowManualInsertColumn: js.UndefOr[Boolean] = js.undefined,
    allowManualInsertRow: js.UndefOr[Boolean] = js.undefined,
    allowRenameColumn: js.UndefOr[Boolean] = js.undefined,
    autoIncrement: js.Any = null,
    columnDrag: js.UndefOr[Boolean] = js.undefined,
    columnResize: js.UndefOr[Boolean] = js.undefined,
    columnSorting: js.UndefOr[Boolean] = js.undefined,
    columns: js.Array[Column] = null,
    contextMenu: js.Function = null,
    copyCompatibility: js.UndefOr[Boolean] = js.undefined,
    csv: String = null,
    csvDelimiter: String = null,
    csvFileName: String = null,
    csvHeaders: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[
      (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ title in string | number ]: jexcel.jexcel.CellValue}
    */ typings.jexcel.jexcelStrings.InitializationOptions with TopLevel[js.Any]) | js.Array[CellValue]
    ] = null,
    defaultColAlign: center | left | right = null,
    defaultColWidth: js.UndefOr[Double] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    includeHeadersOnDownload: js.UndefOr[Boolean] = js.undefined,
    lazyLoading: js.UndefOr[Boolean] = js.undefined,
    loadingSpin: js.UndefOr[Boolean] = js.undefined,
    mergeCells: Record[String, _] = null,
    meta: Record[String, _] = null,
    minDimensions: js.Array[Double] | (js.Tuple2[js.UndefOr[Double], Double]) = null,
    minSpareCols: js.Array[Double] = null,
    minSpareRows: js.Array[Double] = null,
    nestedHeaders: js.Array[js.Array[Colspan]] = null,
    pagination: js.UndefOr[Double] = js.undefined,
    paginationOptions: js.Array[Double] = null,
    parseFormulas: js.Any = null,
    rowDrag: js.UndefOr[Boolean] = js.undefined,
    rowResize: js.UndefOr[Boolean] = js.undefined,
    rows: Record[String, _] = null,
    search: js.UndefOr[Boolean] = js.undefined,
    selectionCopy: js.UndefOr[Boolean] = js.undefined,
    style: StringDictionary[String] = null,
    tableHeight: String = null,
    tableOverflow: js.UndefOr[Boolean] = js.undefined,
    tableWidth: String = null,
    text: Record[String, _] = null,
    toolbar: js.Array[Record[String, _]] = null,
    updateTable: (/* instance */ js.Any, /* cell */ js.Any, /* col */ js.Any, /* row */ js.Any, /* val */ js.Any, /* label */ js.Any, /* cellName */ js.Any) => Unit = null,
    url: String = null,
    wordWrap: js.UndefOr[Boolean] = js.undefined
  ): InitializationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowComments)) __obj.updateDynamic("allowComments")(allowComments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleteColumn)) __obj.updateDynamic("allowDeleteColumn")(allowDeleteColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleteRow)) __obj.updateDynamic("allowDeleteRow")(allowDeleteRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExport)) __obj.updateDynamic("allowExport")(allowExport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsertColumn)) __obj.updateDynamic("allowInsertColumn")(allowInsertColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsertRow)) __obj.updateDynamic("allowInsertRow")(allowInsertRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowManualInsertColumn)) __obj.updateDynamic("allowManualInsertColumn")(allowManualInsertColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowManualInsertRow)) __obj.updateDynamic("allowManualInsertRow")(allowManualInsertRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRenameColumn)) __obj.updateDynamic("allowRenameColumn")(allowRenameColumn.get.asInstanceOf[js.Any])
    if (autoIncrement != null) __obj.updateDynamic("autoIncrement")(autoIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(columnDrag)) __obj.updateDynamic("columnDrag")(columnDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnResize)) __obj.updateDynamic("columnResize")(columnResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnSorting)) __obj.updateDynamic("columnSorting")(columnSorting.get.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(copyCompatibility)) __obj.updateDynamic("copyCompatibility")(copyCompatibility.get.asInstanceOf[js.Any])
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (csvDelimiter != null) __obj.updateDynamic("csvDelimiter")(csvDelimiter.asInstanceOf[js.Any])
    if (csvFileName != null) __obj.updateDynamic("csvFileName")(csvFileName.asInstanceOf[js.Any])
    if (!js.isUndefined(csvHeaders)) __obj.updateDynamic("csvHeaders")(csvHeaders.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultColAlign != null) __obj.updateDynamic("defaultColAlign")(defaultColAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultColWidth)) __obj.updateDynamic("defaultColWidth")(defaultColWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeHeadersOnDownload)) __obj.updateDynamic("includeHeadersOnDownload")(includeHeadersOnDownload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyLoading)) __obj.updateDynamic("lazyLoading")(lazyLoading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadingSpin)) __obj.updateDynamic("loadingSpin")(loadingSpin.get.asInstanceOf[js.Any])
    if (mergeCells != null) __obj.updateDynamic("mergeCells")(mergeCells.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (minDimensions != null) __obj.updateDynamic("minDimensions")(minDimensions.asInstanceOf[js.Any])
    if (minSpareCols != null) __obj.updateDynamic("minSpareCols")(minSpareCols.asInstanceOf[js.Any])
    if (minSpareRows != null) __obj.updateDynamic("minSpareRows")(minSpareRows.asInstanceOf[js.Any])
    if (nestedHeaders != null) __obj.updateDynamic("nestedHeaders")(nestedHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.get.asInstanceOf[js.Any])
    if (paginationOptions != null) __obj.updateDynamic("paginationOptions")(paginationOptions.asInstanceOf[js.Any])
    if (parseFormulas != null) __obj.updateDynamic("parseFormulas")(parseFormulas.asInstanceOf[js.Any])
    if (!js.isUndefined(rowDrag)) __obj.updateDynamic("rowDrag")(rowDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowResize)) __obj.updateDynamic("rowResize")(rowResize.get.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionCopy)) __obj.updateDynamic("selectionCopy")(selectionCopy.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tableHeight != null) __obj.updateDynamic("tableHeight")(tableHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(tableOverflow)) __obj.updateDynamic("tableOverflow")(tableOverflow.get.asInstanceOf[js.Any])
    if (tableWidth != null) __obj.updateDynamic("tableWidth")(tableWidth.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (updateTable != null) __obj.updateDynamic("updateTable")(js.Any.fromFunction7(updateTable))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrap)) __obj.updateDynamic("wordWrap")(wordWrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializationOptions]
  }
}

