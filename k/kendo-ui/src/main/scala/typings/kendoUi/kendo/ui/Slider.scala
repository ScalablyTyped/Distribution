package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Slider")
@js.native
class Slider protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: SliderOptions) = this()
  @JSName("options")
  var options_Slider: SliderOptions = js.native
  var wrapper: JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def max(): Double = js.native
  def max(value: String): Unit = js.native
  def max(value: Double): Unit = js.native
  def min(): Double = js.native
  def min(value: String): Unit = js.native
  def min(value: Double): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def value(): Double = js.native
  def value(value: Double): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Slider")
@js.native
object Slider extends js.Object {
  var fn: Slider = js.native
  def extend(proto: js.Object): Slider = js.native
}

