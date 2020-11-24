package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.drawing.PDFOptions
import typings.kendoUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QRCode extends Widget {
  
  def exportImage(options: js.Any): JQueryPromise[_] = js.native
  
  def exportPDF(): JQueryPromise[_] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[_] = js.native
  
  def exportSVG(options: js.Any): JQueryPromise[_] = js.native
  
  def imageDataURL(): String = js.native
  
  @JSName("options")
  var options_QRCode: QRCodeOptions = js.native
  
  def redraw(): Unit = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  def svg(): String = js.native
  
  def value(options: String): Unit = js.native
  def value(options: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
