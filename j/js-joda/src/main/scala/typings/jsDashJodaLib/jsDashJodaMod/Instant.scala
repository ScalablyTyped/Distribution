package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Instant")
@js.native
class Instant protected () extends Temporal {
  def adjustInto(temporal: Temporal): Temporal = js.native
  def atZone(zone: ZoneId): ZonedDateTime = js.native
  def compareTo(otherInstant: Instant): scala.Double = js.native
  def epochSecond(): scala.Double = js.native
  def equals(otherInstant: js.Any): scala.Boolean = js.native
  def getLong(field: TemporalField): scala.Double = js.native
  def isAfter(otherInstant: Instant): scala.Boolean = js.native
  def isBefore(otherInstant: Instant): scala.Boolean = js.native
  def isSupported(fieldOrUnit: TemporalField): scala.Boolean = js.native
  def isSupported(fieldOrUnit: TemporalUnit): scala.Boolean = js.native
  def minus(amountToSubtract: scala.Double, unit: TemporalUnit): Instant = js.native
  def minus(amount: TemporalAmount): Instant = js.native
  def minusMillis(millisToSubtract: scala.Double): Instant = js.native
  def minusNanos(nanosToSubtract: scala.Double): Instant = js.native
  def minusSeconds(secondsToSubtract: scala.Double): Instant = js.native
  def nano(): scala.Double = js.native
  def plus(amountToAdd: scala.Double, unit: TemporalUnit): Instant = js.native
  def plus(amount: TemporalAmount): Instant = js.native
  def plusMillis(millisToAdd: scala.Double): Instant = js.native
  def plusNanos(nanosToAdd: scala.Double): Instant = js.native
  def plusSeconds(secondsToAdd: scala.Double): Instant = js.native
  def toEpochMilli(): scala.Double = js.native
  def toJSON(): java.lang.String = js.native
  def truncatedTo(unit: TemporalUnit): Instant = js.native
  def until(endExclusive: Temporal, unit: TemporalUnit): scala.Double = js.native
  def `with`(adjuster: TemporalAdjuster): Instant = js.native
  def `with`(field: TemporalField, newValue: scala.Double): Instant = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): Instant = js.native
}

/* static members */
@JSImport("js-joda", "Instant")
@js.native
object Instant extends js.Object {
  var EPOCH: jsDashJodaLib.jsDashJodaMod.Instant = js.native
  var MAX: jsDashJodaLib.jsDashJodaMod.Instant = js.native
  var MAX_SECONDS: jsDashJodaLib.jsDashJodaMod.Instant = js.native
  var MIN: jsDashJodaLib.jsDashJodaMod.Instant = js.native
  var MIN_SECONDS: jsDashJodaLib.jsDashJodaMod.Instant = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.Instant = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.Instant = js.native
  def now(clock: jsDashJodaLib.jsDashJodaMod.Clock): jsDashJodaLib.jsDashJodaMod.Instant = js.native
  def ofEpochMilli(epochMilli: scala.Double): jsDashJodaLib.jsDashJodaMod.Instant = js.native
  def ofEpochSecond(epochSecond: scala.Double): jsDashJodaLib.jsDashJodaMod.Instant = js.native
  def ofEpochSecond(epochSecond: scala.Double, nanoAdjustment: scala.Double): jsDashJodaLib.jsDashJodaMod.Instant = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.Instant = js.native
}

