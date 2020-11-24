package typings.kendoUi.global.kendo

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.date")
@js.native
object date extends js.Object {
  
  var MS_PER_DAY: Double = js.native
  
  var MS_PER_HOUR: Double = js.native
  
  var MS_PER_MINUTE: Double = js.native
  
  def addDays(targetDate: Date, numberOfDaysToAdd: Double): Date = js.native
  
  def dayOfWeek(targetDate: Date, dayOfWeek: Double, direction: Double): Date = js.native
  
  def firstDayOfMonth(targetDate: Date): Date = js.native
  
  def getDate(date: Date): Date = js.native
  
  def getMilliseconds(targetDate: Date): Double = js.native
  
  def isInDateRange(targetDate: Date, lowerLimitDate: Date, upperLimitDate: Date): Boolean = js.native
  
  def isInTimeRange(targetDate: Date, lowerLimitDate: Date, upperLimitDate: Date): Boolean = js.native
  
  def isToday(targetDate: Date): Boolean = js.native
  
  def lastDayOfMonth(targetDate: Date): Date = js.native
  
  def nextDay(targetDate: Date): Date = js.native
  
  def previousDay(targetDate: Date): Date = js.native
  
  def setDayOfWeek(targetDate: Date, dayOfWeek: Double, direction: Double): Unit = js.native
  
  def setHours(targetDate: Date, sourceDate: Double): Date = js.native
  
  def setTime(targetDate: Date, millisecondsToAdd: Double, ignoreDST: Boolean): Unit = js.native
  
  def toInvariantTime(targetDate: Date): Date = js.native
  
  def toUtcTime(targetDate: Date): Double = js.native
  
  def today(): Date = js.native
  
  def weekInYear(date: Date): Double = js.native
  def weekInYear(date: Date, weekStart: Double): Double = js.native
}
