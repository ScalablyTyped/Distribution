package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.PDFViewer")
@js.native
class PDFViewer protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: PDFViewerOptions) = this()
  @JSName("options")
  var options_PDFViewer: PDFViewerOptions = js.native
  var wrapper: JQuery = js.native
  def activatePage(): Unit = js.native
  def execute(): Unit = js.native
  def fromFile(): Unit = js.native
  def loadPage(): Unit = js.native
  def setOptions(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.PDFViewer")
@js.native
object PDFViewer extends js.Object {
  var fn: PDFViewer = js.native
  def extend(proto: js.Object): PDFViewer = js.native
}

