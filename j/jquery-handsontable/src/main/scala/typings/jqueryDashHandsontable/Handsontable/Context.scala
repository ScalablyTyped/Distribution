package typings.jqueryDashHandsontable.Handsontable

import typings.jqueryDashHandsontable.jqueryDashHandsontableStrings.insert_col
import typings.jqueryDashHandsontable.jqueryDashHandsontableStrings.insert_row
import typings.jqueryDashHandsontable.jqueryDashHandsontableStrings.remove_col
import typings.jqueryDashHandsontable.jqueryDashHandsontableStrings.remove_row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  def alter(`type`: String, index: Double): Unit = js.native
  def alter(`type`: String, index: Double, amount: Double): Unit = js.native
  def alter(`type`: String, index: Double, amount: Double, source: String): Unit = js.native
  /**
    * Insert new column(s) before the column at given index. If index is null or undefined, the new column will be added after the current last column. Default amount equals 1.
    */
  @JSName("alter")
  def alter_insertcol(`type`: insert_col, index: Double): Unit = js.native
  @JSName("alter")
  def alter_insertcol(`type`: insert_col, index: Double, amount: Double): Unit = js.native
  @JSName("alter")
  def alter_insertcol(`type`: insert_col, index: Double, amount: Double, source: String): Unit = js.native
  /**
    * Insert new row(s) above the row at given index. If index is null or undefined, the new row will be added after the current last row. Default amount equals 1.
    */
  @JSName("alter")
  def alter_insertrow(`type`: insert_row, index: Double): Unit = js.native
  @JSName("alter")
  def alter_insertrow(`type`: insert_row, index: Double, amount: Double): Unit = js.native
  @JSName("alter")
  def alter_insertrow(`type`: insert_row, index: Double, amount: Double, source: String): Unit = js.native
  /**
    * Remove the column(s) at given index. Default amount equals 1.
    */
  @JSName("alter")
  def alter_removecol(`type`: remove_col, index: Double): Unit = js.native
  @JSName("alter")
  def alter_removecol(`type`: remove_col, index: Double, amount: Double): Unit = js.native
  @JSName("alter")
  def alter_removecol(`type`: remove_col, index: Double, amount: Double, source: String): Unit = js.native
  /**
    * Remove the row(s) at given index. Default amount equals 1.
    */
  @JSName("alter")
  def alter_removerow(`type`: remove_row, index: Double): Unit = js.native
  @JSName("alter")
  def alter_removerow(`type`: remove_row, index: Double, amount: Double): Unit = js.native
  @JSName("alter")
  def alter_removerow(`type`: remove_row, index: Double, amount: Double, source: String): Unit = js.native
  /**
    * Clears grid.
    */
  def clear(): Unit = js.native
  /**
    * Clear undo history.
    */
  def clearUndo(): Unit = js.native
  /**
    * Returns index of first visible column.
    */
  def colOffset(): Double = js.native
  /**
    * Returns property name that corresponds with the given column index.
    */
  def colToProp(column: Double): String = js.native
  /**
    * Returns total number of columns in the grid.
    */
  def countCols(): Double = js.native
  /**
    * Returns number of empty columns.If the optional ending parameter is true, returns number of empty columns at right hand edge of the table.
    */
  def countEmptyCols(): Double = js.native
  def countEmptyCols(ending: Boolean): Double = js.native
  /**
    * Returns number of empty rows. If the optional ending parameter is true, returns number of empty rows at the bottom of the table.
    */
  def countEmptyRows(): Double = js.native
  def countEmptyRows(ending: Boolean): Double = js.native
  /**
    * Returns total number of rows in the grid.
    */
  def countRows(): Double = js.native
  /**
    * Returns number of visible columns.
    */
  def countVisibleCols(): Double = js.native
  /**
    * Returns number of visible rows.
    */
  def countVisibleRows(): Double = js.native
  /**
    * Deselect current selection.
    */
  def deselectCell(): Unit = js.native
  /**
    * Remove grid from DOM.
    */
  def destroy(): Unit = js.native
  /**
    * Destroys current editor, renders and selects current cell. If revertOriginal == false, edited data is saved. Otherwise previous value is restored.
    */
  def destroyEditor(): Unit = js.native
  def destroyEditor(revertOriginal: Boolean): Unit = js.native
  /**
    * Returns TD element for given row, col if it is rendered on screen.
    * Returns null if the TD is not rendered on screen (probably because that part of table is not visible).
    */
  def getCell(row: Double, col: Double): js.Any = js.native
  /**
    * Return cell properties for given row, col coordinates.
    */
  def getCellMeta(row: Double, col: Double): js.Any = js.native
  /**
    * Returns rederer type/
    */
  def getCellRenderer(row: Double, col: Double): String = js.native
  /**
    * Returns array of col headers (if they are enabled). If param col given, return header at given col as string.
    */
  def getColHeader(col: Double): js.Any = js.native
  /**
    * Return column width.
    */
  def getColWidth(col: Double): Double = js.native
  /**
    * Get value of selected range. Each column is separated by tab, each row is separated by new line character.
    */
  def getCopyableData(startRow: Double, startCol: Double, endRow: Double, endCol: Double): js.Any = js.native
  /**
    * Return the current data object (the same that was passed by data configuration option or loadData method). Optionally you can provide cell range row, col, row2, col2 to get only a fragment of grid data
    */
  def getData(): js.Any = js.native
  /**
    * Return the current data object (the same that was passed by data configuration option or loadData method). Optionally you can provide cell range row, col, row2, col2 to get only a fragment of grid data
    */
  def getData(row: Double, col: Double, row2: Double, col2: Double): js.Any = js.native
  /**
    * Return cell value at row, col. row and col are the visible indexes (note that if columns were reordered or sorted, the current order will be used).
    */
  def getDataAtCell(row: Double, col: Double): js.Any = js.native
  /**
    * Returns array of column values from the data source. col is the visible index of the column.
    */
  def getDataAtCol(col: Double): js.Array[_] = js.native
  /**
    * Given the object property name (e.g. 'first.name'), returns array of column values from the data source.
    */
  def getDataAtProp(prop: String): js.Array[_] = js.native
  /**
    * Returns a single row of the data (array or object, depending on what you have). row is the visible index of the row
    */
  def getDataAtRow(row: Double): js.Any = js.native
  /**
    * Same as getDataAtCell, except instead of col, you provide name of the object property (e.g. 'first.name').
    */
  def getDataAtRowProp(row: Double, prop: String): js.Any = js.native
  /**
    * Returns array of row headers (if they are enabled). If param row given, return header at given row as string.
    */
  def getRowHeader(row: Double): js.Any = js.native
  /**
    * Return row height.
    */
  def getRowHeight(row: Double): Double = js.native
  /**
    * Return index of the currently selected cells as an array [startRow, startCol, endRow, endCol]. Start row and start col are the coordinates of the active cell (where the selection was started).
    */
  def getSelected(): js.Array[Double] = js.native
  /**
    * Returns current selection as a WalkontableCellRange object. Returns undefined if there is no selection.
    */
  def getSelectedRange(): Unit = js.native
  /**
    * Returns an object containing the current grid settings.
    */
  def getSettings(): Options = js.native
  /**
    * Returns array of column values from the data source. col is the index of the row in the data source.
    */
  def getSourceDataAtCol(col: Double): js.Array[_] = js.native
  /**
    * Returns a single row of the data (array or object, depending on what you have). row is the index of the row in the data source.
    */
  def getSourceDataAtRow(row: Double): js.Any = js.native
  /**
    * Returns value of selected cell.
    */
  def getValue(): js.Any = js.native
  /**
    * Returns information of this table is configured to display column headers.
    */
  def hasColHeaders(): Boolean = js.native
  /**
    * Returns information of this table is configured to display row headers.
    */
  def hasRowHeaders(): Boolean = js.native
  /**
    * Returns true if the column at the given index is empty, false otherwise.
    */
  def isEmptyCol(col: Double): Boolean = js.native
  /**
    * Returns true if the row at the given index is empty, false otherwise.
    */
  def isEmptyRow(row: Double): Boolean = js.native
  /**
    * Returns true if current Handsontable instance is listening to keyboard input on document body.
    */
  def isListening(): Boolean = js.native
  /**
    * Return true if redo can be performed, false otherwise.
    */
  def isRedoAvailable(): Boolean = js.native
  /**
    * Return true if undo can be performed, false otherwise.
    */
  def isUndoAvailable(): Boolean = js.native
  /**
    * Listen to keyboard input on document body.
    */
  def listen(): Unit = js.native
  /**
    * Reset all cells in the grid to contain data from the data array.
    */
  def loadData(data: js.Array[_]): Unit = js.native
  /**
    * Populate cells at position with 2D input array (e.g. [ [1, 2], [3, 4] ]).
    * Use endRow, endCol when you want to cut input when certain row is reached.
    * @param source (default value "populateFromArray") is used to identify this call in the resulting events (beforeChange, afterChange).
    * @param populateMethod (default value "overwrite", possible values "shift_down" and "shift_right") has the same effect as pasteMethod option (see Options page).
    */
  def populateFromArray(row: Double, col: Double, input: js.Array[_], endRow: Double, endCol: Double): Unit = js.native
  def populateFromArray(row: Double, col: Double, input: js.Array[_], endRow: Double, endCol: Double, source: String): Unit = js.native
  def populateFromArray(
    row: Double,
    col: Double,
    input: js.Array[_],
    endRow: Double,
    endCol: Double,
    source: String,
    populateMethod: String
  ): Unit = js.native
  /**
    * Returns column index that corresponds with the given property.
    */
  def propToCol(property: String): Double = js.native
  /**
    * Redo edit (used to reverse an undo).
    */
  def redo(): Unit = js.native
  /**
    * Rerender the table.
    */
  def render(): Unit = js.native
  /**
    * Returns index of first visible row.
    */
  def rowOffset(): Double = js.native
  /**
    * Select cell row, col or range finishing at row2, col2. By default, viewport will be scrolled to selection.
    */
  def selectCell(row: Double, col: Double, row2: Double, col2: Double): Unit = js.native
  def selectCell(row: Double, col: Double, row2: Double, col2: Double, scrollToSelection: Boolean): Unit = js.native
  /**
    * Sets cell meta data object key corresponding to params row, col.
    */
  def setCellMeta(row: Double, col: Double, key: String, `val`: String): Unit = js.native
  /**
    * Set new value to a cell. To change many cells at once, pass an array of changes in format [ [row, col, value], ... ] as the only parameter. col is the index of visible column (note that if columns were reordered, the current order will be used). source is a flag for before/afterChange events. If you pass only array of changes then source could be set as second parameter.
    */
  def setDataAtCell(changes: js.Array[_]): Unit = js.native
  def setDataAtCell(changes: js.Array[_], source: String): Unit = js.native
  /**
    * Set new value to a cell. To change many cells at once, pass an array of changes in format [ [row, col, value], ... ] as the only parameter. col is the index of visible column (note that if columns were reordered, the current order will be used). source is a flag for before/afterChange events. If you pass only array of changes then source could be set as second parameter.
    */
  def setDataAtCell(row: Double, col: Double, value: js.Any): Unit = js.native
  def setDataAtCell(row: Double, col: Double, value: js.Any, source: String): Unit = js.native
  /**
    * Same as above, except instead of col, you provide name of the object property (e.g. [0, 'first.name', 'Jennifer']).
    */
  def setDataAtRowProp(changes: js.Array[_]): Unit = js.native
  def setDataAtRowProp(changes: js.Array[_], source: String): Unit = js.native
  /**
    * Same as above, except instead of col, you provide name of the object property (e.g. [0, 'first.name', 'Jennifer']).
    */
  def setDataAtRowProp(row: Double, prop: String, value: js.Any): Unit = js.native
  def setDataAtRowProp(row: Double, prop: String, value: js.Any, source: String): Unit = js.native
  /**
    * Sorts table content by cell values in given column, using order. column is a zero-based column index. Order of sorting can be either ascending (order = true) or descending (order = false).
    * Note I: This method is only available when coulmnSorting plugin is enabled. See column sorting demo for details.
    * Note II: Running this method will not alter the table data. Sorting takes place only in view layer.
    */
  def sort(column: Double, order: Boolean): Unit = js.native
  /**
    * Adds/removes data from the column. This function works is modelled after Array.splice. Parameter col is the index of column in which do you want to do splice. Parameter index is the row index at which to start changing the array. If negative, will begin that many elements from the end. Parameter amount, is the number of old array elements to remove. If the amount is 0, no elements are removed. Fourth and further parameters are the elements to add to the array. If you don't specify any elements, spliceCol simply removes elements from the array.
    */
  def spliceCol(col: Double, index: Double, amount: Double, elements: js.Any*): Unit = js.native
  /**
    * Adds/removes data from the row. This function works is modelled after Array.splice. Parameter row is the index of row in which do you want to do splice. Parameter index is the column index at which to start changing the array. If negative, will begin that many elements from the end. Parameter amount, is the number of old array elements to remove. If the amount is 0, no elements are removed. Fourth and further parameters are the elements to add to the array. If you don't specify any elements, spliceCol simply removes elements from the array.
    */
  def spliceRow(row: Double, index: Double, amount: Double, elements: js.Any*): Unit = js.native
  /**
    * Undo last edit.
    */
  def undo(): Unit = js.native
  /**
    * Stop listening to keyboard input on document body.
    */
  def unlisten(): Unit = js.native
  /**
    * Use it if you need to change configuration after initialization.
    */
  def updateSettings(options: Options): Unit = js.native
  /**
    * Validates all cells using their validator functions and calls callback when finished. Does not render the view.
    */
  def validateCells(callback: js.Function): Unit = js.native
}

