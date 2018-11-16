package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Editor")
@js.native
class Editor protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: EditorOptions) = this()
  var body: stdLib.Element = js.native
  @JSName("options")
  var options_Editor: EditorOptions = js.native
  var toolbar: kendoDashUiLib.kendoNs.uiNs.editorNs.Toolbar = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def createRange(): stdLib.Range = js.native
  def createRange(document: stdLib.Document): stdLib.Range = js.native
  def encodedValue(): java.lang.String = js.native
  def exec(name: java.lang.String, params: js.Any): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getRange(): stdLib.Range = js.native
  def getSelection(): stdLib.Selection = js.native
  def paste(html: java.lang.String, options: js.Any): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def saveAsPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def selectRange(range: stdLib.Range): scala.Unit = js.native
  def selectedHtml(): java.lang.String = js.native
  def state(toolName: java.lang.String): scala.Boolean = js.native
  def update(): scala.Unit = js.native
  def value(): java.lang.String = js.native
  def value(value: java.lang.String): scala.Unit = js.native
}

@JSGlobal("kendo.ui.Editor")
@js.native
object Editor extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Editor = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Editor = js.native
}

