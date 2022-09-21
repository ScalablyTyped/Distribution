package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datepicker
  extends StObject
     with Widget
     with DatepickerOptions {
  
  def formatDate(format: String, date: js.Date): String = js.native
  def formatDate(format: String, date: js.Date, settings: DatepickerFormatDateOptions): String = js.native
  
  def iso8601Week(date: js.Date): Double = js.native
  
  def noWeekends(date: js.Date): js.Array[Any] = js.native
  
  def parseDate(format: String, date: String): js.Date = js.native
  def parseDate(format: String, date: String, settings: DatepickerFormatDateOptions): js.Date = js.native
  
  var regional: StringDictionary[Any] = js.native
  
  def setDefaults(defaults: DatepickerOptions): Unit = js.native
}
