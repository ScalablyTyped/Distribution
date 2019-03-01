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
    addDays: js.Function2[stdLib.Date, scala.Double, stdLib.Date],
    addMonths: js.Function2[stdLib.Date, scala.Double, stdLib.Date],
    addYears: js.Function2[stdLib.Date, scala.Double, stdLib.Date],
    getFirstDayOfMonth: js.Function1[stdLib.Date, stdLib.Date],
    getWeekArray: js.Function2[stdLib.Date, scala.Double, js.Array[js.Array[stdLib.Date | scala.Null]]],
    getYear: js.Function1[stdLib.Date, scala.Double],
    monthDiff: js.Function2[stdLib.Date, stdLib.Date, scala.Double],
    setYear: js.Function2[stdLib.Date, scala.Double, stdLib.Date]
  ): utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDays")(addDays)
    __obj.updateDynamic("addMonths")(addMonths)
    __obj.updateDynamic("addYears")(addYears)
    __obj.updateDynamic("getFirstDayOfMonth")(getFirstDayOfMonth)
    __obj.updateDynamic("getWeekArray")(getWeekArray)
    __obj.updateDynamic("getYear")(getYear)
    __obj.updateDynamic("monthDiff")(monthDiff)
    __obj.updateDynamic("setYear")(setYear)
    __obj.asInstanceOf[utils]
  }
}

