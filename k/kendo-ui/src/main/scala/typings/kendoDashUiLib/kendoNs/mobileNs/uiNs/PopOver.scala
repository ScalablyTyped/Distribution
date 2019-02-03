package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.PopOver")
@js.native
class PopOver protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: PopOverOptions) = this()
  @JSName("options")
  var options_PopOver: PopOverOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(): scala.Unit = js.native
  def open(target: kendoDashUiLib.JQuery): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.PopOver")
@js.native
object PopOver extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.PopOver = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.PopOver = js.native
}

