package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.drawing.PDFOptions
import typings.kendoUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearGauge extends Widget {
  @JSName("options")
  var options_LinearGauge: LinearGaugeOptions = js.native
  var wrapper: JQuery = js.native
  def allValues(values: js.Any): js.Any = js.native
  def exportImage(options: js.Any): JQueryPromise[_] = js.native
  def exportPDF(): JQueryPromise[_] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[_] = js.native
  def exportSVG(options: js.Any): JQueryPromise[_] = js.native
  def imageDataURL(): String = js.native
  def redraw(): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def svg(): Unit = js.native
  def value(): Unit = js.native
}

