package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangePicker extends Widget {
  
  def close(): Unit = js.native
  
  def enable(enable: Boolean): Unit = js.native
  
  def max(): Date = js.native
  def max(value: String): Unit = js.native
  def max(value: Date): Unit = js.native
  
  def min(): Date = js.native
  def min(value: String): Unit = js.native
  def min(value: Date): Unit = js.native
  
  def open(): Unit = js.native
  
  @JSName("options")
  var options_DateRangePicker: DateRangePickerOptions = js.native
  
  def range(): js.Any = js.native
  def range(range: DateRangePickerRange): Unit = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  var wrapper: JQuery = js.native
}
