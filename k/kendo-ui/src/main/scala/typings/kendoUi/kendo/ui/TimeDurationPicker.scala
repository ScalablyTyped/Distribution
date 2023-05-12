package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeDurationPicker
  extends StObject
     with Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_TimeDurationPicker: TimeDurationPickerOptions = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def value(): Double = js.native
  def value(value: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
