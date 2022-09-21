package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewer
  extends StObject
     with Widget {
  
  def activatePage(): Unit = js.native
  
  def execute(): Unit = js.native
  
  def fromFile(file: Any): Unit = js.native
  
  def loadPage(): Unit = js.native
  
  @JSName("options")
  var options_PDFViewer: PDFViewerOptions = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  var wrapper: JQuery = js.native
}
