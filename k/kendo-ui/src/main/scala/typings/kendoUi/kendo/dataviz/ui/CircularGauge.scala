package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.drawing.PDFOptions
import typings.kendoUi.kendo.ui.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircularGauge
  extends StObject
     with Widget {
  
  def exportImage(options: Any): JQueryPromise[Any] = js.native
  
  def exportPDF(): JQueryPromise[Any] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[Any] = js.native
  
  def exportSVG(options: Any): JQueryPromise[Any] = js.native
  
  def imageDataURL(): String = js.native
  
  @JSName("options")
  var options_CircularGauge: CircularGaugeOptions = js.native
  
  def redraw(): Unit = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  def svg(): Unit = js.native
  
  def value(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
