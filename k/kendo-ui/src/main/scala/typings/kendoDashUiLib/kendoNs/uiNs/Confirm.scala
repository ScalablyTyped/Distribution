package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Confirm")
@js.native
class Confirm protected () extends Dialog {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ConfirmOptions) = this()
  @JSName("options")
  var options_Confirm: ConfirmOptions = js.native
  var result: kendoDashUiLib.JQueryPromise[_] = js.native
}

@JSGlobal("kendo.ui.Confirm")
@js.native
object Confirm extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Confirm = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Confirm = js.native
}

