package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Grid")
@js.native
class Grid protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: GridOptions) = this()
  var columns: js.Array[GridColumn] = js.native
  var content: kendoDashUiLib.JQuery = js.native
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  var footer: kendoDashUiLib.JQuery = js.native
  var lockedContent: kendoDashUiLib.JQuery = js.native
  var lockedHeader: kendoDashUiLib.JQuery = js.native
  var lockedTable: kendoDashUiLib.JQuery = js.native
  @JSName("options")
  var options_Grid: GridOptions = js.native
  var pager: Pager = js.native
  var table: kendoDashUiLib.JQuery = js.native
  var tbody: kendoDashUiLib.JQuery = js.native
  var thead: kendoDashUiLib.JQuery = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def addRow(): scala.Unit = js.native
  def autoFitColumn(column: java.lang.String): scala.Unit = js.native
  def autoFitColumn(column: js.Any): scala.Unit = js.native
  def autoFitColumn(column: scala.Double): scala.Unit = js.native
  def cancelChanges(): scala.Unit = js.native
  def cancelRow(): scala.Unit = js.native
  def cellIndex(cell: java.lang.String): scala.Double = js.native
  def cellIndex(cell: kendoDashUiLib.JQuery): scala.Double = js.native
  def cellIndex(cell: stdLib.Element): scala.Double = js.native
  def clearSelection(): scala.Unit = js.native
  def closeCell(): scala.Unit = js.native
  def closeCell(isCancel: scala.Boolean): scala.Unit = js.native
  def collapseGroup(row: java.lang.String): scala.Unit = js.native
  def collapseGroup(row: kendoDashUiLib.JQuery): scala.Unit = js.native
  def collapseGroup(row: stdLib.Element): scala.Unit = js.native
  def collapseRow(row: java.lang.String): scala.Unit = js.native
  def collapseRow(row: kendoDashUiLib.JQuery): scala.Unit = js.native
  def collapseRow(row: stdLib.Element): scala.Unit = js.native
  def current(): kendoDashUiLib.JQuery = js.native
  def current(cell: kendoDashUiLib.JQuery): scala.Unit = js.native
  def dataItem(row: java.lang.String): kendoDashUiLib.kendoNs.dataNs.ObservableObject = js.native
  def dataItem(row: kendoDashUiLib.JQuery): kendoDashUiLib.kendoNs.dataNs.ObservableObject = js.native
  def dataItem(row: stdLib.Element): kendoDashUiLib.kendoNs.dataNs.ObservableObject = js.native
  def editCell(cell: kendoDashUiLib.JQuery): scala.Unit = js.native
  def editRow(row: kendoDashUiLib.JQuery): scala.Unit = js.native
  def expandGroup(row: java.lang.String): scala.Unit = js.native
  def expandGroup(row: kendoDashUiLib.JQuery): scala.Unit = js.native
  def expandGroup(row: stdLib.Element): scala.Unit = js.native
  def expandRow(row: java.lang.String): scala.Unit = js.native
  def expandRow(row: kendoDashUiLib.JQuery): scala.Unit = js.native
  def expandRow(row: stdLib.Element): scala.Unit = js.native
  def getOptions(): GridOptions = js.native
  def hideColumn(column: java.lang.String): scala.Unit = js.native
  def hideColumn(column: js.Any): scala.Unit = js.native
  def hideColumn(column: scala.Double): scala.Unit = js.native
  def items(): js.Any = js.native
  def lockColumn(column: java.lang.String): scala.Unit = js.native
  def lockColumn(column: scala.Double): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def removeRow(row: java.lang.String): scala.Unit = js.native
  def removeRow(row: kendoDashUiLib.JQuery): scala.Unit = js.native
  def removeRow(row: stdLib.Element): scala.Unit = js.native
  def reorderColumn(destIndex: scala.Double, column: js.Any): scala.Unit = js.native
  def resizeColumn(column: js.Any, value: scala.Double): scala.Unit = js.native
  def saveAsExcel(): scala.Unit = js.native
  def saveAsPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def saveChanges(): scala.Unit = js.native
  def saveRow(): scala.Unit = js.native
  def select(): kendoDashUiLib.JQuery = js.native
  def select(rows: java.lang.String): scala.Unit = js.native
  def select(rows: kendoDashUiLib.JQuery): scala.Unit = js.native
  def select(rows: stdLib.Element): scala.Unit = js.native
  def selectedKeyNames(): js.Any = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def showColumn(column: java.lang.String): scala.Unit = js.native
  def showColumn(column: js.Any): scala.Unit = js.native
  def showColumn(column: scala.Double): scala.Unit = js.native
  def unlockColumn(column: java.lang.String): scala.Unit = js.native
  def unlockColumn(column: scala.Double): scala.Unit = js.native
}

@JSGlobal("kendo.ui.Grid")
@js.native
object Grid extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Grid = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Grid = js.native
}

