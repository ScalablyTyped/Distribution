package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.FilterMenu")
@js.native
class FilterMenu protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: FilterMenuOptions) = this()
  var field: java.lang.String = js.native
  @JSName("options")
  var options_FilterMenu: FilterMenuOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def clear(): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.FilterMenu")
@js.native
object FilterMenu extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.FilterMenu = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.FilterMenu = js.native
}

