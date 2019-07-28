package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Tooltip")
@js.native
class Tooltip protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: TooltipOptions) = this()
  @JSName("options")
  var options_Tooltip: TooltipOptions = js.native
  var popup: Popup = js.native
  var wrapper: JQuery = js.native
  def hide(): Unit = js.native
  def refresh(): Unit = js.native
  def show(element: JQuery): Unit = js.native
  def target(): JQuery = js.native
}

/* static members */
@JSGlobal("kendo.ui.Tooltip")
@js.native
object Tooltip extends js.Object {
  var fn: Tooltip = js.native
  def extend(proto: js.Object): Tooltip = js.native
}

