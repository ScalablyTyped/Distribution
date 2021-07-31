package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datepicker
  extends StObject
     with Widget
     with DatepickerOptions {
  
  def formatDate(format: String, date: Date): String = js.native
  def formatDate(format: String, date: Date, settings: DatepickerFormatDateOptions): String = js.native
  
  def iso8601Week(date: Date): Double = js.native
  
  def noWeekends(date: Date): js.Array[js.Any] = js.native
  
  def parseDate(format: String, date: String): Date = js.native
  def parseDate(format: String, date: String, settings: DatepickerFormatDateOptions): Date = js.native
  
  var regional: StringDictionary[js.Any] = js.native
  
  def setDefaults(defaults: DatepickerOptions): Unit = js.native
}
