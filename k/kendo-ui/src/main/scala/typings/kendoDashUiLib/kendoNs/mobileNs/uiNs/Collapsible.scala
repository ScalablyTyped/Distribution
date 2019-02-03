package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Collapsible")
@js.native
class Collapsible protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: CollapsibleOptions) = this()
  @JSName("options")
  var options_Collapsible: CollapsibleOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def collapse(instant: scala.Boolean): scala.Unit = js.native
  def expand(): scala.Unit = js.native
  def expand(instant: scala.Boolean): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
  def toggle(instant: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Collapsible")
@js.native
object Collapsible extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.Collapsible = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.Collapsible = js.native
}

