package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.StockChart")
@js.native
class StockChart protected ()
  extends kendoDashUiLib.kendoNs.uiNs.Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: StockChartOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  var navigator: kendoDashUiLib.kendoNs.datavizNs.Navigator = js.native
  @JSName("options")
  var options_StockChart: StockChartOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def exportImage(options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportPDF(options: kendoDashUiLib.kendoNs.drawingNs.PDFOptions): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportSVG(options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def imageDataURL(): java.lang.String = js.native
  def redraw(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def svg(): java.lang.String = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.ui.StockChart")
@js.native
object StockChart extends js.Object {
  var fn: kendoDashUiLib.kendoNs.datavizNs.uiNs.StockChart = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.datavizNs.uiNs.StockChart = js.native
}

