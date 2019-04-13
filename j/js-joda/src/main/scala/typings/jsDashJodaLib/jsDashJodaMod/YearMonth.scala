package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "YearMonth")
@js.native
class YearMonth protected () extends Temporal {
  def atDay(dayOfMonth: scala.Double): LocalDate = js.native
  def atEndOfMonth(): LocalDate = js.native
  def compareTo(other: YearMonth): scala.Double = js.native
  def equals(other: YearMonth): scala.Boolean = js.native
  def format(formatter: DateTimeFormatter): java.lang.String = js.native
  def isAfter(other: YearMonth): scala.Boolean = js.native
  def isBefore(other: YearMonth): scala.Boolean = js.native
  def isLeapYear(): scala.Boolean = js.native
  def isSupported(fieldOrUnit: ChronoUnit): scala.Boolean = js.native
  def isSupported(fieldOrUnit: TemporalField): scala.Boolean = js.native
  def isValidDay(): scala.Boolean = js.native
  def lengthOfMonth(): scala.Double = js.native
  def lengthOfYear(): scala.Double = js.native
  def minus(amountToSubtract: scala.Double, unit: TemporalUnit): YearMonth = js.native
  def minus(amount: TemporalAmount): YearMonth = js.native
  def minusMonths(monthsToSubtract: scala.Double): YearMonth = js.native
  def minusYears(yearsToSubtract: scala.Double): YearMonth = js.native
  def month(): Month = js.native
  def monthValue(): scala.Double = js.native
  def plus(amountToAdd: scala.Double, unit: TemporalUnit): YearMonth = js.native
  def plus(amount: TemporalAmount): YearMonth = js.native
  def plusMonths(monthsToAdd: scala.Double): YearMonth = js.native
  def plusYears(yearsToAdd: scala.Double): YearMonth = js.native
  def toJSON(): java.lang.String = js.native
  def `with`(adjuster: TemporalAdjuster): YearMonth = js.native
  def `with`(field: TemporalField, value: scala.Double): YearMonth = js.native
  def withMonth(month: scala.Double): YearMonth = js.native
  def withYear(year: scala.Double): YearMonth = js.native
  def withYearMonth(newYear: scala.Double, newMonth: scala.Double): YearMonth = js.native
  def year(): scala.Double = js.native
}

/* static members */
@JSImport("js-joda", "YearMonth")
@js.native
object YearMonth extends js.Object {
  def from(temporal: jsDashJodaLib.jsDashJodaMod.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.YearMonth = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.YearMonth = js.native
  def now(zoneIdOrClock: jsDashJodaLib.jsDashJodaMod.Clock): jsDashJodaLib.jsDashJodaMod.YearMonth = js.native
  def now(zoneIdOrClock: jsDashJodaLib.jsDashJodaMod.ZoneId): jsDashJodaLib.jsDashJodaMod.YearMonth = js.native
  def of(year: scala.Double, monthOrNumber: jsDashJodaLib.jsDashJodaMod.Month): jsDashJodaLib.jsDashJodaMod.YearMonth = js.native
  def of(year: scala.Double, monthOrNumber: scala.Double): jsDashJodaLib.jsDashJodaMod.YearMonth = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.YearMonth = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.YearMonth = js.native
}

