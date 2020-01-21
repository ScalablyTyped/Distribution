package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.PopOver")
@js.native
class PopOver protected ()
  extends typings.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: PopOverOptions) = this()
  @JSName("options")
  var options_PopOver: PopOverOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def open(target: JQuery): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.PopOver")
@js.native
object PopOver extends js.Object {
  var fn: PopOver = js.native
  def extend(proto: js.Object): PopOver = js.native
}

