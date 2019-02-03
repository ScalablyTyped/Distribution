package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ToolBar")
@js.native
class ToolBar protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ToolBarOptions) = this()
  @JSName("options")
  var options_ToolBar: ToolBarOptions = js.native
  var popup: Popup = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def add(command: js.Any): scala.Unit = js.native
  def enable(command: java.lang.String, enable: scala.Boolean): scala.Unit = js.native
  def enable(command: kendoDashUiLib.JQuery, enable: scala.Boolean): scala.Unit = js.native
  def enable(command: stdLib.Element, enable: scala.Boolean): scala.Unit = js.native
  def getSelectedFromGroup(groupName: java.lang.String): scala.Unit = js.native
  def hide(command: java.lang.String): scala.Unit = js.native
  def hide(command: kendoDashUiLib.JQuery): scala.Unit = js.native
  def hide(command: stdLib.Element): scala.Unit = js.native
  def remove(command: java.lang.String): scala.Unit = js.native
  def remove(command: kendoDashUiLib.JQuery): scala.Unit = js.native
  def remove(command: stdLib.Element): scala.Unit = js.native
  def show(command: java.lang.String): scala.Unit = js.native
  def show(command: kendoDashUiLib.JQuery): scala.Unit = js.native
  def show(command: stdLib.Element): scala.Unit = js.native
  def toggle(command: java.lang.String, state: scala.Boolean): scala.Unit = js.native
  def toggle(command: kendoDashUiLib.JQuery, state: scala.Boolean): scala.Unit = js.native
  def toggle(command: stdLib.Element, state: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.ToolBar")
@js.native
object ToolBar extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.ToolBar = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.ToolBar = js.native
}

