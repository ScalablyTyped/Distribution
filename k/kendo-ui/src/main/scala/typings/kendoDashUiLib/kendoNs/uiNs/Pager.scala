package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Pager")
@js.native
class Pager protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: PagerOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_Pager: PagerOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def page(): scala.Double = js.native
  def page(page: scala.Double): scala.Unit = js.native
  def pageSize(): scala.Double = js.native
  def refresh(): scala.Unit = js.native
  def totalPages(): scala.Double = js.native
}

@JSGlobal("kendo.ui.Pager")
@js.native
object Pager extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Pager = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Pager = js.native
}

