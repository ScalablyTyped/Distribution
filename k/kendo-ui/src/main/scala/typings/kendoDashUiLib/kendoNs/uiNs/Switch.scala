package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Switch")
@js.native
class Switch protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: SwitchOptions) = this()
  @JSName("options")
  var options_Switch: SwitchOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def check(): scala.Boolean = js.native
  def check(check: scala.Boolean): scala.Unit = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
}

@JSGlobal("kendo.ui.Switch")
@js.native
object Switch extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Switch = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Switch = js.native
}

