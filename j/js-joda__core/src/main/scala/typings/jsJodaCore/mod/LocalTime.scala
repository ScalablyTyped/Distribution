package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "LocalTime")
@js.native
/* private */ open class LocalTime () extends Temporal {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def atDate(date: LocalDate): LocalDateTime = js.native
  
  def atOffset(offset: ZoneOffset): OffsetTime = js.native
  
  def compareTo(other: LocalTime): Double = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
  
  def getLong(field: ChronoField): Double = js.native
  
  def hour(): Double = js.native
  
  def isAfter(other: LocalTime): Boolean = js.native
  
  def isBefore(other: LocalTime): Boolean = js.native
  
  def minusHours(hoursToSubtract: Double): LocalTime = js.native
  
  def minusMinutes(minutesToSubtract: Double): LocalTime = js.native
  
  def minusNanos(nanosToSubtract: Double): LocalTime = js.native
  
  def minusSeconds(secondsToSubtract: Double): LocalTime = js.native
  
  def minute(): Double = js.native
  
  def nano(): Double = js.native
  
  def plusHours(hoursToAdd: Double): LocalTime = js.native
  
  def plusMinutes(minutesToAdd: Double): LocalTime = js.native
  
  def plusNanos(nanosToAdd: Double): LocalTime = js.native
  
  def plusSeconds(secondstoAdd: Double): LocalTime = js.native
  
  def second(): Double = js.native
  
  def toJSON(): String = js.native
  
  def toNanoOfDay(): Double = js.native
  
  def toSecondOfDay(): Double = js.native
  
  def truncatedTo(unit: ChronoUnit): LocalTime = js.native
  
  def withHour(hour: Double): LocalTime = js.native
  
  def withMinute(minute: Double): LocalTime = js.native
  
  def withNano(nanoOfSecond: Double): LocalTime = js.native
  
  def withSecond(second: Double): LocalTime = js.native
}
/* static members */
object LocalTime {
  
  @JSImport("@js-joda/core", "LocalTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "LocalTime.FROM")
  @js.native
  def FROM: TemporalQuery[LocalTime] = js.native
  inline def FROM_=(x: TemporalQuery[LocalTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.HOURS_PER_DAY")
  @js.native
  def HOURS_PER_DAY: Double = js.native
  inline def HOURS_PER_DAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOURS_PER_DAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.MAX")
  @js.native
  def MAX: LocalTime = js.native
  inline def MAX_=(x: LocalTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.MICROS_PER_DAY")
  @js.native
  def MICROS_PER_DAY: Double = js.native
  inline def MICROS_PER_DAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MICROS_PER_DAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.MIDNIGHT")
  @js.native
  def MIDNIGHT: LocalTime = js.native
  inline def MIDNIGHT_=(x: LocalTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIDNIGHT")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.MILLIS_PER_DAY")
  @js.native
  def MILLIS_PER_DAY: Double = js.native
  inline def MILLIS_PER_DAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLIS_PER_DAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.MIN")
  @js.native
  def MIN: LocalTime = js.native
  
  @JSImport("@js-joda/core", "LocalTime.MINUTES_PER_DAY")
  @js.native
  def MINUTES_PER_DAY: Double = js.native
  inline def MINUTES_PER_DAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTES_PER_DAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.MINUTES_PER_HOUR")
  @js.native
  def MINUTES_PER_HOUR: Double = js.native
  inline def MINUTES_PER_HOUR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTES_PER_HOUR")(x.asInstanceOf[js.Any])
  
  inline def MIN_=(x: LocalTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.NANOS_PER_DAY")
  @js.native
  def NANOS_PER_DAY: Double = js.native
  inline def NANOS_PER_DAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NANOS_PER_DAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.NANOS_PER_HOUR")
  @js.native
  def NANOS_PER_HOUR: Double = js.native
  inline def NANOS_PER_HOUR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NANOS_PER_HOUR")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.NANOS_PER_MINUTE")
  @js.native
  def NANOS_PER_MINUTE: Double = js.native
  inline def NANOS_PER_MINUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NANOS_PER_MINUTE")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.NANOS_PER_SECOND")
  @js.native
  def NANOS_PER_SECOND: Double = js.native
  inline def NANOS_PER_SECOND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NANOS_PER_SECOND")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.NOON")
  @js.native
  def NOON: LocalTime = js.native
  inline def NOON_=(x: LocalTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOON")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.SECONDS_PER_DAY")
  @js.native
  def SECONDS_PER_DAY: Double = js.native
  inline def SECONDS_PER_DAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDS_PER_DAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.SECONDS_PER_HOUR")
  @js.native
  def SECONDS_PER_HOUR: Double = js.native
  inline def SECONDS_PER_HOUR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDS_PER_HOUR")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalTime.SECONDS_PER_MINUTE")
  @js.native
  def SECONDS_PER_MINUTE: Double = js.native
  inline def SECONDS_PER_MINUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDS_PER_MINUTE")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
  
  inline def now(): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[LocalTime]
  inline def now(clockOrZone: Clock): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
  inline def now(clockOrZone: ZoneId): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
  
  inline def of(): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("of")().asInstanceOf[LocalTime]
  inline def of(hour: Double): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
  inline def of(hour: Double, minute: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Double, minute: Double, second: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Double, minute: Double, second: Double, nanoOfSecond: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Double, minute: Double, second: Unit, nanoOfSecond: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Double, minute: Unit, second: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Double, minute: Unit, second: Double, nanoOfSecond: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Double, minute: Unit, second: Unit, nanoOfSecond: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Unit, minute: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Unit, minute: Double, second: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Unit, minute: Double, second: Double, nanoOfSecond: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Unit, minute: Double, second: Unit, nanoOfSecond: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Unit, minute: Unit, second: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Unit, minute: Unit, second: Double, nanoOfSecond: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def of(hour: Unit, minute: Unit, second: Unit, nanoOfSecond: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  
  inline def ofInstant(instant: Instant): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
  inline def ofInstant(instant: Instant, zone: ZoneId): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  
  inline def ofNanoOfDay(nanoOfDay: Double): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNanoOfDay")(nanoOfDay.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
  
  inline def ofSecondOfDay(): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("ofSecondOfDay")().asInstanceOf[LocalTime]
  inline def ofSecondOfDay(secondOfDay: Double): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("ofSecondOfDay")(secondOfDay.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
  inline def ofSecondOfDay(secondOfDay: Double, nanoOfSecond: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofSecondOfDay")(secondOfDay.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  inline def ofSecondOfDay(secondOfDay: Unit, nanoOfSecond: Double): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofSecondOfDay")(secondOfDay.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
  
  inline def parse(text: String): LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[LocalTime]
  inline def parse(text: String, formatter: DateTimeFormatter): LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[LocalTime]
}
