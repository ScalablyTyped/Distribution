package typings.kendoUi.global.kendo

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @scala.inline
  def addDays(targetDate: Date, numberOfDaysToAdd: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(targetDate.asInstanceOf[js.Any], numberOfDaysToAdd.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def dayOfWeek(targetDate: Date, dayOfWeek: Double, direction: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("dayOfWeek")(targetDate.asInstanceOf[js.Any], dayOfWeek.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def firstDayOfMonth(targetDate: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("firstDayOfMonth")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def getDate(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def getMilliseconds(targetDate: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMilliseconds")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isInDateRange(targetDate: Date, lowerLimitDate: Date, upperLimitDate: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInDateRange")(targetDate.asInstanceOf[js.Any], lowerLimitDate.asInstanceOf[js.Any], upperLimitDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isInTimeRange(targetDate: Date, lowerLimitDate: Date, upperLimitDate: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInTimeRange")(targetDate.asInstanceOf[js.Any], lowerLimitDate.asInstanceOf[js.Any], upperLimitDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isToday(targetDate: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToday")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def lastDayOfMonth(targetDate: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfMonth")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def nextDay(targetDate: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextDay")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def previousDay(targetDate: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousDay")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def setDayOfWeek(targetDate: Date, dayOfWeek: Double, direction: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDayOfWeek")(targetDate.asInstanceOf[js.Any], dayOfWeek.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setHours(targetDate: Date, sourceDate: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setHours")(targetDate.asInstanceOf[js.Any], sourceDate.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def setTime(targetDate: Date, millisecondsToAdd: Double, ignoreDST: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTime")(targetDate.asInstanceOf[js.Any], millisecondsToAdd.asInstanceOf[js.Any], ignoreDST.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toInvariantTime(targetDate: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvariantTime")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def toUtcTime(targetDate: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtcTime")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def today(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("today")().asInstanceOf[Date]
  
  @scala.inline
  def weekInYear(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("weekInYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def weekInYear(date: Date, weekStart: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekInYear")(date.asInstanceOf[js.Any], weekStart.asInstanceOf[js.Any])).asInstanceOf[Double]
}
