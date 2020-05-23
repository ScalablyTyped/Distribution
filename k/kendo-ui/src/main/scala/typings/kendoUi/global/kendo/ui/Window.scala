package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.WindowOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Window")
@js.native
class Window protected ()
  extends typings.kendoUi.kendo.ui.Window {
  def this(element: Element) = this()
  def this(element: Element, options: WindowOptions) = this()
}

/* static members */
@JSGlobal("kendo.ui.Window")
@js.native
object Window extends js.Object {
  var fn: typings.kendoUi.kendo.ui.Window = js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Window = js.native
}

