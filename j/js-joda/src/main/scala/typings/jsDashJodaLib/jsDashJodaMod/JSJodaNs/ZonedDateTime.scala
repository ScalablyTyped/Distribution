package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZonedDateTime extends ChronoZonedDateTime {
  def dayOfMonth(): scala.Double = js.native
  def dayOfWeek(): DayOfWeek = js.native
  def dayOfYear(): scala.Double = js.native
  def getLong(field: TemporalField): scala.Double = js.native
  def hour(): scala.Double = js.native
  def isSupported(fieldOrUnit: TemporalField): scala.Boolean = js.native
  def isSupported(fieldOrUnit: TemporalUnit): scala.Boolean = js.native
  def minus(): js.Any = js.native
  def minus(amountToSubtract: scala.Double, unit: TemporalUnit): ZonedDateTime = js.native
  def minusDays(days: scala.Double): ZonedDateTime = js.native
  def minusHours(hours: scala.Double): ZonedDateTime = js.native
  def minusMinutes(minutes: scala.Double): ZonedDateTime = js.native
  def minusMonths(months: scala.Double): ZonedDateTime = js.native
  def minusNanos(nanos: scala.Double): ZonedDateTime = js.native
  def minusSeconds(seconds: scala.Double): ZonedDateTime = js.native
  def minusTemporalAmount(amount: TemporalAmount): ZonedDateTime = js.native
  def minusWeeks(weeks: scala.Double): ZonedDateTime = js.native
  def minusYears(years: scala.Double): ZonedDateTime = js.native
  def minute(): scala.Double = js.native
  def month(): Month = js.native
  def monthValue(): scala.Double = js.native
  def nano(): scala.Double = js.native
  def offset(): js.Any = js.native
  def plus(): js.Any = js.native
  def plus(amountToAdd: scala.Double, unit: TemporalUnit): ZonedDateTime = js.native
  def plusDays(days: scala.Double): js.Any = js.native
  def plusHours(hours: scala.Double): ZonedDateTime = js.native
  def plusMinutes(minutes: scala.Double): ZonedDateTime = js.native
  def plusMonths(months: scala.Double): ZonedDateTime = js.native
  def plusNanos(nanos: scala.Double): ZonedDateTime = js.native
  def plusSeconds(seconds: scala.Double): ZonedDateTime = js.native
  def plusTemporalAmount(amount: TemporalAmount): ZonedDateTime = js.native
  def plusWeeks(weeks: scala.Double): js.Any = js.native
  def plusYears(years: scala.Double): ZonedDateTime = js.native
  def second(): scala.Double = js.native
  def toJSON(): java.lang.String = js.native
  def toLocalDate(): LocalDate = js.native
  def toLocalDateTime(): LocalDateTime = js.native
  def toLocalTime(): LocalTime = js.native
  def truncatedTo(unit: TemporalUnit): ZonedDateTime = js.native
  def until(endExclusive: Temporal, unit: TemporalUnit): scala.Double = js.native
  def `with`(): js.Any = js.native
  def `with`(field: TemporalField, newValue: scala.Double): ZonedDateTime = js.native
  def withDayOfMonth(dayOfMonth: scala.Double): ZonedDateTime = js.native
  def withDayOfYear(dayOfYear: scala.Double): ZonedDateTime = js.native
  def withFixedOffsetZone(): ZonedDateTime = js.native
  def withHour(hour: scala.Double): ZonedDateTime = js.native
  def withMinute(minute: scala.Double): ZonedDateTime = js.native
  def withMonth(month: scala.Double): ZonedDateTime = js.native
  def withNano(nanoOfSecond: scala.Double): ZonedDateTime = js.native
  def withSecond(second: scala.Double): ZonedDateTime = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): ZonedDateTime = js.native
  def withYear(year: scala.Double): ZonedDateTime = js.native
  def withZoneSameInstant(zone: ZoneId): ZonedDateTime = js.native
  def withZoneSameLocal(zone: ZoneId): ZonedDateTime = js.native
  def year(): scala.Double = js.native
  def zone(): ZoneId = js.native
}

