package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalTime extends TemporalAccessor {
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

