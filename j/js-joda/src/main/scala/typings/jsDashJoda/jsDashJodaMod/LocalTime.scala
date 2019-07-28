package typings.jsDashJoda.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "LocalTime")
@js.native
class LocalTime protected () extends Temporal {
  def adjustInto(temporal: TemporalAdjuster): Temporal = js.native
  def atDate(date: LocalDate): LocalDateTime = js.native
  def compareTo(other: LocalTime): Double = js.native
  def equals(other: js.Any): Boolean = js.native
  def format(formatter: DateTimeFormatter): String = js.native
  def get(field: ChronoField): Double = js.native
  def getLong(field: ChronoField): Double = js.native
  def hour(): Double = js.native
  def isAfter(other: LocalTime): Boolean = js.native
  def isBefore(other: LocalTime): Boolean = js.native
  def isSupported(fieldOrUnit: ChronoField): Boolean = js.native
  def isSupported(fieldOrUnit: ChronoUnit): Boolean = js.native
  def minus(amountToSubtract: Double, unit: ChronoUnit): LocalTime = js.native
  def minus(amount: TemporalAmount): LocalTime = js.native
  def minusHours(hoursToSubtract: Double): LocalTime = js.native
  def minusMinutes(minutesToSubtract: Double): LocalTime = js.native
  def minusNanos(nanosToSubtract: Double): LocalTime = js.native
  def minusSeconds(secondsToSubtract: Double): LocalTime = js.native
  def minute(): Double = js.native
  def nano(): Double = js.native
  def plus(amountToAdd: Double, unit: TemporalUnit): LocalTime = js.native
  def plus(amount: TemporalAmount): LocalTime = js.native
  def plusHours(hoursToAdd: Double): LocalTime = js.native
  def plusMinutes(minutesToAdd: Double): LocalTime = js.native
  def plusNanos(nanosToAdd: Double): LocalTime = js.native
  def plusSeconds(secondstoAdd: Double): LocalTime = js.native
  def range(field: ChronoField): ValueRange = js.native
  def second(): Double = js.native
  def toJSON(): String = js.native
  def toNanoOfDay(): Double = js.native
  def toSecondOfDay(): Double = js.native
  def truncatedTo(unit: ChronoUnit): LocalTime = js.native
  def until(endExclusive: TemporalAccessor, unit: TemporalUnit): Double = js.native
  def `with`(adjuster: TemporalAdjuster): LocalTime = js.native
  def `with`(field: TemporalField, newValue: Double): LocalTime = js.native
  def withHour(hour: Double): LocalTime = js.native
  def withMinute(minute: Double): LocalTime = js.native
  def withNano(nanoOfSecond: Double): LocalTime = js.native
  def withSecond(second: Double): LocalTime = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalTime = js.native
}

/* static members */
@JSImport("js-joda", "LocalTime")
@js.native
object LocalTime extends js.Object {
  var HOURS_PER_DAY: Double = js.native
  var MAX: LocalTime = js.native
  var MICROS_PER_DAY: Double = js.native
  var MIDNIGHT: LocalTime = js.native
  var MILLIS_PER_DAY: Double = js.native
  var MIN: LocalTime = js.native
  var MINUTES_PER_DAY: Double = js.native
  var MINUTES_PER_HOUR: Double = js.native
  var NANOS_PER_DAY: Double = js.native
  var NANOS_PER_HOUR: Double = js.native
  var NANOS_PER_MINUTE: Double = js.native
  var NANOS_PER_SECOND: Double = js.native
  var NOON: LocalTime = js.native
  var SECONDS_PER_DAY: Double = js.native
  var SECONDS_PER_HOUR: Double = js.native
  var SECONDS_PER_MINUTE: Double = js.native
  def from(temporal: TemporalAccessor): LocalTime = js.native
  def now(): LocalTime = js.native
  def now(clockOrZone: Clock): LocalTime = js.native
  def now(clockOrZone: ZoneId): LocalTime = js.native
  def of(): LocalTime = js.native
  def of(hour: Double): LocalTime = js.native
  def of(hour: Double, minute: Double): LocalTime = js.native
  def of(hour: Double, minute: Double, second: Double): LocalTime = js.native
  def of(hour: Double, minute: Double, second: Double, nanoOfSecond: Double): LocalTime = js.native
  def ofInstant(instant: Instant): LocalTime = js.native
  def ofInstant(instant: Instant, zone: ZoneId): LocalTime = js.native
  def ofNanoOfDay(nanoOfDay: Double): LocalTime = js.native
  def ofSecondOfDay(): LocalTime = js.native
  def ofSecondOfDay(secondOfDay: Double): LocalTime = js.native
  def ofSecondOfDay(secondOfDay: Double, nanoOfSecond: Double): LocalTime = js.native
  def parse(text: String): LocalTime = js.native
  def parse(text: String, formatter: DateTimeFormatter): LocalTime = js.native
}

