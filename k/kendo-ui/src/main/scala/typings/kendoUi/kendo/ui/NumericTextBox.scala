package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericTextBox extends Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  def focus(): Unit = js.native
  
  def max(): Double = js.native
  def max(value: String): Unit = js.native
  def max(value: Double): Unit = js.native
  
  def min(): Double = js.native
  def min(value: String): Unit = js.native
  def min(value: Double): Unit = js.native
  
  @JSName("options")
  var options_NumericTextBox: NumericTextBoxOptions = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def step(): Double = js.native
  def step(value: String): Unit = js.native
  def step(value: Double): Unit = js.native
  
  def value(): Double = js.native
  def value(value: String): Unit = js.native
  def value(value: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
