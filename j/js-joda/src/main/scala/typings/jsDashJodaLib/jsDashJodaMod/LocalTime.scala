package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "LocalTime")
@js.native
class LocalTime protected () extends Temporal {
  def adjustInto(temporal: TemporalAdjuster): Temporal = js.native
  def atDate(date: LocalDate): LocalDateTime = js.native
  def compareTo(other: LocalTime): scala.Double = js.native
  def equals(other: js.Any): scala.Boolean = js.native
  def format(formatter: DateTimeFormatter): java.lang.String = js.native
  def get(field: ChronoField): scala.Double = js.native
  def getLong(field: ChronoField): scala.Double = js.native
  def hour(): scala.Double = js.native
  def isAfter(other: LocalTime): scala.Boolean = js.native
  def isBefore(other: LocalTime): scala.Boolean = js.native
  def isSupported(fieldOrUnit: ChronoField): scala.Boolean = js.native
  def isSupported(fieldOrUnit: ChronoUnit): scala.Boolean = js.native
  def minus(amountToSubtract: scala.Double, unit: ChronoUnit): LocalTime = js.native
  def minus(amount: TemporalAmount): LocalTime = js.native
  def minusHours(hoursToSubtract: scala.Double): LocalTime = js.native
  def minusMinutes(minutesToSubtract: scala.Double): LocalTime = js.native
  def minusNanos(nanosToSubtract: scala.Double): LocalTime = js.native
  def minusSeconds(secondsToSubtract: scala.Double): LocalTime = js.native
  def minute(): scala.Double = js.native
  def nano(): scala.Double = js.native
  def plus(amountToAdd: scala.Double, unit: TemporalUnit): LocalTime = js.native
  def plus(amount: TemporalAmount): LocalTime = js.native
  def plusHours(hoursToAdd: scala.Double): LocalTime = js.native
  def plusMinutes(minutesToAdd: scala.Double): LocalTime = js.native
  def plusNanos(nanosToAdd: scala.Double): LocalTime = js.native
  def plusSeconds(secondstoAdd: scala.Double): LocalTime = js.native
  def range(field: ChronoField): ValueRange = js.native
  def second(): scala.Double = js.native
  def toJSON(): java.lang.String = js.native
  def toNanoOfDay(): scala.Double = js.native
  def toSecondOfDay(): scala.Double = js.native
  def truncatedTo(unit: ChronoUnit): LocalTime = js.native
  def until(endExclusive: TemporalAccessor, unit: TemporalUnit): scala.Double = js.native
  def `with`(adjuster: TemporalAdjuster): LocalTime = js.native
  def `with`(field: TemporalField, newValue: scala.Double): LocalTime = js.native
  def withHour(hour: scala.Double): LocalTime = js.native
  def withMinute(minute: scala.Double): LocalTime = js.native
  def withNano(nanoOfSecond: scala.Double): LocalTime = js.native
  def withSecond(second: scala.Double): LocalTime = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalTime = js.native
}

/* static members */
@JSImport("js-joda", "LocalTime")
@js.native
object LocalTime extends js.Object {
  var HOURS_PER_DAY: scala.Double = js.native
  var MAX: jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  var MICROS_PER_DAY: scala.Double = js.native
  var MIDNIGHT: jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  var MILLIS_PER_DAY: scala.Double = js.native
  var MIN: jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  var MINUTES_PER_DAY: scala.Double = js.native
  var MINUTES_PER_HOUR: scala.Double = js.native
  var NANOS_PER_DAY: scala.Double = js.native
  var NANOS_PER_HOUR: scala.Double = js.native
  var NANOS_PER_MINUTE: scala.Double = js.native
  var NANOS_PER_SECOND: scala.Double = js.native
  var NOON: jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  var SECONDS_PER_DAY: scala.Double = js.native
  var SECONDS_PER_HOUR: scala.Double = js.native
  var SECONDS_PER_MINUTE: scala.Double = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.Clock): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def now(clockOrZone: jsDashJodaLib.jsDashJodaMod.ZoneId): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def of(): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def of(hour: scala.Double): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def of(hour: scala.Double, minute: scala.Double): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def of(hour: scala.Double, minute: scala.Double, second: scala.Double): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def of(hour: scala.Double, minute: scala.Double, second: scala.Double, nanoOfSecond: scala.Double): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def ofInstant(instant: jsDashJodaLib.jsDashJodaMod.Instant): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def ofInstant(instant: jsDashJodaLib.jsDashJodaMod.Instant, zone: jsDashJodaLib.jsDashJodaMod.ZoneId): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def ofNanoOfDay(nanoOfDay: scala.Double): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def ofSecondOfDay(): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def ofSecondOfDay(secondOfDay: scala.Double): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def ofSecondOfDay(secondOfDay: scala.Double, nanoOfSecond: scala.Double): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.LocalTime = js.native
}

