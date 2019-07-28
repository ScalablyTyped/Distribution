package typings.juiDashGrid.juiDashGridMod

import typings.juiDashCore.juiDashCoreMod.UIEvent
import typings.juiDashGrid.juiDashGridStrings.asc
import typings.juiDashGrid.juiDashGridStrings.avg
import typings.juiDashGrid.juiDashGridStrings.desc
import typings.juiDashGrid.juiDashGridStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridXTable extends UIEvent {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: js.Object): this.type = js.native
  /**
    * Gets the index of a row that is activated in an extended/modified/selected state.
    *
    * @return index
    */
  def activeIndex(): Double = js.native
  /**
    * Add a row or a child row to at a specified index.
    */
  def append(index: Double, data: js.Object): Unit = js.native
  def clear(): Unit = js.native
  /**
    * Gets the number of trows of a table.
    *
    * @return count
    */
  def count(): Double = js.native
  /**
    * Downloads the data of a table as a CSV file.
    */
  def downloadCsv(name: String): Unit = js.native
  /**
    * Filters columns at a specified to locate rows that contain keywords in the cell value.
    */
  def filter(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def fold(index: String): Unit = js.native
  /**
    * Hides a child row of a specified index.
    */
  def fold(index: Double): Unit = js.native
  def foldAll(index: String): Unit = js.native
  def foldAll(index: Double): Unit = js.native
  /**
    * Gets the row at the specified index.
    *
    * @return row
    */
  def get(index: Double): GridRow = js.native
  def getAll(index: Double): js.Array[GridRow] = js.native
  def getAll(index: Double, _result: js.Any): js.Array[GridRow] = js.native
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
  def getCsv(): String = js.native
  /**
    * Gets the data of a table as a CSV string encoded as base64.
    *
    * @return base64
    */
  def getCsvBase64(): String = js.native
  def getData(index: String): js.Any = js.native
  /**
    * Gets the data at the specified index.
    *
    * @param key index
    * @return data
    */
  def getData(index: Double): js.Any = js.native
  /**
    * Get a row in which the extended area is currently activated.
    *
    * @return row
    */
  def getExpand(): GridRow = js.native
  /**
    * Gets the current page of a table.
    *
    * @return page
    */
  def getPage(): Double = js.native
  /**
    * @deprecated
    * Sets the scroll based on the height of a table.
    */
  def height(h: Double): Unit = js.native
  def hideColumn(index: String): Unit = js.native
  /**
    * Hides the column index (or column name).
    *
    * @param key index or column name
    */
  def hideColumn(index: Double): Unit = js.native
  def hideColumnMenu(): Unit = js.native
  def hideExpand(index: Double): Unit = js.native
  def hideLoading(): Unit = js.native
  def initColumns(keys: String): Unit = js.native
  /**
    * It is possible to determine the index or name of the column to be shown in an array.
    *
    * @param key index or column name
    */
  def initColumns(keys: Double): Unit = js.native
  /**
    * Gets all the rows of a table.
    *
    * @return rows
    */
  def list(): js.Array[GridRow] = js.native
  /**
    * Gets all columns.
    *
    * @return columns
    */
  def listColumn(): js.Array[GridColumn] = js.native
  /**
    * Gets the data of all the rows of a table.
    *
    * @return datas
    */
  def listData(): js.Array[_] = js.native
  def next(): Unit = js.native
  def open(index: String): Unit = js.native
  /**
    * Shows a child row of a specified index.
    */
  def open(index: Double): Unit = js.native
  def openAll(index: String): Unit = js.native
  def openAll(index: Double): Unit = js.native
  /**
    * Changes to the page of at a specified index.
    */
  def page(pNo: Double): Unit = js.native
  def render(): Unit = js.native
  def render(isTree: Boolean): Unit = js.native
  def reset(): Unit = js.native
  def resize(): Unit = js.native
  def rollback(): Unit = js.native
  @JSName("rowFunc")
  def rowFunc_avg(`type`: avg, index: Double, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  /**
    * Ir is possible to use a function for all row data applicable to the column (or column name) of a specified column (or column name). Currently only SUM and AVG are supported.
    */
  @JSName("rowFunc")
  def rowFunc_sum(`type`: sum, index: Double, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  /**
    * Sets the scroll based on the height of a table.
    */
  def scrollHeight(h: Double): Unit = js.native
  def scrollTop(index: String, dist: Double): Unit = js.native
  /**
    * Sets the scroll based on the height of a table.
    */
  def scrollTop(index: Double, dist: Double): Unit = js.native
  /**
    * Sets the scroll based on the width of a table.
    */
  def scrollWidth(scrollWidth: Double): Unit = js.native
  def scrollWidth(scrollWidth: Double, isInit: Boolean): Unit = js.native
  /**
    * Adds a selected class to a row at a specified index and gets an instance of the applicable row.
    *
    * @return row
    */
  def select(index: Double): GridRow = js.native
  def setCsv(csv: String): Unit = js.native
  def setCsvFile(file: js.Any): Unit = js.native
  def showColumn(index: String): Unit = js.native
  /**
    * Shows the column index (or column name).
    *
    * @param key index or column name
    */
  def showColumn(index: Double): Unit = js.native
  /**
    * Shows the Show/Hide Column menu at specified coordinates.
    */
  def showColumnMenu(x: Double, y: Double): Unit = js.native
  /**
    * Shows the extended row area of a specified index.
    */
  def showExpand(index: Double, obj: js.Any): Unit = js.native
  /**
    * Shows the loading screen for the specified delay time.
    */
  def showLoading(delay: Double): Unit = js.native
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
  @JSName("sort")
  def sort_asc(index: Double, order: asc): Unit = js.native
  @JSName("sort")
  def sort_asc(index: Double, order: asc, e: js.Any): Unit = js.native
  @JSName("sort")
  def sort_asc(index: Double, order: asc, e: js.Any, isNotLoading: js.Any): Unit = js.native
  @JSName("sort")
  def sort_desc(index: Double, order: desc): Unit = js.native
  @JSName("sort")
  def sort_desc(index: Double, order: desc, e: js.Any): Unit = js.native
  @JSName("sort")
  def sort_desc(index: Double, order: desc, e: js.Any, isNotLoading: js.Any): Unit = js.native
  /**
    * Shows or hides the Show/Hide Column menu.
    */
  def toggleColumnMenu(x: Double, y: Double): Unit = js.native
  /**
    * Removes a selected class from a selected row and gets an instance of the row in question.
    *
    * @return row
    */
  def unselect(): GridRow = js.native
  /**
    * Updates the list of rows or modifies the row at a specified index.
    */
  def update(dataList: js.Array[_]): Unit = js.native
  /**
    * It is possible to configure a tree table using an object array with the index and data properties.
    */
  def updateTree(tree: js.Array[_]): Unit = js.native
}

