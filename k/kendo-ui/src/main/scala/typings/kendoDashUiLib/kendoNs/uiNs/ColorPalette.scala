package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ColorPalette")
@js.native
class ColorPalette protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ColorPaletteOptions) = this()
  @JSName("options")
  var options_ColorPalette: ColorPaletteOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def color(): kendoDashUiLib.kendoNs.Color = js.native
  def color(color: kendoDashUiLib.kendoNs.Color): scala.Unit = js.native
  @JSName("color")
  def color_Unit(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def value(): java.lang.String = js.native
  def value(color: java.lang.String): scala.Unit = js.native
  @JSName("value")
  def value_Unit(): scala.Unit = js.native
}

@JSGlobal("kendo.ui.ColorPalette")
@js.native
object ColorPalette extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.ColorPalette = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.ColorPalette = js.native
}

