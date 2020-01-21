package typings.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "YearMonth")
@js.native
class YearMonth protected () extends TemporalAccessor {
  def atDay(dayOfMonth: Double): LocalDate = js.native
  def atEndOfMonth(): LocalDate = js.native
  def compareTo(other: YearMonth): Double = js.native
  def equals(other: YearMonth): Boolean = js.native
  def format(formatter: DateTimeFormatter): String = js.native
  def isAfter(other: YearMonth): Boolean = js.native
  def isBefore(other: YearMonth): Boolean = js.native
  def isLeapYear(): Boolean = js.native
  def isSupported(fieldOrUnit: ChronoUnit): Boolean = js.native
  def isSupported(fieldOrUnit: TemporalField): Boolean = js.native
  def isValidDay(): Boolean = js.native
  def lengthOfMonth(): Double = js.native
  def lengthOfYear(): Double = js.native
  def minus(amountToSubtract: Double, unit: TemporalUnit): YearMonth = js.native
  def minus(amount: TemporalAmount): YearMonth = js.native
  def minusMonths(monthsToSubtract: Double): YearMonth = js.native
  def minusYears(yearsToSubtract: Double): YearMonth = js.native
  def month(): Month = js.native
  def monthValue(): Double = js.native
  def plus(amountToAdd: Double, unit: TemporalUnit): YearMonth = js.native
  def plus(amount: TemporalAmount): YearMonth = js.native
  def plusMonths(monthsToAdd: Double): YearMonth = js.native
  def plusYears(yearsToAdd: Double): YearMonth = js.native
  def toJSON(): String = js.native
  def `with`(adjuster: TemporalAdjuster): YearMonth = js.native
  def `with`(field: TemporalField, value: Double): YearMonth = js.native
  def withMonth(month: Double): YearMonth = js.native
  def withYear(year: Double): YearMonth = js.native
  def withYearMonth(newYear: Double, newMonth: Double): YearMonth = js.native
  def year(): Double = js.native
}

/* static members */
@JSImport("js-joda", "YearMonth")
@js.native
object YearMonth extends js.Object {
  def from(temporal: TemporalAccessor): YearMonth = js.native
  def now(): YearMonth = js.native
  def now(zoneIdOrClock: Clock): YearMonth = js.native
  def now(zoneIdOrClock: ZoneId): YearMonth = js.native
  def of(year: Double, monthOrNumber: Double): YearMonth = js.native
  def of(year: Double, monthOrNumber: Month): YearMonth = js.native
  def parse(text: String): YearMonth = js.native
  def parse(text: String, formatter: DateTimeFormatter): YearMonth = js.native
}

