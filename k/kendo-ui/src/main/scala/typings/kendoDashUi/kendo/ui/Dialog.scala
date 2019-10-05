package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Dialog")
@js.native
class Dialog protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DialogOptions) = this()
  var wrapper: JQuery = js.native
  def close(): Dialog = js.native
  def content(): String = js.native
  def content(content: String): Dialog = js.native
  def content(content: JQuery): Dialog = js.native
  @JSName("content")
  def content_Dialog(): Dialog = js.native
  def open(): Dialog = js.native
  def title(): String = js.native
  def title(text: String): Dialog = js.native
  @JSName("title")
  def title_Dialog(): Dialog = js.native
  def toFront(): Dialog = js.native
}

/* static members */
@JSGlobal("kendo.ui.Dialog")
@js.native
object Dialog extends js.Object {
  var fn: Dialog = js.native
  def extend(proto: js.Object): Dialog = js.native
}

