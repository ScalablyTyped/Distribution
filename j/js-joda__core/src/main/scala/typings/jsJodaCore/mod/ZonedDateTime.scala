package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "ZonedDateTime")
@js.native
/* private */ open class ZonedDateTime () extends ChronoZonedDateTime {
  
  def dayOfMonth(): Double = js.native
  
  def dayOfWeek(): DayOfWeek = js.native
  
  def dayOfYear(): Double = js.native
  
  def hour(): Double = js.native
  
  def minusDays(days: Double): ZonedDateTime = js.native
  
  def minusHours(hours: Double): ZonedDateTime = js.native
  
  def minusMinutes(minutes: Double): ZonedDateTime = js.native
  
  def minusMonths(months: Double): ZonedDateTime = js.native
  
  def minusNanos(nanos: Double): ZonedDateTime = js.native
  
  def minusSeconds(seconds: Double): ZonedDateTime = js.native
  
  def minusWeeks(weeks: Double): ZonedDateTime = js.native
  
  def minusYears(years: Double): ZonedDateTime = js.native
  
  def minute(): Double = js.native
  
  def month(): Month = js.native
  
  def monthValue(): Double = js.native
  
  def nano(): Double = js.native
  
  def offset(): ZoneOffset = js.native
  
  def plusDays(days: Double): ZonedDateTime = js.native
  
  def plusHours(hours: Double): ZonedDateTime = js.native
  
  def plusMinutes(minutes: Double): ZonedDateTime = js.native
  
  def plusMonths(months: Double): ZonedDateTime = js.native
  
  def plusNanos(nanos: Double): ZonedDateTime = js.native
  
  def plusSeconds(seconds: Double): ZonedDateTime = js.native
  
  def plusWeeks(weeks: Double): ZonedDateTime = js.native
  
  def plusYears(years: Double): ZonedDateTime = js.native
  
  def second(): Double = js.native
  
  def toJSON(): String = js.native
  
  def toLocalDate(): LocalDate = js.native
  
  def toLocalDateTime(): LocalDateTime = js.native
  
  def toLocalTime(): LocalTime = js.native
  
  def toOffsetDateTime(): OffsetDateTime = js.native
  
  def truncatedTo(unit: TemporalUnit): ZonedDateTime = js.native
  
  def withDayOfMonth(dayOfMonth: Double): ZonedDateTime = js.native
  
  def withDayOfYear(dayOfYear: Double): ZonedDateTime = js.native
  
  /**
    * Returns a copy of this date-time changing the zone offset to the earlier of the two valid
    * offsets at a local time-line overlap.
    *
    * This method only has any effect when the local time-line overlaps, such as at an autumn
    * daylight savings cutover. In this scenario, there are two valid offsets for the local
    * date-time. Calling this method will return a zoned date-time with the earlier of the two
    * selected.
    *
    * If this method is called when it is not an overlap, `this` is returned.
    */
  def withEarlierOffsetAtOverlap(): ZonedDateTime = js.native
  
  /**
    * Returns a copy of this date-time with the zone ID set to the offset.
    *
    * This returns a zoned date-time where the zone ID is the same as `offset()`. The local
    * date-time, offset and instant of the result will be the same as in this date-time.
    *
    * Setting the date-time to a fixed single offset means that any future calculations, such as
    * addition or subtraction, have no complex edge cases due to time-zone rules. This might also
    * be useful when sending a zoned date-time across a network, as most protocols, such as
    * ISO-8601, only handle offsets, and not region-based zone IDs.
    */
  def withFixedOffsetZone(): ZonedDateTime = js.native
  
  def withHour(hour: Double): ZonedDateTime = js.native
  
  /**
    * Returns a copy of this date-time changing the zone offset to the later of the two valid
    * offsets at a local time-line overlap.
    *
    * This method only has any effect when the local time-line overlaps, such as at an autumn
    * daylight savings cutover. In this scenario, there are two valid offsets for the local
    * date-time. Calling this method will return a zoned date-time with the later of the two
    * selected.
    *
    * If this method is called when it is not an overlap, `this` is returned.
    */
  def withLaterOffsetAtOverlap(): ZonedDateTime = js.native
  
  def withMinute(minute: Double): ZonedDateTime = js.native
  
  def withMonth(month: Double): ZonedDateTime = js.native
  
  def withNano(nanoOfSecond: Double): ZonedDateTime = js.native
  
  def withSecond(second: Double): ZonedDateTime = js.native
  
  def withYear(year: Double): ZonedDateTime = js.native
  
  /**
    * Returns a copy of this date-time with a different time-zone, retaining the instant.
    *
    * This method changes the time-zone and retains the instant. This normally results in a
    * change to the local date-time.
    *
    * This method is based on retaining the same instant, thus gaps and overlaps in the local
    * time-line have no effect on the result.
    *
    * To change the offset while keeping the local time, use `withZoneSameLocal(ZoneId)`.
    */
  def withZoneSameInstant(zone: ZoneId): ZonedDateTime = js.native
  
  /**
    * Returns a copy of this date-time with a different time-zone, retaining the local date-time
    * if possible.
    *
    * This method changes the time-zone and retains the local date-time. The local date-time is
    * only changed if it is invalid for the new zone, determined using the same approach as
    * `ofLocal(LocalDateTime, ZoneId, ZoneOffset)`.
    *
    * To change the zone and adjust the local date-time, use `withZoneSameInstant(ZoneId)`.
    */
  def withZoneSameLocal(zone: ZoneId): ZonedDateTime = js.native
  
  def year(): Double = js.native
  
  def zone(): ZoneId = js.native
}
/* static members */
object ZonedDateTime {
  
