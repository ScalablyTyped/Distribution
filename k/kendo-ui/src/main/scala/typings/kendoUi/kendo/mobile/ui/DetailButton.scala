package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.DetailButton")
@js.native
class DetailButton protected ()
  extends typings.kendoUi.kendo.ui.Widget {
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

