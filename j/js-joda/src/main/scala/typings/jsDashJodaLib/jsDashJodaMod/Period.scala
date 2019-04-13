package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Period")
@js.native
class Period protected () extends TemporalAmount {
  def chronology(): IsoChronology = js.native
  def days(): scala.Double = js.native
  def equals(obj: js.Any): scala.Boolean = js.native
  def isNegative(): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def minus(amountToSubtract: TemporalAmount): Period = js.native
  def minusDays(daysToSubtract: scala.Double): Period = js.native
  def minusMonths(monthsToSubtract: scala.Double): Period = js.native
  def minusYears(yearsToSubtract: scala.Double): Period = js.native
  def months(): scala.Double = js.native
  def multipliedBy(scalar: scala.Double): Period = js.native
  def negated(): Period = js.native
  def normalized(): Period = js.native
  def plus(amountToAdd: TemporalAmount): Period = js.native
  def plusDays(daysToAdd: scala.Double): Period = js.native
  def plusMonths(monthsToAdd: scala.Double): Period = js.native
  def plusYears(yearsToAdd: scala.Double): Period = js.native
  def toJSON(): java.lang.String = js.native
  def toTotalMonths(): scala.Double = js.native
  def withDays(days: scala.Double): Period = js.native
  def withMonths(months: scala.Double): Period = js.native
  def withYears(years: scala.Double): Period = js.native
  def years(): scala.Double = js.native
}

/* static members */
@JSImport("js-joda", "Period")
@js.native
object Period extends js.Object {
  var ZERO: jsDashJodaLib.jsDashJodaMod.Period = js.native
  def between(startDate: jsDashJodaLib.jsDashJodaMod.LocalDate, endDate: jsDashJodaLib.jsDashJodaMod.LocalDate): jsDashJodaLib.jsDashJodaMod.Period = js.native
  def create(years: scala.Double, months: scala.Double, days: scala.Double): jsDashJodaLib.jsDashJodaMod.Duration = js.native
  def from(amount: jsDashJodaLib.jsDashJodaMod.TemporalAmount): jsDashJodaLib.jsDashJodaMod.Period = js.native
  def of(years: scala.Double, months: scala.Double, days: scala.Double): jsDashJodaLib.jsDashJodaMod.Period = js.native
  def ofDays(days: scala.Double): jsDashJodaLib.jsDashJodaMod.Period = js.native
  def ofMonths(months: scala.Double): jsDashJodaLib.jsDashJodaMod.Period = js.native
  def ofWeeks(weeks: scala.Double): jsDashJodaLib.jsDashJodaMod.Period = js.native
  def ofYears(years: scala.Double): jsDashJodaLib.jsDashJodaMod.Period = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.Period = js.native
}

