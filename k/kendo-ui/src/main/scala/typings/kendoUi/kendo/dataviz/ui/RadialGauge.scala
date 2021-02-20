package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.drawing.PDFOptions
import typings.kendoUi.kendo.ui.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialGauge extends Widget {
  
  def allValues(): js.Any = js.native
  def allValues(values: js.Any): js.Any = js.native
  
  def exportImage(options: js.Any): JQueryPromise[_] = js.native
  
  def exportPDF(): JQueryPromise[_] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[_] = js.native
  
  def exportSVG(options: js.Any): JQueryPromise[_] = js.native
  
  def imageDataURL(): String = js.native
  
  @JSName("options")
  var options_RadialGauge: RadialGaugeOptions = js.native
  
  def redraw(): Unit = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  def svg(): Unit = js.native
  
  def value(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
