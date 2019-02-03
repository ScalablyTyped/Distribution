package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.PivotGrid")
@js.native
class PivotGrid protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: PivotGridOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_PivotGrid: PivotGridOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def cellInfo(columnIndex: scala.Double, rowIndex: scala.Double): js.Any = js.native
  def cellInfoByElement(cell: java.lang.String): js.Any = js.native
  def cellInfoByElement(cell: kendoDashUiLib.JQuery): js.Any = js.native
  def cellInfoByElement(cell: stdLib.Element): js.Any = js.native
  def refresh(): scala.Unit = js.native
  def saveAsExcel(): scala.Unit = js.native
  def saveAsPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.PivotDataSource): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.PivotGrid")
@js.native
object PivotGrid extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.PivotGrid = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.PivotGrid = js.native
}

