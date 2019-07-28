package typings.jsDashJoda.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Instant")
@js.native
class Instant protected () extends Temporal {
  def adjustInto(temporal: Temporal): Temporal = js.native
  def atZone(zone: ZoneId): ZonedDateTime = js.native
  def compareTo(otherInstant: Instant): Double = js.native
  def epochSecond(): Double = js.native
  def equals(otherInstant: js.Any): Boolean = js.native
  def getLong(field: TemporalField): Double = js.native
  def isAfter(otherInstant: Instant): Boolean = js.native
  def isBefore(otherInstant: Instant): Boolean = js.native
  def isSupported(fieldOrUnit: TemporalField): Boolean = js.native
  def isSupported(fieldOrUnit: TemporalUnit): Boolean = js.native
  def minus(amountToSubtract: Double, unit: TemporalUnit): Instant = js.native
  def minus(amount: TemporalAmount): Instant = js.native
  def minusMillis(millisToSubtract: Double): Instant = js.native
  def minusNanos(nanosToSubtract: Double): Instant = js.native
  def minusSeconds(secondsToSubtract: Double): Instant = js.native
  def nano(): Double = js.native
  def plus(amountToAdd: Double, unit: TemporalUnit): Instant = js.native
  def plus(amount: TemporalAmount): Instant = js.native
  def plusMillis(millisToAdd: Double): Instant = js.native
  def plusNanos(nanosToAdd: Double): Instant = js.native
  def plusSeconds(secondsToAdd: Double): Instant = js.native
  def toEpochMilli(): Double = js.native
  def toJSON(): String = js.native
  def truncatedTo(unit: TemporalUnit): Instant = js.native
  def until(endExclusive: Temporal, unit: TemporalUnit): Double = js.native
  def `with`(adjuster: TemporalAdjuster): Instant = js.native
  def `with`(field: TemporalField, newValue: Double): Instant = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): Instant = js.native
}

/* static members */
@JSImport("js-joda", "Instant")
@js.native
object Instant extends js.Object {
  var EPOCH: Instant = js.native
  var MAX: Instant = js.native
  var MAX_SECONDS: Instant = js.native
  var MIN: Instant = js.native
  var MIN_SECONDS: Instant = js.native
  def from(temporal: TemporalAccessor): Instant = js.native
  def now(): Instant = js.native
  def now(clock: Clock): Instant = js.native
  def ofEpochMilli(epochMilli: Double): Instant = js.native
  def ofEpochSecond(epochSecond: Double): Instant = js.native
  def ofEpochSecond(epochSecond: Double, nanoAdjustment: Double): Instant = js.native
  def parse(text: String): Instant = js.native
}

