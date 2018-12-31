package typings
package juiDashGridLib.juiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridTable
  extends juiDashCoreLib.juiDashCoreMod.UIEvent {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiDashGridLib.Anon_Scroll): this.type = js.native
  /**
    * Gets the index of a row that is activated in an extended/modified/selected state.
    *
    * @return index
    */
  def activeIndex(): scala.Double = js.native
  /**
    * Add a row or a child row to at a specified index.
    */
  def append(): scala.Unit = js.native
  def append(rowOrIndex: js.Any): scala.Unit = js.native
  def append(rowOrIndex: js.Any, row: js.Any): scala.Unit = js.native
  def append(rowOrIndex: scala.Double): scala.Unit = js.native
  def append(rowOrIndex: scala.Double, row: js.Any): scala.Unit = js.native
  /**
    * Add a checked class to a row at a specified index.
    */
  def check(index: scala.Double): scala.Unit = js.native
  /**
    * Gets the number of trows of a table.
    *
    * @return count
    */
  def count(): scala.Double = js.native
  /**
    * Downloads the data of a table as a CSV file.
    */
  def downloadCsv(name: java.lang.String, isTree: scala.Boolean): scala.Unit = js.native
  /**
    * Hides a child row of a specified index.
    */
  def fold(index: scala.Double): scala.Unit = js.native
  def foldAll(): scala.Unit = js.native
  /**
    * Gets the row at the specified index.
    *
    * @return row
    */
  def get(index: scala.Double): GridRow = js.native
  /**
    * Gets all rows of at the specified index including child rows.
    *
    * @return rows
    */
  def getAll(index: scala.Double): js.Array[GridRow] = js.native
  def getColumn(index: java.lang.String): GridColumn = js.native
  /**
    * Gets the column at the specified index.
    *
    * @param key index or column key
    * @return column
    */
  def getColumn(index: scala.Double): GridColumn = js.native
  /**
    * Gets the data of a table as a CSV string.
    *
    * @return csv
    */
  def getCsv(isTree: scala.Boolean): java.lang.String = js.native
  /**
    * Gets the data of a table as a CSV string encoded as base64.
    *
    * @return base64
    */
  def getCsvBase64(isTree: scala.Boolean): java.lang.String = js.native
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
  def hideColumn(index: java.lang.String): scala.Unit = js.native
  def hideColumn(index: java.lang.String, e: js.Any): scala.Unit = js.native
  /**
    * Hides the column index (or column name).
    *
    * @param key index or column name
    */
  def hideColumn(index: scala.Double): scala.Unit = js.native
  def hideColumn(index: scala.Double, e: js.Any): scala.Unit = js.native
  def hideColumnMenu(): scala.Unit = js.native
  def hideEditRow(): scala.Unit = js.native
  def hideEditRow(data: js.Any): scala.Unit = js.native
  def hideExpand(): scala.Unit = js.native
  def hideExpand(e: js.Any): scala.Unit = js.native
  /**
    * It is possible to determine the index or name of the column to be shown in an array.
    *
    * @param key index or column name
    */
  def initColumns(keys: js.Any): scala.Unit = js.native
  /**
    * Adds a row at a specified index.
    */
  def insert(index: scala.Double, dataList: js.Object): scala.Unit = js.native
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
  def move(index: scala.Double, targetIndex: scala.Double): scala.Unit = js.native
  /**
    * Shows a child row of a specified index.
    */
  def open(index: scala.Double): scala.Unit = js.native
  def openAll(): scala.Unit = js.native
  /**
    * Remove a row at a specified index.
    */
  def remove(index: scala.Double): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def resize(): scala.Unit = js.native
  def resizeColumns(): scala.Unit = js.native
  /**
    * Sets the scroll based on the height of a table.
    */
  def scroll(height: scala.Double): scala.Unit = js.native
  /**
    * Adds a selected class to a row at a specified index and gets an instance of the applicable row.
    *
    * @return row
    */
  def select(index: scala.Double): GridRow = js.native
  def setCsv(csvOrKey: js.Any): scala.Unit = js.native
  def setCsv(csvOrKey: js.Any, key: js.Any): scala.Unit = js.native
  def setCsvFile(fileOrKey: js.Any): scala.Unit = js.native
  def setCsvFile(fileOrKey: js.Any, key: js.Any): scala.Unit = js.native
  def showColumn(index: java.lang.String): scala.Unit = js.native
  def showColumn(index: java.lang.String, e: js.Any): scala.Unit = js.native
  /**
    * Shows the column index (or column name).
    *
    * @param key index or column name
    */
  def showColumn(index: scala.Double): scala.Unit = js.native
  def showColumn(index: scala.Double, e: js.Any): scala.Unit = js.native
  /**
    * Shows the Show/Hide Column menu at specified coordinates.
    */
  def showColumnMenu(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Shows the modified row area of a specified index.
    */
  def showEditRow(index: scala.Double): scala.Unit = js.native
  def showEditRow(index: scala.Double, e: js.Any): scala.Unit = js.native
  /**
    * Shows the extended row area of a specified index.
    */
  def showExpand(index: scala.Double): scala.Unit = js.native
  def showExpand(index: scala.Double, obj: js.Any): scala.Unit = js.native
  def showExpand(index: scala.Double, obj: js.Any, e: js.Any): scala.Unit = js.native
  /**
    * Gets the size of all the rows of a table.
    *
    * @return size
    */
  def size(): scala.Double = js.native
  /**
    * Moves a row iat a specified index to the target index.
    *
    * @param order  "asc" or "desc"
    */
  def sort(index: scala.Double, order: java.lang.String): scala.Unit = js.native
  def sort(index: scala.Double, order: java.lang.String, e: js.Any): scala.Unit = js.native
  /**
    * Shows or hides the Show/Hide Column menu.
    */
  def toggleColumnMenu(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Removes a checked class from a row at a specified index.
    */
  def uncheck(index: scala.Double): scala.Unit = js.native
  def uncheckAll(): scala.Unit = js.native
  /**
    * Removes a selected class from a selected row and gets an instance of the row in question.
    *
    * @return row
    */
  def unselect(): GridRow = js.native
  /**
    * Updates the list of rows or modifies the row at a specified index.
    */
  def update(): scala.Unit = js.native
  def update(indexOrRows: js.Any): scala.Unit = js.native
  def update(indexOrRows: js.Any, rows: js.Any): scala.Unit = js.native
  /**
    * It is possible to configure a tree table using an object array with the index and data properties.
    */
  def updateTree(rows: js.Array[_]): scala.Unit = js.native
}

