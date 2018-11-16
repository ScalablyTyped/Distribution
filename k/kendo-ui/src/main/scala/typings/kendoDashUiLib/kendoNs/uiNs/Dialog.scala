package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Dialog")
@js.native
class Dialog protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: DialogOptions) = this()
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(): Dialog = js.native
  def content(): java.lang.String = js.native
  def content(content: java.lang.String): Dialog = js.native
  def content(content: kendoDashUiLib.JQuery): Dialog = js.native
  @JSName("content")
  def content_Dialog(): Dialog = js.native
  def open(): Dialog = js.native
  def title(): java.lang.String = js.native
  def title(text: java.lang.String): Dialog = js.native
  @JSName("title")
  def title_Dialog(): Dialog = js.native
  def toFront(): Dialog = js.native
}

@JSGlobal("kendo.ui.Dialog")
@js.native
object Dialog extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Dialog = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Dialog = js.native
}

