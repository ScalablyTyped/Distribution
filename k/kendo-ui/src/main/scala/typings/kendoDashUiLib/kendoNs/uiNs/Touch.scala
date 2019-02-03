package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Touch")
@js.native
class Touch protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: TouchOptions) = this()
  @JSName("options")
  var options_Touch: TouchOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def cancel(): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Touch")
@js.native
object Touch extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Touch = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Touch = js.native
}

