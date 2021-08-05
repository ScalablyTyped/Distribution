package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "Duration")
@js.native
/* private */ class Duration () extends TemporalAmount {
  
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
object Duration {
  
  @JSImport("js-joda", "Duration")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "Duration.ZERO")
  @js.native
  def ZERO: Duration = js.native
  inline def ZERO_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def between(startInclusive: Temporal, endExclusive: Temporal): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(startInclusive.asInstanceOf[js.Any], endExclusive.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  /* static member */
  inline def from(amount: TemporalAmount): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(amount.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  /* static member */
  inline def of(amount: Double, unit: TemporalUnit): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(amount.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  /* static member */
  inline def ofDays(days: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofDays")(days.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  /* static member */
  inline def ofHours(hours: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofHours")(hours.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  /* static member */
  inline def ofMillis(millis: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofMillis")(millis.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  /* static member */
  inline def ofMinutes(minutes: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofMinutes")(minutes.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  /* static member */
  inline def ofNanos(nanos: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNanos")(nanos.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  /* static member */
  inline def ofSeconds(seconds: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofSeconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  /* static member */
  inline def parse(text: String): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Duration]
}
