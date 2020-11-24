package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSlider extends Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_RangeSlider: RangeSliderOptions = js.native
  
  def value(): js.Any = js.native
  def value(startEndArray: js.Any): Unit = js.native
  
  def values(): js.Any = js.native
  def values(selectionStart: Double, selectionEnd: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
