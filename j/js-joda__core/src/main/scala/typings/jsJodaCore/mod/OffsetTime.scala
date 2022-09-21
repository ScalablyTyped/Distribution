package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "OffsetTime")
@js.native
/* private */ open class OffsetTime () extends Temporal {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def atDate(date: LocalDate): OffsetDateTime = js.native
  
  def compareTo(other: OffsetTime): Double = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
  
  def hour(): Double = js.native
  
  def isAfter(other: OffsetTime): Boolean = js.native
  
  def isBefore(other: OffsetTime): Boolean = js.native
  
  def isEqual(other: OffsetTime): Boolean = js.native
  
  def minusHours(hours: Double): OffsetTime = js.native
  
  def minusMinutes(minutes: Double): OffsetTime = js.native
  
  def minusNanos(nanos: Double): OffsetTime = js.native
  
  def minusSeconds(seconds: Double): OffsetTime = js.native
  
  def minute(): Double = js.native
  
  def nano(): Double = js.native
  
  def offset(): ZoneOffset = js.native
  
  def plusHours(hours: Double): OffsetTime = js.native
  
  def plusMinutes(minutes: Double): OffsetTime = js.native
  
  def plusNanos(nanos: Double): OffsetTime = js.native
  
  def plusSeconds(seconds: Double): OffsetTime = js.native
  
  def second(): Double = js.native
  
  def toJSON(): String = js.native
  
  def toLocalTime(): LocalTime = js.native
  
  def truncatedTo(unit: TemporalUnit): OffsetTime = js.native
  
  def withHour(hour: Double): OffsetTime = js.native
  
  def withMinute(minute: Double): OffsetTime = js.native
  
  def withNano(nanoOfSecond: Double): OffsetTime = js.native
  
  def withOffsetSameInstant(offset: ZoneOffset): OffsetTime = js.native
  
  def withOffsetSameLocal(offset: ZoneOffset): OffsetTime = js.native
  
  def withSecond(second: Double): OffsetTime = js.native
}
/* static members */
object OffsetTime {
  
  @JSImport("@js-joda/core", "OffsetTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "OffsetTime.FROM")
  @js.native
  def FROM: TemporalQuery[OffsetTime] = js.native
  inline def FROM_=(x: TemporalQuery[OffsetTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "OffsetTime.MAX")
  @js.native
  def MAX: OffsetTime = js.native
  inline def MAX_=(x: OffsetTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "OffsetTime.MIN")
  @js.native
  def MIN: OffsetTime = js.native
  inline def MIN_=(x: OffsetTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[OffsetTime]
  
  inline def now(): OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[OffsetTime]
  inline def now(clockOrZone: Clock): OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[OffsetTime]
  inline def now(clockOrZone: ZoneId): OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[OffsetTime]
  
  inline def of(hour: Double, minute: Double, second: Double, nanoOfSecond: Double, offset: ZoneOffset): OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[OffsetTime]
  inline def of(time: LocalTime, offset: ZoneOffset): OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[OffsetTime]
  
  inline def ofInstant(instant: Instant, zone: ZoneId): OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[OffsetTime]
  
  inline def parse(text: String): OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[OffsetTime]
  inline def parse(text: String, formatter: DateTimeFormatter): OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[OffsetTime]
}
