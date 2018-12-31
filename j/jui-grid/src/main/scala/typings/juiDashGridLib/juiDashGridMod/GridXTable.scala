package typings
package juiDashGridLib.juiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridXTable
  extends juiDashCoreLib.juiDashCoreMod.UIEvent {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: js.Object): this.type = js.native
  /**
    * Gets the index of a row that is activated in an extended/modified/selected state.
    *
    * @return index
    */
  def activeIndex(): scala.Double = js.native
  /**
    * Add a row or a child row to at a specified index.
    */
  def append(index: scala.Double, data: js.Object): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  /**
    * Gets the number of trows of a table.
    *
    * @return count
    */
  def count(): scala.Double = js.native
  /**
    * Downloads the data of a table as a CSV file.
    */
  def downloadCsv(name: java.lang.String): scala.Unit = js.native
  /**
    * Filters columns at a specified to locate rows that contain keywords in the cell value.
    */
  def filter(callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def fold(index: java.lang.String): scala.Unit = js.native
  /**
    * Hides a child row of a specified index.
    */
  def fold(index: scala.Double): scala.Unit = js.native
  def foldAll(index: java.lang.String): scala.Unit = js.native
  def foldAll(index: scala.Double): scala.Unit = js.native
  /**
    * Gets the row at the specified index.
    *
    * @return row
    */
  def get(index: scala.Double): GridRow = js.native
  def getAll(index: scala.Double): js.Array[GridRow] = js.native
  def getAll(index: scala.Double, _result: js.Any): js.Array[GridRow] = js.native
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
  def getCsv(): java.lang.String = js.native
  /**
    * Gets the data of a table as a CSV string encoded as base64.
    *
    * @return base64
    */
  def getCsvBase64(): java.lang.String = js.native
  def getData(index: java.lang.String): js.Any = js.native
  /**
    * Gets the data at the specified index.
    *
    * @param key index
    * @return data
    */
  def getData(index: scala.Double): js.Any = js.native
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
  def getPage(): scala.Double = js.native
  /**
    * @deprecated
    * Sets the scroll based on the height of a table.
    */
  def height(h: scala.Double): scala.Unit = js.native
  def hideColumn(index: java.lang.String): scala.Unit = js.native
  /**
    * Hides the column index (or column name).
    *
    * @param key index or column name
    */
  def hideColumn(index: scala.Double): scala.Unit = js.native
  def hideColumnMenu(): scala.Unit = js.native
  def hideExpand(index: scala.Double): scala.Unit = js.native
  def hideLoading(): scala.Unit = js.native
  def initColumns(keys: java.lang.String): scala.Unit = js.native
  /**
    * It is possible to determine the index or name of the column to be shown in an array.
    *
    * @param key index or column name
    */
  def initColumns(keys: scala.Double): scala.Unit = js.native
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
  def next(): scala.Unit = js.native
  def open(index: java.lang.String): scala.Unit = js.native
  /**
    * Shows a child row of a specified index.
    */
  def open(index: scala.Double): scala.Unit = js.native
  def openAll(index: java.lang.String): scala.Unit = js.native
  def openAll(index: scala.Double): scala.Unit = js.native
  /**
    * Changes to the page of at a specified index.
    */
  def page(pNo: scala.Double): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def render(isTree: scala.Boolean): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def resize(): scala.Unit = js.native
  def rollback(): scala.Unit = js.native
  @JSName("rowFunc")
  def rowFunc_avg(
    `type`: juiDashGridLib.juiDashGridLibStrings.avg,
    index: scala.Double,
    callback: js.Function1[/* data */ js.Any, scala.Unit]
  ): js.Any = js.native
  /**
    * Ir is possible to use a function for all row data applicable to the column (or column name) of a specified column (or column name). Currently only SUM and AVG are supported.
    */
  @JSName("rowFunc")
  def rowFunc_sum(
    `type`: juiDashGridLib.juiDashGridLibStrings.sum,
    index: scala.Double,
    callback: js.Function1[/* data */ js.Any, scala.Unit]
  ): js.Any = js.native
  /**
    * Sets the scroll based on the height of a table.
    */
  def scrollHeight(h: scala.Double): scala.Unit = js.native
  def scrollTop(index: java.lang.String, dist: scala.Double): scala.Unit = js.native
  /**
    * Sets the scroll based on the height of a table.
    */
  def scrollTop(index: scala.Double, dist: scala.Double): scala.Unit = js.native
  /**
    * Sets the scroll based on the width of a table.
    */
  def scrollWidth(scrollWidth: scala.Double): scala.Unit = js.native
  def scrollWidth(scrollWidth: scala.Double, isInit: scala.Boolean): scala.Unit = js.native
  /**
    * Adds a selected class to a row at a specified index and gets an instance of the applicable row.
    *
    * @return row
    */
  def select(index: scala.Double): GridRow = js.native
  def setCsv(csv: java.lang.String): scala.Unit = js.native
  def setCsvFile(file: js.Any): scala.Unit = js.native
  def showColumn(index: java.lang.String): scala.Unit = js.native
  /**
    * Shows the column index (or column name).
    *
    * @param key index or column name
    */
  def showColumn(index: scala.Double): scala.Unit = js.native
  /**
    * Shows the Show/Hide Column menu at specified coordinates.
    */
  def showColumnMenu(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Shows the extended row area of a specified index.
    */
  def showExpand(index: scala.Double, obj: js.Any): scala.Unit = js.native
  /**
    * Shows the loading screen for the specified delay time.
    */
  def showLoading(delay: scala.Double): scala.Unit = js.native
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
  @JSName("sort")
  def sort_asc(index: scala.Double, order: juiDashGridLib.juiDashGridLibStrings.asc): scala.Unit = js.native
  @JSName("sort")
  def sort_asc(index: scala.Double, order: juiDashGridLib.juiDashGridLibStrings.asc, e: js.Any): scala.Unit = js.native
  @JSName("sort")
  def sort_asc(
    index: scala.Double,
    order: juiDashGridLib.juiDashGridLibStrings.asc,
    e: js.Any,
    isNotLoading: js.Any
  ): scala.Unit = js.native
  @JSName("sort")
  def sort_desc(index: scala.Double, order: juiDashGridLib.juiDashGridLibStrings.desc): scala.Unit = js.native
  @JSName("sort")
  def sort_desc(index: scala.Double, order: juiDashGridLib.juiDashGridLibStrings.desc, e: js.Any): scala.Unit = js.native
  @JSName("sort")
  def sort_desc(
    index: scala.Double,
    order: juiDashGridLib.juiDashGridLibStrings.desc,
    e: js.Any,
    isNotLoading: js.Any
  ): scala.Unit = js.native
  /**
    * Shows or hides the Show/Hide Column menu.
    */
  def toggleColumnMenu(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Removes a selected class from a selected row and gets an instance of the row in question.
    *
    * @return row
    */
  def unselect(): GridRow = js.native
  /**
    * Updates the list of rows or modifies the row at a specified index.
    */
  def update(dataList: js.Array[_]): scala.Unit = js.native
  /**
    * It is possible to configure a tree table using an object array with the index and data properties.
    */
  def updateTree(tree: js.Array[_]): scala.Unit = js.native
}

