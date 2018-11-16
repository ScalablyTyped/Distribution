package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.Chart")
@js.native
class Chart protected ()
  extends kendoDashUiLib.kendoNs.uiNs.Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ChartOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_Chart: ChartOptions = js.native
  var surface: kendoDashUiLib.kendoNs.drawingNs.Surface = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def exportImage(options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportPDF(options: kendoDashUiLib.kendoNs.drawingNs.PDFOptions): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportSVG(options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def findAxisByName(name: java.lang.String): kendoDashUiLib.kendoNs.datavizNs.ChartAxis = js.native
  def findPaneByIndex(index: scala.Double): kendoDashUiLib.kendoNs.datavizNs.ChartPane = js.native
  def findPaneByName(name: java.lang.String): kendoDashUiLib.kendoNs.datavizNs.ChartPane = js.native
  def findSeries(callback: js.Function): kendoDashUiLib.kendoNs.datavizNs.ChartSeries = js.native
  def findSeriesByIndex(index: scala.Double): kendoDashUiLib.kendoNs.datavizNs.ChartSeries = js.native
  def findSeriesByName(name: java.lang.String): kendoDashUiLib.kendoNs.datavizNs.ChartSeries = js.native
  def getAxis(name: java.lang.String): kendoDashUiLib.kendoNs.datavizNs.ChartAxis = js.native
  def hideTooltip(): scala.Unit = js.native
  def imageDataURL(): java.lang.String = js.native
  def plotArea(): kendoDashUiLib.kendoNs.datavizNs.ChartPlotArea = js.native
  def redraw(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def saveAsPDF(): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def showTooltip(filter: java.lang.String): scala.Unit = js.native
  def showTooltip(filter: js.Function): scala.Unit = js.native
  def showTooltip(filter: scala.Double): scala.Unit = js.native
  def showTooltip(filter: stdLib.Date): scala.Unit = js.native
  def svg(): java.lang.String = js.native
  def toggleHighlight(show: scala.Boolean, options: js.Any): scala.Unit = js.native
}

@JSGlobal("kendo.dataviz.ui.Chart")
@js.native
object Chart extends js.Object {
  var fn: kendoDashUiLib.kendoNs.datavizNs.uiNs.Chart = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.datavizNs.uiNs.Chart = js.native
}

