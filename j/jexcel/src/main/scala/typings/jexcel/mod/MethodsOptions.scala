package typings.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Main options
// ----------------------------------------------------------------------
trait MethodsOptions extends js.Object {
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
  /**
    * Toggle table fullscreen mode
    * @param boolean fullscreen - define fullscreen status as true or false
    * myTable.fullscreen([bool]);
    */
  // tslint:disable-next-line ban-types
  var fullscreen: js.UndefOr[js.Function] = js.undefined
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
  /** search in the table, only if directive is enabled during inialization. @param string - Search for word    myTable.search([string]); */
  // tslint:disable-next-line ban-types
  var search: js.UndefOr[js.Function] = js.undefined
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
  @scala.inline
  def apply(
    deleteColumn: js.Function = null,
    deleteRow: js.Function = null,
    destroyMerged: js.Function = null,
    download: js.Function = null,
    fullscreen: js.Function = null,
    getCell: js.Function = null,
    getColumnData: js.Function = null,
    getComments: js.Function = null,
    getConfig: js.Function = null,
    getData: js.Function = null,
    getHeader: js.Function = null,
    getHeaders: js.Function = null,
    getHeight: js.Function = null,
    getJson: js.Function = null,
    getLabel: js.Function = null,
    getMerge: js.Function = null,
    getMeta: js.Function = null,
    getRowData: js.Function = null,
    getSelectedColumns: js.Function = null,
    getSelectedRows: js.Function = null,
    getStyle: js.Function = null,
    getValue: js.Function = null,
    getValueFromCoords: js.Function = null,
    getWidth: js.Function = null,
    hideColumn: js.Function = null,
    hideIndex: js.Function = null,
    insertColumn: js.Function = null,
    insertRow: js.Function = null,
    moveColumn: js.Function = null,
    moveRow: js.Function = null,
    orderBy: js.Function = null,
    page: js.Function = null,
    redo: js.Function = null,
    removeMerge: js.Function = null,
    resetSearch: js.Function = null,
    resetSelection: js.Function = null,
    resetStyle: js.Function = null,
    search: js.Function = null,
    setColumnData: js.Function = null,
    setComments: js.Function = null,
    setData: js.Function = null,
    setHeader: js.Function = null,
    setHeight: js.Function = null,
    setMerge: js.Function = null,
    setMeta: js.Function = null,
    setRowData: js.Function = null,
    setStyle: js.Function = null,
    setValue: js.Function = null,
    setValueFromCoords: js.Function = null,
    setWidth: js.Function = null,
    showColumn: js.Function = null,
    showIndex: js.Function = null,
    undo: js.Function = null,
    updateSelection: js.Function = null,
    updateSelectionFromCoords: js.Function = null,
    whichPage: js.Function = null
  ): MethodsOptions = {
    val __obj = js.Dynamic.literal()
    if (deleteColumn != null) __obj.updateDynamic("deleteColumn")(deleteColumn.asInstanceOf[js.Any])
    if (deleteRow != null) __obj.updateDynamic("deleteRow")(deleteRow.asInstanceOf[js.Any])
    if (destroyMerged != null) __obj.updateDynamic("destroyMerged")(destroyMerged.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (fullscreen != null) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (getCell != null) __obj.updateDynamic("getCell")(getCell.asInstanceOf[js.Any])
    if (getColumnData != null) __obj.updateDynamic("getColumnData")(getColumnData.asInstanceOf[js.Any])
    if (getComments != null) __obj.updateDynamic("getComments")(getComments.asInstanceOf[js.Any])
    if (getConfig != null) __obj.updateDynamic("getConfig")(getConfig.asInstanceOf[js.Any])
    if (getData != null) __obj.updateDynamic("getData")(getData.asInstanceOf[js.Any])
    if (getHeader != null) __obj.updateDynamic("getHeader")(getHeader.asInstanceOf[js.Any])
    if (getHeaders != null) __obj.updateDynamic("getHeaders")(getHeaders.asInstanceOf[js.Any])
    if (getHeight != null) __obj.updateDynamic("getHeight")(getHeight.asInstanceOf[js.Any])
    if (getJson != null) __obj.updateDynamic("getJson")(getJson.asInstanceOf[js.Any])
    if (getLabel != null) __obj.updateDynamic("getLabel")(getLabel.asInstanceOf[js.Any])
    if (getMerge != null) __obj.updateDynamic("getMerge")(getMerge.asInstanceOf[js.Any])
    if (getMeta != null) __obj.updateDynamic("getMeta")(getMeta.asInstanceOf[js.Any])
    if (getRowData != null) __obj.updateDynamic("getRowData")(getRowData.asInstanceOf[js.Any])
    if (getSelectedColumns != null) __obj.updateDynamic("getSelectedColumns")(getSelectedColumns.asInstanceOf[js.Any])
    if (getSelectedRows != null) __obj.updateDynamic("getSelectedRows")(getSelectedRows.asInstanceOf[js.Any])
    if (getStyle != null) __obj.updateDynamic("getStyle")(getStyle.asInstanceOf[js.Any])
    if (getValue != null) __obj.updateDynamic("getValue")(getValue.asInstanceOf[js.Any])
    if (getValueFromCoords != null) __obj.updateDynamic("getValueFromCoords")(getValueFromCoords.asInstanceOf[js.Any])
    if (getWidth != null) __obj.updateDynamic("getWidth")(getWidth.asInstanceOf[js.Any])
    if (hideColumn != null) __obj.updateDynamic("hideColumn")(hideColumn.asInstanceOf[js.Any])
    if (hideIndex != null) __obj.updateDynamic("hideIndex")(hideIndex.asInstanceOf[js.Any])
    if (insertColumn != null) __obj.updateDynamic("insertColumn")(insertColumn.asInstanceOf[js.Any])
    if (insertRow != null) __obj.updateDynamic("insertRow")(insertRow.asInstanceOf[js.Any])
    if (moveColumn != null) __obj.updateDynamic("moveColumn")(moveColumn.asInstanceOf[js.Any])
    if (moveRow != null) __obj.updateDynamic("moveRow")(moveRow.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (redo != null) __obj.updateDynamic("redo")(redo.asInstanceOf[js.Any])
    if (removeMerge != null) __obj.updateDynamic("removeMerge")(removeMerge.asInstanceOf[js.Any])
    if (resetSearch != null) __obj.updateDynamic("resetSearch")(resetSearch.asInstanceOf[js.Any])
    if (resetSelection != null) __obj.updateDynamic("resetSelection")(resetSelection.asInstanceOf[js.Any])
    if (resetStyle != null) __obj.updateDynamic("resetStyle")(resetStyle.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (setColumnData != null) __obj.updateDynamic("setColumnData")(setColumnData.asInstanceOf[js.Any])
    if (setComments != null) __obj.updateDynamic("setComments")(setComments.asInstanceOf[js.Any])
    if (setData != null) __obj.updateDynamic("setData")(setData.asInstanceOf[js.Any])
    if (setHeader != null) __obj.updateDynamic("setHeader")(setHeader.asInstanceOf[js.Any])
    if (setHeight != null) __obj.updateDynamic("setHeight")(setHeight.asInstanceOf[js.Any])
    if (setMerge != null) __obj.updateDynamic("setMerge")(setMerge.asInstanceOf[js.Any])
    if (setMeta != null) __obj.updateDynamic("setMeta")(setMeta.asInstanceOf[js.Any])
    if (setRowData != null) __obj.updateDynamic("setRowData")(setRowData.asInstanceOf[js.Any])
    if (setStyle != null) __obj.updateDynamic("setStyle")(setStyle.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(setValue.asInstanceOf[js.Any])
    if (setValueFromCoords != null) __obj.updateDynamic("setValueFromCoords")(setValueFromCoords.asInstanceOf[js.Any])
    if (setWidth != null) __obj.updateDynamic("setWidth")(setWidth.asInstanceOf[js.Any])
    if (showColumn != null) __obj.updateDynamic("showColumn")(showColumn.asInstanceOf[js.Any])
    if (showIndex != null) __obj.updateDynamic("showIndex")(showIndex.asInstanceOf[js.Any])
    if (undo != null) __obj.updateDynamic("undo")(undo.asInstanceOf[js.Any])
    if (updateSelection != null) __obj.updateDynamic("updateSelection")(updateSelection.asInstanceOf[js.Any])
    if (updateSelectionFromCoords != null) __obj.updateDynamic("updateSelectionFromCoords")(updateSelectionFromCoords.asInstanceOf[js.Any])
    if (whichPage != null) __obj.updateDynamic("whichPage")(whichPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodsOptions]
  }
}

