package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ContextMenu")
@js.native
class ContextMenu protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ContextMenuOptions) = this()
  @JSName("options")
  var options_ContextMenu: ContextMenuOptions = js.native
  var wrapper: JQuery = js.native
  def append(item: js.Any): ContextMenu = js.native
  def append(item: js.Any, referenceItem: String): ContextMenu = js.native
  def append(item: js.Any, referenceItem: JQuery): ContextMenu = js.native
  def close(element: JQuery): ContextMenu = js.native
  def close(element: Element): ContextMenu = js.native
  def enable(element: String, enable: Boolean): ContextMenu = js.native
  def enable(element: JQuery, enable: Boolean): ContextMenu = js.native
  def enable(element: Element, enable: Boolean): ContextMenu = js.native
  def insertAfter(item: js.Any, referenceItem: String): ContextMenu = js.native
  def insertAfter(item: js.Any, referenceItem: JQuery): ContextMenu = js.native
  def insertAfter(item: js.Any, referenceItem: Element): ContextMenu = js.native
  def insertBefore(item: js.Any, referenceItem: String): ContextMenu = js.native
  def insertBefore(item: js.Any, referenceItem: JQuery): ContextMenu = js.native
  def insertBefore(item: js.Any, referenceItem: Element): ContextMenu = js.native
  def open(x: Double): ContextMenu = js.native
  def open(x: Double, y: Double): ContextMenu = js.native
  def open(x: JQuery): ContextMenu = js.native
  def open(x: JQuery, y: Double): ContextMenu = js.native
  def open(x: Element): ContextMenu = js.native
  def open(x: Element, y: Double): ContextMenu = js.native
  def remove(element: String): ContextMenu = js.native
  def remove(element: JQuery): ContextMenu = js.native
  def remove(element: Element): ContextMenu = js.native
}

/* static members */
@JSGlobal("kendo.ui.ContextMenu")
@js.native
object ContextMenu extends js.Object {
  var fn: ContextMenu = js.native
  def extend(proto: js.Object): ContextMenu = js.native
}

