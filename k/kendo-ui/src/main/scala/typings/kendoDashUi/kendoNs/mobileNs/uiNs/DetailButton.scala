package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.DetailButton")
@js.native
class DetailButton protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DetailButtonOptions) = this()
  @JSName("options")
  var options_DetailButton: DetailButtonOptions = js.native
  var wrapper: JQuery = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.DetailButton")
@js.native
object DetailButton extends js.Object {
  var fn: DetailButton = js.native
  def extend(proto: js.Object): DetailButton = js.native
}

