package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsJodaCore.mod.TemporalAdjuster because Inheritance from two classes. Inlined adjustInto */ @JSImport("@js-joda/core", "OffsetDateTime")
@js.native
/* private */ open class OffsetDateTime () extends Temporal {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def atZoneSameInstant(zone: ZoneId): ZonedDateTime = js.native
  
  def atZoneSimilarLocal(zone: ZoneId): ZonedDateTime = js.native
  
  def compareTo(other: OffsetDateTime): Double = js.native
  
  def dayOfMonth(): Double = js.native
  
  def dayOfWeek(): DayOfWeek = js.native
  
  def dayOfYear(): Double = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
  
  def hour(): Double = js.native
  
  def isAfter(other: OffsetDateTime): Boolean = js.native
  
  def isBefore(other: OffsetDateTime): Boolean = js.native
  
  def isEqual(other: OffsetDateTime): Boolean = js.native
  
  def minusDays(days: Double): OffsetDateTime = js.native
  
  def minusHours(hours: Double): OffsetDateTime = js.native
  
  def minusMinutes(minutes: Double): OffsetDateTime = js.native
  
  def minusMonths(months: Double): OffsetDateTime = js.native
  
  def minusNanos(nanos: Double): OffsetDateTime = js.native
  
  def minusSeconds(seconds: Double): OffsetDateTime = js.native
  
  def minusWeeks(weeks: Double): OffsetDateTime = js.native
  
  def minusYears(years: Double): OffsetDateTime = js.native
  
  def minute(): Double = js.native
  
  def month(): Month = js.native
  
  def monthValue(): Double = js.native
  
  def nano(): Double = js.native
  
  def offset(): ZoneOffset = js.native
  
  def plusDays(days: Double): OffsetDateTime = js.native
  
  def plusHours(hours: Double): OffsetDateTime = js.native
  
  def plusMinutes(minutes: Double): OffsetDateTime = js.native
  
  def plusMonths(months: Double): OffsetDateTime = js.native
  
  def plusNanos(nanos: Double): OffsetDateTime = js.native
  
  def plusSeconds(seconds: Double): OffsetDateTime = js.native
  
  def plusWeeks(weeks: Double): OffsetDateTime = js.native
  
  def plusYears(years: Double): OffsetDateTime = js.native
  
  def second(): Double = js.native
  
  def toEpochSecond(): Double = js.native
  
  def toInstant(): Instant = js.native
  
  def toJSON(): String = js.native
  
  def toLocalDate(): LocalDate = js.native
  
  def toLocalDateTime(): LocalDateTime = js.native
  
  def toLocalTime(): LocalTime = js.native
  
  def toOffsetTime(): OffsetTime = js.native
  
  def truncatedTo(unit: TemporalUnit): OffsetDateTime = js.native
  
  def withDayOfMonth(dayOfMonth: Double): OffsetDateTime = js.native
  
  def withDayOfYear(dayOfYear: Double): OffsetDateTime = js.native
  
  def withHour(hour: Double): OffsetDateTime = js.native
  
  def withMinute(minute: Double): OffsetDateTime = js.native
  
  def withMonth(month: Double): OffsetDateTime = js.native
  
  def withNano(nanoOfSecond: Double): OffsetDateTime = js.native
  
  def withOffsetSameInstant(offset: ZoneOffset): OffsetDateTime = js.native
  
  def withOffsetSameLocal(offset: ZoneOffset): OffsetDateTime = js.native
  
  def withSecond(second: Double): OffsetDateTime = js.native
  
  def withYear(year: Double): OffsetDateTime = js.native
  
  def year(): Double = js.native
}
/* static members */
object OffsetDateTime {
  
  @JSImport("@js-joda/core", "OffsetDateTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "OffsetDateTime.FROM")
  @js.native
  def FROM: TemporalQuery[OffsetDateTime] = js.native
  inline def FROM_=(x: TemporalQuery[OffsetDateTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "OffsetDateTime.MAX")
  @js.native
  def MAX: OffsetDateTime = js.native
  inline def MAX_=(x: OffsetDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "OffsetDateTime.MIN")
  @js.native
  def MIN: OffsetDateTime = js.native
  inline def MIN_=(x: OffsetDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[OffsetDateTime]
  
  inline def now(): OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[OffsetDateTime]
  inline def now(clockOrZone: Clock): OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[OffsetDateTime]
  inline def now(clockOrZone: ZoneId): OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[OffsetDateTime]
  
  inline def of(dateTime: LocalDateTime, offset: ZoneOffset): OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(dateTime.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[OffsetDateTime]
  inline def of(date: LocalDate, time: LocalTime, offset: ZoneOffset): OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[OffsetDateTime]
  inline def of(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoOfSecond: Double,
    offset: ZoneOffset
  ): OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[OffsetDateTime]
  
  inline def ofInstant(instant: Instant, zone: ZoneId): OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[OffsetDateTime]
  
  inline def parse(text: String): OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[OffsetDateTime]
  inline def parse(text: String, formatter: DateTimeFormatter): OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[OffsetDateTime]
}
