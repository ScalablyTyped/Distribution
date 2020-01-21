package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.View")
@js.native
class View protected ()
  extends typings.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ViewOptions) = this()
  @JSName("options")
  var options_View: ViewOptions = js.native
  var wrapper: JQuery = js.native
  def contentElement(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.View")
@js.native
object View extends js.Object {
  var fn: View = js.native
  def extend(proto: js.Object): View = js.native
}

