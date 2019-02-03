package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Tooltip")
@js.native
class Tooltip protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: TooltipOptions) = this()
  @JSName("options")
  var options_Tooltip: TooltipOptions = js.native
  var popup: Popup = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def hide(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def show(element: kendoDashUiLib.JQuery): scala.Unit = js.native
  def target(): kendoDashUiLib.JQuery = js.native
}

/* static members */
@JSGlobal("kendo.ui.Tooltip")
@js.native
object Tooltip extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Tooltip = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Tooltip = js.native
}

