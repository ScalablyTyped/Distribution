package typings.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodsOptions extends js.Object {
  
  /**
    * remove column by number
    * @param integer columnNumber - Which column should be excluded starting on zero
    * @param integer numOfColumns - number of columns to be excluded from the reference column    myTable.deleteColumn([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var deleteColumn: js.UndefOr[js.Function] = js.native
  
  /**
    * remove row by number
    * @param integer rowNumber - Which row should be excluded starting on zero
    * @param integer numOfRows - number of lines to be excluded
    * myTable.deleteRow([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var deleteRow: js.UndefOr[js.Function] = js.native
  
  /** Destroy all merged cells    myTable.destroyMerge(); */
  // tslint:disable-next-line ban-types
  var destroyMerged: js.UndefOr[js.Function] = js.native
  
  /**
    * get the current data as a CSV file
    * @param bool - true to download parsed formulas.
    * myTable.download([bool]);
    */
  // tslint:disable-next-line ban-types
  var download: js.UndefOr[js.Function] = js.native
  
  /** get current cell DOM @param string columnName - str compatible with excel, or as object.    myTable.getCell([string]); */
  // tslint:disable-next-line ban-types
  var getCell: js.UndefOr[js.Function] = js.native
  
  /** Get the data from one column by number @param integer columnNumber - Column number    myTable.getColumnData([int]); */
  // tslint:disable-next-line ban-types
  var getColumnData: js.UndefOr[js.Function] = js.native
  
  /** get cell comments @param mixed - cell identification or null for the whole table.    myTable.getComments([string]); */
  // tslint:disable-next-line ban-types
  var getComments: js.UndefOr[js.Function] = js.native
  
  /** get table definitions    myTable.getConfig(); */
  // tslint:disable-next-line ban-types
  var getConfig: js.UndefOr[js.Function] = js.native
  
  /** Get the full or partial table data @param boolean onlyHighlighedCells - Get only highlighted cells    myTable.getData([bool]); */
  // tslint:disable-next-line ban-types
  var getData: js.UndefOr[js.Function] = js.native
  
  /** get the current header by column number @param integer columnNumber - Column number starting on zero    myTable.getHeader([integer]); */
  // tslint:disable-next-line ban-types
  var getHeader: js.UndefOr[js.Function] = js.native
  
  /** get all header titles    myTable.getHeaders(); */
  // tslint:disable-next-line ban-types
  var getHeaders: js.UndefOr[js.Function] = js.native
  
  /** get the current row height @param integer rowNumber - row number starting on zero    myTable.getHeight([integer]); */
  // tslint:disable-next-line ban-types
  var getHeight: js.UndefOr[js.Function] = js.native
  
  /** Get the full or partial table data in JSON format @param boolean onlyHighlighedCells - Get only highlighted cells    myTable.getData([bool]); */
  // tslint:disable-next-line ban-types
  var getJson: js.UndefOr[js.Function] = js.native
  
  /** get current cell DOM innerHTML @param string columnName - str compatible with excel, or as object.    myTable.getLabel([string]); */
  // tslint:disable-next-line ban-types
  var getLabel: js.UndefOr[js.Function] = js.native
  
  /** Get merged cells properties @param string columnName - Column name, such as A1.    myTable.getMerge([string]); */
  // tslint:disable-next-line ban-types
  var getMerge: js.UndefOr[js.Function] = js.native
  
  /** get the table or cell meta information @param mixed - cell identification or null for the whole table.    myTable.getMeta([string]); */
  // tslint:disable-next-line ban-types
  var getMeta: js.UndefOr[js.Function] = js.native
  
  /** Get the data from one row by number @param integer rowNumber - Row number    myTable.getRowData([int]); */
  // tslint:disable-next-line ban-types
  var getRowData: js.UndefOr[js.Function] = js.native
  
  /** Get the selected columns @param boolean asIds - Get the colNumbers or row DOM elements    myTable.getSelectedColumns([bool]); */
  // tslint:disable-next-line ban-types
  var getSelectedColumns: js.UndefOr[js.Function] = js.native
  
  /** Get the selected rows @param boolean asIds - Get the rowNumbers or row DOM elements    myTable.getSelectedRows([bool]); */
  // tslint:disable-next-line ban-types
  var getSelectedRows: js.UndefOr[js.Function] = js.native
  
  /** get table or cell style @param mixed - cell identification or null for the whole table.    myTable.getStyle([string])); */
  // tslint:disable-next-line ban-types
  var getStyle: js.UndefOr[js.Function] = js.native
  
  /** get current cell value @param mixed cellIdent - str compatible with excel, or as object.    myTable.getValue([string]); */
  // tslint:disable-next-line ban-types
  var getValue: js.UndefOr[js.Function] = js.native
  
  /** get value from coords @param integer x @param integer y myTable.getValueFromCoords([integer], [integer]); */
  // tslint:disable-next-line ban-types
  var getValueFromCoords: js.UndefOr[js.Function] = js.native
  
  /** get the current column width @param integer columnNumber - column number starting on zero    myTable.getWidth([integer]); */
  // tslint:disable-next-line ban-types
  var getWidth: js.UndefOr[js.Function] = js.native
  
  /** hide column by number    myTable.hideColumn([int]); */
  // tslint:disable-next-line ban-types
  var hideColumn: js.UndefOr[js.Function] = js.native
  
  /** hide column of index numbers    myTable.hideIndex(); */
  // tslint:disable-next-line ban-types
  var hideIndex: js.UndefOr[js.Function] = js.native
  
  /**
    * add a new column
    * @param mixed - num of columns to be added or data to be added in one single column
    * @param int columnNumber - number of columns to be created
    * @param boolean insertBefore
    * @param object properties - column properties
    * myTable.insertColumn([mixed], [integer], [boolean], [object]);
    */
  // tslint:disable-next-line ban-types
  var insertColumn: js.UndefOr[js.Function] = js.native
  
  /**
    * add a new row
    * @param mixed - number of blank lines to be insert or a single array with the data of the new row
    * @param integer rowNumber - reference row number
    * @param boolean insertBefore
    * myTable.insertRow([mixed], [integer], [boolean]);
    */
  // tslint:disable-next-line ban-types
  var insertRow: js.UndefOr[js.Function] = js.native
  
  /**
    * change the column position
    * @param integer columnPosition
    * @param integer newColumnPosition
    * myTable.moveColumn([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var moveColumn: js.UndefOr[js.Function] = js.native
  
  /**
    * change the row position
    * @param integer rowPosition
    * @param integer newRowPosition
    * myTable.moveRow([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var moveRow: js.UndefOr[js.Function] = js.native
  
  /**
    * reorder a column asc or desc
    * @param integer columnNumber - column number starting on zero
    * @param smallint sortType - One will order DESC, zero will order ASC, anything else will toggle the current order
    * myTable.orderBy([integer], [boolean]);
    */
  // tslint:disable-next-line ban-types
  var orderBy: js.UndefOr[js.Function] = js.native
  
  /** Go to page number- Valid only when pagination is true. @param integer - Go to page number    myTable.page([integer]); */
  // tslint:disable-next-line ban-types
  var page: js.UndefOr[js.Function] = js.native
  
  /** Redo changes    myTable.redo(); */
  // tslint:disable-next-line ban-types
  var redo: js.UndefOr[js.Function] = js.native
  
  /** Destroy merged by column name @param string columnName - Column name, such as A1.    myTable.removeMerge([string]); */
  // tslint:disable-next-line ban-types
  var removeMerge: js.UndefOr[js.Function] = js.native
  
  /** reset search table    myTable.resetSearch(); */
  // tslint:disable-next-line ban-types
  var resetSearch: js.UndefOr[js.Function] = js.native
  
  /** Reset the table selection @param boolean executeBlur - execute the blur from the table myTable.resetSelection([bool]); */
  // tslint:disable-next-line ban-types
  var resetSelection: js.UndefOr[js.Function] = js.native
  
  /** remove all style from a cell @param string columnName - Column name, example: A1, B3, etc    myTable.resetStyle([string]); */
  // tslint:disable-next-line ban-types
  var resetStyle: js.UndefOr[js.Function] = js.native
  
  /** Set the data from one column by number @param integer columnNumber - Column number @param array colData - Column data    myTable.setColumnData([int], [array]); */
  // tslint:disable-next-line ban-types
  var setColumnData: js.UndefOr[js.Function] = js.native
  
  /** set cell comments @param cell - cell identification @param text - comments    myTable.setComments([string], [string]); */
  // tslint:disable-next-line ban-types
  var setComments: js.UndefOr[js.Function] = js.native
  
  /** Set the table data @param json newData - New json data, null will reload what is in memory.    myTable.setData([json]); */
  // tslint:disable-next-line ban-types
  var setData: js.UndefOr[js.Function] = js.native
  
  /** change header by column @param integer columnNumber - column number starting on zero @param string columnTitle - New header title    myTable.setHeader([integer], [string]); */
  // tslint:disable-next-line ban-types
  var setHeader: js.UndefOr[js.Function] = js.native
  
  /** change row height @param integer rowNumber - row number starting on zero @param string newRowHeight- New row height    myTable.setHeight([integer], [integer]); */
  // tslint:disable-next-line ban-types
  var setHeight: js.UndefOr[js.Function] = js.native
  
  /**
    * Merge cells
    * @param string columnName - Column name, such as A1.
    * @param integer colspan - Number of columns
    * @param integer rowspan - Number of rows
    * myTable.setMerge([string], [int], [int]);
    */
  // tslint:disable-next-line ban-types
  var setMerge: js.UndefOr[js.Function] = js.native
  
  /** set the table or cell meta information @param mixed - json with whole table meta information.    myTable.setMeta[mixed]); */
  // tslint:disable-next-line ban-types
  var setMeta: js.UndefOr[js.Function] = js.native
  
  /**
    * Set the data from one row by number
    * @param integer rowNumber - Row number
    * @param array rowData - Row data
    * myTable.setRowData([int], [array]);
    */
  // tslint:disable-next-line ban-types
  var setRowData: js.UndefOr[js.Function] = js.native
  
  /**
    * set cell(s) CSS style
    * @param mixed - json with whole table style information or just one cell identification. Ex. A1.
    * @param k [optional]- CSS key
    * @param v [optional]- CSS value
    * myTable.setSyle([object], [string], [string]);
    */
  // tslint:disable-next-line ban-types
  var setStyle: js.UndefOr[js.Function] = js.native
  
  /**
    * change the cell value
    * @param mixed cellIdent - str compatible with excel, or as object.
    * @param string Value - new value for the cell
    * @param bool force - update readonly columns
    * myTable.setValue([string], [string], [bool]);
    */
  // tslint:disable-next-line ban-types
  var setValue: js.UndefOr[js.Function] = js.native
  
  /**
    * get value from coords
    * @param integer x
    * @param integer y
    * @param string Value - new value for the cell
    * @param bool force - update readonly columns
    * myTable.getValueFromCoords([integer], [integer], [string], [bool]);
    */
  // tslint:disable-next-line ban-types
  var setValueFromCoords: js.UndefOr[js.Function] = js.native
  
  /**
    * change column width
    * @param integer columnNumber - column number starting on zero
    * @param string newColumnWidth - New column width
    * myTable.setWidth([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var setWidth: js.UndefOr[js.Function] = js.native
  
  /** show column by number    myTable.showIndex([int]); */
  // tslint:disable-next-line ban-types
  var showColumn: js.UndefOr[js.Function] = js.native
  
  /** show column of index numbers    myTable.showIndex(); */
  // tslint:disable-next-line ban-types
  var showIndex: js.UndefOr[js.Function] = js.native
  
  /** Undo last changes    myTable.undo(); */
  // tslint:disable-next-line ban-types
  var undo: js.UndefOr[js.Function] = js.native
  
  /**
    * select cells
    * @param object startCell - cell object
    * @param object endCell - cell object
    * @param boolean ignoreEvents - ignore onselection event
    * myTable.updateSelection([cell], [cell], true);
    */
  // tslint:disable-next-line ban-types
  var updateSelection: js.UndefOr[js.Function] = js.native
  
  /** select cells @param integer x1 @param integer y1 @param integer x2 @param integer y2    myTable.updateSelectionFromCoords([integer], [integer], [integer], [integer]); */
  // tslint:disable-next-line ban-types
  var updateSelectionFromCoords: js.UndefOr[js.Function] = js.native
  
  /** Which page showing on jExcel - Valid only when pagination is true.    myTable.whichPage(); */
  // tslint:disable-next-line ban-types
  var whichPage: js.UndefOr[js.Function] = js.native
}
object MethodsOptions {
  
