package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.Color
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.FlatColorPicker")
@js.native
class FlatColorPicker protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: FlatColorPickerOptions) = this()
  @JSName("options")
  var options_FlatColorPicker: FlatColorPickerOptions = js.native
  var wrapper: JQuery = js.native
  def color(): Unit = js.native
  def color(color: Color): Unit = js.native
  @JSName("color")
  def color_Color(): Color = js.native
  def enable(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def value(): String = js.native
  def value(color: String): Unit = js.native
  @JSName("value")
  def value_Unit(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.FlatColorPicker")
@js.native
object FlatColorPicker extends js.Object {
  var fn: FlatColorPicker = js.native
  def extend(proto: js.Object): FlatColorPicker = js.native
}

