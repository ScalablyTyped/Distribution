package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewer extends Widget {
  @JSName("options")
  var options_PDFViewer: PDFViewerOptions = js.native
  var wrapper: JQuery = js.native
  def activatePage(): Unit = js.native
  def execute(): Unit = js.native
  def fromFile(): Unit = js.native
  def loadPage(): Unit = js.native
  def setOptions(): Unit = js.native
}

