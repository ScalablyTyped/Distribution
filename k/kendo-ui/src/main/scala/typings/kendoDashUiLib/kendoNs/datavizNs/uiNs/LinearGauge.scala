package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.LinearGauge")
@js.native
class LinearGauge protected ()
  extends kendoDashUiLib.kendoNs.uiNs.Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: LinearGaugeOptions) = this()
  @JSName("options")
  var options_LinearGauge: LinearGaugeOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def allValues(values: js.Any): js.Any = js.native
  def exportImage(options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportPDF(options: kendoDashUiLib.kendoNs.drawingNs.PDFOptions): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportSVG(options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def imageDataURL(): java.lang.String = js.native
  def redraw(): scala.Unit = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def svg(): scala.Unit = js.native
  def value(): scala.Unit = js.native
}

@JSGlobal("kendo.dataviz.ui.LinearGauge")
@js.native
object LinearGauge extends js.Object {
  var fn: kendoDashUiLib.kendoNs.datavizNs.uiNs.LinearGauge = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.datavizNs.uiNs.LinearGauge = js.native
}

