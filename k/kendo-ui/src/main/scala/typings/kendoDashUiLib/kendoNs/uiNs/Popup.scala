package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Popup")
@js.native
class Popup protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: PopupOptions) = this()
  @JSName("options")
  var options_Popup: PopupOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def position(): scala.Unit = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def visible(): scala.Boolean = js.native
}

@JSGlobal("kendo.ui.Popup")
@js.native
object Popup extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Popup = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Popup = js.native
}

