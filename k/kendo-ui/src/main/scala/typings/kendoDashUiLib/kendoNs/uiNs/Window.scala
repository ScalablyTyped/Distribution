package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Window")
@js.native
class Window protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: WindowOptions) = this()
  @JSName("options")
  var options_Window: WindowOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def center(): Window = js.native
  def close(): Window = js.native
  def content(): Window = js.native
  def content(content: java.lang.String): Window = js.native
  def content(content: kendoDashUiLib.JQuery): Window = js.native
  @JSName("content")
  def content_String(): java.lang.String = js.native
  def isMaximized(): scala.Boolean = js.native
  def isMinimized(): scala.Boolean = js.native
  def maximize(): Window = js.native
  def minimize(): Window = js.native
  def open(): Window = js.native
  def pin(): scala.Unit = js.native
  def refresh(options: js.Any): Window = js.native
  def restore(): Window = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def title(): Window = js.native
  def title(text: java.lang.String): Window = js.native
  @JSName("title")
  def title_String(): java.lang.String = js.native
  def toFront(): Window = js.native
  def toggleMaximization(): Window = js.native
  def unpin(): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Window")
@js.native
object Window extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Window = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Window = js.native
}

