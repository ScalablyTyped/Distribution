package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeSlider extends Widget {
  @JSName("options")
  var options_RangeSlider: RangeSliderOptions = js.native
  var wrapper: JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def value(): js.Any = js.native
  def value(startEndArray: js.Any): Unit = js.native
  def values(): js.Any = js.native
  def values(selectionStart: Double, selectionEnd: Double): Unit = js.native
}

