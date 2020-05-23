package typings.jexcel.mod

import typings.jexcel.jexcelNumbers.`0`
import typings.jexcel.jexcelNumbers.`1`
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLTableColElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JExcelElement extends js.Object {
  var ads: HTMLDivElement = js.native
  var colgroup: js.Array[HTMLTableColElement] = js.native
  var colgroupContainer: js.Any = js.native
  var content: HTMLDivElement = js.native
  var contextMenu: HTMLDivElement = js.native
  var corner: js.Any = js.native
  var cursor: js.Any = js.native
  var data: js.Any = js.native
  var dragging: js.Any = js.native
  var edition: js.Any = js.native
  var el: HTMLDivElement = js.native
  var filter: HTMLDivElement = js.native
  var formula: js.Array[_] = js.native
  var hashString: js.Any = js.native
  var headerContainer: HTMLTableRowElement = js.native
  var headers: js.Any = js.native
  var highlighted: js.Array[_] = js.native
  var history: ActionHistory = js.native
  var historyIndex: Double = js.native
  var ignoreEvents: Boolean = js.native
  var ignoreHistory: Boolean = js.native
  var options: js.Any = js.native
  var pageNumber: js.Any = js.native
  var pagination: HTMLDivElement = js.native
  var records: js.Any = js.native
  var resizing: js.Any = js.native
  var results: js.Any = js.native
  var rows: js.Array[HTMLTableRowElement] = js.native
  var searchInput: HTMLInputElement = js.native
  var selectedCell: js.Any = js.native
  var selectedContainer: js.Any = js.native
  var selection: js.Array[_] = js.native
  var style: js.Array[_] = js.native
  var table: HTMLTableElement = js.native
  var tbody: HTMLTableSectionElement = js.native
  var textarea: HTMLTextAreaElement = js.native
  var thead: HTMLTableHeaderCellElement = js.native
  var toolbar: HTMLDivElement = js.native
  def closeEditor(cell: js.Object, save: Boolean): js.Any = js.native
  def col(cell: js.Object): js.Any = js.native
  /**
    * Move coords to A1 in case ovelaps with an excluded cell
    */
  @JSName("conditionalSelectionUpdate")
  def conditionalSelectionUpdate_0(`type`: `0`, o: Double, d: Double): Unit = js.native
  @JSName("conditionalSelectionUpdate")
  def conditionalSelectionUpdate_1(`type`: `1`, o: Double, d: Double): Unit = js.native
  /**
    * Copy method
    *
    * @param bool highlighted - Get only highlighted cells
    * @param delimiter - \t default to keep compatibility with excel
    * @return string value
    */
  def copy(): String = js.native
  def copy(highlighted: Boolean): String = js.native
  def copy(highlighted: Boolean, delimiter: String): String = js.native
  def copy(highlighted: Boolean, delimiter: String, returnData: Boolean): String = js.native
  /**
    * Helper function to copy data using the corner icon
    */
  def copyData(o: js.Object, d: js.Object): js.Any = js.native
  def createCell(i: Double, j: Double, value: CellValue): js.Any = js.native
  def createCellHeader(colNumber: Double): js.Any = js.native
  def createNestedHeader(nestedInformation: js.Array[js.Object]): js.Any = js.native
  def createRow(j: Double): js.Any = js.native
  def createRow(j: Double, data: js.Any): js.Any = js.native
  def createTable(): Unit = js.native
  def createToolbar(toolbar: js.Array[js.Object]): Unit = js.native
  def deleteColumn(columnNumber: js.Any, numOfColumns: js.Any): js.Any = js.native
  def deleteRow(rowNumber: js.Any, numOfRows: js.Any): js.Any = js.native
  def destroy(): js.Any = js.native
  def destroyMerged(keepOptions: js.Any): js.Any = js.native
  def down(shiftKey: js.Any, ctrlKey: js.Any): js.Any = js.native
  def download(includeHeaders: js.Any): js.Any = js.native
  def executeFormula(expression: js.Any, x: js.Any, y: js.Any): js.Any = js.native
  def first(shiftKey: js.Any, ctrlKey: js.Any): js.Any = js.native
  def fullscreen(activate: js.Any): js.Any = js.native
  def getCell(cell: js.Any): js.Any = js.native
  def getCellFromCoords(x: Double, y: Double): js.Any = js.native
  def getColumnData(columnNumber: Double): js.Array[CellValue] = js.native
  def getComments(cell: js.Any, withAuthor: js.Any): js.Any = js.native
  def getConfig(): js.Any = js.native
  def getData(): js.Array[js.Array[CellValue]] = js.native
  def getData(highlighted: Boolean): js.Array[js.Array[CellValue]] = js.native
  def getData(highlighted: Boolean, dataOnly: Boolean): js.Array[js.Array[CellValue]] = js.native
  def getDropDownValue(column: js.Any, key: js.Any): js.Any = js.native
  def getHeader(column: js.Any): js.Any = js.native
  def getHeaders(asArray: js.Any): js.Any = js.native
  def getHeight(row: js.Any): js.Any = js.native
  def getHighlighted(): js.Any = js.native
  def getJson(): js.Any = js.native
  def getJson(highlighted: Boolean): js.Any = js.native
  def getLabel(cell: js.Any): js.Any = js.native
  def getLabelFromCoords(x: Double, y: Double): js.Any = js.native
  def getMerge(cellName: js.Any): js.Any = js.native
  def getMeta(cell: js.Any, key: js.Any): js.Any = js.native
  def getRowData(rowNumber: Double): js.Any = js.native
  def getSelectedColumns(): js.Any = js.native
  def getSelectedRows(): js.Any = js.native
  def getSelectedRows(asIds: Boolean): js.Any = js.native
  def getStyle(cell: js.Any, key: js.Any): js.Any = js.native
  def getValue(cell: js.Any, processedValue: js.Any): js.Any = js.native
  def getValueFromCoords(x: Double, y: Double, processedValue: js.Any): js.Any = js.native
  def getWidth(column: js.Any): js.Any = js.native
  def hash(str: js.Any): js.Any = js.native
  def hideColumn(colNumber: Double): js.Any = js.native
  def hideIndex(): js.Any = js.native
  def historyProcessColumn(`type`: js.Any, historyRecord: js.Any): js.Any = js.native
  def historyProcessRow(`type`: js.Any, historyRecord: js.Any): js.Any = js.native
  def init(): js.Any = js.native
  /**
    * Insert a new column
    *
    * @param mixed - num of columns to be added or data to be added in one single column
    * @param int columnNumber - number of columns to be created
    * @param bool insertBefore
    * @param object properties - column properties
    * @return void
    */
  def insertColumn(mixed: js.Any): js.Any = js.native
  def insertColumn(mixed: js.Any, columnNumber: Double): js.Any = js.native
  def insertColumn(mixed: js.Any, columnNumber: Double, insertBefore: Boolean): js.Any = js.native
  def insertColumn(mixed: js.Any, columnNumber: Double, insertBefore: Boolean, properties: js.Object): js.Any = js.native
  def insertRow(): js.Any = js.native
  def insertRow(mixed: js.Any): js.Any = js.native
  def insertRow(mixed: js.Any, rowNumber: Double): js.Any = js.native
  def insertRow(mixed: js.Any, rowNumber: Double, insertBefore: Boolean): js.Any = js.native
  def isColMerged(x: Double): js.Any = js.native
  def isColMerged(x: Double, insertBefore: Boolean): js.Any = js.native
  def isRowMerged(y: Double): js.Any = js.native
  def isRowMerged(y: Double, insertBefore: Boolean): js.Any = js.native
  def last(shiftKey: js.Any, ctrlKey: js.Any): js.Any = js.native
  def left(shiftKey: js.Any, ctrlKey: js.Any): js.Any = js.native
  def loadDown(): js.Any = js.native
  def loadPage(pageNumber: Double): js.Any = js.native
  def loadUp(): js.Any = js.native
  def loadValidation(): js.Any = js.native
  def moveColumn(o: js.Any, d: js.Any): js.Any = js.native
  def moveRow(o: js.Any, d: js.Any, ignoreDom: js.Any): js.Any = js.native
  def onafterchanges(el: js.Any, records: js.Any): js.Any = js.native
  def openEditor(cell: js.Any, empty: js.Any, e: js.Any): js.Any = js.native
  def orderBy(column: Double): js.Any = js.native
  @JSName("orderBy")
  def orderBy_0(column: Double, order: `0`): js.Any = js.native
  @JSName("orderBy")
  def orderBy_1(column: Double, order: `1`): js.Any = js.native
  def page(pageNumber: Double): js.Any = js.native
  def parseCSV(str: String): js.Any = js.native
  def parseCSV(str: String, delimiter: String): js.Any = js.native
  def parseNumber(value: Double): Double | Null = js.native
  def parseNumber(value: Double, columnNumber: Double): Double | Null = js.native
  def paste(): js.Any = js.native
  def paste(x: Double): js.Any = js.native
  def paste(x: Double, y: Double): js.Any = js.native
  def paste(x: Double, y: Double, data: CellValue): js.Any = js.native
  def prepareTable(): js.Any = js.native
  def redo(): js.Any = js.native
  def refresh(): js.Any = js.native
  def refreshSelection(): js.Any = js.native
  def removeCopySelection(): js.Any = js.native
  def removeMerge(cellName: js.Any, data: js.Any, keepOptions: js.Any): js.Any = js.native
  def resetSearch(): js.Any = js.native
  def resetSelection(blur: js.Any): js.Any = js.native
  def resetStyle(o: js.Any, ignoreHistoryAndEvents: js.Any): js.Any = js.native
  def right(shiftKey: js.Any, ctrlKey: js.Any): js.Any = js.native
  def row(cell: js.Any): js.Any = js.native
  def scrollControls(e: js.Any): js.Any = js.native
  def search(query: js.Any): js.Any = js.native
  def selectAll(): js.Any = js.native
  def setCheckRadioValue(): js.Any = js.native
  def setColumnData(colNumber: Double): js.Any = js.native
  def setColumnData(colNumber: Double, data: js.Any): js.Any = js.native
  def setComments(cellId: js.Any, comments: js.Any, author: js.Any): js.Any = js.native
  def setData(data: js.Any): js.Any = js.native
  def setHeader(column: js.Any, newValue: js.Any): js.Any = js.native
  def setHeight(row: js.Any, height: js.Any, oldHeight: js.Any): js.Any = js.native
  def setHistory(changes: js.Any): js.Any = js.native
  def setMerge(cellName: js.Any, colspan: js.Any, rowspan: js.Any): js.Any = js.native
  def setMerge(cellName: js.Any, colspan: js.Any, rowspan: js.Any, ignoreHistoryAndEvents: js.Any): js.Any = js.native
  def setMeta(o: js.Any, k: js.Any, v: js.Any): js.Any = js.native
  def setRowData(rowNumber: Double, data: js.Any): js.Any = js.native
  def setStyle(o: js.Any, k: js.Any, v: js.Any): js.Any = js.native
  def setStyle(o: js.Any, k: js.Any, v: js.Any, force: js.Any): js.Any = js.native
  def setStyle(o: js.Any, k: js.Any, v: js.Any, force: js.Any, ignoreHistoryAndEvents: js.Any): js.Any = js.native
  def setValue(cell: js.Any, value: js.Any, force: js.Any): js.Any = js.native
  def setValueFromCoords(x: Double, y: Double, value: js.Any, force: js.Any): js.Any = js.native
  def setWidth(column: js.Any, width: js.Any, oldWidth: js.Any): js.Any = js.native
  def showColumn(colNumber: Double): js.Any = js.native
  def showIndex(): js.Any = js.native
  def undo(): js.Any = js.native
  def up(shiftKey: js.Any, ctrlKey: js.Any): js.Any = js.native
  def updateCell(x: Double, y: Double): js.Any = js.native
  def updateCell(x: Double, y: Double, value: CellValue): js.Any = js.native
  def updateCell(x: Double, y: Double, value: CellValue, force: js.Any): js.Any = js.native
  def updateCopySelection(x3: js.Any, y3: js.Any): js.Any = js.native
  def updateCornerPosition(): js.Any = js.native
  def updateFormula(formula: js.Any, referencesToUpdate: js.Any): js.Any = js.native
  def updateFormulaChain(x: js.Any, y: js.Any, records: js.Any): js.Any = js.native
  def updateFormulas(referencesToUpdate: js.Any): js.Any = js.native
  def updateMeta(affectedCells: js.Any): js.Any = js.native
  def updateOrder(rows: js.Any): js.Any = js.native
  def updateOrderArrow(column: js.Any, order: js.Any): js.Any = js.native
  def updatePagination(): js.Any = js.native
  def updateScroll(direction: js.Any): js.Any = js.native
  def updateSelection(el1: js.Any, el2: js.Any, origin: js.Any): js.Any = js.native
  def updateSelectionFromCoords(x1: Double, y1: Double, x2: Double, y2: Double, origin: js.Any): js.Any = js.native
  def updateTable(): js.Any = js.native
  def updateTableReferences(): js.Any = js.native
  def whichPage(cell: js.Any): js.Any = js.native
}

