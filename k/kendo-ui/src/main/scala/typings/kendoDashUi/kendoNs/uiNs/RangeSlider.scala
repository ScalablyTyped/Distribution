package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.RangeSlider")
@js.native
class RangeSlider protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: RangeSliderOptions) = this()
  @JSName("options")
  var options_RangeSlider: RangeSliderOptions = js.native
  var wrapper: JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def value(): js.Any = js.native
  def value(startEndArray: js.Any): Unit = js.native
  def values(): js.Any = js.native
  def values(selectionStart: Double, selectionEnd: Double): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.RangeSlider")
@js.native
object RangeSlider extends js.Object {
  var fn: RangeSlider = js.native
  def extend(proto: js.Object): RangeSlider = js.native
}

