package typings.jspreadsheetCe.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jspreadsheetCe.anon.Colspan
import typings.jspreadsheetCe.jspreadsheetCeStrings.center
import typings.jspreadsheetCe.jspreadsheetCeStrings.left
import typings.jspreadsheetCe.jspreadsheetCeStrings.right
import typings.std.HTMLElement
import typings.std.HTMLTableCellElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jspreadsheet-ce.jspreadsheet-ce.Options & {  sheetName :string} */
trait TabOptions extends StObject {
  
  /** About */
  var about: js.UndefOr[Any] = js.undefined
  
  /** Add comments */
  var addComments: js.UndefOr[Any] = js.undefined
  
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
  
  /** Are you sure to delete the selected columns? */
  var areYouSureToDeleteTheSelectedColumns: js.UndefOr[Any] = js.undefined
  
  /** Are you sure to delete the selected rows? */
  var areYouSureToDeleteTheSelectedRows: js.UndefOr[Any] = js.undefined
  
  /** Auto increment actions when using the dragging corner */
  var autoIncrement: js.UndefOr[Any] = js.undefined
  
  /** Cell already merged */
  var cellAlreadyMerged: js.UndefOr[Any] = js.undefined
  
  /** Clear comments */
  var clearComments: js.UndefOr[Any] = js.undefined
  
  /** Allow column dragging: bool */
  var columnDrag: js.UndefOr[Boolean] = js.undefined
  
  /** Allow column resizing: bool */
  var columnResize: js.UndefOr[Boolean] = js.undefined
  
  /** Allow column sorting: bool */
  var columnSorting: js.UndefOr[Boolean] = js.undefined
  
  /** Column type, title, width, align, dropdown options, text wrapping, mask, etc.: object */
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  
  /** Comments */
  var comments: js.UndefOr[Any] = js.undefined
  
  /** Context menu content: function() { return customMenu } */
  // tslint:disable-next-line ban-types
  var contextMenu: js.UndefOr[js.Function] = js.undefined
  
  /** Copy... */
  var copy: js.UndefOr[Any] = js.undefined
  
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
  
  /**
    * remove column by number
    * @param integer columnNumber - Which column should be excluded starting on zero
    * @param integer numOfColumns - number of columns to be excluded from the reference column    myTable.deleteColumn([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var deleteColumn: js.UndefOr[js.Function] = js.undefined
  
  /**
    * remove row by number
    * @param integer rowNumber - Which row should be excluded starting on zero
    * @param integer numOfRows - number of lines to be excluded
    * myTable.deleteRow([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var deleteRow: js.UndefOr[js.Function] = js.undefined
  
  /** Delete selected columns */
  var deleteSelectedColumns: js.UndefOr[Any] = js.undefined
  
  /** Delete selected rows */
  var deleteSelectedRows: js.UndefOr[Any] = js.undefined
  
  /** Destroy all merged cells    myTable.destroyMerge(); */
  // tslint:disable-next-line ban-types
  var destroyMerged: js.UndefOr[js.Function] = js.undefined
  
  /**
    * get the current data as a CSV file
    * @param bool - true to download parsed formulas.
    * myTable.download([bool]);
    */
  // tslint:disable-next-line ban-types
  var download: js.UndefOr[js.Function] = js.undefined
  
  /** Edit comments */
  var editComments: js.UndefOr[Any] = js.undefined
  
  /** Allow table edition: bool */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /** entries */
  var entries: js.UndefOr[Any] = js.undefined
  
