package typings
package kendoDashUiLib.kendoNs.spreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.spreadsheet.Sheet")
@js.native
class Sheet ()
  extends kendoDashUiLib.kendoNs.Observable {
  var options: SheetOptions = js.native
  def batch(callback: js.Function, changeEventArgs: js.Any): scala.Unit = js.native
  def clearFilter(indexes: js.Any): scala.Unit = js.native
  def clearFilter(indexes: scala.Double): scala.Unit = js.native
  def columnWidth(): scala.Unit = js.native
  def columnWidth(index: scala.Double): scala.Unit = js.native
  def columnWidth(index: scala.Double, width: scala.Double): scala.Unit = js.native
  def deleteColumn(index: scala.Double): scala.Unit = js.native
  def deleteRow(index: scala.Double): scala.Unit = js.native
  def fromJSON(data: js.Any): scala.Unit = js.native
  def frozenColumns(): scala.Double = js.native
  def frozenColumns(count: scala.Double): scala.Unit = js.native
  @JSName("frozenColumns")
  def frozenColumns_Unit(): scala.Unit = js.native
  def frozenRows(): scala.Double = js.native
  def frozenRows(count: scala.Double): scala.Unit = js.native
  @JSName("frozenRows")
  def frozenRows_Unit(): scala.Unit = js.native
  def hideColumn(index: scala.Double): scala.Unit = js.native
  def hideRow(index: scala.Double): scala.Unit = js.native
  def insertColumn(index: scala.Double): scala.Unit = js.native
  def insertRow(index: scala.Double): scala.Unit = js.native
  def range(ref: java.lang.String): Range = js.native
  def range(rowIndex: scala.Double, columnIndex: scala.Double): Range = js.native
  def range(rowIndex: scala.Double, columnIndex: scala.Double, rowCount: scala.Double): Range = js.native
  def range(
    rowIndex: scala.Double,
    columnIndex: scala.Double,
    rowCount: scala.Double,
    columnCount: scala.Double
  ): Range = js.native
  def rowHeight(): scala.Unit = js.native
  def rowHeight(index: scala.Double): scala.Unit = js.native
  def rowHeight(index: scala.Double, width: scala.Double): scala.Unit = js.native
  def selection(): Range = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource, columns: js.Any): scala.Unit = js.native
  def showGridLines(): scala.Boolean = js.native
  def showGridLines(showGridLines: scala.Boolean): scala.Unit = js.native
  @JSName("showGridLines")
  def showGridLines_Unit(): scala.Unit = js.native
  def toJSON(): scala.Unit = js.native
  def unhideColumn(index: scala.Double): scala.Unit = js.native
  def unhideRow(index: scala.Double): scala.Unit = js.native
}

