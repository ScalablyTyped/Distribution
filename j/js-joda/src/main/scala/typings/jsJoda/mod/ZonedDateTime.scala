package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ZonedDateTime")
@js.native
/* private */ class ZonedDateTime () extends ChronoZonedDateTime {
  
  def dayOfMonth(): Double = js.native
  
  def dayOfWeek(): DayOfWeek = js.native
  
  def dayOfYear(): Double = js.native
  
  def getLong(field: TemporalField): Double = js.native
  
  def hour(): Double = js.native
  
  def isSupported(fieldOrUnit: TemporalField): Boolean = js.native
  def isSupported(fieldOrUnit: TemporalUnit): Boolean = js.native
  
  def minus(): js.Any = js.native
  def minus(amountToSubtract: Double, unit: TemporalUnit): ZonedDateTime = js.native
  
  def minusDays(days: Double): ZonedDateTime = js.native
  
  def minusHours(hours: Double): ZonedDateTime = js.native
  
  def minusMinutes(minutes: Double): ZonedDateTime = js.native
  
  def minusMonths(months: Double): ZonedDateTime = js.native
  
  def minusNanos(nanos: Double): ZonedDateTime = js.native
  
  def minusSeconds(seconds: Double): ZonedDateTime = js.native
  
  def minusTemporalAmount(amount: TemporalAmount): ZonedDateTime = js.native
  
  def minusWeeks(weeks: Double): ZonedDateTime = js.native
  
  def minusYears(years: Double): ZonedDateTime = js.native
  
  def minute(): Double = js.native
  
  def month(): Month = js.native
  
  def monthValue(): Double = js.native
  
  def nano(): Double = js.native
  
  def offset(): js.Any = js.native
  
  def plus(): js.Any = js.native
  def plus(amountToAdd: Double, unit: TemporalUnit): ZonedDateTime = js.native
  
  def plusDays(days: Double): js.Any = js.native
  
  def plusHours(hours: Double): ZonedDateTime = js.native
  
  def plusMinutes(minutes: Double): ZonedDateTime = js.native
  
  def plusMonths(months: Double): ZonedDateTime = js.native
  
  def plusNanos(nanos: Double): ZonedDateTime = js.native
  
  def plusSeconds(seconds: Double): ZonedDateTime = js.native
  
  def plusTemporalAmount(amount: TemporalAmount): ZonedDateTime = js.native
  
  def plusWeeks(weeks: Double): js.Any = js.native
  
  def plusYears(years: Double): ZonedDateTime = js.native
  
  def second(): Double = js.native
  
  def toJSON(): String = js.native
  
  def toLocalDate(): LocalDate = js.native
  
  def toLocalDateTime(): LocalDateTime = js.native
  
  def toLocalTime(): LocalTime = js.native
  
  def truncatedTo(unit: TemporalUnit): ZonedDateTime = js.native
  
  def until(endExclusive: Temporal, unit: TemporalUnit): Double = js.native
  
  def `with`(): js.Any = js.native
  def `with`(field: TemporalField, newValue: Double): ZonedDateTime = js.native
  
  def withDayOfMonth(dayOfMonth: Double): ZonedDateTime = js.native
  
  def withDayOfYear(dayOfYear: Double): ZonedDateTime = js.native
  
  def withFixedOffsetZone(): ZonedDateTime = js.native
  
  def withHour(hour: Double): ZonedDateTime = js.native
  
  def withMinute(minute: Double): ZonedDateTime = js.native
  
  def withMonth(month: Double): ZonedDateTime = js.native
  
  def withNano(nanoOfSecond: Double): ZonedDateTime = js.native
  
  def withSecond(second: Double): ZonedDateTime = js.native
  
  def withTemporalAdjuster(adjuster: TemporalAdjuster): ZonedDateTime = js.native
  
  def withYear(year: Double): ZonedDateTime = js.native
  
  def withZoneSameInstant(zone: ZoneId): ZonedDateTime = js.native
  
  def withZoneSameLocal(zone: ZoneId): ZonedDateTime = js.native
  
  def year(): Double = js.native
  
  def zone(): ZoneId = js.native
}
object ZonedDateTime {
  
  @JSImport("js-joda", "ZonedDateTime")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def from(temporal: TemporalAccessor): ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[ZonedDateTime]
  
  /* static member */
  inline def now(): ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[ZonedDateTime]
  inline def now(clockOrZone: Clock): ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[ZonedDateTime]
  inline def now(clockOrZone: ZoneId): ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[ZonedDateTime]
  
  /* static member */
  inline def of(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("of")().asInstanceOf[js.Any]
  /* static member */
  inline def of(date: LocalDate, time: LocalTime, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  /* static member */
  inline def of(localDateTime: LocalDateTime, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(localDateTime.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  /* static member */
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoOfSecond: Double,
    zone: ZoneId
  ): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  
  /* static member */
  inline def ofInstant(): ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")().asInstanceOf[ZonedDateTime]
  /* static member */
  inline def ofInstant(instant: Instant, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  /* static member */
  inline def ofInstant(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(localDateTime.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  
  /* static member */
  inline def ofLocal(localDateTime: LocalDateTime, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofLocal")(localDateTime.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  inline def ofLocal(localDateTime: LocalDateTime, zone: ZoneId, preferredOffset: ZoneOffset): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofLocal")(localDateTime.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], preferredOffset.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  
  /* static member */
  inline def ofStrict(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofStrict")(localDateTime.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  
  /* static member */
  inline def parse(text: String): ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[ZonedDateTime]
  inline def parse(text: String, formatter: DateTimeFormatter): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
}
