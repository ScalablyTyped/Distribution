package typings.kendoUi.global.kendo

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
  inline def MS_PER_DAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MS_PER_DAY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.date.MS_PER_HOUR")
  @js.native
  def MS_PER_HOUR: Double = js.native
  inline def MS_PER_HOUR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MS_PER_HOUR")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.date.MS_PER_MINUTE")
  @js.native
  def MS_PER_MINUTE: Double = js.native
  inline def MS_PER_MINUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MS_PER_MINUTE")(x.asInstanceOf[js.Any])
  
  inline def addDays(targetDate: js.Date, numberOfDaysToAdd: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(targetDate.asInstanceOf[js.Any], numberOfDaysToAdd.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def dayOfWeek(targetDate: js.Date, dayOfWeek: Double, direction: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("dayOfWeek")(targetDate.asInstanceOf[js.Any], dayOfWeek.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def firstDayOfMonth(targetDate: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("firstDayOfMonth")(targetDate.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getDate(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getMilliseconds(targetDate: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMilliseconds")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isInDateRange(targetDate: js.Date, lowerLimitDate: js.Date, upperLimitDate: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInDateRange")(targetDate.asInstanceOf[js.Any], lowerLimitDate.asInstanceOf[js.Any], upperLimitDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInTimeRange(targetDate: js.Date, lowerLimitDate: js.Date, upperLimitDate: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInTimeRange")(targetDate.asInstanceOf[js.Any], lowerLimitDate.asInstanceOf[js.Any], upperLimitDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isToday(targetDate: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToday")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lastDayOfMonth(targetDate: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("lastDayOfMonth")(targetDate.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def nextDay(targetDate: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextDay")(targetDate.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def previousDay(targetDate: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("previousDay")(targetDate.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def setDayOfWeek(targetDate: js.Date, dayOfWeek: Double, direction: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDayOfWeek")(targetDate.asInstanceOf[js.Any], dayOfWeek.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setHours(targetDate: js.Date, sourceDate: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setHours")(targetDate.asInstanceOf[js.Any], sourceDate.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def setTime(targetDate: js.Date, millisecondsToAdd: Double, ignoreDST: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTime")(targetDate.asInstanceOf[js.Any], millisecondsToAdd.asInstanceOf[js.Any], ignoreDST.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toInvariantTime(targetDate: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toInvariantTime")(targetDate.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def toUtcTime(targetDate: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtcTime")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def today(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("today")().asInstanceOf[js.Date]
  
  inline def weekInYear(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("weekInYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def weekInYear(date: js.Date, weekStart: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekInYear")(date.asInstanceOf[js.Any], weekStart.asInstanceOf[js.Any])).asInstanceOf[Double]
}