  @scala.inline
  def apply(): MethodsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodsOptions]
  }
  
  @scala.inline
  implicit class MethodsOptionsOps[Self <: MethodsOptions] (val x: Self) extends AnyVal {
    
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
    def setDeleteColumn(value: js.Function): Self = this.set("deleteColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteColumn: Self = this.set("deleteColumn", js.undefined)
    
    @scala.inline
    def setDeleteRow(value: js.Function): Self = this.set("deleteRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteRow: Self = this.set("deleteRow", js.undefined)
    
    @scala.inline
    def setDestroyMerged(value: js.Function): Self = this.set("destroyMerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyMerged: Self = this.set("destroyMerged", js.undefined)
    
    @scala.inline
    def setDownload(value: js.Function): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setGetCell(value: js.Function): Self = this.set("getCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetCell: Self = this.set("getCell", js.undefined)
    
    @scala.inline
    def setGetColumnData(value: js.Function): Self = this.set("getColumnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetColumnData: Self = this.set("getColumnData", js.undefined)
    
    @scala.inline
    def setGetComments(value: js.Function): Self = this.set("getComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetComments: Self = this.set("getComments", js.undefined)
    
    @scala.inline
    def setGetConfig(value: js.Function): Self = this.set("getConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetConfig: Self = this.set("getConfig", js.undefined)
    
    @scala.inline
    def setGetData(value: js.Function): Self = this.set("getData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    
    @scala.inline
    def setGetHeader(value: js.Function): Self = this.set("getHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetHeader: Self = this.set("getHeader", js.undefined)
    
    @scala.inline
    def setGetHeaders(value: js.Function): Self = this.set("getHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetHeaders: Self = this.set("getHeaders", js.undefined)
    
    @scala.inline
    def setGetHeight(value: js.Function): Self = this.set("getHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetHeight: Self = this.set("getHeight", js.undefined)
    
    @scala.inline
    def setGetJson(value: js.Function): Self = this.set("getJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetJson: Self = this.set("getJson", js.undefined)
    
    @scala.inline
    def setGetLabel(value: js.Function): Self = this.set("getLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetLabel: Self = this.set("getLabel", js.undefined)
    
    @scala.inline
    def setGetMerge(value: js.Function): Self = this.set("getMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetMerge: Self = this.set("getMerge", js.undefined)
    
    @scala.inline
    def setGetMeta(value: js.Function): Self = this.set("getMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetMeta: Self = this.set("getMeta", js.undefined)
    
    @scala.inline
    def setGetRowData(value: js.Function): Self = this.set("getRowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetRowData: Self = this.set("getRowData", js.undefined)
    
    @scala.inline
    def setGetSelectedColumns(value: js.Function): Self = this.set("getSelectedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetSelectedColumns: Self = this.set("getSelectedColumns", js.undefined)
    
    @scala.inline
    def setGetSelectedRows(value: js.Function): Self = this.set("getSelectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetSelectedRows: Self = this.set("getSelectedRows", js.undefined)
    
    @scala.inline
    def setGetStyle(value: js.Function): Self = this.set("getStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetStyle: Self = this.set("getStyle", js.undefined)
    
    @scala.inline
    def setGetValue(value: js.Function): Self = this.set("getValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    
    @scala.inline
    def setGetValueFromCoords(value: js.Function): Self = this.set("getValueFromCoords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetValueFromCoords: Self = this.set("getValueFromCoords", js.undefined)
    
    @scala.inline
    def setGetWidth(value: js.Function): Self = this.set("getWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetWidth: Self = this.set("getWidth", js.undefined)
    
    @scala.inline
    def setHideColumn(value: js.Function): Self = this.set("hideColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideColumn: Self = this.set("hideColumn", js.undefined)
    
    @scala.inline
    def setHideIndex(value: js.Function): Self = this.set("hideIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideIndex: Self = this.set("hideIndex", js.undefined)
    
    @scala.inline
    def setInsertColumn(value: js.Function): Self = this.set("insertColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertColumn: Self = this.set("insertColumn", js.undefined)
    
    @scala.inline
    def setInsertRow(value: js.Function): Self = this.set("insertRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertRow: Self = this.set("insertRow", js.undefined)
    
    @scala.inline
    def setMoveColumn(value: js.Function): Self = this.set("moveColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveColumn: Self = this.set("moveColumn", js.undefined)
    
    @scala.inline
    def setMoveRow(value: js.Function): Self = this.set("moveRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveRow: Self = this.set("moveRow", js.undefined)
    
    @scala.inline
    def setOrderBy(value: js.Function): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPage(value: js.Function): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setRedo(value: js.Function): Self = this.set("redo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedo: Self = this.set("redo", js.undefined)
    
    @scala.inline
    def setRemoveMerge(value: js.Function): Self = this.set("removeMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveMerge: Self = this.set("removeMerge", js.undefined)
    
    @scala.inline
    def setResetSearch(value: js.Function): Self = this.set("resetSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetSearch: Self = this.set("resetSearch", js.undefined)
    
    @scala.inline
    def setResetSelection(value: js.Function): Self = this.set("resetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetSelection: Self = this.set("resetSelection", js.undefined)
    
    @scala.inline
    def setResetStyle(value: js.Function): Self = this.set("resetStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetStyle: Self = this.set("resetStyle", js.undefined)
    
    @scala.inline
    def setSetColumnData(value: js.Function): Self = this.set("setColumnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetColumnData: Self = this.set("setColumnData", js.undefined)
    
    @scala.inline
    def setSetComments(value: js.Function): Self = this.set("setComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetComments: Self = this.set("setComments", js.undefined)
    
    @scala.inline
    def setSetData(value: js.Function): Self = this.set("setData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    
    @scala.inline
    def setSetHeader(value: js.Function): Self = this.set("setHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetHeader: Self = this.set("setHeader", js.undefined)
    
    @scala.inline
    def setSetHeight(value: js.Function): Self = this.set("setHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    
    @scala.inline
    def setSetMerge(value: js.Function): Self = this.set("setMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetMerge: Self = this.set("setMerge", js.undefined)
    
    @scala.inline
    def setSetMeta(value: js.Function): Self = this.set("setMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetMeta: Self = this.set("setMeta", js.undefined)
    
    @scala.inline
    def setSetRowData(value: js.Function): Self = this.set("setRowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetRowData: Self = this.set("setRowData", js.undefined)
    
    @scala.inline
    def setSetStyle(value: js.Function): Self = this.set("setStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
    
    @scala.inline
    def setSetValue(value: js.Function): Self = this.set("setValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setSetValueFromCoords(value: js.Function): Self = this.set("setValueFromCoords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetValueFromCoords: Self = this.set("setValueFromCoords", js.undefined)
    
    @scala.inline
    def setSetWidth(value: js.Function): Self = this.set("setWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
    
    @scala.inline
    def setShowColumn(value: js.Function): Self = this.set("showColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumn: Self = this.set("showColumn", js.undefined)
    
    @scala.inline
    def setShowIndex(value: js.Function): Self = this.set("showIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIndex: Self = this.set("showIndex", js.undefined)
    
    @scala.inline
    def setUndo(value: js.Function): Self = this.set("undo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
    
    @scala.inline
    def setUpdateSelection(value: js.Function): Self = this.set("updateSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateSelection: Self = this.set("updateSelection", js.undefined)
    
    @scala.inline
    def setUpdateSelectionFromCoords(value: js.Function): Self = this.set("updateSelectionFromCoords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateSelectionFromCoords: Self = this.set("updateSelectionFromCoords", js.undefined)
    
    @scala.inline
    def setWhichPage(value: js.Function): Self = this.set("whichPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhichPage: Self = this.set("whichPage", js.undefined)
  }
}
