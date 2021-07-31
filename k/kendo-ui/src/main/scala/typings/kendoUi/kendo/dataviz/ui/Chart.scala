package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.dataviz.ChartAxis
import typings.kendoUi.kendo.dataviz.ChartSeries
import typings.kendoUi.kendo.drawing.PDFOptions
import typings.kendoUi.kendo.drawing.Surface
import typings.kendoUi.kendo.ui.Widget
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart
  extends StObject
     with Widget {
  
  var dataSource: DataSource = js.native
  
  def exportImage(options: js.Any): JQueryPromise[js.Any] = js.native
  
  def exportPDF(): JQueryPromise[js.Any] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[js.Any] = js.native
  
  def exportSVG(options: js.Any): JQueryPromise[js.Any] = js.native
  
  def findAxisByName(name: String): ChartAxis = js.native
  
  def findPaneByIndex(index: Double): typings.kendoUi.kendo.dataviz.ChartPane = js.native
  
  def findPaneByName(name: String): typings.kendoUi.kendo.dataviz.ChartPane = js.native
  
  def findSeries(callback: js.Function): ChartSeries = js.native
  
  def findSeriesByIndex(index: Double): ChartSeries = js.native
  
  def findSeriesByName(name: String): ChartSeries = js.native
  
  def getAxis(name: String): ChartAxis = js.native
  
  def hideTooltip(): Unit = js.native
  
  def imageDataURL(): String = js.native
  
  @JSName("options")
  var options_Chart: ChartOptions = js.native
  
  def plotArea(): typings.kendoUi.kendo.dataviz.ChartPlotArea = js.native
  
  def redraw(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def saveAsPDF(): Unit = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  def showTooltip(filter: String): Unit = js.native
  def showTooltip(filter: js.Function): Unit = js.native
  def showTooltip(filter: Double): Unit = js.native
  def showTooltip(filter: Date): Unit = js.native
  
  var surface: Surface = js.native
  
  def svg(): String = js.native
  
  def toggleHighlight(show: Boolean, options: js.Any): Unit = js.native
  
  var wrapper: JQuery = js.native
}
