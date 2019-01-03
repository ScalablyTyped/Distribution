package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends TemporalAmount {
  def abs(): Duration = js.native
  def compareTo(otherDuration: Duration): scala.Double = js.native
  def dividedBy(divisor: scala.Double): Duration = js.native
  def equals(otherDuration: js.Any): scala.Boolean = js.native
  def isNegative(): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def minus(durationOrNumber: Duration, unit: ChronoUnit): Duration = js.native
  def minus(durationOrNumber: scala.Double, unit: ChronoUnit): Duration = js.native
  def minusAmountUnit(amountToSubtract: scala.Double, unit: TemporalUnit): Duration = js.native
  def minusDays(daysToSubtract: scala.Double): Duration = js.native
  def minusDuration(duration: Duration): Duration = js.native
  def minusHours(hoursToSubtract: scala.Double): Duration = js.native
  def minusMillis(millisToSubtract: scala.Double): Duration = js.native
  def minusMinutes(minutesToSubtract: scala.Double): Duration = js.native
  def minusNanos(nanosToSubtract: scala.Double): Duration = js.native
  def minusSeconds(secondsToSubtract: scala.Double): Duration = js.native
  def multipliedBy(multiplicand: scala.Double): Duration = js.native
  def nano(): scala.Double = js.native
  def negated(): Duration = js.native
  def plus(durationOrNumber: Duration, unitOrNumber: TemporalUnit): Duration = js.native
  def plus(durationOrNumber: Duration, unitOrNumber: scala.Double): Duration = js.native
  def plus(durationOrNumber: scala.Double, unitOrNumber: TemporalUnit): Duration = js.native
  def plus(durationOrNumber: scala.Double, unitOrNumber: scala.Double): Duration = js.native
  def plusAmountUnit(amountToAdd: scala.Double, unit: TemporalUnit): Duration = js.native
  def plusDays(daysToAdd: scala.Double): Duration = js.native
  def plusDuration(duration: Duration): Duration = js.native
  def plusHours(hoursToAdd: scala.Double): Duration = js.native
  def plusMillis(millisToAdd: scala.Double): Duration = js.native
  def plusMinutes(minutesToAdd: scala.Double): Duration = js.native
  def plusNanos(nanosToAdd: scala.Double): Duration = js.native
  def plusSeconds(secondsToAdd: scala.Double): Duration = js.native
  def plusSecondsNanos(secondsToAdd: scala.Double, nanosToAdd: scala.Double): Duration = js.native
  def seconds(): scala.Double = js.native
  def toDays(): scala.Double = js.native
  def toHours(): scala.Double = js.native
  def toJSON(): java.lang.String = js.native
  def toMillis(): scala.Double = js.native
  def toMinutes(): scala.Double = js.native
  def toNanos(): scala.Double = js.native
  def withNanos(nanoOfSecond: scala.Double): Duration = js.native
  def withSeconds(seconds: scala.Double): Duration = js.native
}

