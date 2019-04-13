package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "LocalDateTime")
@js.native
class LocalDateTime protected () extends ChronoLocalDateTime {
  def adjustInto(temporal: TemporalAdjuster): LocalDateTime = js.native
  def atZone(zone: ZoneId): ZonedDateTime = js.native
  def compareTo(other: LocalDateTime): scala.Double = js.native
  def dayOfMonth(): scala.Double = js.native
  def dayOfWeek(): DayOfWeek = js.native
  def dayOfYear(): scala.Double = js.native
  def equals(other: js.Any): scala.Boolean = js.native
  def format(formatter: DateTimeFormatter): java.lang.String = js.native
  def getLong(field: TemporalField): scala.Double = js.native
  def hour(): scala.Double = js.native
  def isAfter(other: LocalDateTime): scala.Boolean = js.native
  def isBefore(other: LocalDateTime): scala.Boolean = js.native
  def isEqual(other: js.Any): scala.Boolean = js.native
  def isSupported(fieldOrUnit: TemporalField): scala.Boolean = js.native
  def isSupported(fieldOrUnit: TemporalUnit): scala.Boolean = js.native
  def minus(amountToSubtract: scala.Double, unit: TemporalUnit): LocalDateTime = js.native
  def minus(amount: TemporalAmount): LocalDateTime = js.native
  def minusDays(days: scala.Double): LocalDateTime = js.native
  def minusHours(hours: scala.Double): LocalDateTime = js.native
  def minusMinutes(minutes: scala.Double): LocalDateTime = js.native
  def minusMonths(months: scala.Double): LocalDateTime = js.native
  def minusNanos(nanos: scala.Double): LocalDateTime = js.native
  def minusSeconds(seconds: scala.Double): LocalDateTime = js.native
  def minusTemporalAmount(amount: TemporalAmount): LocalDateTime = js.native
  def minusWeeks(weeks: scala.Double): LocalDateTime = js.native
  def minusYears(years: scala.Double): LocalDateTime = js.native
  def minute(): scala.Double = js.native
  def month(): Month = js.native
  def monthValue(): scala.Double = js.native
  def nano(): scala.Double = js.native
  def plus(amountToAdd: scala.Double, unit: TemporalUnit): LocalDateTime = js.native
  def plus(amount: TemporalAmount): LocalDateTime = js.native
  def plusDays(days: scala.Double): LocalDateTime = js.native
  def plusHours(hours: scala.Double): LocalDateTime = js.native
  def plusMinutes(minutes: scala.Double): LocalDateTime = js.native
  def plusMonths(months: scala.Double): LocalDateTime = js.native
  def plusNanos(nanos: scala.Double): LocalDateTime = js.native
  def plusSeconds(seconds: scala.Double): LocalDateTime = js.native
  def plusTemporalAmount(amount: TemporalAmount): LocalDateTime = js.native
  def plusWeeks(weeks: scala.Double): LocalDateTime = js.native
  def plusYears(years: scala.Double): LocalDateTime = js.native
  def second(): scala.Double = js.native
  def toJSON(): java.lang.String = js.native
  def toLocalDate(): LocalDate = js.native
  def toLocalTime(): LocalTime = js.native
  def truncatedTo(unit: TemporalUnit): LocalDateTime = js.native
  def until(endExclusive: Temporal, unit: TemporalUnit): scala.Double = js.native
  def `with`(adjuster: TemporalAdjuster): LocalDateTime = js.native
  def `with`(field: TemporalField, newValue: scala.Double): LocalDateTime = js.native
  def withDayOfMonth(dayOfMonth: scala.Double): LocalDateTime = js.native
  def withDayOfYear(dayOfYear: scala.Double): LocalDateTime = js.native
  def withHour(hour: scala.Double): LocalDateTime = js.native
  def withMinute(minute: scala.Double): LocalDateTime = js.native
  def withMonth(month: Month): LocalDateTime = js.native
  def withMonth(month: scala.Double): LocalDateTime = js.native
  def withNano(nanoOfSecond: scala.Double): LocalDateTime = js.native
  def withSecond(second: scala.Double): LocalDateTime = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalDateTime = js.native
  def withYear(year: scala.Double): LocalDateTime = js.native
  def year(): scala.Double = js.native
}

/* static members */
@JSImport("js-joda", "LocalDateTime")
@js.native
object LocalDateTime extends js.Object {
  var MAX: jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  var MIN: jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.Clock): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.ZoneId): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def of(date: jsDashJodaLib.jsDashJodaMod.LocalDate, time: jsDashJodaLib.jsDashJodaMod.LocalTime): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def of(
    year: js.UndefOr[scala.Double],
    month: js.UndefOr[scala.Double | jsDashJodaLib.jsDashJodaMod.Month],
    dayOfMonth: js.UndefOr[scala.Double],
    hour: js.UndefOr[scala.Double],
    minute: js.UndefOr[scala.Double],
    second: js.UndefOr[scala.Double],
    nanoSecond: js.UndefOr[scala.Double]
  ): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def ofEpochSecond(
    epochSecond: scala.Double,
    nanoOfSecond: scala.Double,
    offset: jsDashJodaLib.jsDashJodaMod.ZoneOffset
  ): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def ofEpochSecond(epochSecond: scala.Double, offset: jsDashJodaLib.jsDashJodaMod.ZoneOffset): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def ofInstant(instant: jsDashJodaLib.jsDashJodaMod.Instant): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def ofInstant(instant: jsDashJodaLib.jsDashJodaMod.Instant, zoneId: jsDashJodaLib.jsDashJodaMod.ZoneId): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.LocalDateTime = js.native
}

