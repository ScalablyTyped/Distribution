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

