package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Sortable")
@js.native
class Sortable protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: SortableOptions) = this()
  @JSName("options")
  var options_Sortable: SortableOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def indexOf(element: kendoDashUiLib.JQuery): scala.Double = js.native
  def items(): kendoDashUiLib.JQuery = js.native
}

/* static members */
@JSGlobal("kendo.ui.Sortable")
@js.native
object Sortable extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Sortable = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Sortable = js.native
}

