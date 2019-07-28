package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.JQueryPromise
import typings.kendoDashUi.kendoNs.drawingNs.PDFOptions
import typings.kendoDashUi.kendoNs.uiNs.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.ArcGauge")
@js.native
class ArcGauge protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ArcGaugeOptions) = this()
  @JSName("options")
  var options_ArcGauge: ArcGaugeOptions = js.native
  var wrapper: JQuery = js.native
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
@JSGlobal("kendo.dataviz.ui.ArcGauge")
@js.native
object ArcGauge extends js.Object {
  var fn: ArcGauge = js.native
  def extend(proto: js.Object): ArcGauge = js.native
}

