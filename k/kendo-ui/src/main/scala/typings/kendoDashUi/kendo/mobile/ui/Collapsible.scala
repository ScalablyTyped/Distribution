package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Collapsible")
@js.native
class Collapsible protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: CollapsibleOptions) = this()
  @JSName("options")
  var options_Collapsible: CollapsibleOptions = js.native
  var wrapper: JQuery = js.native
  def collapse(instant: Boolean): Unit = js.native
  def expand(): Unit = js.native
  def expand(instant: Boolean): Unit = js.native
  def toggle(): Unit = js.native
  def toggle(instant: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Collapsible")
@js.native
object Collapsible extends js.Object {
  var fn: Collapsible = js.native
  def extend(proto: js.Object): Collapsible = js.native
}

