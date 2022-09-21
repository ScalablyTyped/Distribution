package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "Duration")
@js.native
/* private */ open class Duration () extends TemporalAmount {
  
  def abs(): Duration = js.native
  
  def compareTo(otherDuration: Duration): Double = js.native
  
  def dividedBy(divisor: Double): Duration = js.native
  
  def isNegative(): Boolean = js.native
  
  def isZero(): Boolean = js.native
  
  def minus(amount: Double, unit: TemporalUnit): Duration = js.native
  def minus(duration: Duration): Duration = js.native
  
  def minusDays(daysToSubtract: Double): Duration = js.native
  
  def minusHours(hoursToSubtract: Double): Duration = js.native
  
  def minusMillis(millisToSubtract: Double): Duration = js.native
  
  def minusMinutes(minutesToSubtract: Double): Duration = js.native
  
  def minusNanos(nanosToSubtract: Double): Duration = js.native
  
  def minusSeconds(secondsToSubtract: Double): Duration = js.native
  
  def multipliedBy(multiplicand: Double): Duration = js.native
  
  def nano(): Double = js.native
  
  def negated(): Duration = js.native
  
  def plus(amount: Double, unit: TemporalUnit): Duration = js.native
  def plus(duration: Duration): Duration = js.native
  
  def plusDays(daysToAdd: Double): Duration = js.native
  
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
object Duration {
  
  @JSImport("@js-joda/core", "Duration")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "Duration.ZERO")
  @js.native
  def ZERO: Duration = js.native
  inline def ZERO_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  inline def between(startInclusive: Temporal, endExclusive: Temporal): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(startInclusive.asInstanceOf[js.Any], endExclusive.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  inline def from(amount: TemporalAmount): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(amount.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  inline def of(amount: Double, unit: TemporalUnit): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(amount.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  inline def ofDays(days: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofDays")(days.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  inline def ofHours(hours: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofHours")(hours.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  inline def ofMillis(millis: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofMillis")(millis.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  inline def ofMinutes(minutes: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofMinutes")(minutes.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  inline def ofNanos(nanos: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNanos")(nanos.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  inline def ofSeconds(seconds: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofSeconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[Duration]
  inline def ofSeconds(seconds: Double, nanoAdjustment: Double): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("ofSeconds")(seconds.asInstanceOf[js.Any], nanoAdjustment.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  inline def parse(text: String): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Duration]
}
