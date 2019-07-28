package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.JQueryPromise
import typings.kendoDashUi.kendoNs.dataNs.DataSource
import typings.kendoDashUi.kendoNs.datavizNs.Navigator
import typings.kendoDashUi.kendoNs.drawingNs.PDFOptions
import typings.kendoDashUi.kendoNs.uiNs.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.StockChart")
@js.native
class StockChart protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: StockChartOptions) = this()
  var dataSource: DataSource = js.native
  var navigator: Navigator = js.native
  @JSName("options")
  var options_StockChart: StockChartOptions = js.native
  var wrapper: JQuery = js.native
  def exportImage(options: js.Any): JQueryPromise[_] = js.native
  def exportPDF(): JQueryPromise[_] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[_] = js.native
  def exportSVG(options: js.Any): JQueryPromise[_] = js.native
  def imageDataURL(): String = js.native
  def redraw(): Unit = js.native
  def refresh(): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def svg(): String = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.ui.StockChart")
@js.native
object StockChart extends js.Object {
  var fn: StockChart = js.native
  def extend(proto: js.Object): StockChart = js.native
}

