package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.NavBar")
@js.native
class NavBar protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: NavBarOptions) = this()
  @JSName("options")
  var options_NavBar: NavBarOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def title(value: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.NavBar")
@js.native
object NavBar extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.NavBar = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.NavBar = js.native
}

