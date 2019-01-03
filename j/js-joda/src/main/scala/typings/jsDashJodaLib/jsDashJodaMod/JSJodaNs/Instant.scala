package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instant extends TemporalAccessor {
  def adjustInto(temporal: Temporal): Temporal = js.native
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
  def truncatedTo(unit: TemporalUnit): Instant = js.native
  def until(endExclusive: Temporal, unit: TemporalUnit): scala.Double = js.native
  def `with`(adjuster: TemporalAdjuster): Instant = js.native
  def `with`(field: TemporalField, newValue: scala.Double): Instant = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): Instant = js.native
}

