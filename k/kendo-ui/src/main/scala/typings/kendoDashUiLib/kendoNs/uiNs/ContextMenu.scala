package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ContextMenu")
@js.native
class ContextMenu protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ContextMenuOptions) = this()
  @JSName("options")
  var options_ContextMenu: ContextMenuOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def append(item: js.Any): ContextMenu = js.native
  def append(item: js.Any, referenceItem: java.lang.String): ContextMenu = js.native
  def append(item: js.Any, referenceItem: kendoDashUiLib.JQuery): ContextMenu = js.native
  def close(element: kendoDashUiLib.JQuery): ContextMenu = js.native
  def close(element: stdLib.Element): ContextMenu = js.native
  def enable(element: java.lang.String, enable: scala.Boolean): ContextMenu = js.native
  def enable(element: kendoDashUiLib.JQuery, enable: scala.Boolean): ContextMenu = js.native
  def enable(element: stdLib.Element, enable: scala.Boolean): ContextMenu = js.native
  def insertAfter(item: js.Any, referenceItem: java.lang.String): ContextMenu = js.native
  def insertAfter(item: js.Any, referenceItem: kendoDashUiLib.JQuery): ContextMenu = js.native
  def insertAfter(item: js.Any, referenceItem: stdLib.Element): ContextMenu = js.native
  def insertBefore(item: js.Any, referenceItem: java.lang.String): ContextMenu = js.native
  def insertBefore(item: js.Any, referenceItem: kendoDashUiLib.JQuery): ContextMenu = js.native
  def insertBefore(item: js.Any, referenceItem: stdLib.Element): ContextMenu = js.native
  def open(x: kendoDashUiLib.JQuery): ContextMenu = js.native
  def open(x: kendoDashUiLib.JQuery, y: scala.Double): ContextMenu = js.native
  def open(x: scala.Double): ContextMenu = js.native
  def open(x: scala.Double, y: scala.Double): ContextMenu = js.native
  def open(x: stdLib.Element): ContextMenu = js.native
  def open(x: stdLib.Element, y: scala.Double): ContextMenu = js.native
  def remove(element: java.lang.String): ContextMenu = js.native
  def remove(element: kendoDashUiLib.JQuery): ContextMenu = js.native
  def remove(element: stdLib.Element): ContextMenu = js.native
}

@JSGlobal("kendo.ui.ContextMenu")
@js.native
object ContextMenu extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.ContextMenu = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.ContextMenu = js.native
}

