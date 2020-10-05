package typings.materialUi.MaterialUI.propTypes

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait utils extends js.Object {
  def addDays(date: Date, days: Double): Date = js.native
  def addMonths(date: Date, months: Double): Date = js.native
  def addYears(date: Date, years: Double): Date = js.native
  def getFirstDayOfMonth(date: Date): Date = js.native
  def getWeekArray(date: Date, firstDayOfWeek: Double): js.Array[js.Array[Date | Null]] = js.native
  def getYear(date: Date): Double = js.native
  def monthDiff(date1: Date, date2: Date): Double = js.native
  def setYear(date: Date, year: Double): Date = js.native
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
  @scala.inline
  implicit class utilsOps[Self <: utils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddDays(value: (Date, Double) => Date): Self = this.set("addDays", js.Any.fromFunction2(value))
    @scala.inline
    def setAddMonths(value: (Date, Double) => Date): Self = this.set("addMonths", js.Any.fromFunction2(value))
    @scala.inline
    def setAddYears(value: (Date, Double) => Date): Self = this.set("addYears", js.Any.fromFunction2(value))
    @scala.inline
    def setGetFirstDayOfMonth(value: Date => Date): Self = this.set("getFirstDayOfMonth", js.Any.fromFunction1(value))
    @scala.inline
    def setGetWeekArray(value: (Date, Double) => js.Array[js.Array[Date | Null]]): Self = this.set("getWeekArray", js.Any.fromFunction2(value))
    @scala.inline
    def setGetYear(value: Date => Double): Self = this.set("getYear", js.Any.fromFunction1(value))
    @scala.inline
    def setMonthDiff(value: (Date, Date) => Double): Self = this.set("monthDiff", js.Any.fromFunction2(value))
    @scala.inline
    def setSetYear(value: (Date, Double) => Date): Self = this.set("setYear", js.Any.fromFunction2(value))
  }
  
}

