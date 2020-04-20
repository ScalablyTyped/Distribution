package typings.materialUi.MaterialUI.propTypes

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait utils extends js.Object {
  def addDays(date: Date, days: Double): Date
  def addMonths(date: Date, months: Double): Date
  def addYears(date: Date, years: Double): Date
  def getFirstDayOfMonth(date: Date): Date
  def getWeekArray(date: Date, firstDayOfWeek: Double): js.Array[js.Array[Date | Null]]
  def getYear(date: Date): Double
  def monthDiff(date1: Date, date2: Date): Double
  def setYear(date: Date, year: Double): Date
}

object utils {
  @scala.inline
  def apply(
    addDays: (Date, Double) => Date,
    addMonths: (Date, Double) => Date,
    addYears: (Date, Double) => Date,
    getFirstDayOfMonth: Date => Date,
    getWeekArray: (Date, Double) => js.Array[js.Array[Date | Null]],
    getYear: Date => Double,
    monthDiff: (Date, Date) => Double,
    setYear: (Date, Double) => Date
  ): utils = {
    val __obj = js.Dynamic.literal(addDays = js.Any.fromFunction2(addDays), addMonths = js.Any.fromFunction2(addMonths), addYears = js.Any.fromFunction2(addYears), getFirstDayOfMonth = js.Any.fromFunction1(getFirstDayOfMonth), getWeekArray = js.Any.fromFunction2(getWeekArray), getYear = js.Any.fromFunction1(getYear), monthDiff = js.Any.fromFunction2(monthDiff), setYear = js.Any.fromFunction2(setYear))
    __obj.asInstanceOf[utils]
  }
}

