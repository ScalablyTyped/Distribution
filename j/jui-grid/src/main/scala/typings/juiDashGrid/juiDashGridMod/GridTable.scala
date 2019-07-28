package typings.juiDashGrid.juiDashGridMod

import typings.juiDashCore.juiDashCoreMod.UIEvent
import typings.juiDashGrid.Anon_Asc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridTable extends UIEvent {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Anon_Asc): this.type = js.native
  /**
    * Gets the index of a row that is activated in an extended/modified/selected state.
    *
    * @return index
    */
  def activeIndex(): Double = js.native
  /**
    * Add a row or a child row to at a specified index.
    */
  def append(): Unit = js.native
  def append(rowOrIndex: js.Any): Unit = js.native
  def append(rowOrIndex: js.Any, row: js.Any): Unit = js.native
  def append(rowOrIndex: Double): Unit = js.native
  def append(rowOrIndex: Double, row: js.Any): Unit = js.native
  /**
    * Add a checked class to a row at a specified index.
    */
  def check(index: Double): Unit = js.native
  /**
    * Gets the number of trows of a table.
    *
    * @return count
    */
  def count(): Double = js.native
  /**
    * Downloads the data of a table as a CSV file.
    */
  def downloadCsv(name: String, isTree: Boolean): Unit = js.native
  /**
    * Hides a child row of a specified index.
    */
  def fold(index: Double): Unit = js.native
  def foldAll(): Unit = js.native
  /**
    * Gets the row at the specified index.
    *
    * @return row
    */
  def get(index: Double): GridRow = js.native
  /**
    * Gets all rows of at the specified index including child rows.
    *
    * @return rows
    */
  def getAll(index: Double): js.Array[GridRow] = js.native
  def getColumn(index: String): GridColumn = js.native
  /**
    * Gets the column at the specified index.
    *
    * @param key index or column key
    * @return column
    */
  def getColumn(index: Double): GridColumn = js.native
  /**
    * Gets the data of a table as a CSV string.
    *
    * @return csv
    */
  def getCsv(isTree: Boolean): String = js.native
  /**
    * Gets the data of a table as a CSV string encoded as base64.
    *
    * @return base64
    */
  def getCsvBase64(isTree: Boolean): String = js.native
  /**
    * Get a row in which the modified area is currently activated.
    *
    * @return row
    */
  def getEditRow(): GridRow = js.native
  /**
    * Get a row in which the extended area is currently activated.
    *
    * @return row
    */
  def getExpand(): GridRow = js.native
  def hideColumn(index: String): Unit = js.native
  def hideColumn(index: String, e: js.Any): Unit = js.native
  /**
    * Hides the column index (or column name).
    *
    * @param key index or column name
    */
  def hideColumn(index: Double): Unit = js.native
  def hideColumn(index: Double, e: js.Any): Unit = js.native
  def hideColumnMenu(): Unit = js.native
  def hideEditRow(): Unit = js.native
  def hideEditRow(data: js.Any): Unit = js.native
  def hideExpand(): Unit = js.native
  def hideExpand(e: js.Any): Unit = js.native
  /**
    * It is possible to determine the index or name of the column to be shown in an array.
    *
    * @param key index or column name
    */
  def initColumns(keys: js.Any): Unit = js.native
  /**
    * Adds a row at a specified index.
    */
  def insert(index: Double, dataList: js.Object): Unit = js.native
  /**
    * Gets all the rows of a table.
    *
    * @return rows
    */
  def list(): js.Array[GridRow] = js.native
  /**
    * Gets all the rows of a table including child rows.
    *
    * @return rows
    */
  def listAll(): js.Array[GridRow] = js.native
  /**
    * Gets all rows in a check state.
    *
    * @return rows
    */
  def listChecked(): js.Array[GridRow] = js.native
  /**
    * Gets all columns.
    *
    * @return columns
    */
  def listColumn(): GridColumn = js.native
  /**
    * Gets the data of all the rows of a table.
    *
    * @return datas
    */
  def listData(): js.Array[_] = js.native
  /**
    * Moves a row iat a specified index to the target index.
    */
  def move(index: Double, targetIndex: Double): Unit = js.native
  /**
    * Shows a child row of a specified index.
    */
  def open(index: Double): Unit = js.native
  def openAll(): Unit = js.native
  /**
    * Remove a row at a specified index.
    */
  def remove(index: Double): Unit = js.native
  def reset(): Unit = js.native
  def resize(): Unit = js.native
  def resizeColumns(): Unit = js.native
  /**
    * Sets the scroll based on the height of a table.
    */
  def scroll(height: Double): Unit = js.native
  /**
    * Adds a selected class to a row at a specified index and gets an instance of the applicable row.
    *
    * @return row
    */
  def select(index: Double): GridRow = js.native
  def setCsv(csvOrKey: js.Any): Unit = js.native
  def setCsv(csvOrKey: js.Any, key: js.Any): Unit = js.native
  def setCsvFile(fileOrKey: js.Any): Unit = js.native
  def setCsvFile(fileOrKey: js.Any, key: js.Any): Unit = js.native
  def showColumn(index: String): Unit = js.native
  def showColumn(index: String, e: js.Any): Unit = js.native
  /**
    * Shows the column index (or column name).
    *
    * @param key index or column name
    */
  def showColumn(index: Double): Unit = js.native
  def showColumn(index: Double, e: js.Any): Unit = js.native
  /**
    * Shows the Show/Hide Column menu at specified coordinates.
    */
  def showColumnMenu(x: Double, y: Double): Unit = js.native
  /**
    * Shows the modified row area of a specified index.
    */
  def showEditRow(index: Double): Unit = js.native
  def showEditRow(index: Double, e: js.Any): Unit = js.native
  /**
    * Shows the extended row area of a specified index.
    */
  def showExpand(index: Double): Unit = js.native
  def showExpand(index: Double, obj: js.Any): Unit = js.native
  def showExpand(index: Double, obj: js.Any, e: js.Any): Unit = js.native
  /**
    * Gets the size of all the rows of a table.
    *
    * @return size
    */
  def size(): Double = js.native
  /**
    * Moves a row iat a specified index to the target index.
    *
    * @param order  "asc" or "desc"
    */
  def sort(index: Double, order: String): Unit = js.native
  def sort(index: Double, order: String, e: js.Any): Unit = js.native
  /**
    * Shows or hides the Show/Hide Column menu.
    */
  def toggleColumnMenu(x: Double, y: Double): Unit = js.native
  /**
    * Removes a checked class from a row at a specified index.
    */
  def uncheck(index: Double): Unit = js.native
  def uncheckAll(): Unit = js.native
  /**
    * Removes a selected class from a selected row and gets an instance of the row in question.
    *
    * @return row
    */
  def unselect(): GridRow = js.native
  /**
    * Updates the list of rows or modifies the row at a specified index.
    */
  def update(): Unit = js.native
  def update(indexOrRows: js.Any): Unit = js.native
  def update(indexOrRows: js.Any, rows: js.Any): Unit = js.native
  /**
    * It is possible to configure a tree table using an object array with the index and data properties.
    */
  def updateTree(rows: js.Array[_]): Unit = js.native
}

