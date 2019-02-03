package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.Barcode")
@js.native
class Barcode protected ()
  extends kendoDashUiLib.kendoNs.uiNs.Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: BarcodeOptions) = this()
  @JSName("options")
  var options_Barcode: BarcodeOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def exportImage(options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportPDF(options: kendoDashUiLib.kendoNs.drawingNs.PDFOptions): kendoDashUiLib.JQueryPromise[_] = js.native
  def exportSVG(options: js.Any): kendoDashUiLib.JQueryPromise[_] = js.native
  def imageDataURL(): java.lang.String = js.native
  def redraw(): scala.Unit = js.native
  def svg(): java.lang.String = js.native
  def value(): java.lang.String = js.native
  def value(value: java.lang.String): scala.Unit = js.native
  def value(value: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.ui.Barcode")
@js.native
object Barcode extends js.Object {
  var fn: kendoDashUiLib.kendoNs.datavizNs.uiNs.Barcode = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.datavizNs.uiNs.Barcode = js.native
}

