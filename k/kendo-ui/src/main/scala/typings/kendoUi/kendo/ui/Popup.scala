package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Popup")
@js.native
class Popup protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: PopupOptions) = this()
  @JSName("options")
  var options_Popup: PopupOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def open(): Unit = js.native
  def position(): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def visible(): Boolean = js.native
}

/* static members */
@JSGlobal("kendo.ui.Popup")
@js.native
object Popup extends js.Object {
  var TabKeyTrap: js.Any = js.native
  var fn: Popup = js.native
  def extend(proto: js.Object): Popup = js.native
}

