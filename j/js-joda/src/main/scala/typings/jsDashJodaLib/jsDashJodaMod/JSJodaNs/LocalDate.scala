package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalDate extends ChronoLocalDate {
  def atStartOfDay(): LocalDateTime = js.native
  def atStartOfDay(zone: ZoneId): ZonedDateTime = js.native
  def atStartOfDayWithZone(zone: ZoneId): ZonedDateTime = js.native
  def atTime(hour: scala.Double, minute: scala.Double): LocalDateTime = js.native
  def atTime(hour: scala.Double, minute: scala.Double, second: scala.Double): LocalDateTime = js.native
  def atTime(hour: scala.Double, minute: scala.Double, second: scala.Double, nanoOfSecond: scala.Double): LocalDateTime = js.native
  def atTime(time: LocalTime): LocalDateTime = js.native
  def chronology(): Chronology = js.native
  def compareTo(other: LocalDate): scala.Double = js.native
  def dayOfMonth(): scala.Double = js.native
  def dayOfWeek(): DayOfWeek = js.native
  def dayOfYear(): scala.Double = js.native
  def equals(otherDate: js.Any): scala.Boolean = js.native
  def getLong(field: TemporalField): scala.Double = js.native
  def isAfter(other: LocalDate): scala.Boolean = js.native
  def isBefore(other: LocalDate): scala.Boolean = js.native
  def isEqual(other: LocalDate): scala.Boolean = js.native
  def isLeapYear(): scala.Boolean = js.native
  def isoWeekOfWeekyear(): scala.Double = js.native
   //implemented in IsoFields.js
  def isoWeekyear(): scala.Double = js.native
   //implemented in IsoFields.js
  def lengthOfMonth(): scala.Double = js.native
  def lengthOfYear(): scala.Double = js.native
  def minus(amountToSubtract: scala.Double, unit: TemporalUnit): LocalDate = js.native
  def minus(amount: TemporalAmount): LocalDate = js.native
  def minusDays(daysToSubtract: scala.Double): LocalDate = js.native
  def minusMonths(monthsToSubtract: scala.Double): LocalDate = js.native
  def minusWeeks(weeksToSubtract: scala.Double): LocalDate = js.native
  def minusYears(yearsToSubtract: scala.Double): LocalDate = js.native
  def month(): Month = js.native
  def monthValue(): scala.Double = js.native
  def plus(amountToAdd: scala.Double, unit: TemporalUnit): LocalDate = js.native
  def plus(amount: TemporalAmount): LocalDate = js.native
  def plusDays(daysToAdd: scala.Double): LocalDate = js.native
  def plusMonths(monthsToAdd: scala.Double): LocalDate = js.native
  def plusWeeks(weeksToAdd: scala.Double): LocalDate = js.native
  def plusYears(yearsToAdd: scala.Double): LocalDate = js.native
  def toEpochDay(): scala.Double = js.native
  def toJSON(): java.lang.String = js.native
  def until(endDate: TemporalAccessor): Period = js.native
  def until(endExclusive: TemporalAccessor, unit: TemporalUnit): scala.Double = js.native
  def `with`(adjuster: TemporalAdjuster): LocalDate = js.native
  def `with`(fieldOrAdjuster: TemporalField, newValue: stdLib.Number): LocalDate = js.native
  def withDayOfMonth(dayOfMonth: scala.Double): LocalDate = js.native
  def withDayOfYear(dayOfYear: scala.Double): LocalDate = js.native
  def withFieldAndValue(field: TemporalField, newValue: scala.Double): LocalDate = js.native
  def withMonth(month: Month): LocalDate = js.native
  def withMonth(month: scala.Double): LocalDate = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalDate = js.native
  def withYear(year: scala.Double): LocalDate = js.native
  def year(): scala.Double = js.native
}

