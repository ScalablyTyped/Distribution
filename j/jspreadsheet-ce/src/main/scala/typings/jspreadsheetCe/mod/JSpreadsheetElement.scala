package typings.jspreadsheetCe.mod

import typings.jspreadsheetCe.jspreadsheetCeNumbers.`0`
import typings.jspreadsheetCe.jspreadsheetCeNumbers.`1`
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLTableColElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSpreadsheetElement extends StObject {
  
  var ads: HTMLDivElement = js.native
  
  def closeEditor(cell: js.Object, save: Boolean): Any = js.native
  
  def col(cell: js.Object): Any = js.native
  
  var colgroup: js.Array[HTMLTableColElement] = js.native
  
  var colgroupContainer: Any = js.native
  
  /**
    * Move coords to A1 in case ovelaps with an excluded cell
    */
  def conditionalSelectionUpdate(`type`: `0` | `1`, o: Double, d: Double): Unit = js.native
  
  var content: HTMLDivElement = js.native
  
  var contextMenu: HTMLDivElement = js.native
  
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
  def copy(highlighted: Boolean, delimiter: Unit, returnData: Boolean): String = js.native
  def copy(highlighted: Unit, delimiter: String): String = js.native
  def copy(highlighted: Unit, delimiter: String, returnData: Boolean): String = js.native
  def copy(highlighted: Unit, delimiter: Unit, returnData: Boolean): String = js.native
  
  /**
    * Helper function to copy data using the corner icon
    */
  def copyData(o: js.Object, d: js.Object): Any = js.native
  
  var corner: Any = js.native
  
  def createCell(i: Double, j: Double, value: CellValue): Any = js.native
  
  def createCellHeader(colNumber: Double): Any = js.native
  
  def createNestedHeader(nestedInformation: js.Array[js.Object]): Any = js.native
  
  def createRow(j: Double): Any = js.native
  def createRow(j: Double, data: Any): Any = js.native
  
  def createTable(): Unit = js.native
  
  def createToolbar(toolbar: js.Array[js.Object]): Unit = js.native
  
  var cursor: Any = js.native
  
  var data: Any = js.native
  
  def deleteColumn(columnNumber: Any, numOfColumns: Any): Any = js.native
  
  def deleteRow(rowNumber: Any, numOfRows: Any): Any = js.native
  
  def destroy(): Any = js.native
  
  def destroyMerged(keepOptions: Any): Any = js.native
  
  def down(shiftKey: Any, ctrlKey: Any): Any = js.native
  
  def download(includeHeaders: Any): Any = js.native
  
  var dragging: Any = js.native
  
  var edition: Any = js.native
  
  var el: HTMLDivElement = js.native
  
  def executeFormula(expression: Any, x: Any, y: Any): Any = js.native
  
  var filter: HTMLDivElement = js.native
  
  def first(shiftKey: Any, ctrlKey: Any): Any = js.native
  
  var formula: js.Array[Any] = js.native
  
  def fullscreen(activate: Any): Any = js.native
  
  def getCell(cell: Any): Any = js.native
  
  def getCellFromCoords(x: Double, y: Double): Any = js.native
  
  def getColumnData(columnNumber: Double): js.Array[CellValue] = js.native
  
  def getComments(cell: Any, withAuthor: Any): Any = js.native
  
  def getConfig(): Any = js.native
  
  def getData(): js.Array[js.Array[CellValue]] = js.native
  def getData(highlighted: Boolean): js.Array[js.Array[CellValue]] = js.native
  def getData(highlighted: Boolean, dataOnly: Boolean): js.Array[js.Array[CellValue]] = js.native
  def getData(highlighted: Unit, dataOnly: Boolean): js.Array[js.Array[CellValue]] = js.native
  
  def getDropDownValue(column: Any, key: Any): Any = js.native
  
  def getHeader(column: Any): Any = js.native
  
  def getHeaders(asArray: Any): Any = js.native
  
  def getHeight(row: Any): Any = js.native
  
  def getHighlighted(): Any = js.native
  
  def getJson(): Any = js.native
  def getJson(highlighted: Boolean): Any = js.native
  
  def getLabel(cell: Any): Any = js.native
  
  def getLabelFromCoords(x: Double, y: Double): Any = js.native
  
  def getMerge(cellName: Any): Any = js.native
  
  def getMeta(cell: Any, key: Any): Any = js.native
  
  def getRowData(rowNumber: Double): Any = js.native
  
  def getSelectedColumns(): Any = js.native
  
  def getSelectedRows(): Any = js.native
  def getSelectedRows(asIds: Boolean): Any = js.native
  
  def getStyle(cell: Any, key: Any): Any = js.native
  
  def getValue(cell: Any, processedValue: Any): Any = js.native
  
  def getValueFromCoords(x: Double, y: Double, processedValue: Any): Any = js.native
  
  def getWidth(column: Any): Any = js.native
  
  def hash(str: Any): Any = js.native
  
  var hashString: Any = js.native
  
  var headerContainer: HTMLTableRowElement = js.native
  
  var headers: Any = js.native
  
  def hideColumn(colNumber: Double): Any = js.native
  
  def hideIndex(): Any = js.native
  
  var highlighted: js.Array[Any] = js.native
  
  var history: ActionHistory = js.native
  
  var historyIndex: Double = js.native
  
  def historyProcessColumn(`type`: Any, historyRecord: Any): Any = js.native
  
  def historyProcessRow(`type`: Any, historyRecord: Any): Any = js.native
  
  var ignoreEvents: Boolean = js.native
  
  var ignoreHistory: Boolean = js.native
  
  def init(): Any = js.native
  
  /**
    * Insert a new column
    *
    * @param mixed - num of columns to be added or data to be added in one single column
    * @param int columnNumber - number of columns to be created
    * @param bool insertBefore
    * @param object properties - column properties
    * @return void
    */
  def insertColumn(mixed: Any): Any = js.native
  def insertColumn(mixed: Any, columnNumber: Double): Any = js.native
  def insertColumn(mixed: Any, columnNumber: Double, insertBefore: Boolean): Any = js.native
  def insertColumn(mixed: Any, columnNumber: Double, insertBefore: Boolean, properties: js.Object): Any = js.native
  def insertColumn(mixed: Any, columnNumber: Double, insertBefore: Unit, properties: js.Object): Any = js.native
  def insertColumn(mixed: Any, columnNumber: Unit, insertBefore: Boolean): Any = js.native
  def insertColumn(mixed: Any, columnNumber: Unit, insertBefore: Boolean, properties: js.Object): Any = js.native
  def insertColumn(mixed: Any, columnNumber: Unit, insertBefore: Unit, properties: js.Object): Any = js.native
  
  def insertRow(): Any = js.native
  def insertRow(mixed: Any): Any = js.native
  def insertRow(mixed: Any, rowNumber: Double): Any = js.native
  def insertRow(mixed: Any, rowNumber: Double, insertBefore: Boolean): Any = js.native
  def insertRow(mixed: Any, rowNumber: Unit, insertBefore: Boolean): Any = js.native
  def insertRow(mixed: Unit, rowNumber: Double): Any = js.native
  def insertRow(mixed: Unit, rowNumber: Double, insertBefore: Boolean): Any = js.native
  def insertRow(mixed: Unit, rowNumber: Unit, insertBefore: Boolean): Any = js.native
  
  def isColMerged(x: Double): Any = js.native
  def isColMerged(x: Double, insertBefore: Boolean): Any = js.native
  
  def isRowMerged(y: Double): Any = js.native
  def isRowMerged(y: Double, insertBefore: Boolean): Any = js.native
  
  def last(shiftKey: Any, ctrlKey: Any): Any = js.native
  
  def left(shiftKey: Any, ctrlKey: Any): Any = js.native
  
  def loadDown(): Any = js.native
  
  def loadPage(pageNumber: Double): Any = js.native
  
  def loadUp(): Any = js.native
  
  def loadValidation(): Any = js.native
  
  def moveColumn(o: Any, d: Any): Any = js.native
  
  def moveRow(o: Any, d: Any, ignoreDom: Any): Any = js.native
  
  def onafterchanges(el: Any, records: Any): Any = js.native
  
  def openEditor(cell: Any, empty: Any, e: Any): Any = js.native
  
  var options: Any = js.native
  
  def orderBy(column: Double): Any = js.native
  def orderBy(column: Double, order: `0` | `1`): Any = js.native
  
  def page(pageNumber: Double): Any = js.native
  
  var pageNumber: Any = js.native
  
  var pagination: HTMLDivElement = js.native
  
  def parseCSV(str: String): Any = js.native
  def parseCSV(str: String, delimiter: String): Any = js.native
  
  def parseNumber(value: Double): Double | Null = js.native
  def parseNumber(value: Double, columnNumber: Double): Double | Null = js.native
  
  def paste(): Any = js.native
  def paste(x: Double): Any = js.native
  def paste(x: Double, y: Double): Any = js.native
  def paste(x: Double, y: Double, data: CellValue): Any = js.native
  def paste(x: Double, y: Unit, data: CellValue): Any = js.native
  def paste(x: Unit, y: Double): Any = js.native
  def paste(x: Unit, y: Double, data: CellValue): Any = js.native
  def paste(x: Unit, y: Unit, data: CellValue): Any = js.native
  
  def prepareTable(): Any = js.native
  
  var records: Any = js.native
  
  def redo(): Any = js.native
  
  def refresh(): Any = js.native
  
  def refreshSelection(): Any = js.native
  
  def removeCopySelection(): Any = js.native
  
  def removeMerge(cellName: Any, data: Any, keepOptions: Any): Any = js.native
  
  def resetSearch(): Any = js.native
  
  def resetSelection(blur: Any): Any = js.native
  
  def resetStyle(o: Any, ignoreHistoryAndEvents: Any): Any = js.native
  
  var resizing: Any = js.native
  
  var results: Any = js.native
  
  def right(shiftKey: Any, ctrlKey: Any): Any = js.native
  
  def row(cell: Any): Any = js.native
  
  var rows: js.Array[HTMLTableRowElement] = js.native
  
  def scrollControls(e: Any): Any = js.native
  
  def search(query: Any): Any = js.native
  
  var searchInput: HTMLInputElement = js.native
  
  def selectAll(): Any = js.native
  
  var selectedCell: Any = js.native
  
  var selectedContainer: Any = js.native
  
  var selection: js.Array[Any] = js.native
  
  def setCheckRadioValue(): Any = js.native
  
  def setColumnData(colNumber: Double): Any = js.native
  def setColumnData(colNumber: Double, data: Any): Any = js.native
  
  def setComments(cellId: Any, comments: Any, author: Any): Any = js.native
  
  def setData(data: Any): Any = js.native
  
  def setHeader(column: Any, newValue: Any): Any = js.native
  
  def setHeight(row: Any, height: Any, oldHeight: Any): Any = js.native
  
  def setHistory(changes: Any): Any = js.native
  
  def setMerge(cellName: Any, colspan: Any, rowspan: Any): Any = js.native
  def setMerge(cellName: Any, colspan: Any, rowspan: Any, ignoreHistoryAndEvents: Any): Any = js.native
  
  def setMeta(o: Any, k: Any, v: Any): Any = js.native
  
  def setRowData(rowNumber: Double, data: Any): Any = js.native
  
  def setStyle(o: Any, k: Any, v: Any): Any = js.native
  def setStyle(o: Any, k: Any, v: Any, force: Any): Any = js.native
  def setStyle(o: Any, k: Any, v: Any, force: Any, ignoreHistoryAndEvents: Any): Any = js.native
  def setStyle(o: Any, k: Any, v: Any, force: Unit, ignoreHistoryAndEvents: Any): Any = js.native
  
  def setValue(cell: Any, value: Any, force: Any): Any = js.native
  
  def setValueFromCoords(x: Double, y: Double, value: Any, force: Any): Any = js.native
  
  def setWidth(column: Any, width: Any, oldWidth: Any): Any = js.native
  
  def showColumn(colNumber: Double): Any = js.native
  
  def showIndex(): Any = js.native
  
  var style: js.Array[Any] = js.native
  
  var table: HTMLTableElement = js.native
  
  var tbody: HTMLTableSectionElement = js.native
  
  var textarea: HTMLTextAreaElement = js.native
  
  var thead: HTMLTableHeaderCellElement = js.native
  
  var toolbar: HTMLDivElement = js.native
  
  def undo(): Any = js.native
  
  def up(shiftKey: Any, ctrlKey: Any): Any = js.native
  
  def updateCell(x: Double, y: Double): Any = js.native
  def updateCell(x: Double, y: Double, value: Unit, force: Any): Any = js.native
  def updateCell(x: Double, y: Double, value: CellValue): Any = js.native
  def updateCell(x: Double, y: Double, value: CellValue, force: Any): Any = js.native
  
  def updateCopySelection(x3: Any, y3: Any): Any = js.native
  
  def updateCornerPosition(): Any = js.native
  
  def updateFormula(formula: Any, referencesToUpdate: Any): Any = js.native
  
  def updateFormulaChain(x: Any, y: Any, records: Any): Any = js.native
  
  def updateFormulas(referencesToUpdate: Any): Any = js.native
  
  def updateMeta(affectedCells: Any): Any = js.native
  
  def updateOrder(rows: Any): Any = js.native
  
  def updateOrderArrow(column: Any, order: Any): Any = js.native
  
  def updatePagination(): Any = js.native
  
  def updateScroll(direction: Any): Any = js.native
  
  def updateSelection(el1: Any, el2: Any, origin: Any): Any = js.native
  
  def updateSelectionFromCoords(x1: Double, y1: Double, x2: Double, y2: Double, origin: Any): Any = js.native
  
  def updateTable(): Any = js.native
  
  def updateTableReferences(): Any = js.native
  
  def whichPage(cell: Any): Any = js.native
}
