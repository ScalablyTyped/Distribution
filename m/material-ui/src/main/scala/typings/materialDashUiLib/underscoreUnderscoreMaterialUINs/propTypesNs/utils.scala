package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait utils extends js.Object {
  def addDays(date: stdLib.Date, days: scala.Double): stdLib.Date
  def addMonths(date: stdLib.Date, months: scala.Double): stdLib.Date
  def addYears(date: stdLib.Date, years: scala.Double): stdLib.Date
  def getFirstDayOfMonth(date: stdLib.Date): stdLib.Date
  def getWeekArray(date: stdLib.Date, firstDayOfWeek: scala.Double): js.Array[js.Array[stdLib.Date | scala.Null]]
  def getYear(date: stdLib.Date): scala.Double
  def monthDiff(date1: stdLib.Date, date2: stdLib.Date): scala.Double
  def setYear(date: stdLib.Date, year: scala.Double): stdLib.Date
}

object utils {
  @scala.inline
  def apply(
    addDays: (stdLib.Date, scala.Double) => stdLib.Date,
    addMonths: (stdLib.Date, scala.Double) => stdLib.Date,
    addYears: (stdLib.Date, scala.Double) => stdLib.Date,
    getFirstDayOfMonth: stdLib.Date => stdLib.Date,
    getWeekArray: (stdLib.Date, scala.Double) => js.Array[js.Array[stdLib.Date | scala.Null]],
    getYear: stdLib.Date => scala.Double,
    monthDiff: (stdLib.Date, stdLib.Date) => scala.Double,
    setYear: (stdLib.Date, scala.Double) => stdLib.Date
  ): utils = {
    val __obj = js.Dynamic.literal(addDays = js.Any.fromFunction2(addDays), addMonths = js.Any.fromFunction2(addMonths), addYears = js.Any.fromFunction2(addYears), getFirstDayOfMonth = js.Any.fromFunction1(getFirstDayOfMonth), getWeekArray = js.Any.fromFunction2(getWeekArray), getYear = js.Any.fromFunction1(getYear), monthDiff = js.Any.fromFunction2(monthDiff), setYear = js.Any.fromFunction2(setYear))
  
    __obj.asInstanceOf[utils]
  }
}

