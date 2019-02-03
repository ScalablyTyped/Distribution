package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Button")
@js.native
class Button protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ButtonOptions) = this()
  @JSName("options")
  var options_Button: ButtonOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def badge(value: java.lang.String): java.lang.String = js.native
  def badge(value: scala.Boolean): java.lang.String = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Button")
@js.native
object Button extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.Button = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.Button = js.native
}

