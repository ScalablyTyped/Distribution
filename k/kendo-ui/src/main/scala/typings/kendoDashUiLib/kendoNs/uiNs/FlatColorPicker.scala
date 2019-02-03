package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.FlatColorPicker")
@js.native
class FlatColorPicker protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: FlatColorPickerOptions) = this()
  @JSName("options")
  var options_FlatColorPicker: FlatColorPickerOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def color(): kendoDashUiLib.kendoNs.Color = js.native
  def color(color: kendoDashUiLib.kendoNs.Color): scala.Unit = js.native
  @JSName("color")
  def color_Unit(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def value(): java.lang.String = js.native
  def value(color: java.lang.String): scala.Unit = js.native
  @JSName("value")
  def value_Unit(): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.FlatColorPicker")
@js.native
object FlatColorPicker extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.FlatColorPicker = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.FlatColorPicker = js.native
}

