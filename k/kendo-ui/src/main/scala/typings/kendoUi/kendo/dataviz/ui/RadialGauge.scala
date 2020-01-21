package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.drawing.PDFOptions
import typings.kendoUi.kendo.ui.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.RadialGauge")
@js.native
class RadialGauge protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: RadialGaugeOptions) = this()
  @JSName("options")
  var options_RadialGauge: RadialGaugeOptions = js.native
  var wrapper: JQuery = js.native
  def allValues(): js.Any = js.native
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

/* static members */
@JSGlobal("kendo.dataviz.ui.RadialGauge")
@js.native
object RadialGauge extends js.Object {
  var fn: RadialGauge = js.native
  def extend(proto: js.Object): RadialGauge = js.native
}

