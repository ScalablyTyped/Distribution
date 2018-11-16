package typings
package jqueryDashHandsontableLib.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  def alter(`type`: java.lang.String, index: scala.Double): scala.Unit = js.native
  def alter(`type`: java.lang.String, index: scala.Double, amount: scala.Double): scala.Unit = js.native
  def alter(`type`: java.lang.String, index: scala.Double, amount: scala.Double, source: java.lang.String): scala.Unit = js.native
  /**
           * Insert new column(s) before the column at given index. If index is null or undefined, the new column will be added after the current last column. Default amount equals 1.
           */
  @JSName("alter")
  def alter_insert_col(`type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.insert_col, index: scala.Double): scala.Unit = js.native
  /**
           * Insert new column(s) before the column at given index. If index is null or undefined, the new column will be added after the current last column. Default amount equals 1.
           */
  @JSName("alter")
  def alter_insert_col(
    `type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.insert_col,
    index: scala.Double,
    amount: scala.Double
  ): scala.Unit = js.native
  /**
           * Insert new column(s) before the column at given index. If index is null or undefined, the new column will be added after the current last column. Default amount equals 1.
           */
  @JSName("alter")
  def alter_insert_col(
    `type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.insert_col,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  /**
           * Insert new row(s) above the row at given index. If index is null or undefined, the new row will be added after the current last row. Default amount equals 1.
           */
  @JSName("alter")
  def alter_insert_row(`type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.insert_row, index: scala.Double): scala.Unit = js.native
  /**
           * Insert new row(s) above the row at given index. If index is null or undefined, the new row will be added after the current last row. Default amount equals 1.
           */
  @JSName("alter")
  def alter_insert_row(
    `type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.insert_row,
    index: scala.Double,
    amount: scala.Double
  ): scala.Unit = js.native
  /**
           * Insert new row(s) above the row at given index. If index is null or undefined, the new row will be added after the current last row. Default amount equals 1.
           */
  @JSName("alter")
  def alter_insert_row(
    `type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.insert_row,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  /**
           * Remove the column(s) at given index. Default amount equals 1.
           */
  @JSName("alter")
  def alter_remove_col(`type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.remove_col, index: scala.Double): scala.Unit = js.native
  /**
           * Remove the column(s) at given index. Default amount equals 1.
           */
  @JSName("alter")
  def alter_remove_col(
    `type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.remove_col,
    index: scala.Double,
    amount: scala.Double
  ): scala.Unit = js.native
  /**
           * Remove the column(s) at given index. Default amount equals 1.
           */
  @JSName("alter")
  def alter_remove_col(
    `type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.remove_col,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  /**
           * Remove the row(s) at given index. Default amount equals 1.
           */
  @JSName("alter")
  def alter_remove_row(`type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.remove_row, index: scala.Double): scala.Unit = js.native
  /**
           * Remove the row(s) at given index. Default amount equals 1.
           */
  @JSName("alter")
  def alter_remove_row(
    `type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.remove_row,
    index: scala.Double,
    amount: scala.Double
  ): scala.Unit = js.native
  /**
           * Remove the row(s) at given index. Default amount equals 1.
           */
  @JSName("alter")
  def alter_remove_row(
    `type`: jqueryDashHandsontableLib.jqueryDashHandsontableLibStrings.remove_row,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  /**
           * Clears grid.
           */
  def clear(): scala.Unit = js.native
  /**
           * Clear undo history.
           */
  def clearUndo(): scala.Unit = js.native
  /**
           * Returns index of first visible column.
           */
  def colOffset(): scala.Double = js.native
  /**
           * Returns property name that corresponds with the given column index.
           */
  def colToProp(column: scala.Double): java.lang.String = js.native
  /**
           * Returns total number of columns in the grid.
           */
  def countCols(): scala.Double = js.native
  /**
           * Returns number of empty columns.If the optional ending parameter is true, returns number of empty columns at right hand edge of the table.
           */
  def countEmptyCols(): scala.Double = js.native
  /**
           * Returns number of empty columns.If the optional ending parameter is true, returns number of empty columns at right hand edge of the table.
           */
  def countEmptyCols(ending: scala.Boolean): scala.Double = js.native
  /**
           * Returns number of empty rows. If the optional ending parameter is true, returns number of empty rows at the bottom of the table.
           */
  def countEmptyRows(): scala.Double = js.native
  /**
           * Returns number of empty rows. If the optional ending parameter is true, returns number of empty rows at the bottom of the table.
           */
  def countEmptyRows(ending: scala.Boolean): scala.Double = js.native
  /**
           * Returns total number of rows in the grid.
           */
  def countRows(): scala.Double = js.native
  /**
           * Returns number of visible columns.
           */
  def countVisibleCols(): scala.Double = js.native
  /**
           * Returns number of visible rows.
           */
  def countVisibleRows(): scala.Double = js.native
  /**
           * Deselect current selection.
           */
  def deselectCell(): scala.Unit = js.native
  /**
           * Remove grid from DOM.
           */
  def destroy(): scala.Unit = js.native
  /**
           * Destroys current editor, renders and selects current cell. If revertOriginal == false, edited data is saved. Otherwise previous value is restored.
           */
  def destroyEditor(): scala.Unit = js.native
  /**
           * Destroys current editor, renders and selects current cell. If revertOriginal == false, edited data is saved. Otherwise previous value is restored.
           */
  def destroyEditor(revertOriginal: scala.Boolean): scala.Unit = js.native
  /**
           * Returns TD element for given row, col if it is rendered on screen.
           * Returns null if the TD is not rendered on screen (probably because that part of table is not visible).
           */
  def getCell(row: scala.Double, col: scala.Double): js.Any = js.native
  /**
           * Return cell properties for given row, col coordinates.
           */
  def getCellMeta(row: scala.Double, col: scala.Double): js.Any = js.native
  /**
           * Returns rederer type/
           */
  def getCellRenderer(row: scala.Double, col: scala.Double): java.lang.String = js.native
  /**
           * Returns array of col headers (if they are enabled). If param col given, return header at given col as string.
           */
  def getColHeader(col: scala.Double): js.Any = js.native
  /**
           * Return column width.
           */
  def getColWidth(col: scala.Double): scala.Double = js.native
  /**
           * Get value of selected range. Each column is separated by tab, each row is separated by new line character.
           */
  def getCopyableData(startRow: scala.Double, startCol: scala.Double, endRow: scala.Double, endCol: scala.Double): js.Any = js.native
  /**
           * Return the current data object (the same that was passed by data configuration option or loadData method). Optionally you can provide cell range row, col, row2, col2 to get only a fragment of grid data
           */
  def getData(): js.Any = js.native
  /**
           * Return the current data object (the same that was passed by data configuration option or loadData method). Optionally you can provide cell range row, col, row2, col2 to get only a fragment of grid data
           */
  def getData(row: scala.Double, col: scala.Double, row2: scala.Double, col2: scala.Double): js.Any = js.native
  /**
           * Return cell value at row, col. row and col are the visible indexes (note that if columns were reordered or sorted, the current order will be used).
           */
  def getDataAtCell(row: scala.Double, col: scala.Double): js.Any = js.native
  /**
           * Returns array of column values from the data source. col is the visible index of the column.
           */
  def getDataAtCol(col: scala.Double): js.Array[_] = js.native
  /**
           * Given the object property name (e.g. 'first.name'), returns array of column values from the data source.
           */
  def getDataAtProp(prop: java.lang.String): js.Array[_] = js.native
  /**
           * Returns a single row of the data (array or object, depending on what you have). row is the visible index of the row
           */
  def getDataAtRow(row: scala.Double): js.Any = js.native
  /**
           * Same as getDataAtCell, except instead of col, you provide name of the object property (e.g. 'first.name').
           */
  def getDataAtRowProp(row: scala.Double, prop: java.lang.String): js.Any = js.native
  /**
           * Returns array of row headers (if they are enabled). If param row given, return header at given row as string.
           */
  def getRowHeader(row: scala.Double): js.Any = js.native
  /**
           * Return row height.
           */
  def getRowHeight(row: scala.Double): scala.Double = js.native
  /**
           * Return index of the currently selected cells as an array [startRow, startCol, endRow, endCol]. Start row and start col are the coordinates of the active cell (where the selection was started).
           */
  def getSelected(): js.Array[scala.Double] = js.native
  /**
           * Returns current selection as a WalkontableCellRange object. Returns undefined if there is no selection.
           */
  def getSelectedRange(): scala.Unit = js.native
  /**
           * Returns an object containing the current grid settings.
           */
  def getSettings(): Options = js.native
  /**
           * Returns array of column values from the data source. col is the index of the row in the data source.
           */
  def getSourceDataAtCol(col: scala.Double): js.Array[_] = js.native
  /**
           * Returns a single row of the data (array or object, depending on what you have). row is the index of the row in the data source.
           */
  def getSourceDataAtRow(row: scala.Double): js.Any = js.native
  /**
           * Returns value of selected cell.
           */
  def getValue(): js.Any = js.native
  /**
           * Returns information of this table is configured to display column headers.
           */
  def hasColHeaders(): scala.Boolean = js.native
  /**
           * Returns information of this table is configured to display row headers.
           */
  def hasRowHeaders(): scala.Boolean = js.native
  /**
           * Returns true if the column at the given index is empty, false otherwise.
           */
  def isEmptyCol(col: scala.Double): scala.Boolean = js.native
  /**
           * Returns true if the row at the given index is empty, false otherwise.
           */
  def isEmptyRow(row: scala.Double): scala.Boolean = js.native
  /**
           * Returns true if current Handsontable instance is listening to keyboard input on document body.
           */
  def isListening(): scala.Boolean = js.native
  /**
           * Return true if redo can be performed, false otherwise.
           */
  def isRedoAvailable(): scala.Boolean = js.native
  /**
           * Return true if undo can be performed, false otherwise.
           */
  def isUndoAvailable(): scala.Boolean = js.native
  /**
           * Listen to keyboard input on document body.
           */
  def listen(): scala.Unit = js.native
  /**
           * Reset all cells in the grid to contain data from the data array.
           */
  def loadData(data: js.Array[_]): scala.Unit = js.native
  /**
           * Populate cells at position with 2D input array (e.g. [ [1, 2], [3, 4] ]).
           * Use endRow, endCol when you want to cut input when certain row is reached.
           * @param source (default value "populateFromArray") is used to identify this call in the resulting events (beforeChange, afterChange).
           * @param populateMethod (default value "overwrite", possible values "shift_down" and "shift_right") has the same effect as pasteMethod option (see Options page).
           */
  def populateFromArray(
    row: scala.Double,
    col: scala.Double,
    input: js.Array[_],
    endRow: scala.Double,
    endCol: scala.Double
  ): scala.Unit = js.native
  /**
           * Populate cells at position with 2D input array (e.g. [ [1, 2], [3, 4] ]).
           * Use endRow, endCol when you want to cut input when certain row is reached.
           * @param source (default value "populateFromArray") is used to identify this call in the resulting events (beforeChange, afterChange).
           * @param populateMethod (default value "overwrite", possible values "shift_down" and "shift_right") has the same effect as pasteMethod option (see Options page).
           */
  def populateFromArray(
    row: scala.Double,
    col: scala.Double,
    input: js.Array[_],
    endRow: scala.Double,
    endCol: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  /**
           * Populate cells at position with 2D input array (e.g. [ [1, 2], [3, 4] ]).
           * Use endRow, endCol when you want to cut input when certain row is reached.
           * @param source (default value "populateFromArray") is used to identify this call in the resulting events (beforeChange, afterChange).
           * @param populateMethod (default value "overwrite", possible values "shift_down" and "shift_right") has the same effect as pasteMethod option (see Options page).
           */
  def populateFromArray(
    row: scala.Double,
    col: scala.Double,
    input: js.Array[_],
    endRow: scala.Double,
    endCol: scala.Double,
    source: java.lang.String,
    populateMethod: java.lang.String
  ): scala.Unit = js.native
  /**
           * Returns column index that corresponds with the given property.
           */
  def propToCol(property: java.lang.String): scala.Double = js.native
  /**
           * Redo edit (used to reverse an undo).
           */
  def redo(): scala.Unit = js.native
  /**
           * Rerender the table.
           */
  def render(): scala.Unit = js.native
  /**
           * Returns index of first visible row.
           */
  def rowOffset(): scala.Double = js.native
  /**
           * Select cell row, col or range finishing at row2, col2. By default, viewport will be scrolled to selection.
           */
  def selectCell(row: scala.Double, col: scala.Double, row2: scala.Double, col2: scala.Double): scala.Unit = js.native
  /**
           * Select cell row, col or range finishing at row2, col2. By default, viewport will be scrolled to selection.
           */
  def selectCell(
    row: scala.Double,
    col: scala.Double,
    row2: scala.Double,
    col2: scala.Double,
    scrollToSelection: scala.Boolean
  ): scala.Unit = js.native
  /**
           * Sets cell meta data object key corresponding to params row, col.
           */
  def setCellMeta(row: scala.Double, col: scala.Double, key: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  /**
           * Set new value to a cell. To change many cells at once, pass an array of changes in format [ [row, col, value], ... ] as the only parameter. col is the index of visible column (note that if columns were reordered, the current order will be used). source is a flag for before/afterChange events. If you pass only array of changes then source could be set as second parameter.
           */
  def setDataAtCell(changes: js.Array[_]): scala.Unit = js.native
  /**
           * Set new value to a cell. To change many cells at once, pass an array of changes in format [ [row, col, value], ... ] as the only parameter. col is the index of visible column (note that if columns were reordered, the current order will be used). source is a flag for before/afterChange events. If you pass only array of changes then source could be set as second parameter.
           */
  def setDataAtCell(changes: js.Array[_], source: java.lang.String): scala.Unit = js.native
  /**
           * Set new value to a cell. To change many cells at once, pass an array of changes in format [ [row, col, value], ... ] as the only parameter. col is the index of visible column (note that if columns were reordered, the current order will be used). source is a flag for before/afterChange events. If you pass only array of changes then source could be set as second parameter.
           */
  def setDataAtCell(row: scala.Double, col: scala.Double, value: js.Any): scala.Unit = js.native
  /**
           * Set new value to a cell. To change many cells at once, pass an array of changes in format [ [row, col, value], ... ] as the only parameter. col is the index of visible column (note that if columns were reordered, the current order will be used). source is a flag for before/afterChange events. If you pass only array of changes then source could be set as second parameter.
           */
  def setDataAtCell(row: scala.Double, col: scala.Double, value: js.Any, source: java.lang.String): scala.Unit = js.native
  /**
           * Same as above, except instead of col, you provide name of the object property (e.g. [0, 'first.name', 'Jennifer']).
           */
  def setDataAtRowProp(changes: js.Array[_]): scala.Unit = js.native
  /**
           * Same as above, except instead of col, you provide name of the object property (e.g. [0, 'first.name', 'Jennifer']).
           */
  def setDataAtRowProp(changes: js.Array[_], source: java.lang.String): scala.Unit = js.native
  /**
           * Same as above, except instead of col, you provide name of the object property (e.g. [0, 'first.name', 'Jennifer']).
           */
  def setDataAtRowProp(row: scala.Double, prop: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
           * Same as above, except instead of col, you provide name of the object property (e.g. [0, 'first.name', 'Jennifer']).
           */
  def setDataAtRowProp(row: scala.Double, prop: java.lang.String, value: js.Any, source: java.lang.String): scala.Unit = js.native
  /**
           * Sorts table content by cell values in given column, using order. column is a zero-based column index. Order of sorting can be either ascending (order = true) or descending (order = false).
           * Note I: This method is only available when coulmnSorting plugin is enabled. See column sorting demo for details.
           * Note II: Running this method will not alter the table data. Sorting takes place only in view layer.
           */
  def sort(column: scala.Double, order: scala.Boolean): scala.Unit = js.native
  /**
           * Adds/removes data from the column. This function works is modelled after Array.splice. Parameter col is the index of column in which do you want to do splice. Parameter index is the row index at which to start changing the array. If negative, will begin that many elements from the end. Parameter amount, is the number of old array elements to remove. If the amount is 0, no elements are removed. Fourth and further parameters are the elements to add to the array. If you don't specify any elements, spliceCol simply removes elements from the array.
           */
  def spliceCol(col: scala.Double, index: scala.Double, amount: scala.Double, elements: js.Any*): scala.Unit = js.native
  /**
           * Adds/removes data from the row. This function works is modelled after Array.splice. Parameter row is the index of row in which do you want to do splice. Parameter index is the column index at which to start changing the array. If negative, will begin that many elements from the end. Parameter amount, is the number of old array elements to remove. If the amount is 0, no elements are removed. Fourth and further parameters are the elements to add to the array. If you don't specify any elements, spliceCol simply removes elements from the array.
           */
  def spliceRow(row: scala.Double, index: scala.Double, amount: scala.Double, elements: js.Any*): scala.Unit = js.native
  /**
           * Undo last edit.
           */
  def undo(): scala.Unit = js.native
  /**
           * Stop listening to keyboard input on document body.
           */
  def unlisten(): scala.Unit = js.native
  /**
           * Use it if you need to change configuration after initialization.
           */
  def updateSettings(options: Options): scala.Unit = js.native
  /**
           * Validates all cells using their validator functions and calls callback when finished. Does not render the view.
           */
  def validateCells(callback: js.Function): scala.Unit = js.native
}

