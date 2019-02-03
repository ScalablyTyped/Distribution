package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Alert")
@js.native
class Alert protected () extends Dialog {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: AlertOptions) = this()
  @JSName("options")
  var options_Alert: AlertOptions = js.native
}

/* static members */
@JSGlobal("kendo.ui.Alert")
@js.native
object Alert extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Alert = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Alert = js.native
}

