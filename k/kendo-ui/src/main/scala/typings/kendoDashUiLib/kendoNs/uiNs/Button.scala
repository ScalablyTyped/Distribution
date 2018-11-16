package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Button")
@js.native
class Button protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ButtonOptions) = this()
  @JSName("options")
  var options_Button: ButtonOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def enable(toggle: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("kendo.ui.Button")
@js.native
object Button extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Button = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Button = js.native
}

