package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.ObservableArray
import typings.kendoUi.kendo.data.ObservableObject
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grid extends Widget {
  
  def addRow(): Unit = js.native
  
  def autoFitColumn(column: String): Unit = js.native
  def autoFitColumn(column: js.Any): Unit = js.native
  def autoFitColumn(column: Double): Unit = js.native
  
  def cancelChanges(): Unit = js.native
  
  def cancelRow(): Unit = js.native
  
  def cellIndex(cell: String): Double = js.native
  def cellIndex(cell: JQuery): Double = js.native
  def cellIndex(cell: Element): Double = js.native
  
  def clearSelection(): Unit = js.native
  
  def closeCell(): Unit = js.native
  def closeCell(isCancel: Boolean): Unit = js.native
  
  def collapseGroup(row: String): Unit = js.native
  def collapseGroup(row: JQuery): Unit = js.native
  def collapseGroup(row: Element): Unit = js.native
  
  def collapseRow(row: String): Unit = js.native
  def collapseRow(row: JQuery): Unit = js.native
  def collapseRow(row: Element): Unit = js.native
  
  var columns: js.Array[GridColumn] = js.native
  
  var content: JQuery = js.native
  
  def current(): JQuery = js.native
  def current(cell: JQuery): Unit = js.native
  
  def dataItem(row: String): ObservableObject = js.native
  def dataItem(row: JQuery): ObservableObject = js.native
  def dataItem(row: Element): ObservableObject = js.native
  
  def dataItems(): ObservableArray = js.native
  
  var dataSource: DataSource = js.native
  
  def editCell(cell: JQuery): Unit = js.native
  
  def editRow(row: JQuery): Unit = js.native
  
  def expandGroup(row: String): Unit = js.native
  def expandGroup(row: JQuery): Unit = js.native
  def expandGroup(row: Element): Unit = js.native
  
  def expandRow(row: String): Unit = js.native
  def expandRow(row: JQuery): Unit = js.native
  def expandRow(row: Element): Unit = js.native
  
  var footer: JQuery = js.native
  
  def getOptions(): GridOptions = js.native
  
  def hideColumn(column: String): Unit = js.native
  def hideColumn(column: js.Any): Unit = js.native
  def hideColumn(column: Double): Unit = js.native
  
  def items(): js.Any = js.native
  
  def lockColumn(column: String): Unit = js.native
  def lockColumn(column: Double): Unit = js.native
  
  var lockedContent: JQuery = js.native
  
  var lockedHeader: JQuery = js.native
  
  var lockedTable: JQuery = js.native
  
  @JSName("options")
  var options_Grid: GridOptions = js.native
  
  var pager: Pager = js.native
  
  def refresh(): Unit = js.native
  
  def removeRow(row: String): Unit = js.native
  def removeRow(row: JQuery): Unit = js.native
  def removeRow(row: Element): Unit = js.native
  
  def reorderColumn(destIndex: Double, column: js.Any): Unit = js.native
  
  def resizeColumn(column: js.Any, value: Double): Unit = js.native
  
  def saveAsExcel(): Unit = js.native
  
  def saveAsPDF(): JQueryPromise[_] = js.native
  
  def saveChanges(): Unit = js.native
  
  def saveRow(): Unit = js.native
  
  def select(): JQuery = js.native
  def select(rows: String): Unit = js.native
  def select(rows: JQuery): Unit = js.native
  def select(rows: Element): Unit = js.native
  
  def selectedKeyNames(): js.Any = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  def showColumn(column: String): Unit = js.native
  def showColumn(column: js.Any): Unit = js.native
  def showColumn(column: Double): Unit = js.native
  
  def stickColumn(column: String): Unit = js.native
  def stickColumn(column: Double): Unit = js.native
  
  var table: JQuery = js.native
  
  var tbody: JQuery = js.native
  
  var thead: JQuery = js.native
  
  def unlockColumn(column: String): Unit = js.native
  def unlockColumn(column: Double): Unit = js.native
  
  def unstickColumn(column: String): Unit = js.native
  def unstickColumn(column: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
