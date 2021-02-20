package typings.jqrangeslider

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def dateRangeSlider(): JQuery = js.native
  def dateRangeSlider(method: String): js.Any = js.native
  def dateRangeSlider(method: String, min: Date, max: Date): JQuery = js.native
  def dateRangeSlider(method: String, value: Date): JQuery = js.native
  def dateRangeSlider(options: JQDateRangeSliderOptions): JQuery = js.native
  
  def editRangeSlider(): JQuery = js.native
  def editRangeSlider(method: String): js.Any = js.native
  def editRangeSlider(method: String, min: Double, max: Double): JQuery = js.native
  def editRangeSlider(method: String, value: Double): JQuery = js.native
  def editRangeSlider(options: JQEditRangeSliderOptions): JQuery = js.native
  
  def rangeSlider(): JQuery = js.native
  def rangeSlider(method: String): js.Any = js.native
  def rangeSlider(method: String, min: Double, max: Double): JQuery = js.native
  def rangeSlider(method: String, value: Double): JQuery = js.native
  def rangeSlider(options: JQNumericRangeSliderOptions): JQuery = js.native
}
