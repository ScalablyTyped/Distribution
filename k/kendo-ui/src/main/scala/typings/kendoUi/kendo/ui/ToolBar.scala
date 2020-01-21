package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ToolBar")
@js.native
class ToolBar protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ToolBarOptions) = this()
  @JSName("options")
  var options_ToolBar: ToolBarOptions = js.native
  var popup: Popup = js.native
  var wrapper: JQuery = js.native
  def add(command: js.Any): Unit = js.native
  def enable(command: String, enable: Boolean): Unit = js.native
  def enable(command: JQuery, enable: Boolean): Unit = js.native
  def enable(command: Element, enable: Boolean): Unit = js.native
  def getSelectedFromGroup(groupName: String): Unit = js.native
  def hide(command: String): Unit = js.native
  def hide(command: JQuery): Unit = js.native
  def hide(command: Element): Unit = js.native
  def remove(command: String): Unit = js.native
  def remove(command: JQuery): Unit = js.native
  def remove(command: Element): Unit = js.native
  def show(command: String): Unit = js.native
  def show(command: JQuery): Unit = js.native
  def show(command: Element): Unit = js.native
  def toggle(command: String, state: Boolean): Unit = js.native
  def toggle(command: JQuery, state: Boolean): Unit = js.native
  def toggle(command: Element, state: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.ToolBar")
@js.native
object ToolBar extends js.Object {
  var fn: ToolBar = js.native
  def extend(proto: js.Object): ToolBar = js.native
}

