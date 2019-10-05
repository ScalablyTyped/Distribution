package typings.kendoDashUi.kendo.dataviz.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.JQueryPromise
import typings.kendoDashUi.kendo.data.DataSource
import typings.kendoDashUi.kendo.dataviz.ChartAxis
import typings.kendoDashUi.kendo.dataviz.ChartSeries
import typings.kendoDashUi.kendo.drawing.PDFOptions
import typings.kendoDashUi.kendo.drawing.Surface
import typings.kendoDashUi.kendo.ui.Widget
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.Chart")
@js.native
class Chart protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ChartOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_Chart: ChartOptions = js.native
  var surface: Surface = js.native
  var wrapper: JQuery = js.native
  def exportImage(options: js.Any): JQueryPromise[_] = js.native
  def exportPDF(): JQueryPromise[_] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[_] = js.native
  def exportSVG(options: js.Any): JQueryPromise[_] = js.native
  def findAxisByName(name: String): ChartAxis = js.native
  def findPaneByIndex(index: Double): typings.kendoDashUi.kendo.dataviz.ChartPane = js.native
  def findPaneByName(name: String): typings.kendoDashUi.kendo.dataviz.ChartPane = js.native
  def findSeries(callback: js.Function): ChartSeries = js.native
  def findSeriesByIndex(index: Double): ChartSeries = js.native
  def findSeriesByName(name: String): ChartSeries = js.native
  def getAxis(name: String): ChartAxis = js.native
  def hideTooltip(): Unit = js.native
  def imageDataURL(): String = js.native
  def plotArea(): typings.kendoDashUi.kendo.dataviz.ChartPlotArea = js.native
  def redraw(): Unit = js.native
  def refresh(): Unit = js.native
  def saveAsPDF(): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def showTooltip(filter: String): Unit = js.native
  def showTooltip(filter: js.Function): Unit = js.native
  def showTooltip(filter: Double): Unit = js.native
  def showTooltip(filter: Date): Unit = js.native
  def svg(): String = js.native
  def toggleHighlight(show: Boolean, options: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.ui.Chart")
@js.native
object Chart extends js.Object {
  var fn: Chart = js.native
  def extend(proto: js.Object): Chart = js.native
}

