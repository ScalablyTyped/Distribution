package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "Instant")
@js.native
/* private */ open class Instant () extends Temporal {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def atOffset(offset: ZoneOffset): OffsetDateTime = js.native
  
  def atZone(zone: ZoneId): ZonedDateTime = js.native
  
  def compareTo(otherInstant: Instant): Double = js.native
  
  def epochSecond(): Double = js.native
  
  def isAfter(otherInstant: Instant): Boolean = js.native
  
  def isBefore(otherInstant: Instant): Boolean = js.native
  
  def minusMicros(microsToSubtract: Double): Instant = js.native
  
  def minusMillis(millisToSubtract: Double): Instant = js.native
  
  def minusNanos(nanosToSubtract: Double): Instant = js.native
  
  def minusSeconds(secondsToSubtract: Double): Instant = js.native
  
  def nano(): Double = js.native
  
  def plusMicros(microsToAdd: Double): Instant = js.native
  
  def plusMillis(millisToAdd: Double): Instant = js.native
  
  def plusNanos(nanosToAdd: Double): Instant = js.native
  
  def plusSeconds(secondsToAdd: Double): Instant = js.native
  
  def toEpochMilli(): Double = js.native
  
  def toJSON(): String = js.native
  
  def truncatedTo(unit: TemporalUnit): Instant = js.native
}
/* static members */
object Instant {
  
  @JSImport("@js-joda/core", "Instant")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "Instant.EPOCH")
  @js.native
  def EPOCH: Instant = js.native
  inline def EPOCH_=(x: Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPOCH")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Instant.FROM")
  @js.native
  def FROM: TemporalQuery[Instant] = js.native
  inline def FROM_=(x: TemporalQuery[Instant]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Instant.MAX")
  @js.native
  def MAX: Instant = js.native
  inline def MAX_=(x: Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Instant.MAX_SECONDS")
  @js.native
  def MAX_SECONDS: Instant = js.native
  inline def MAX_SECONDS_=(x: Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SECONDS")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Instant.MIN")
  @js.native
  def MIN: Instant = js.native
  inline def MIN_=(x: Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "Instant.MIN_SECONDS")
  @js.native
  def MIN_SECONDS: Instant = js.native
  inline def MIN_SECONDS_=(x: Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SECONDS")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[Instant]
  
  inline def now(): Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Instant]
  inline def now(clock: Clock): Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clock.asInstanceOf[js.Any]).asInstanceOf[Instant]
  
  inline def ofEpochMicro(epochMicro: Double): Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochMicro")(epochMicro.asInstanceOf[js.Any]).asInstanceOf[Instant]
  
  inline def ofEpochMilli(epochMilli: Double): Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochMilli")(epochMilli.asInstanceOf[js.Any]).asInstanceOf[Instant]
  
  inline def ofEpochSecond(epochSecond: Double): Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochSecond")(epochSecond.asInstanceOf[js.Any]).asInstanceOf[Instant]
  inline def ofEpochSecond(epochSecond: Double, nanoAdjustment: Double): Instant = (^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochSecond")(epochSecond.asInstanceOf[js.Any], nanoAdjustment.asInstanceOf[js.Any])).asInstanceOf[Instant]
  
  inline def parse(text: String): Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Instant]
}
