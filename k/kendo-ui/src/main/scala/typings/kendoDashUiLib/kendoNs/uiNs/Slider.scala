package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Slider")
@js.native
class Slider protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: SliderOptions) = this()
  @JSName("options")
  var options_Slider: SliderOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def max(): scala.Double = js.native
  def max(value: java.lang.String): scala.Unit = js.native
  def max(value: scala.Double): scala.Unit = js.native
  def min(): scala.Double = js.native
  def min(value: java.lang.String): scala.Unit = js.native
  def min(value: scala.Double): scala.Unit = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def value(): scala.Double = js.native
  def value(value: scala.Double): scala.Unit = js.native
}

@JSGlobal("kendo.ui.Slider")
@js.native
object Slider extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Slider = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Slider = js.native
}