  var footers: js.UndefOr[
    js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: {[ title in string | number ]: jspreadsheet-ce.jspreadsheet-ce.CellValue} */ js.Any) | js.Array[CellValue]
    ]
  ] = js.undefined
  
  /** Allow freezing columns: number */
  var freezeColumns: js.UndefOr[Double] = js.undefined
  
  /**
    * Toggle table fullscreen mode or set fullscreen mode in initialization
    * @param boolean fullscreen - define fullscreen status as true or false
    * myTable.fullscreen([bool]);
    */
  // tslint:disable-next-line ban-types
  var fullscreen: js.UndefOr[js.Function | Boolean] = js.undefined
  
  /** get current cell DOM @param string columnName - str compatible with excel, or as object.    myTable.getCell([string]); */
  // tslint:disable-next-line ban-types
  var getCell: js.UndefOr[js.Function] = js.undefined
  
  /** Get the data from one column by number @param integer columnNumber - Column number    myTable.getColumnData([int]); */
  // tslint:disable-next-line ban-types
  var getColumnData: js.UndefOr[js.Function] = js.undefined
  
  /** get cell comments @param mixed - cell identification or null for the whole table.    myTable.getComments([string]); */
  // tslint:disable-next-line ban-types
  var getComments: js.UndefOr[js.Function] = js.undefined
  
  /** get table definitions    myTable.getConfig(); */
  // tslint:disable-next-line ban-types
  var getConfig: js.UndefOr[js.Function] = js.undefined
  
  /** Get the full or partial table data @param boolean onlyHighlighedCells - Get only highlighted cells    myTable.getData([bool]); */
  // tslint:disable-next-line ban-types
  var getData: js.UndefOr[js.Function] = js.undefined
  
  /** get the current header by column number @param integer columnNumber - Column number starting on zero    myTable.getHeader([integer]); */
  // tslint:disable-next-line ban-types
  var getHeader: js.UndefOr[js.Function] = js.undefined
  
  /** get all header titles    myTable.getHeaders(); */
  // tslint:disable-next-line ban-types
  var getHeaders: js.UndefOr[js.Function] = js.undefined
  
  /** get the current row height @param integer rowNumber - row number starting on zero    myTable.getHeight([integer]); */
  // tslint:disable-next-line ban-types
  var getHeight: js.UndefOr[js.Function] = js.undefined
  
  /** Get the full or partial table data in JSON format @param boolean onlyHighlighedCells - Get only highlighted cells    myTable.getData([bool]); */
  // tslint:disable-next-line ban-types
  var getJson: js.UndefOr[js.Function] = js.undefined
  
  /** get current cell DOM innerHTML @param string columnName - str compatible with excel, or as object.    myTable.getLabel([string]); */
  // tslint:disable-next-line ban-types
  var getLabel: js.UndefOr[js.Function] = js.undefined
  
  /** Get merged cells properties @param string columnName - Column name, such as A1.    myTable.getMerge([string]); */
  // tslint:disable-next-line ban-types
  var getMerge: js.UndefOr[js.Function] = js.undefined
  
  /** get the table or cell meta information @param mixed - cell identification or null for the whole table.    myTable.getMeta([string]); */
  // tslint:disable-next-line ban-types
  var getMeta: js.UndefOr[js.Function] = js.undefined
  
  /** Get the data from one row by number @param integer rowNumber - Row number    myTable.getRowData([int]); */
  // tslint:disable-next-line ban-types
  var getRowData: js.UndefOr[js.Function] = js.undefined
  
  /** Get the selected columns @param boolean asIds - Get the colNumbers or row DOM elements    myTable.getSelectedColumns([bool]); */
  // tslint:disable-next-line ban-types
  var getSelectedColumns: js.UndefOr[js.Function] = js.undefined
  
  /** Get the selected rows @param boolean asIds - Get the rowNumbers or row DOM elements    myTable.getSelectedRows([bool]); */
  // tslint:disable-next-line ban-types
  var getSelectedRows: js.UndefOr[js.Function] = js.undefined
  
  /** get table or cell style @param mixed - cell identification or null for the whole table.    myTable.getStyle([string])); */
  // tslint:disable-next-line ban-types
  var getStyle: js.UndefOr[js.Function] = js.undefined
  
  /** get current cell value @param mixed cellIdent - str compatible with excel, or as object.    myTable.getValue([string]); */
  // tslint:disable-next-line ban-types
  var getValue: js.UndefOr[js.Function] = js.undefined
  
  /** get value from coords @param integer x @param integer y myTable.getValueFromCoords([integer], [integer]); */
  // tslint:disable-next-line ban-types
  var getValueFromCoords: js.UndefOr[js.Function] = js.undefined
  
  /** get the current column width @param integer columnNumber - column number starting on zero    myTable.getWidth([integer]); */
  // tslint:disable-next-line ban-types
  var getWidth: js.UndefOr[js.Function] = js.undefined
  
  /** hide column by number    myTable.hideColumn([int]); */
  // tslint:disable-next-line ban-types
  var hideColumn: js.UndefOr[js.Function] = js.undefined
  
  /** hide column of index numbers    myTable.hideIndex(); */
  // tslint:disable-next-line ban-types
  var hideIndex: js.UndefOr[js.Function] = js.undefined
  
  /** Include header titles on download: bool */
  var includeHeadersOnDownload: js.UndefOr[Boolean] = js.undefined
  
  /** Insert a new column after */
  var insertANewColumnAfter: js.UndefOr[Any] = js.undefined
  
  /** Insert a new column before */
  var insertANewColumnBefore: js.UndefOr[Any] = js.undefined
  
  /** Insert a new row after */
  var insertANewRowAfter: js.UndefOr[Any] = js.undefined
  
  /** Insert a new row before */
  var insertANewRowBefore: js.UndefOr[Any] = js.undefined
  
  /**
    * add a new column
    * @param mixed - num of columns to be added or data to be added in one single column
    * @param int columnNumber - number of columns to be created
    * @param boolean insertBefore
    * @param object properties - column properties
    * myTable.insertColumn([mixed], [integer], [boolean], [object]);
    */
  // tslint:disable-next-line ban-types
  var insertColumn: js.UndefOr[js.Function] = js.undefined
  
  /**
    * add a new row
    * @param mixed - number of blank lines to be insert or a single array with the data of the new row
    * @param integer rowNumber - reference row number
    * @param boolean insertBefore
    * myTable.insertRow([mixed], [integer], [boolean]);
    */
  // tslint:disable-next-line ban-types
  var insertRow: js.UndefOr[js.Function] = js.undefined
  
  /** Invalid merged properties */
  var invalidMergeProperties: js.UndefOr[Any] = js.undefined
  
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
  
  /**
    * change the column position
    * @param integer columnPosition
    * @param integer newColumnPosition
    * myTable.moveColumn([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var moveColumn: js.UndefOr[js.Function] = js.undefined
  
  /**
    * change the row position
    * @param integer rowPosition
    * @param integer newRowPosition
    * myTable.moveRow([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var moveRow: js.UndefOr[js.Function] = js.undefined
  
  /** Define the nested headers, including title, colspan, etc: object */
  var nestedHeaders: js.UndefOr[js.Array[js.Array[Colspan]]] = js.undefined
  
  /** No cells selected */
  var noCellsSelected: js.UndefOr[Any] = js.undefined
  
  /** No records found */
  var noRecordsFound: js.UndefOr[Any] = js.undefined
  
  /** After all changes are applied in the table. */
  var onafterchanges: js.UndefOr[
    js.Function2[/* instance */ HTMLElement, /* cellChanges */ js.Array[CellChange], Unit]
  ] = js.undefined
  
  /** Before a column value is changed. NOTE: It is possible to overwrite the original value, by return a new value on this method. v3.4.0+ */
  var onbeforechange: js.UndefOr[
    js.Function5[
      /* instance */ HTMLElement, 
      /* cell */ HTMLTableCellElement, 
      /* columnIndex */ Double, 
      /* rowIndex */ Double, 
      /* value */ CellValue, 
      CellValue | Unit
    ]
  ] = js.undefined
  
  /** Before a column is excluded. You can cancel the insert event by returning false. */
  var onbeforedeletecolumn: js.UndefOr[
    js.Function3[/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double, Unit]
  ] = js.undefined
  
  /** Before a row is deleted. You can cancel the delete event by returning false. */
  var onbeforedeleterow: js.UndefOr[
    js.Function3[/* instance */ HTMLElement, /* startRowIndex */ Double, /* count */ Double, Unit]
  ] = js.undefined
  
  /** Before a new column is inserted. You can cancel the insert event by returning false. */
  var onbeforeinsertcolumn: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startColumnIndex */ Double, 
      /* count */ Double, 
      /* isBefore */ Boolean, 
      Unit
    ]
  ] = js.undefined
  
  /** Before a new row is inserted. You can cancel the insert event by returning false. */
  var onbeforeinsertrow: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startColumnIndex */ Double, 
      /* count */ Double, 
      /* isBefore */ Boolean, 
      Unit
    ]
  ] = js.undefined
  
  /** Before the paste action is performed. Used to parse any input data, should return the data. */
  // tslint:disable-next-line ban-types
  var onbeforepaste: js.UndefOr[js.Function] = js.undefined
  
  /** On table blur */
  var onblur: js.UndefOr[js.Function1[/* instance */ HTMLElement, Unit]] = js.undefined
  
  /** After a column value is changed. */
  var onchange: js.UndefOr[
    js.Function5[
      /* instance */ HTMLElement, 
      /* cell */ HTMLTableCellElement, 
      /* columnIndex */ String, 
      /* rowIndex */ String, 
      /* value */ CellValue, 
      Unit
    ]
  ] = js.undefined
  
  /** On header change */
  // tslint:disable-next-line ban-types
  var onchangeheader: js.UndefOr[js.Function] = js.undefined
  
  /** When a setMeta is called. */
  // tslint:disable-next-line ban-types
  var onchangemeta: js.UndefOr[js.Function] = js.undefined
  
  /** When the page is changed. */
  // tslint:disable-next-line ban-types
  var onchangepage: js.UndefOr[js.Function] = js.undefined
  
  /** When a setStyle is called. */
  // tslint:disable-next-line ban-types
  var onchangestyle: js.UndefOr[js.Function] = js.undefined
  
  /** After a column is excluded. */
  var ondeletecolumn: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startColumnIndex */ Double, 
      /* count */ Double, 
      /* cells */ js.Array[js.Array[HTMLTableCellElement]], 
      Unit
    ]
  ] = js.undefined
  
  /** After a row is excluded. */
  var ondeleterow: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startRowIndex */ Double, 
      /* count */ Double, 
      /* cells */ js.Array[js.Array[HTMLTableCellElement]], 
      Unit
    ]
  ] = js.undefined
  
  /** When a closeEditor is called. */
  var oneditionend: js.UndefOr[
    js.Function5[
      /* instance */ HTMLElement, 
      /* cell */ HTMLTableCellElement, 
      /* columnIndex */ String, 
      /* rowIndex */ String, 
      /* value */ CellValue, 
      Unit
    ]
  ] = js.undefined
  
  /** When a openEditor is called. */
  var oneditionstart: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* cell */ HTMLTableCellElement, 
      /* columnIndex */ String, 
      /* rowIndex */ String, 
      Unit
    ]
  ] = js.undefined
  
  /** On table focus */
  var onfocus: js.UndefOr[js.Function1[/* instance */ HTMLElement, Unit]] = js.undefined
  
  /** After a new column is inserted. */
  var oninsertcolumn: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startColumnIndex */ Double, 
      /* count */ Double, 
      /* cells */ js.Array[js.Array[HTMLTableCellElement]], 
      Unit
    ]
  ] = js.undefined
  
  /** After a new row is inserted. */
  var oninsertrow: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startRowIndex */ Double, 
      /* count */ Double, 
      /* cells */ js.Array[js.Array[HTMLTableCellElement]], 
      Unit
    ]
  ] = js.undefined
  
  /** This method is called when the method setData */
  var onload: js.UndefOr[js.Function1[/* instance */ HTMLElement, Unit]] = js.undefined
  
  /** On column merge */
  // tslint:disable-next-line ban-types
  var onmerge: js.UndefOr[js.Function] = js.undefined
  
  /** After a column is moved to a new position. */
  // tslint:disable-next-line ban-types
  var onmovecolumn: js.UndefOr[js.Function] = js.undefined
  
  /** After a row is moved to a new position. */
  // tslint:disable-next-line ban-types
  var onmoverow: js.UndefOr[js.Function] = js.undefined
  
  /** After a paste action is performed in the javascript table. */
  var onpaste: js.UndefOr[
    js.Function2[/* instance */ HTMLElement, /* data */ js.Array[js.Array[CellValue]], Unit]
  ] = js.undefined
  
  /** On redo is applied */
  // tslint:disable-next-line ban-types
  var onredo: js.UndefOr[js.Function] = js.undefined
  
  /** After a change in column width. */
  // tslint:disable-next-line ban-types
  var onresizecolumn: js.UndefOr[js.Function] = js.undefined
  
  /** After a change in row height. */
  // tslint:disable-next-line ban-types
  var onresizerow: js.UndefOr[js.Function] = js.undefined
  
  /** On the selection is changed. */
  var onselection: js.UndefOr[
    js.Function5[
      /* instance */ HTMLElement, 
      /* startColumnIndex */ Double, 
      /* startRowIndex */ Double, 
      /* endColumnIndex */ Double, 
      /* endRowIndex */ Double, 
      Unit
    ]
  ] = js.undefined
  
  /** After a colum is sorted. */
  // tslint:disable-next-line ban-types
  var onsort: js.UndefOr[js.Function] = js.undefined
  
  /** On undo is applied */
  // tslint:disable-next-line ban-types
  var onundo: js.UndefOr[js.Function] = js.undefined
  
  /** Order ascending */
  var orderAscending: js.UndefOr[Any] = js.undefined
  
  /**
    * reorder a column asc or desc
    * @param integer columnNumber - column number starting on zero
    * @param smallint sortType - One will order DESC, zero will order ASC, anything else will toggle the current order
    * myTable.orderBy([integer], [boolean]);
    */
  // tslint:disable-next-line ban-types
  var orderBy: js.UndefOr[js.Function] = js.undefined
  
  /** Order descending */
  var orderDescending: js.UndefOr[Any] = js.undefined
  
  /** Go to page number- Valid only when pagination is true. @param integer - Go to page number    myTable.page([integer]); */
  // tslint:disable-next-line ban-types
  var page: js.UndefOr[js.Function] = js.undefined
  
  /** Break the table by pages */
  var pagination: js.UndefOr[Double] = js.undefined
  
  /** Number of records per page: 25,50,75,100 for example. */
  var paginationOptions: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Enable execution of formulas inside the table */
  var parseFormulas: js.UndefOr[Any] = js.undefined
  
  /** Paste... */
  var paste: js.UndefOr[Any] = js.undefined
  
  /** Redo changes    myTable.redo(); */
  // tslint:disable-next-line ban-types
  var redo: js.UndefOr[js.Function] = js.undefined
  
  /** Destroy merged by column name @param string columnName - Column name, such as A1.    myTable.removeMerge([string]); */
  // tslint:disable-next-line ban-types
  var removeMerge: js.UndefOr[js.Function] = js.undefined
  
  /** Rename this column */
  var renameThisColumn: js.UndefOr[Any] = js.undefined
  
  /** reset search table    myTable.resetSearch(); */
  // tslint:disable-next-line ban-types
  var resetSearch: js.UndefOr[js.Function] = js.undefined
  
  /** Reset the table selection @param boolean executeBlur - execute the blur from the table myTable.resetSelection([bool]); */
  // tslint:disable-next-line ban-types
  var resetSelection: js.UndefOr[js.Function] = js.undefined
  
  /** remove all style from a cell @param string columnName - Column name, example: A1, B3, etc    myTable.resetStyle([string]); */
  // tslint:disable-next-line ban-types
  var resetStyle: js.UndefOr[js.Function] = js.undefined
  
  /** Allow row dragging: bool */
  var rowDrag: js.UndefOr[Boolean] = js.undefined
  
  /** Allow row resizing: bool */
  var rowResize: js.UndefOr[Boolean] = js.undefined
  
  /** Row properties: height.: object */
  var rows: js.UndefOr[Record[String, Any]] = js.undefined
  
  /** Save as... */
  var saveAs: js.UndefOr[Any] = js.undefined
  
  /**
    * Search in the table, only if directive is enabled during inialization - sets search in initialization.
    * @param string - Search for word
    * myTable.search([string]);
    */
  // tslint:disable-next-line ban-types
  var search: js.UndefOr[js.Function | Boolean] = js.undefined
  
  /** Allow selection copy: bool */
  var selectionCopy: js.UndefOr[Boolean] = js.undefined
  
  /** Set the data from one column by number @param integer columnNumber - Column number @param array colData - Column data    myTable.setColumnData([int], [array]); */
  // tslint:disable-next-line ban-types
  var setColumnData: js.UndefOr[js.Function] = js.undefined
  
  /** set cell comments @param cell - cell identification @param text - comments    myTable.setComments([string], [string]); */
  // tslint:disable-next-line ban-types
  var setComments: js.UndefOr[js.Function] = js.undefined
  
  /** Set the table data @param json newData - New json data, null will reload what is in memory.    myTable.setData([json]); */
  // tslint:disable-next-line ban-types
  var setData: js.UndefOr[js.Function] = js.undefined
  
  /** change header by column @param integer columnNumber - column number starting on zero @param string columnTitle - New header title    myTable.setHeader([integer], [string]); */
  // tslint:disable-next-line ban-types
  var setHeader: js.UndefOr[js.Function] = js.undefined
  
  /** change row height @param integer rowNumber - row number starting on zero @param string newRowHeight- New row height    myTable.setHeight([integer], [integer]); */
  // tslint:disable-next-line ban-types
  var setHeight: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Merge cells
    * @param string columnName - Column name, such as A1.
    * @param integer colspan - Number of columns
    * @param integer rowspan - Number of rows
    * myTable.setMerge([string], [int], [int]);
    */
  // tslint:disable-next-line ban-types
  var setMerge: js.UndefOr[js.Function] = js.undefined
  
  /** set the table or cell meta information @param mixed - json with whole table meta information.    myTable.setMeta[mixed]); */
  // tslint:disable-next-line ban-types
  var setMeta: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Set the data from one row by number
    * @param integer rowNumber - Row number
    * @param array rowData - Row data
    * myTable.setRowData([int], [array]);
    */
  // tslint:disable-next-line ban-types
  var setRowData: js.UndefOr[js.Function] = js.undefined
  
  /**
    * set cell(s) CSS style
    * @param mixed - json with whole table style information or just one cell identification. Ex. A1.
    * @param k [optional]- CSS key
    * @param v [optional]- CSS value
    * myTable.setSyle([object], [string], [string]);
    */
  // tslint:disable-next-line ban-types
  var setStyle: js.UndefOr[js.Function] = js.undefined
  
  /**
    * change the cell value
    * @param mixed cellIdent - str compatible with excel, or as object.
    * @param string Value - new value for the cell
    * @param bool force - update readonly columns
    * myTable.setValue([string], [string], [bool]);
    */
  // tslint:disable-next-line ban-types
  var setValue: js.UndefOr[js.Function] = js.undefined
  
  /**
    * get value from coords
    * @param integer x
    * @param integer y
    * @param string Value - new value for the cell
    * @param bool force - update readonly columns
    * myTable.getValueFromCoords([integer], [integer], [string], [bool]);
    */
  // tslint:disable-next-line ban-types
  var setValueFromCoords: js.UndefOr[js.Function] = js.undefined
  
  /**
    * change column width
    * @param integer columnNumber - column number starting on zero
    * @param string newColumnWidth - New column width
    * myTable.setWidth([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var setWidth: js.UndefOr[js.Function] = js.undefined
  
  var sheetName: String
  
  /** Show */
  var show: js.UndefOr[Any] = js.undefined
  
  /** show column by number    myTable.showIndex([int]); */
  // tslint:disable-next-line ban-types
  var showColumn: js.UndefOr[js.Function] = js.undefined
  
  /** show column of index numbers    myTable.showIndex(); */
  // tslint:disable-next-line ban-types
  var showIndex: js.UndefOr[js.Function] = js.undefined
  
  /** Showing page {0} of {1} entries */
  var showingPage: js.UndefOr[Any] = js.undefined
  
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
  
  /** There is a conflict with another merged cell */
  var thereIsAConflictWithAnotherMergedCell: js.UndefOr[Any] = js.undefined
  
  /** This action will clear your search results. Are you sure? */
  var thisActionWillClearYourSearchResultsAreYouSure: js.UndefOr[Any] = js.undefined
  
  /** This action will destroy any existing merged cells. Are you sure? */
  var thisActionWillDestroyAnyExistingMergedCellsAreYouSure: js.UndefOr[Any] = js.undefined
  
  /** Add custom toolbars: object */
  var toolbar: js.UndefOr[js.Array[Record[String, Any]]] = js.undefined
  
  /** Undo last changes    myTable.undo(); */
  // tslint:disable-next-line ban-types
  var undo: js.UndefOr[js.Function] = js.undefined
  
  /**
    * select cells
    * @param object startCell - cell object
    * @param object endCell - cell object
    * @param boolean ignoreEvents - ignore onselection event
    * myTable.updateSelection([cell], [cell], true);
    */
  // tslint:disable-next-line ban-types
  var updateSelection: js.UndefOr[js.Function] = js.undefined
  
  /** select cells @param integer x1 @param integer y1 @param integer x2 @param integer y2    myTable.updateSelectionFromCoords([integer], [integer], [integer], [integer]); */
  // tslint:disable-next-line ban-types
  var updateSelectionFromCoords: js.UndefOr[js.Function] = js.undefined
  
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
  
  /** Which page showing on jExcel - Valid only when pagination is true.    myTable.whichPage(); */
  // tslint:disable-next-line ban-types
  var whichPage: js.UndefOr[js.Function] = js.undefined
  
  /** Global text wrapping: bool */
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}
object TabOptions {
  
