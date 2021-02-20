package typings.kendoUi.global.kendo

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object date {
  
  @JSGlobal("kendo.date")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("kendo.date.MS_PER_DAY")
  @js.native
  def MS_PER_DAY: Double = js.native
  @scala.inline
  def MS_PER_DAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MS_PER_DAY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.date.MS_PER_HOUR")
  @js.native
  def MS_PER_HOUR: Double = js.native
  @scala.inline
  def MS_PER_HOUR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MS_PER_HOUR")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.date.MS_PER_MINUTE")
  @js.native
  def MS_PER_MINUTE: Double = js.native
  @scala.inline
  def MS_PER_MINUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MS_PER_MINUTE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.date.addDays")
  @js.native
  def addDays(targetDate: Date, numberOfDaysToAdd: Double): Date = js.native
  
  @JSGlobal("kendo.date.dayOfWeek")
  @js.native
  def dayOfWeek(targetDate: Date, dayOfWeek: Double, direction: Double): Date = js.native
  
  @JSGlobal("kendo.date.firstDayOfMonth")
  @js.native
  def firstDayOfMonth(targetDate: Date): Date = js.native
  
  @JSGlobal("kendo.date.getDate")
  @js.native
  def getDate(date: Date): Date = js.native
  
  @JSGlobal("kendo.date.getMilliseconds")
  @js.native
  def getMilliseconds(targetDate: Date): Double = js.native
  
  @JSGlobal("kendo.date.isInDateRange")
  @js.native
  def isInDateRange(targetDate: Date, lowerLimitDate: Date, upperLimitDate: Date): Boolean = js.native
  
  @JSGlobal("kendo.date.isInTimeRange")
  @js.native
  def isInTimeRange(targetDate: Date, lowerLimitDate: Date, upperLimitDate: Date): Boolean = js.native
  
  @JSGlobal("kendo.date.isToday")
  @js.native
  def isToday(targetDate: Date): Boolean = js.native
  
  @JSGlobal("kendo.date.lastDayOfMonth")
  @js.native
  def lastDayOfMonth(targetDate: Date): Date = js.native
  
  @JSGlobal("kendo.date.nextDay")
  @js.native
  def nextDay(targetDate: Date): Date = js.native
  
  @JSGlobal("kendo.date.previousDay")
  @js.native
  def previousDay(targetDate: Date): Date = js.native
  
  @JSGlobal("kendo.date.setDayOfWeek")
  @js.native
  def setDayOfWeek(targetDate: Date, dayOfWeek: Double, direction: Double): Unit = js.native
  
  @JSGlobal("kendo.date.setHours")
  @js.native
  def setHours(targetDate: Date, sourceDate: Double): Date = js.native
  
  @JSGlobal("kendo.date.setTime")
  @js.native
  def setTime(targetDate: Date, millisecondsToAdd: Double, ignoreDST: Boolean): Unit = js.native
  
  @JSGlobal("kendo.date.toInvariantTime")
  @js.native
  def toInvariantTime(targetDate: Date): Date = js.native
  
  @JSGlobal("kendo.date.toUtcTime")
  @js.native
  def toUtcTime(targetDate: Date): Double = js.native
  
  @JSGlobal("kendo.date.today")
  @js.native
  def today(): Date = js.native
  
  @JSGlobal("kendo.date.weekInYear")
  @js.native
  def weekInYear(date: Date): Double = js.native
  @JSGlobal("kendo.date.weekInYear")
  @js.native
  def weekInYear(date: Date, weekStart: Double): Double = js.native
}
