package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendo.Color
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ColorPalette")
@js.native
class ColorPalette protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ColorPaletteOptions) = this()
  @JSName("options")
  var options_ColorPalette: ColorPaletteOptions = js.native
  var wrapper: JQuery = js.native
  def color(): Color = js.native
  def color(color: Color): Unit = js.native
  @JSName("color")
  def color_Unit(): Unit = js.native
  def enable(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  def value(): String = js.native
  def value(color: String): Unit = js.native
  @JSName("value")
  def value_Unit(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.ColorPalette")
@js.native
object ColorPalette extends js.Object {
  var fn: ColorPalette = js.native
  def extend(proto: js.Object): ColorPalette = js.native
}

