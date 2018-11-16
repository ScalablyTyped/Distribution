package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.date")
@js.native
object dateNs extends js.Object {
  def addDays(targetDate: stdLib.Date, numberOfDaysToAdd: scala.Double): stdLib.Date = js.native
  def dayOfWeek(targetDate: stdLib.Date, dayOfWeek: scala.Double, direction: scala.Double): stdLib.Date = js.native
  def firstDayOfMonth(targetDate: stdLib.Date): stdLib.Date = js.native
  def getDate(date: stdLib.Date): stdLib.Date = js.native
  def getMilliseconds(targetDate: stdLib.Date): stdLib.Date = js.native
  def isInDateRange(targetDate: stdLib.Date, lowerLimitDate: stdLib.Date, upperLimitDate: stdLib.Date): scala.Boolean = js.native
  def isInTimeRange(targetDate: stdLib.Date, lowerLimitDate: stdLib.Date, upperLimitDate: stdLib.Date): scala.Boolean = js.native
  def isToday(targetDate: stdLib.Date): scala.Boolean = js.native
  def lastDayOfMonth(targetDate: stdLib.Date): stdLib.Date = js.native
  def nextDay(targetDate: stdLib.Date): stdLib.Date = js.native
  def previousDay(targetDate: stdLib.Date): stdLib.Date = js.native
  def setDayOfWeek(targetDate: stdLib.Date, dayOfWeek: scala.Double, direction: scala.Double): scala.Unit = js.native
  def setHours(targetDate: stdLib.Date, sourceDate: scala.Double): stdLib.Date = js.native
  def setTime(targetDate: stdLib.Date, millisecondsToAdd: scala.Double, ignoreDST: scala.Boolean): scala.Unit = js.native
  def toInvariantTime(targetDate: stdLib.Date): stdLib.Date = js.native
  def toUtcTime(targetDate: stdLib.Date): scala.Double = js.native
  def today(): stdLib.Date = js.native
  def weekInYear(date: stdLib.Date): scala.Double = js.native
  def weekInYear(date: stdLib.Date, weekStart: scala.Double): scala.Double = js.native
}

