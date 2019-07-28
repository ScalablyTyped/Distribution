package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.FilterMenu")
@js.native
class FilterMenu protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: FilterMenuOptions) = this()
  var field: String = js.native
  @JSName("options")
  var options_FilterMenu: FilterMenuOptions = js.native
  var wrapper: JQuery = js.native
  def clear(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.FilterMenu")
@js.native
object FilterMenu extends js.Object {
  var fn: FilterMenu = js.native
  def extend(proto: js.Object): FilterMenu = js.native
}

