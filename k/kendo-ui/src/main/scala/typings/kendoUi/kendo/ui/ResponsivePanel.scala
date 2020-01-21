package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ResponsivePanel")
@js.native
class ResponsivePanel protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ResponsivePanelOptions) = this()
  @JSName("options")
  var options_ResponsivePanel: ResponsivePanelOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def open(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.ResponsivePanel")
@js.native
object ResponsivePanel extends js.Object {
  var fn: ResponsivePanel = js.native
  def extend(proto: js.Object): ResponsivePanel = js.native
}

