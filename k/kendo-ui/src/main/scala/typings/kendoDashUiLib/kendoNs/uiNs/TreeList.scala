package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.TreeList")
@js.native
class TreeList protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: TreeListOptions) = this()
  var columns: js.Any = js.native
  var content: kendoDashUiLib.JQuery = js.native
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  var lockedContent: kendoDashUiLib.JQuery = js.native
  var lockedHeader: kendoDashUiLib.JQuery = js.native
  var lockedTable: kendoDashUiLib.JQuery = js.native
  @JSName("options")
  var options_TreeList: TreeListOptions = js.native
  var table: kendoDashUiLib.JQuery = js.native
  var tbody: kendoDashUiLib.JQuery = js.native
  var thead: kendoDashUiLib.JQuery = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def addRow(parentRow: java.lang.String): scala.Unit = js.native
  def addRow(parentRow: kendoDashUiLib.JQuery): scala.Unit = js.native
  def addRow(parentRow: stdLib.Element): scala.Unit = js.native
  def autoFitColumn(column: java.lang.String): scala.Unit = js.native
  def autoFitColumn(column: js.Any): scala.Unit = js.native
  def autoFitColumn(column: scala.Double): scala.Unit = js.native
  def cancelChanges(): scala.Unit = js.native
  def cancelRow(): scala.Unit = js.native
  def clearSelection(): scala.Unit = js.native
  def closeCell(): scala.Unit = js.native
  def closeCell(isCancel: scala.Boolean): scala.Unit = js.native
  def collapse(row: java.lang.String): kendoDashUiLib.JQueryPromise[_] = js.native
  def collapse(row: kendoDashUiLib.JQuery): kendoDashUiLib.JQueryPromise[_] = js.native
  def collapse(row: stdLib.Element): kendoDashUiLib.JQueryPromise[_] = js.native
  def dataItem(row: java.lang.String): kendoDashUiLib.kendoNs.dataNs.TreeListModel = js.native
  def dataItem(row: kendoDashUiLib.JQuery): kendoDashUiLib.kendoNs.dataNs.TreeListModel = js.native
  def dataItem(row: stdLib.Element): kendoDashUiLib.kendoNs.dataNs.TreeListModel = js.native
  def editCell(cell: kendoDashUiLib.JQuery): scala.Unit = js.native
  def editRow(row: kendoDashUiLib.JQuery): scala.Unit = js.native
  def expand(row: java.lang.String): kendoDashUiLib.JQueryPromise[_] = js.native
  def expand(row: kendoDashUiLib.JQuery): kendoDashUiLib.JQueryPromise[_] = js.native
  def expand(row: stdLib.Element): kendoDashUiLib.JQueryPromise[_] = js.native
  def hideColumn(column: java.lang.String): scala.Unit = js.native
  def hideColumn(column: scala.Double): scala.Unit = js.native
  def itemFor(model: js.Any): kendoDashUiLib.JQuery = js.native
  def itemFor(model: kendoDashUiLib.kendoNs.dataNs.TreeListModel): kendoDashUiLib.JQuery = js.native
  def items(): js.Any = js.native
  def lockColumn(column: java.lang.String): scala.Unit = js.native
  def lockColumn(column: scala.Double): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def removeRow(row: java.lang.String): scala.Unit = js.native
  def removeRow(row: kendoDashUiLib.JQuery): scala.Unit = js.native
  def removeRow(row: stdLib.Element): scala.Unit = js.native
  def reorderColumn(destIndex: scala.Double, column: js.Any): scala.Unit = js.native
  def saveAsExcel(): scala.Unit = js.native
  def saveAsPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def saveChanges(): scala.Unit = js.native
  def saveRow(): scala.Unit = js.native
  def select(): kendoDashUiLib.JQuery = js.native
  def select(rows: kendoDashUiLib.JQuery): scala.Unit = js.native
  def select(rows: stdLib.Element): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.TreeListDataSource): scala.Unit = js.native
  def showColumn(column: java.lang.String): scala.Unit = js.native
  def showColumn(column: scala.Double): scala.Unit = js.native
  def unlockColumn(column: java.lang.String): scala.Unit = js.native
  def unlockColumn(column: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.TreeList")
@js.native
object TreeList extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.TreeList = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.TreeList = js.native
}

