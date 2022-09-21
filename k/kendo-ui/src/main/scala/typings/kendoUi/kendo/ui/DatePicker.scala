package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePicker
  extends StObject
     with Widget {
  
  def close(): Unit = js.native
  
  def enable(enable: Boolean): Unit = js.native
  
  def max(): js.Date = js.native
  def max(value: String): Unit = js.native
  def max(value: js.Date): Unit = js.native
  
  def min(): js.Date = js.native
  def min(value: String): Unit = js.native
  def min(value: js.Date): Unit = js.native
  
  def open(): Unit = js.native
  
  @JSName("options")
  var options_DatePicker: DatePickerOptions = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  def value(): Unit = js.native
  def value(value: String): Unit = js.native
  def value(value: js.Date): Unit = js.native
  @JSName("value")
  def value_Date(): js.Date = js.native
  
  var wrapper: JQuery = js.native
}
