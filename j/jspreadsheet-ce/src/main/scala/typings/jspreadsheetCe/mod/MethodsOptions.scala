package typings.jspreadsheetCe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodsOptions extends StObject {
  
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
  
  /**
    * reorder a column asc or desc
    * @param integer columnNumber - column number starting on zero
    * @param smallint sortType - One will order DESC, zero will order ASC, anything else will toggle the current order
    * myTable.orderBy([integer], [boolean]);
    */
  // tslint:disable-next-line ban-types
  var orderBy: js.UndefOr[js.Function] = js.undefined
  
  /** Go to page number- Valid only when pagination is true. @param integer - Go to page number    myTable.page([integer]); */
  // tslint:disable-next-line ban-types
  var page: js.UndefOr[js.Function] = js.undefined
  
  /** Redo changes    myTable.redo(); */
  // tslint:disable-next-line ban-types
  var redo: js.UndefOr[js.Function] = js.undefined
  
  /** Destroy merged by column name @param string columnName - Column name, such as A1.    myTable.removeMerge([string]); */
  // tslint:disable-next-line ban-types
  var removeMerge: js.UndefOr[js.Function] = js.undefined
  
  /** reset search table    myTable.resetSearch(); */
  // tslint:disable-next-line ban-types
  var resetSearch: js.UndefOr[js.Function] = js.undefined
  
  /** Reset the table selection @param boolean executeBlur - execute the blur from the table myTable.resetSelection([bool]); */
  // tslint:disable-next-line ban-types
  var resetSelection: js.UndefOr[js.Function] = js.undefined
  
  /** remove all style from a cell @param string columnName - Column name, example: A1, B3, etc    myTable.resetStyle([string]); */
  // tslint:disable-next-line ban-types
  var resetStyle: js.UndefOr[js.Function] = js.undefined
  
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
  
  /** show column by number    myTable.showIndex([int]); */
  // tslint:disable-next-line ban-types
  var showColumn: js.UndefOr[js.Function] = js.undefined
  
  /** show column of index numbers    myTable.showIndex(); */
  // tslint:disable-next-line ban-types
  var showIndex: js.UndefOr[js.Function] = js.undefined
  
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
  
  /** Which page showing on jExcel - Valid only when pagination is true.    myTable.whichPage(); */
  // tslint:disable-next-line ban-types
  var whichPage: js.UndefOr[js.Function] = js.undefined
}
object MethodsOptions {
  
  inline def apply(): MethodsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodsOptions]
  }
  
  extension [Self <: MethodsOptions](x: Self) {
    
    inline def setDeleteColumn(value: js.Function): Self = StObject.set(x, "deleteColumn", value.asInstanceOf[js.Any])
    
    inline def setDeleteColumnUndefined: Self = StObject.set(x, "deleteColumn", js.undefined)
    
    inline def setDeleteRow(value: js.Function): Self = StObject.set(x, "deleteRow", value.asInstanceOf[js.Any])
    
    inline def setDeleteRowUndefined: Self = StObject.set(x, "deleteRow", js.undefined)
    
    inline def setDestroyMerged(value: js.Function): Self = StObject.set(x, "destroyMerged", value.asInstanceOf[js.Any])
    
    inline def setDestroyMergedUndefined: Self = StObject.set(x, "destroyMerged", js.undefined)
    
    inline def setDownload(value: js.Function): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
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
    
    inline def setInsertColumn(value: js.Function): Self = StObject.set(x, "insertColumn", value.asInstanceOf[js.Any])
    
    inline def setInsertColumnUndefined: Self = StObject.set(x, "insertColumn", js.undefined)
    
    inline def setInsertRow(value: js.Function): Self = StObject.set(x, "insertRow", value.asInstanceOf[js.Any])
    
    inline def setInsertRowUndefined: Self = StObject.set(x, "insertRow", js.undefined)
    
    inline def setMoveColumn(value: js.Function): Self = StObject.set(x, "moveColumn", value.asInstanceOf[js.Any])
    
    inline def setMoveColumnUndefined: Self = StObject.set(x, "moveColumn", js.undefined)
    
    inline def setMoveRow(value: js.Function): Self = StObject.set(x, "moveRow", value.asInstanceOf[js.Any])
    
    inline def setMoveRowUndefined: Self = StObject.set(x, "moveRow", js.undefined)
    
    inline def setOrderBy(value: js.Function): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPage(value: js.Function): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setRedo(value: js.Function): Self = StObject.set(x, "redo", value.asInstanceOf[js.Any])
    
    inline def setRedoUndefined: Self = StObject.set(x, "redo", js.undefined)
    
    inline def setRemoveMerge(value: js.Function): Self = StObject.set(x, "removeMerge", value.asInstanceOf[js.Any])
    
    inline def setRemoveMergeUndefined: Self = StObject.set(x, "removeMerge", js.undefined)
    
    inline def setResetSearch(value: js.Function): Self = StObject.set(x, "resetSearch", value.asInstanceOf[js.Any])
    
    inline def setResetSearchUndefined: Self = StObject.set(x, "resetSearch", js.undefined)
    
    inline def setResetSelection(value: js.Function): Self = StObject.set(x, "resetSelection", value.asInstanceOf[js.Any])
    
    inline def setResetSelectionUndefined: Self = StObject.set(x, "resetSelection", js.undefined)
    
    inline def setResetStyle(value: js.Function): Self = StObject.set(x, "resetStyle", value.asInstanceOf[js.Any])
    
    inline def setResetStyleUndefined: Self = StObject.set(x, "resetStyle", js.undefined)
    
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
    
    inline def setShowColumn(value: js.Function): Self = StObject.set(x, "showColumn", value.asInstanceOf[js.Any])
    
    inline def setShowColumnUndefined: Self = StObject.set(x, "showColumn", js.undefined)
    
    inline def setShowIndex(value: js.Function): Self = StObject.set(x, "showIndex", value.asInstanceOf[js.Any])
    
    inline def setShowIndexUndefined: Self = StObject.set(x, "showIndex", js.undefined)
    
    inline def setUndo(value: js.Function): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
    
    inline def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
    
    inline def setUpdateSelection(value: js.Function): Self = StObject.set(x, "updateSelection", value.asInstanceOf[js.Any])
    
    inline def setUpdateSelectionFromCoords(value: js.Function): Self = StObject.set(x, "updateSelectionFromCoords", value.asInstanceOf[js.Any])
    
    inline def setUpdateSelectionFromCoordsUndefined: Self = StObject.set(x, "updateSelectionFromCoords", js.undefined)
    
    inline def setUpdateSelectionUndefined: Self = StObject.set(x, "updateSelection", js.undefined)
    
    inline def setWhichPage(value: js.Function): Self = StObject.set(x, "whichPage", value.asInstanceOf[js.Any])
    
    inline def setWhichPageUndefined: Self = StObject.set(x, "whichPage", js.undefined)
  }
}
