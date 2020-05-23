package typings.juiGrid

import typings.juiCore.mod.UIEvent
import typings.juiGrid.anon.Colshow
import typings.juiGrid.juiGridStrings.asc
import typings.juiGrid.juiGridStrings.avg
import typings.juiGrid.juiGridStrings.desc
import typings.juiGrid.juiGridStrings.fold
import typings.juiGrid.juiGridStrings.hide
import typings.juiGrid.juiGridStrings.open
import typings.juiGrid.juiGridStrings.resize
import typings.juiGrid.juiGridStrings.show
import typings.juiGrid.juiGridStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jui-grid", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait GridBase extends js.Object {
    def appendColumn(tplType: String, dataList: js.Array[_]): Unit = js.native
    def appendRow(index: String): GridRow = js.native
    def appendRow(index: String, data: js.Object): GridRow = js.native
    def appendRow(index: Double): GridRow = js.native
    def appendRow(index: Double, data: js.Object): GridRow = js.native
    def foldRow(index: String): Unit = js.native
    def foldRow(index: Double): Unit = js.native
    def foldRowAll(): Unit = js.native
    def getColumn(): GridColumn | js.Array[GridColumn] = js.native
    def getColumn(index: String): GridColumn | js.Array[GridColumn] = js.native
    def getColumn(index: Double): GridColumn | js.Array[GridColumn] = js.native
    def getColumnCount(): Double = js.native
    def getRow(): GridRow | js.Array[GridRow] = js.native
    def getRow(index: String): GridRow | js.Array[GridRow] = js.native
    def getRow(index: Double): GridRow | js.Array[GridRow] = js.native
    def getRowAll(index: String): js.Array[GridRow] = js.native
    def getRowAll(index: Double): js.Array[GridRow] = js.native
    def getRowCount(): Double = js.native
    def getRowParent(index: String): GridRow = js.native
    def getRowParent(index: Double): GridRow = js.native
    def hideColumn(index: String): Unit = js.native
    def hideColumn(index: Double): Unit = js.native
    def insertRow(index: String, data: js.Object): GridRow = js.native
    def insertRow(index: Double, data: js.Object): GridRow = js.native
    def moveRow(index: String, targetIndex: String): Unit = js.native
    def moveRow(index: String, targetIndex: Double): Unit = js.native
    def moveRow(index: Double, targetIndex: String): Unit = js.native
    def moveRow(index: Double, targetIndex: Double): Unit = js.native
    def openRow(index: String): Unit = js.native
    def openRow(index: Double): Unit = js.native
    def openRowAll(): Unit = js.native
    def removeColumn(index: String): Unit = js.native
    def removeColumn(index: Double): Unit = js.native
    def removeRow(index: String): Unit = js.native
    def removeRow(index: Double): Unit = js.native
    def removeRows(): Unit = js.native
    def setColumn(index: String, column: GridColumn): Unit = js.native
    def setColumn(index: Double, column: GridColumn): Unit = js.native
    def setRow(index: String, row: GridRow): Unit = js.native
    def setRow(index: Double, row: GridRow): Unit = js.native
    def showColumn(index: String): Unit = js.native
    def showColumn(index: Double): Unit = js.native
    def sortRows(name: String, isDesc: Boolean): Unit = js.native
    def updateRow(index: String, data: js.Object): GridRow = js.native
    def updateRow(index: Double, data: js.Object): GridRow = js.native
  }
  
  @js.native
  trait GridColumn extends js.Object {
    /** Data from all rows belonging for a specified column */
    var data: js.Array[_] = js.native
    /**
      * TH element of a specified column
      * @default null
      */
    var element: js.Any = js.native
    /** Column index */
    var index: Double = js.native
    /** TD element of all rows belonging to a specified column */
    var list: js.Array[_] = js.native
    /**
      * Column name
      * @default null
      */
    var name: js.UndefOr[String] = js.native
    /**
      * Column sort state
      * @default "asc"
      */
    var order: asc | desc = js.native
    /**
      * The current column state
      * @default "show"
      */
    var `type`: show | hide | resize = js.native
    /**
      * Column width
      * @default null
      */
    var width: js.UndefOr[Double] = js.native
    def apply(index: String): this.type = js.native
    def apply(index: Double): this.type = js.native
    def hide(): Unit = js.native
    def show(): Unit = js.native
  }
  
  @js.native
  trait GridRow extends js.Object {
    /** List of child rows. */
    var children: js.Array[_] = js.native
    /** Data of a specified row. */
    var data: js.Array[_] = js.native
    /**
      * The depth of the current row in the case of a tree structure.
      * @default 0
      */
    var depth: Double = js.native
    /** TR element of a specified row. */
    var element: js.Any = js.native
    /** Index of a specified row. In the case of a tree structure, a depth is given. */
    var index: Double | String = js.native
    /** List of TD elements of a specified row. */
    var list: js.Array[_] = js.native
    /** Variable that refers to the parent row. */
    var parent: js.UndefOr[GridRow] = js.native
    /** The unique number of a child row under the specified parent row if a parent row exists. */
    var rownum: js.UndefOr[Double] = js.native
    /** Data of a sequence. */
    var seq: Double = js.native
    /**
      * State value that indicates whether a child row is shown or hidden.
      */
    var tpl: js.UndefOr[js.Function0[Unit]] = js.native
    /**
      * State value that indicates whether a child row is shown or hidden.
      * @default "fold"
      */
    var `type`: open | fold = js.native
    def appendChild(row: GridRow): Unit = js.native
    def destroy(): Unit = js.native
    def fold(): Unit = js.native
    def hideCell(index: Double): Unit = js.native
    def insertChild(rownum: Double, row: GridRow): Unit = js.native
    def insertChild(rownum: Double, row: GridRow, isReload: js.Any): Unit = js.native
    def isLeaf(): Boolean = js.native
    def lastChild(): GridRow = js.native
    def lastChildLeaf(lastRow: GridRow): GridRow | js.Any = js.native
    def open(): Unit = js.native
    def reload(columns: js.Array[GridColumn], seq: js.Any, xssFilter: js.Any): Unit = js.native
    def removeChild(index: String): Unit = js.native
    def removeChild(index: Double): Unit = js.native
    def setIndex(rownum: String): Unit = js.native
    def setIndex(rownum: Double): Unit = js.native
    def showCell(index: Double): Unit = js.native
  }
  
  @js.native
  trait GridTable extends UIEvent {
    def apply(selector: js.Any): this.type = js.native
    def apply(selector: js.Any, options: Colshow): this.type = js.native
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
  
}

