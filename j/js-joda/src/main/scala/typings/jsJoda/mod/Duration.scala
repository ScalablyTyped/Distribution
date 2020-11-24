package typings.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "Duration")
@js.native
class Duration protected () extends TemporalAmount {
  
  def abs(): Duration = js.native
  
  def compareTo(otherDuration: Duration): Double = js.native
  
  def dividedBy(divisor: Double): Duration = js.native
  
  def equals(otherDuration: js.Any): Boolean = js.native
  
  def isNegative(): Boolean = js.native
  
  def isZero(): Boolean = js.native
  
  def minus(durationOrNumber: Double, unit: ChronoUnit): Duration = js.native
  def minus(durationOrNumber: Duration, unit: ChronoUnit): Duration = js.native
  
  def minusAmountUnit(amountToSubtract: Double, unit: TemporalUnit): Duration = js.native
  
  def minusDays(daysToSubtract: Double): Duration = js.native
  
  def minusDuration(duration: Duration): Duration = js.native
  
  def minusHours(hoursToSubtract: Double): Duration = js.native
  
  def minusMillis(millisToSubtract: Double): Duration = js.native
  
  def minusMinutes(minutesToSubtract: Double): Duration = js.native
  
  def minusNanos(nanosToSubtract: Double): Duration = js.native
  
  def minusSeconds(secondsToSubtract: Double): Duration = js.native
  
  def multipliedBy(multiplicand: Double): Duration = js.native
  
  def nano(): Double = js.native
  
  def negated(): Duration = js.native
  
  def plus(durationOrNumber: Double, unitOrNumber: Double): Duration = js.native
  def plus(durationOrNumber: Double, unitOrNumber: TemporalUnit): Duration = js.native
  def plus(durationOrNumber: Duration, unitOrNumber: Double): Duration = js.native
  def plus(durationOrNumber: Duration, unitOrNumber: TemporalUnit): Duration = js.native
  
  def plusAmountUnit(amountToAdd: Double, unit: TemporalUnit): Duration = js.native
  
  def plusDays(daysToAdd: Double): Duration = js.native
  
  def plusDuration(duration: Duration): Duration = js.native
  
  def plusHours(hoursToAdd: Double): Duration = js.native
  
  def plusMillis(millisToAdd: Double): Duration = js.native
  
  def plusMinutes(minutesToAdd: Double): Duration = js.native
  
  def plusNanos(nanosToAdd: Double): Duration = js.native
  
  def plusSeconds(secondsToAdd: Double): Duration = js.native
  
  def plusSecondsNanos(secondsToAdd: Double, nanosToAdd: Double): Duration = js.native
  
  def seconds(): Double = js.native
  
  def toDays(): Double = js.native
  
  def toHours(): Double = js.native
  
  def toJSON(): String = js.native
  
  def toMillis(): Double = js.native
  
  def toMinutes(): Double = js.native
  
  def toNanos(): Double = js.native
  
  def withNanos(nanoOfSecond: Double): Duration = js.native
  
  def withSeconds(seconds: Double): Duration = js.native
}
/* static members */
@JSImport("js-joda", "Duration")
@js.native
object Duration extends js.Object {
  
  var ZERO: Duration = js.native
  
  def between(startInclusive: Temporal, endExclusive: Temporal): Duration = js.native
  
  def from(amount: TemporalAmount): Duration = js.native
  
  def of(amount: Double, unit: TemporalUnit): Duration = js.native
  
  def ofDays(days: Double): Duration = js.native
  
  def ofHours(hours: Double): Duration = js.native
  
  def ofMillis(millis: Double): Duration = js.native
  
  def ofMinutes(minutes: Double): Duration = js.native
  
  def ofNanos(nanos: Double): Duration = js.native
  
  def ofSeconds(seconds: Double): Duration = js.native
  
  def parse(text: String): Duration = js.native
}