  inline def apply(sheetName: String): TabOptions = {
    val __obj = js.Dynamic.literal(sheetName = sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabOptions] (val x: Self) extends AnyVal {
    
    inline def setAbout(value: Any): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAddComments(value: Any): Self = StObject.set(x, "addComments", value.asInstanceOf[js.Any])
    
    inline def setAddCommentsUndefined: Self = StObject.set(x, "addComments", js.undefined)
    
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
    
    inline def setAreYouSureToDeleteTheSelectedColumns(value: Any): Self = StObject.set(x, "areYouSureToDeleteTheSelectedColumns", value.asInstanceOf[js.Any])
    
    inline def setAreYouSureToDeleteTheSelectedColumnsUndefined: Self = StObject.set(x, "areYouSureToDeleteTheSelectedColumns", js.undefined)
    
    inline def setAreYouSureToDeleteTheSelectedRows(value: Any): Self = StObject.set(x, "areYouSureToDeleteTheSelectedRows", value.asInstanceOf[js.Any])
    
    inline def setAreYouSureToDeleteTheSelectedRowsUndefined: Self = StObject.set(x, "areYouSureToDeleteTheSelectedRows", js.undefined)
    
    inline def setAutoIncrement(value: Any): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    inline def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    inline def setCellAlreadyMerged(value: Any): Self = StObject.set(x, "cellAlreadyMerged", value.asInstanceOf[js.Any])
    
    inline def setCellAlreadyMergedUndefined: Self = StObject.set(x, "cellAlreadyMerged", js.undefined)
    
    inline def setClearComments(value: Any): Self = StObject.set(x, "clearComments", value.asInstanceOf[js.Any])
    
    inline def setClearCommentsUndefined: Self = StObject.set(x, "clearComments", js.undefined)
    
    inline def setColumnDrag(value: Boolean): Self = StObject.set(x, "columnDrag", value.asInstanceOf[js.Any])
    
    inline def setColumnDragUndefined: Self = StObject.set(x, "columnDrag", js.undefined)
    
    inline def setColumnResize(value: Boolean): Self = StObject.set(x, "columnResize", value.asInstanceOf[js.Any])
    
    inline def setColumnResizeUndefined: Self = StObject.set(x, "columnResize", js.undefined)
    
    inline def setColumnSorting(value: Boolean): Self = StObject.set(x, "columnSorting", value.asInstanceOf[js.Any])
    
    inline def setColumnSortingUndefined: Self = StObject.set(x, "columnSorting", js.undefined)
    
    inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setComments(value: Any): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setContextMenu(value: js.Function): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setCopy(value: Any): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyCompatibility(value: Boolean): Self = StObject.set(x, "copyCompatibility", value.asInstanceOf[js.Any])
    
    inline def setCopyCompatibilityUndefined: Self = StObject.set(x, "copyCompatibility", js.undefined)
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
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
    
    inline def setDeleteColumn(value: js.Function): Self = StObject.set(x, "deleteColumn", value.asInstanceOf[js.Any])
    
    inline def setDeleteColumnUndefined: Self = StObject.set(x, "deleteColumn", js.undefined)
    
    inline def setDeleteRow(value: js.Function): Self = StObject.set(x, "deleteRow", value.asInstanceOf[js.Any])
    
    inline def setDeleteRowUndefined: Self = StObject.set(x, "deleteRow", js.undefined)
    
    inline def setDeleteSelectedColumns(value: Any): Self = StObject.set(x, "deleteSelectedColumns", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelectedColumnsUndefined: Self = StObject.set(x, "deleteSelectedColumns", js.undefined)
    
    inline def setDeleteSelectedRows(value: Any): Self = StObject.set(x, "deleteSelectedRows", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelectedRowsUndefined: Self = StObject.set(x, "deleteSelectedRows", js.undefined)
    
    inline def setDestroyMerged(value: js.Function): Self = StObject.set(x, "destroyMerged", value.asInstanceOf[js.Any])
    
    inline def setDestroyMergedUndefined: Self = StObject.set(x, "destroyMerged", js.undefined)
    
    inline def setDownload(value: js.Function): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setEditComments(value: Any): Self = StObject.set(x, "editComments", value.asInstanceOf[js.Any])
    
    inline def setEditCommentsUndefined: Self = StObject.set(x, "editComments", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEntries(value: Any): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setFooters(
      value: js.Array[
          (/* import warning: importer.ImportType#apply Failed type conversion: {[ title in string | number ]: jspreadsheet-ce.jspreadsheet-ce.CellValue} */ js.Any) | js.Array[CellValue]
        ]
    ): Self = StObject.set(x, "footers", value.asInstanceOf[js.Any])
    
    inline def setFootersUndefined: Self = StObject.set(x, "footers", js.undefined)
    
    inline def setFootersVarargs(
      value: ((/* import warning: importer.ImportType#apply Failed type conversion: {[ title in string | number ]: jspreadsheet-ce.jspreadsheet-ce.CellValue} */ js.Any) | js.Array[CellValue])*
    ): Self = StObject.set(x, "footers", js.Array(value*))
    
    inline def setFreezeColumns(value: Double): Self = StObject.set(x, "freezeColumns", value.asInstanceOf[js.Any])
    
    inline def setFreezeColumnsUndefined: Self = StObject.set(x, "freezeColumns", js.undefined)
    
    inline def setFullscreen(value: js.Function | Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setGetCell(value: js.Function): Self = StObject.set(x, "getCell", value.asInstanceOf[js.Any])
    
    inline def setGetCellUndefined: Self = StObject.set(x, "getCell", js.undefined)
    
    inline def setGetColumnData(value: js.Function): Self = StObject.set(x, "getColumnData", value.asInstanceOf[js.Any])
    
    inline def setGetColumnDataUndefined: Self = StObject.set(x, "getColumnData", js.undefined)
    
    inline def setGetComments(value: js.Function): Self = StObject.set(x, "getComments", value.asInstanceOf[js.Any])
    
    inline def setGetCommentsUndefined: Self = StObject.set(x, "getComments", js.undefined)
    
    inline def setGetConfig(value: js.Function): Self = StObject.set(x, "getConfig", value.asInstanceOf[js.Any])
    
    inline def setGetConfigUndefined: Self = StObject.set(x, "getConfig", js.undefined)
    
    inline def setGetData(value: js.Function): Self = StObject.set(x, "getData", value.asInstanceOf[js.Any])
    
    inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    inline def setGetHeader(value: js.Function): Self = StObject.set(x, "getHeader", value.asInstanceOf[js.Any])
    
    inline def setGetHeaderUndefined: Self = StObject.set(x, "getHeader", js.undefined)
    
    inline def setGetHeaders(value: js.Function): Self = StObject.set(x, "getHeaders", value.asInstanceOf[js.Any])
    
    inline def setGetHeadersUndefined: Self = StObject.set(x, "getHeaders", js.undefined)
    
    inline def setGetHeight(value: js.Function): Self = StObject.set(x, "getHeight", value.asInstanceOf[js.Any])
    
    inline def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
    
    inline def setGetJson(value: js.Function): Self = StObject.set(x, "getJson", value.asInstanceOf[js.Any])
    
    inline def setGetJsonUndefined: Self = StObject.set(x, "getJson", js.undefined)
    
    inline def setGetLabel(value: js.Function): Self = StObject.set(x, "getLabel", value.asInstanceOf[js.Any])
    
    inline def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
    
    inline def setGetMerge(value: js.Function): Self = StObject.set(x, "getMerge", value.asInstanceOf[js.Any])
    
    inline def setGetMergeUndefined: Self = StObject.set(x, "getMerge", js.undefined)
    
    inline def setGetMeta(value: js.Function): Self = StObject.set(x, "getMeta", value.asInstanceOf[js.Any])
    
    inline def setGetMetaUndefined: Self = StObject.set(x, "getMeta", js.undefined)
    
    inline def setGetRowData(value: js.Function): Self = StObject.set(x, "getRowData", value.asInstanceOf[js.Any])
    
    inline def setGetRowDataUndefined: Self = StObject.set(x, "getRowData", js.undefined)
    
    inline def setGetSelectedColumns(value: js.Function): Self = StObject.set(x, "getSelectedColumns", value.asInstanceOf[js.Any])
    
    inline def setGetSelectedColumnsUndefined: Self = StObject.set(x, "getSelectedColumns", js.undefined)
    
    inline def setGetSelectedRows(value: js.Function): Self = StObject.set(x, "getSelectedRows", value.asInstanceOf[js.Any])
    
    inline def setGetSelectedRowsUndefined: Self = StObject.set(x, "getSelectedRows", js.undefined)
    
    inline def setGetStyle(value: js.Function): Self = StObject.set(x, "getStyle", value.asInstanceOf[js.Any])
    
    inline def setGetStyleUndefined: Self = StObject.set(x, "getStyle", js.undefined)
    
    inline def setGetValue(value: js.Function): Self = StObject.set(x, "getValue", value.asInstanceOf[js.Any])
    
    inline def setGetValueFromCoords(value: js.Function): Self = StObject.set(x, "getValueFromCoords", value.asInstanceOf[js.Any])
    
    inline def setGetValueFromCoordsUndefined: Self = StObject.set(x, "getValueFromCoords", js.undefined)
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setGetWidth(value: js.Function): Self = StObject.set(x, "getWidth", value.asInstanceOf[js.Any])
    
    inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
    
    inline def setHideColumn(value: js.Function): Self = StObject.set(x, "hideColumn", value.asInstanceOf[js.Any])
    
    inline def setHideColumnUndefined: Self = StObject.set(x, "hideColumn", js.undefined)
    
    inline def setHideIndex(value: js.Function): Self = StObject.set(x, "hideIndex", value.asInstanceOf[js.Any])
    
    inline def setHideIndexUndefined: Self = StObject.set(x, "hideIndex", js.undefined)
    
    inline def setIncludeHeadersOnDownload(value: Boolean): Self = StObject.set(x, "includeHeadersOnDownload", value.asInstanceOf[js.Any])
    
    inline def setIncludeHeadersOnDownloadUndefined: Self = StObject.set(x, "includeHeadersOnDownload", js.undefined)
    
    inline def setInsertANewColumnAfter(value: Any): Self = StObject.set(x, "insertANewColumnAfter", value.asInstanceOf[js.Any])
    
    inline def setInsertANewColumnAfterUndefined: Self = StObject.set(x, "insertANewColumnAfter", js.undefined)
    
    inline def setInsertANewColumnBefore(value: Any): Self = StObject.set(x, "insertANewColumnBefore", value.asInstanceOf[js.Any])
    
    inline def setInsertANewColumnBeforeUndefined: Self = StObject.set(x, "insertANewColumnBefore", js.undefined)
    
    inline def setInsertANewRowAfter(value: Any): Self = StObject.set(x, "insertANewRowAfter", value.asInstanceOf[js.Any])
    
    inline def setInsertANewRowAfterUndefined: Self = StObject.set(x, "insertANewRowAfter", js.undefined)
    
    inline def setInsertANewRowBefore(value: Any): Self = StObject.set(x, "insertANewRowBefore", value.asInstanceOf[js.Any])
    
    inline def setInsertANewRowBeforeUndefined: Self = StObject.set(x, "insertANewRowBefore", js.undefined)
    
    inline def setInsertColumn(value: js.Function): Self = StObject.set(x, "insertColumn", value.asInstanceOf[js.Any])
    
    inline def setInsertColumnUndefined: Self = StObject.set(x, "insertColumn", js.undefined)
    
    inline def setInsertRow(value: js.Function): Self = StObject.set(x, "insertRow", value.asInstanceOf[js.Any])
    
    inline def setInsertRowUndefined: Self = StObject.set(x, "insertRow", js.undefined)
    
    inline def setInvalidMergeProperties(value: Any): Self = StObject.set(x, "invalidMergeProperties", value.asInstanceOf[js.Any])
    
    inline def setInvalidMergePropertiesUndefined: Self = StObject.set(x, "invalidMergeProperties", js.undefined)
    
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
    
    inline def setMoveColumn(value: js.Function): Self = StObject.set(x, "moveColumn", value.asInstanceOf[js.Any])
    
    inline def setMoveColumnUndefined: Self = StObject.set(x, "moveColumn", js.undefined)
    
    inline def setMoveRow(value: js.Function): Self = StObject.set(x, "moveRow", value.asInstanceOf[js.Any])
    
    inline def setMoveRowUndefined: Self = StObject.set(x, "moveRow", js.undefined)
    
    inline def setNestedHeaders(value: js.Array[js.Array[Colspan]]): Self = StObject.set(x, "nestedHeaders", value.asInstanceOf[js.Any])
    
    inline def setNestedHeadersUndefined: Self = StObject.set(x, "nestedHeaders", js.undefined)
    
    inline def setNestedHeadersVarargs(value: js.Array[Colspan]*): Self = StObject.set(x, "nestedHeaders", js.Array(value*))
    
    inline def setNoCellsSelected(value: Any): Self = StObject.set(x, "noCellsSelected", value.asInstanceOf[js.Any])
    
    inline def setNoCellsSelectedUndefined: Self = StObject.set(x, "noCellsSelected", js.undefined)
    
    inline def setNoRecordsFound(value: Any): Self = StObject.set(x, "noRecordsFound", value.asInstanceOf[js.Any])
    
    inline def setNoRecordsFoundUndefined: Self = StObject.set(x, "noRecordsFound", js.undefined)
    
    inline def setOnafterchanges(value: (/* instance */ HTMLElement, /* cellChanges */ js.Array[CellChange]) => Unit): Self = StObject.set(x, "onafterchanges", js.Any.fromFunction2(value))
    
    inline def setOnafterchangesUndefined: Self = StObject.set(x, "onafterchanges", js.undefined)
    
    inline def setOnbeforechange(
      value: (/* instance */ HTMLElement, /* cell */ HTMLTableCellElement, /* columnIndex */ Double, /* rowIndex */ Double, /* value */ CellValue) => CellValue | Unit
    ): Self = StObject.set(x, "onbeforechange", js.Any.fromFunction5(value))
    
    inline def setOnbeforechangeUndefined: Self = StObject.set(x, "onbeforechange", js.undefined)
    
    inline def setOnbeforedeletecolumn(value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double) => Unit): Self = StObject.set(x, "onbeforedeletecolumn", js.Any.fromFunction3(value))
    
    inline def setOnbeforedeletecolumnUndefined: Self = StObject.set(x, "onbeforedeletecolumn", js.undefined)
    
    inline def setOnbeforedeleterow(value: (/* instance */ HTMLElement, /* startRowIndex */ Double, /* count */ Double) => Unit): Self = StObject.set(x, "onbeforedeleterow", js.Any.fromFunction3(value))
    
    inline def setOnbeforedeleterowUndefined: Self = StObject.set(x, "onbeforedeleterow", js.undefined)
    
    inline def setOnbeforeinsertcolumn(
      value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double, /* isBefore */ Boolean) => Unit
    ): Self = StObject.set(x, "onbeforeinsertcolumn", js.Any.fromFunction4(value))
    
    inline def setOnbeforeinsertcolumnUndefined: Self = StObject.set(x, "onbeforeinsertcolumn", js.undefined)
    
    inline def setOnbeforeinsertrow(
      value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double, /* isBefore */ Boolean) => Unit
    ): Self = StObject.set(x, "onbeforeinsertrow", js.Any.fromFunction4(value))
    
    inline def setOnbeforeinsertrowUndefined: Self = StObject.set(x, "onbeforeinsertrow", js.undefined)
    
    inline def setOnbeforepaste(value: js.Function): Self = StObject.set(x, "onbeforepaste", value.asInstanceOf[js.Any])
    
    inline def setOnbeforepasteUndefined: Self = StObject.set(x, "onbeforepaste", js.undefined)
    
    inline def setOnblur(value: /* instance */ HTMLElement => Unit): Self = StObject.set(x, "onblur", js.Any.fromFunction1(value))
    
    inline def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
    
    inline def setOnchange(
      value: (/* instance */ HTMLElement, /* cell */ HTMLTableCellElement, /* columnIndex */ String, /* rowIndex */ String, /* value */ CellValue) => Unit
    ): Self = StObject.set(x, "onchange", js.Any.fromFunction5(value))
    
    inline def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
    
    inline def setOnchangeheader(value: js.Function): Self = StObject.set(x, "onchangeheader", value.asInstanceOf[js.Any])
    
    inline def setOnchangeheaderUndefined: Self = StObject.set(x, "onchangeheader", js.undefined)
    
    inline def setOnchangemeta(value: js.Function): Self = StObject.set(x, "onchangemeta", value.asInstanceOf[js.Any])
    
    inline def setOnchangemetaUndefined: Self = StObject.set(x, "onchangemeta", js.undefined)
    
    inline def setOnchangepage(value: js.Function): Self = StObject.set(x, "onchangepage", value.asInstanceOf[js.Any])
    
    inline def setOnchangepageUndefined: Self = StObject.set(x, "onchangepage", js.undefined)
    
    inline def setOnchangestyle(value: js.Function): Self = StObject.set(x, "onchangestyle", value.asInstanceOf[js.Any])
    
    inline def setOnchangestyleUndefined: Self = StObject.set(x, "onchangestyle", js.undefined)
    
    inline def setOndeletecolumn(
      value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double, /* cells */ js.Array[js.Array[HTMLTableCellElement]]) => Unit
    ): Self = StObject.set(x, "ondeletecolumn", js.Any.fromFunction4(value))
    
    inline def setOndeletecolumnUndefined: Self = StObject.set(x, "ondeletecolumn", js.undefined)
    
    inline def setOndeleterow(
      value: (/* instance */ HTMLElement, /* startRowIndex */ Double, /* count */ Double, /* cells */ js.Array[js.Array[HTMLTableCellElement]]) => Unit
    ): Self = StObject.set(x, "ondeleterow", js.Any.fromFunction4(value))
    
    inline def setOndeleterowUndefined: Self = StObject.set(x, "ondeleterow", js.undefined)
    
    inline def setOneditionend(
      value: (/* instance */ HTMLElement, /* cell */ HTMLTableCellElement, /* columnIndex */ String, /* rowIndex */ String, /* value */ CellValue) => Unit
    ): Self = StObject.set(x, "oneditionend", js.Any.fromFunction5(value))
    
    inline def setOneditionendUndefined: Self = StObject.set(x, "oneditionend", js.undefined)
    
    inline def setOneditionstart(
      value: (/* instance */ HTMLElement, /* cell */ HTMLTableCellElement, /* columnIndex */ String, /* rowIndex */ String) => Unit
    ): Self = StObject.set(x, "oneditionstart", js.Any.fromFunction4(value))
    
    inline def setOneditionstartUndefined: Self = StObject.set(x, "oneditionstart", js.undefined)
    
    inline def setOnfocus(value: /* instance */ HTMLElement => Unit): Self = StObject.set(x, "onfocus", js.Any.fromFunction1(value))
    
    inline def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
    
    inline def setOninsertcolumn(
      value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double, /* cells */ js.Array[js.Array[HTMLTableCellElement]]) => Unit
    ): Self = StObject.set(x, "oninsertcolumn", js.Any.fromFunction4(value))
    
    inline def setOninsertcolumnUndefined: Self = StObject.set(x, "oninsertcolumn", js.undefined)
    
    inline def setOninsertrow(
      value: (/* instance */ HTMLElement, /* startRowIndex */ Double, /* count */ Double, /* cells */ js.Array[js.Array[HTMLTableCellElement]]) => Unit
    ): Self = StObject.set(x, "oninsertrow", js.Any.fromFunction4(value))
    
    inline def setOninsertrowUndefined: Self = StObject.set(x, "oninsertrow", js.undefined)
    
    inline def setOnload(value: /* instance */ HTMLElement => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
    
    inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    inline def setOnmerge(value: js.Function): Self = StObject.set(x, "onmerge", value.asInstanceOf[js.Any])
    
    inline def setOnmergeUndefined: Self = StObject.set(x, "onmerge", js.undefined)
    
    inline def setOnmovecolumn(value: js.Function): Self = StObject.set(x, "onmovecolumn", value.asInstanceOf[js.Any])
    
    inline def setOnmovecolumnUndefined: Self = StObject.set(x, "onmovecolumn", js.undefined)
    
    inline def setOnmoverow(value: js.Function): Self = StObject.set(x, "onmoverow", value.asInstanceOf[js.Any])
    
    inline def setOnmoverowUndefined: Self = StObject.set(x, "onmoverow", js.undefined)
    
    inline def setOnpaste(value: (/* instance */ HTMLElement, /* data */ js.Array[js.Array[CellValue]]) => Unit): Self = StObject.set(x, "onpaste", js.Any.fromFunction2(value))
    
    inline def setOnpasteUndefined: Self = StObject.set(x, "onpaste", js.undefined)
    
    inline def setOnredo(value: js.Function): Self = StObject.set(x, "onredo", value.asInstanceOf[js.Any])
    
    inline def setOnredoUndefined: Self = StObject.set(x, "onredo", js.undefined)
    
    inline def setOnresizecolumn(value: js.Function): Self = StObject.set(x, "onresizecolumn", value.asInstanceOf[js.Any])
    
    inline def setOnresizecolumnUndefined: Self = StObject.set(x, "onresizecolumn", js.undefined)
    
    inline def setOnresizerow(value: js.Function): Self = StObject.set(x, "onresizerow", value.asInstanceOf[js.Any])
    
    inline def setOnresizerowUndefined: Self = StObject.set(x, "onresizerow", js.undefined)
    
    inline def setOnselection(
      value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* startRowIndex */ Double, /* endColumnIndex */ Double, /* endRowIndex */ Double) => Unit
    ): Self = StObject.set(x, "onselection", js.Any.fromFunction5(value))
    
    inline def setOnselectionUndefined: Self = StObject.set(x, "onselection", js.undefined)
    
    inline def setOnsort(value: js.Function): Self = StObject.set(x, "onsort", value.asInstanceOf[js.Any])
    
    inline def setOnsortUndefined: Self = StObject.set(x, "onsort", js.undefined)
    
    inline def setOnundo(value: js.Function): Self = StObject.set(x, "onundo", value.asInstanceOf[js.Any])
    
    inline def setOnundoUndefined: Self = StObject.set(x, "onundo", js.undefined)
    
    inline def setOrderAscending(value: Any): Self = StObject.set(x, "orderAscending", value.asInstanceOf[js.Any])
    
    inline def setOrderAscendingUndefined: Self = StObject.set(x, "orderAscending", js.undefined)
    
    inline def setOrderBy(value: js.Function): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrderDescending(value: Any): Self = StObject.set(x, "orderDescending", value.asInstanceOf[js.Any])
    
    inline def setOrderDescendingUndefined: Self = StObject.set(x, "orderDescending", js.undefined)
    
    inline def setPage(value: js.Function): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPagination(value: Double): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationOptions(value: js.Array[Double]): Self = StObject.set(x, "paginationOptions", value.asInstanceOf[js.Any])
    
    inline def setPaginationOptionsUndefined: Self = StObject.set(x, "paginationOptions", js.undefined)
    
    inline def setPaginationOptionsVarargs(value: Double*): Self = StObject.set(x, "paginationOptions", js.Array(value*))
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setParseFormulas(value: Any): Self = StObject.set(x, "parseFormulas", value.asInstanceOf[js.Any])
    
    inline def setParseFormulasUndefined: Self = StObject.set(x, "parseFormulas", js.undefined)
    
    inline def setPaste(value: Any): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
    
    inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    inline def setRedo(value: js.Function): Self = StObject.set(x, "redo", value.asInstanceOf[js.Any])
    
    inline def setRedoUndefined: Self = StObject.set(x, "redo", js.undefined)
    
    inline def setRemoveMerge(value: js.Function): Self = StObject.set(x, "removeMerge", value.asInstanceOf[js.Any])
    
    inline def setRemoveMergeUndefined: Self = StObject.set(x, "removeMerge", js.undefined)
    
    inline def setRenameThisColumn(value: Any): Self = StObject.set(x, "renameThisColumn", value.asInstanceOf[js.Any])
    
    inline def setRenameThisColumnUndefined: Self = StObject.set(x, "renameThisColumn", js.undefined)
    
    inline def setResetSearch(value: js.Function): Self = StObject.set(x, "resetSearch", value.asInstanceOf[js.Any])
    
    inline def setResetSearchUndefined: Self = StObject.set(x, "resetSearch", js.undefined)
    
    inline def setResetSelection(value: js.Function): Self = StObject.set(x, "resetSelection", value.asInstanceOf[js.Any])
    
    inline def setResetSelectionUndefined: Self = StObject.set(x, "resetSelection", js.undefined)
    
    inline def setResetStyle(value: js.Function): Self = StObject.set(x, "resetStyle", value.asInstanceOf[js.Any])
    
    inline def setResetStyleUndefined: Self = StObject.set(x, "resetStyle", js.undefined)
    
    inline def setRowDrag(value: Boolean): Self = StObject.set(x, "rowDrag", value.asInstanceOf[js.Any])
    
    inline def setRowDragUndefined: Self = StObject.set(x, "rowDrag", js.undefined)
    
    inline def setRowResize(value: Boolean): Self = StObject.set(x, "rowResize", value.asInstanceOf[js.Any])
    
    inline def setRowResizeUndefined: Self = StObject.set(x, "rowResize", js.undefined)
    
    inline def setRows(value: Record[String, Any]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSaveAs(value: Any): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
    
    inline def setSaveAsUndefined: Self = StObject.set(x, "saveAs", js.undefined)
    
    inline def setSearch(value: js.Function | Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSelectionCopy(value: Boolean): Self = StObject.set(x, "selectionCopy", value.asInstanceOf[js.Any])
    
    inline def setSelectionCopyUndefined: Self = StObject.set(x, "selectionCopy", js.undefined)
    
    inline def setSetColumnData(value: js.Function): Self = StObject.set(x, "setColumnData", value.asInstanceOf[js.Any])
    
    inline def setSetColumnDataUndefined: Self = StObject.set(x, "setColumnData", js.undefined)
    
    inline def setSetComments(value: js.Function): Self = StObject.set(x, "setComments", value.asInstanceOf[js.Any])
    
    inline def setSetCommentsUndefined: Self = StObject.set(x, "setComments", js.undefined)
    
    inline def setSetData(value: js.Function): Self = StObject.set(x, "setData", value.asInstanceOf[js.Any])
    
    inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    
    inline def setSetHeader(value: js.Function): Self = StObject.set(x, "setHeader", value.asInstanceOf[js.Any])
    
    inline def setSetHeaderUndefined: Self = StObject.set(x, "setHeader", js.undefined)
    
    inline def setSetHeight(value: js.Function): Self = StObject.set(x, "setHeight", value.asInstanceOf[js.Any])
    
    inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    inline def setSetMerge(value: js.Function): Self = StObject.set(x, "setMerge", value.asInstanceOf[js.Any])
    
    inline def setSetMergeUndefined: Self = StObject.set(x, "setMerge", js.undefined)
    
    inline def setSetMeta(value: js.Function): Self = StObject.set(x, "setMeta", value.asInstanceOf[js.Any])
    
    inline def setSetMetaUndefined: Self = StObject.set(x, "setMeta", js.undefined)
    
    inline def setSetRowData(value: js.Function): Self = StObject.set(x, "setRowData", value.asInstanceOf[js.Any])
    
    inline def setSetRowDataUndefined: Self = StObject.set(x, "setRowData", js.undefined)
    
    inline def setSetStyle(value: js.Function): Self = StObject.set(x, "setStyle", value.asInstanceOf[js.Any])
    
    inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    
    inline def setSetValue(value: js.Function): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
    
    inline def setSetValueFromCoords(value: js.Function): Self = StObject.set(x, "setValueFromCoords", value.asInstanceOf[js.Any])
    
    inline def setSetValueFromCoordsUndefined: Self = StObject.set(x, "setValueFromCoords", js.undefined)
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setSetWidth(value: js.Function): Self = StObject.set(x, "setWidth", value.asInstanceOf[js.Any])
    
    inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
    
    inline def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Any): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowColumn(value: js.Function): Self = StObject.set(x, "showColumn", value.asInstanceOf[js.Any])
    
    inline def setShowColumnUndefined: Self = StObject.set(x, "showColumn", js.undefined)
    
    inline def setShowIndex(value: js.Function): Self = StObject.set(x, "showIndex", value.asInstanceOf[js.Any])
    
    inline def setShowIndexUndefined: Self = StObject.set(x, "showIndex", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setShowingPage(value: Any): Self = StObject.set(x, "showingPage", value.asInstanceOf[js.Any])
    
    inline def setShowingPageUndefined: Self = StObject.set(x, "showingPage", js.undefined)
    
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
    
    inline def setThereIsAConflictWithAnotherMergedCell(value: Any): Self = StObject.set(x, "thereIsAConflictWithAnotherMergedCell", value.asInstanceOf[js.Any])
    
    inline def setThereIsAConflictWithAnotherMergedCellUndefined: Self = StObject.set(x, "thereIsAConflictWithAnotherMergedCell", js.undefined)
    
    inline def setThisActionWillClearYourSearchResultsAreYouSure(value: Any): Self = StObject.set(x, "thisActionWillClearYourSearchResultsAreYouSure", value.asInstanceOf[js.Any])
    
    inline def setThisActionWillClearYourSearchResultsAreYouSureUndefined: Self = StObject.set(x, "thisActionWillClearYourSearchResultsAreYouSure", js.undefined)
    
    inline def setThisActionWillDestroyAnyExistingMergedCellsAreYouSure(value: Any): Self = StObject.set(x, "thisActionWillDestroyAnyExistingMergedCellsAreYouSure", value.asInstanceOf[js.Any])
    
    inline def setThisActionWillDestroyAnyExistingMergedCellsAreYouSureUndefined: Self = StObject.set(x, "thisActionWillDestroyAnyExistingMergedCellsAreYouSure", js.undefined)
    
    inline def setToolbar(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setToolbarVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "toolbar", js.Array(value*))
    
    inline def setUndo(value: js.Function): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
    
    inline def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
    
    inline def setUpdateSelection(value: js.Function): Self = StObject.set(x, "updateSelection", value.asInstanceOf[js.Any])
    
    inline def setUpdateSelectionFromCoords(value: js.Function): Self = StObject.set(x, "updateSelectionFromCoords", value.asInstanceOf[js.Any])
    
    inline def setUpdateSelectionFromCoordsUndefined: Self = StObject.set(x, "updateSelectionFromCoords", js.undefined)
    
    inline def setUpdateSelectionUndefined: Self = StObject.set(x, "updateSelection", js.undefined)
    
    inline def setUpdateTable(
      value: (/* instance */ Any, /* cell */ Any, /* col */ Any, /* row */ Any, /* val */ Any, /* label */ Any, /* cellName */ Any) => Unit
    ): Self = StObject.set(x, "updateTable", js.Any.fromFunction7(value))
    
    inline def setUpdateTableUndefined: Self = StObject.set(x, "updateTable", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWhichPage(value: js.Function): Self = StObject.set(x, "whichPage", value.asInstanceOf[js.Any])
    
    inline def setWhichPageUndefined: Self = StObject.set(x, "whichPage", js.undefined)
    
    inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
