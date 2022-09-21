package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateInput
  extends StObject
     with Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  def max(): js.Date = js.native
  def max(value: String): Unit = js.native
  def max(value: js.Date): Unit = js.native
  
  def min(): js.Date = js.native
  def min(value: String): Unit = js.native
  def min(value: js.Date): Unit = js.native
  
  @JSName("options")
  var options_DateInput: DateInputOptions = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  def value(): js.Date = js.native
  def value(value: String): Unit = js.native
  def value(value: js.Date): Unit = js.native
  
  var wrapper: JQuery = js.native
}
