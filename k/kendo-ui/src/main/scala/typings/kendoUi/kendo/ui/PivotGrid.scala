package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.PivotDataSource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGrid extends Widget {
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_PivotGrid: PivotGridOptions = js.native
  var wrapper: JQuery = js.native
  def cellInfo(columnIndex: Double, rowIndex: Double): js.Any = js.native
  def cellInfoByElement(cell: String): js.Any = js.native
  def cellInfoByElement(cell: JQuery): js.Any = js.native
  def cellInfoByElement(cell: Element): js.Any = js.native
  def refresh(): Unit = js.native
  def saveAsExcel(): Unit = js.native
  def saveAsPDF(): JQueryPromise[_] = js.native
  def setDataSource(dataSource: PivotDataSource): Unit = js.native
}

