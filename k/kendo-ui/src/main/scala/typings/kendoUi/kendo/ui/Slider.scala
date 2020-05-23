package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slider extends Widget {
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

