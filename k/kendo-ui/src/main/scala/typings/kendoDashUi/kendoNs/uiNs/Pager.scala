package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendoNs.dataNs.DataSource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Pager")
@js.native
class Pager protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: PagerOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_Pager: PagerOptions = js.native
  var wrapper: JQuery = js.native
  def page(): Double = js.native
  def page(page: Double): Unit = js.native
  def pageSize(): Double = js.native
  def refresh(): Unit = js.native
  def totalPages(): Double = js.native
}

/* static members */
@JSGlobal("kendo.ui.Pager")
@js.native
object Pager extends js.Object {
  var fn: Pager = js.native
  def extend(proto: js.Object): Pager = js.native
}

