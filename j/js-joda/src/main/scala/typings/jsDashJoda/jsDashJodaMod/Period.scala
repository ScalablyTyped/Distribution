package typings.jsDashJoda.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Period")
@js.native
class Period protected () extends TemporalAmount {
  def chronology(): IsoChronology = js.native
  def days(): Double = js.native
  def equals(obj: js.Any): Boolean = js.native
  def isNegative(): Boolean = js.native
  def isZero(): Boolean = js.native
  def minus(amountToSubtract: TemporalAmount): Period = js.native
  def minusDays(daysToSubtract: Double): Period = js.native
  def minusMonths(monthsToSubtract: Double): Period = js.native
  def minusYears(yearsToSubtract: Double): Period = js.native
  def months(): Double = js.native
  def multipliedBy(scalar: Double): Period = js.native
  def negated(): Period = js.native
  def normalized(): Period = js.native
  def plus(amountToAdd: TemporalAmount): Period = js.native
  def plusDays(daysToAdd: Double): Period = js.native
  def plusMonths(monthsToAdd: Double): Period = js.native
  def plusYears(yearsToAdd: Double): Period = js.native
  def toJSON(): String = js.native
  def toTotalMonths(): Double = js.native
  def withDays(days: Double): Period = js.native
  def withMonths(months: Double): Period = js.native
  def withYears(years: Double): Period = js.native
  def years(): Double = js.native
}

/* static members */
@JSImport("js-joda", "Period")
@js.native
object Period extends js.Object {
  var ZERO: Period = js.native
  def between(startDate: LocalDate, endDate: LocalDate): Period = js.native
  def create(years: Double, months: Double, days: Double): Duration = js.native
  def from(amount: TemporalAmount): Period = js.native
  def of(years: Double, months: Double, days: Double): Period = js.native
  def ofDays(days: Double): Period = js.native
  def ofMonths(months: Double): Period = js.native
  def ofWeeks(weeks: Double): Period = js.native
  def ofYears(years: Double): Period = js.native
  def parse(text: String): Period = js.native
}

