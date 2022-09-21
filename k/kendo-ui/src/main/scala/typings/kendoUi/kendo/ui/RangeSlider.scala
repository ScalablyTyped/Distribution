package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSlider
  extends StObject
     with Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_RangeSlider: RangeSliderOptions = js.native
  
  def value(): Any = js.native
  def value(startEndArray: Any): Unit = js.native
  
  def values(): Any = js.native
  def values(selectionStart: Double, selectionEnd: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
