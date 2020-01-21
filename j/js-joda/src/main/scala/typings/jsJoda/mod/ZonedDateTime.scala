package typings.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZonedDateTime")
@js.native
class ZonedDateTime protected () extends ChronoZonedDateTime {
  def dayOfMonth(): Double = js.native
  def dayOfWeek(): DayOfWeek = js.native
  def dayOfYear(): Double = js.native
  def getLong(field: TemporalField): Double = js.native
  def hour(): Double = js.native
  def isSupported(fieldOrUnit: TemporalField): Boolean = js.native
  def isSupported(fieldOrUnit: TemporalUnit): Boolean = js.native
  def minus(): js.Any = js.native
  def minus(amountToSubtract: Double, unit: TemporalUnit): ZonedDateTime = js.native
  def minusDays(days: Double): ZonedDateTime = js.native
  def minusHours(hours: Double): ZonedDateTime = js.native
  def minusMinutes(minutes: Double): ZonedDateTime = js.native
  def minusMonths(months: Double): ZonedDateTime = js.native
  def minusNanos(nanos: Double): ZonedDateTime = js.native
  def minusSeconds(seconds: Double): ZonedDateTime = js.native
  def minusTemporalAmount(amount: TemporalAmount): ZonedDateTime = js.native
  def minusWeeks(weeks: Double): ZonedDateTime = js.native
  def minusYears(years: Double): ZonedDateTime = js.native
  def minute(): Double = js.native
  def month(): Month = js.native
  def monthValue(): Double = js.native
  def nano(): Double = js.native
  def offset(): js.Any = js.native
  def plus(): js.Any = js.native
  def plus(amountToAdd: Double, unit: TemporalUnit): ZonedDateTime = js.native
  def plusDays(days: Double): js.Any = js.native
  def plusHours(hours: Double): ZonedDateTime = js.native
  def plusMinutes(minutes: Double): ZonedDateTime = js.native
  def plusMonths(months: Double): ZonedDateTime = js.native
  def plusNanos(nanos: Double): ZonedDateTime = js.native
  def plusSeconds(seconds: Double): ZonedDateTime = js.native
  def plusTemporalAmount(amount: TemporalAmount): ZonedDateTime = js.native
  def plusWeeks(weeks: Double): js.Any = js.native
  def plusYears(years: Double): ZonedDateTime = js.native
  def second(): Double = js.native
  def toJSON(): String = js.native
  def toLocalDate(): LocalDate = js.native
  def toLocalDateTime(): LocalDateTime = js.native
  def toLocalTime(): LocalTime = js.native
  def truncatedTo(unit: TemporalUnit): ZonedDateTime = js.native
  def until(endExclusive: Temporal, unit: TemporalUnit): Double = js.native
  def `with`(): js.Any = js.native
  def `with`(field: TemporalField, newValue: Double): ZonedDateTime = js.native
  def withDayOfMonth(dayOfMonth: Double): ZonedDateTime = js.native
  def withDayOfYear(dayOfYear: Double): ZonedDateTime = js.native
  def withFixedOffsetZone(): ZonedDateTime = js.native
  def withHour(hour: Double): ZonedDateTime = js.native
  def withMinute(minute: Double): ZonedDateTime = js.native
  def withMonth(month: Double): ZonedDateTime = js.native
  def withNano(nanoOfSecond: Double): ZonedDateTime = js.native
  def withSecond(second: Double): ZonedDateTime = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): ZonedDateTime = js.native
  def withYear(year: Double): ZonedDateTime = js.native
  def withZoneSameInstant(zone: ZoneId): ZonedDateTime = js.native
  def withZoneSameLocal(zone: ZoneId): ZonedDateTime = js.native
  def year(): Double = js.native
  def zone(): ZoneId = js.native
}

/* static members */
@JSImport("js-joda", "ZonedDateTime")
@js.native
object ZonedDateTime extends js.Object {
  def from(temporal: TemporalAccessor): ZonedDateTime = js.native
  def now(): ZonedDateTime = js.native
  def now(clockOrZone: Clock): ZonedDateTime = js.native
  def now(clockOrZone: ZoneId): ZonedDateTime = js.native
  def of(): js.Any = js.native
  def of(date: LocalDate, time: LocalTime, zone: ZoneId): ZonedDateTime = js.native
  def of(localDateTime: LocalDateTime, zone: ZoneId): ZonedDateTime = js.native
  def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoOfSecond: Double,
    zone: ZoneId
  ): ZonedDateTime = js.native
  def ofInstant(): ZonedDateTime = js.native
  def ofInstant(instant: Instant, zone: ZoneId): ZonedDateTime = js.native
  def ofInstant(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = js.native
  def ofLocal(localDateTime: LocalDateTime, zone: ZoneId): ZonedDateTime = js.native
  def ofLocal(localDateTime: LocalDateTime, zone: ZoneId, preferredOffset: ZoneOffset): ZonedDateTime = js.native
  def ofStrict(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = js.native
  def parse(text: String): ZonedDateTime = js.native
  def parse(text: String, formatter: DateTimeFormatter): ZonedDateTime = js.native
}