  @JSImport("@js-joda/core", "ZonedDateTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "ZonedDateTime.FROM")
  @js.native
  def FROM: TemporalQuery[ZonedDateTime] = js.native
  inline def FROM_=(x: TemporalQuery[ZonedDateTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[ZonedDateTime]
  
  inline def now(): ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[ZonedDateTime]
  inline def now(clockOrZone: Clock): ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[ZonedDateTime]
  inline def now(clockOrZone: ZoneId): ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[ZonedDateTime]
  
  inline def of(date: LocalDate, time: LocalTime, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  inline def of(localDateTime: LocalDateTime, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(localDateTime.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
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
  
  /**
    * Obtains an instance of ZonedDateTime from an Instant.
    *
    * This creates a zoned date-time with the same instant as that specified. Calling
    * `ChronoZonedDateTime.toInstant()` will return an instant equal to the one used here.
    *
    * Converting an instant to a zoned date-time is simple as there is only one valid offset for
    * each instant.
    */
  inline def ofInstant(instant: Instant, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  /**
    * Obtains an instance of `ZonedDateTime` from the instant formed by combining the local
    * date-time and offset.
    *
    * This creates a zoned date-time by combining the `LocalDateTime` and `ZoneOffset`. This
    * combination uniquely specifies an instant without ambiguity.
    *
    * Converting an instant to a zoned date-time is simple as there is only one valid offset for
    * each instant. If the valid offset is different to the offset specified, the the date-time
    * and offset of the zoned date-time will differ from those specified.
    *
    * If the `ZoneId` to be used is a `ZoneOffset`, this method is equivalent to
    * `of(LocalDateTime, ZoneId)`.
    */
  inline def ofInstant(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(localDateTime.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  
  /**
    * Obtains an instance of `ZonedDateTime` from a local date-time using the preferred offset
    * if possible.
    *
    * The local date-time is resolved to a single instant on the time-line. This is achieved by
    * finding a valid offset from UTC/Greenwich for the local date-time as defined by the rules
    * of the zone ID.
    *
    * In most cases, there is only one valid offset for a local date-time. In the case of an
    * overlap, where clocks are set back, there are two valid offsets. If the preferred offset
    * is one of the valid offsets then it is used. Otherwise the earlier valid offset is used,
    * typically corresponding to "summer".
    *
    * In the case of a gap, where clocks jump forward, there is no valid offset. Instead, the
    * local date-time is adjusted to be later by the length of the gap. For a typical one hour
    * daylight savings change, the local date-time will be moved one hour later into the offset
    * typically corresponding to "summer".
    */
  inline def ofLocal(localDateTime: LocalDateTime, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofLocal")(localDateTime.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  inline def ofLocal(localDateTime: LocalDateTime, zone: ZoneId, preferredOffset: ZoneOffset): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofLocal")(localDateTime.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], preferredOffset.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  
  /**
    * Obtains an instance of `ZonedDateTime` strictly validating the combination of local
    * date-time, offset and zone ID.
    *
    * This creates a zoned date-time ensuring that the offset is valid for the local date-time
    * according to the rules of the specified zone. If the offset is invalid, an exception is
    * thrown.
    */
  inline def ofStrict(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofStrict")(localDateTime.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
  
  inline def parse(text: String): ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[ZonedDateTime]
  inline def parse(text: String, formatter: DateTimeFormatter): ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[ZonedDateTime]
}
