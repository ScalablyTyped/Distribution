package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.RangeSlider")
@js.native
class RangeSlider protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: RangeSliderOptions) = this()
  @JSName("options")
  var options_RangeSlider: RangeSliderOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def value(): js.Any = js.native
  def value(startEndArray: js.Any): scala.Unit = js.native
  def values(): js.Any = js.native
  def values(selectionStart: scala.Double, selectionEnd: scala.Double): scala.Unit = js.native
}

@JSGlobal("kendo.ui.RangeSlider")
@js.native
object RangeSlider extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.RangeSlider = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.RangeSlider = js.native
}

