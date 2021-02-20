package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Instant {
  
  @JSImport("js-joda", "Instant")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "Instant.EPOCH")
  @js.native
  def EPOCH: Instant = js.native
  @scala.inline
  def EPOCH_=(x: Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPOCH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "Instant.MAX")
  @js.native
  def MAX: Instant = js.native
  @scala.inline
  def MAX_=(x: Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "Instant.MAX_SECONDS")
  @js.native
  def MAX_SECONDS: Instant = js.native
  @scala.inline
  def MAX_SECONDS_=(x: Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SECONDS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "Instant.MIN")
  @js.native
  def MIN: Instant = js.native
  @scala.inline
  def MIN_=(x: Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "Instant.MIN_SECONDS")
  @js.native
  def MIN_SECONDS: Instant = js.native
  @scala.inline
  def MIN_SECONDS_=(x: Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SECONDS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "Instant.from")
  @js.native
  def from(temporal: TemporalAccessor): Instant = js.native
  
  /* static member */
  @JSImport("js-joda", "Instant.now")
  @js.native
  def now(): Instant = js.native
  @JSImport("js-joda", "Instant.now")
  @js.native
  def now(clock: Clock): Instant = js.native
  
  /* static member */
  @JSImport("js-joda", "Instant.ofEpochMilli")
  @js.native
  def ofEpochMilli(epochMilli: Double): Instant = js.native
  
  /* static member */
  @JSImport("js-joda", "Instant.ofEpochSecond")
  @js.native
  def ofEpochSecond(epochSecond: Double): Instant = js.native
  @JSImport("js-joda", "Instant.ofEpochSecond")
  @js.native
  def ofEpochSecond(epochSecond: Double, nanoAdjustment: Double): Instant = js.native
  
  /* static member */
  @JSImport("js-joda", "Instant.parse")
  @js.native
  def parse(text: String): Instant = js.native
}
