package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.ZonedDateTime")
@js.native
/* private */ open class ZonedDateTime ()
  extends typings.jsJodaCore.mod.ZonedDateTime
/* static members */
object ZonedDateTime {
  
  @JSGlobal("JSJoda.ZonedDateTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.ZonedDateTime.FROM")
  @js.native
  def FROM: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.ZonedDateTime] = js.native
  inline def FROM_=(x: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.ZonedDateTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typings.jsJodaCore.mod.TemporalAccessor): typings.jsJodaCore.mod.ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  
  inline def now(): typings.jsJodaCore.mod.ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  inline def now(clockOrZone: typings.jsJodaCore.mod.Clock): typings.jsJodaCore.mod.ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  inline def now(clockOrZone: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  
  inline def of(
    date: typings.jsJodaCore.mod.LocalDate,
    time: typings.jsJodaCore.mod.LocalTime,
    zone: typings.jsJodaCore.mod.ZoneId
  ): typings.jsJodaCore.mod.ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  inline def of(localDateTime: typings.jsJodaCore.mod.LocalDateTime, zone: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(localDateTime.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoOfSecond: Double,
    zone: typings.jsJodaCore.mod.ZoneId
  ): typings.jsJodaCore.mod.ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  
  /**
    * Obtains an instance of ZonedDateTime from an Instant.
    *
    * This creates a zoned date-time with the same instant as that specified. Calling
    * `ChronoZonedDateTime.toInstant()` will return an instant equal to the one used here.
    *
    * Converting an instant to a zoned date-time is simple as there is only one valid offset for
    * each instant.
    */
  inline def ofInstant(instant: typings.jsJodaCore.mod.Instant, zone: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
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
  inline def ofInstant(
    localDateTime: typings.jsJodaCore.mod.LocalDateTime,
    offset: typings.jsJodaCore.mod.ZoneOffset,
    zone: typings.jsJodaCore.mod.ZoneId
  ): typings.jsJodaCore.mod.ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(localDateTime.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  
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
  inline def ofLocal(localDateTime: typings.jsJodaCore.mod.LocalDateTime, zone: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofLocal")(localDateTime.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  inline def ofLocal(
    localDateTime: typings.jsJodaCore.mod.LocalDateTime,
    zone: typings.jsJodaCore.mod.ZoneId,
    preferredOffset: typings.jsJodaCore.mod.ZoneOffset
  ): typings.jsJodaCore.mod.ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofLocal")(localDateTime.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], preferredOffset.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  
  /**
    * Obtains an instance of `ZonedDateTime` strictly validating the combination of local
    * date-time, offset and zone ID.
    *
    * This creates a zoned date-time ensuring that the offset is valid for the local date-time
    * according to the rules of the specified zone. If the offset is invalid, an exception is
    * thrown.
    */
  inline def ofStrict(
    localDateTime: typings.jsJodaCore.mod.LocalDateTime,
    offset: typings.jsJodaCore.mod.ZoneOffset,
    zone: typings.jsJodaCore.mod.ZoneId
  ): typings.jsJodaCore.mod.ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofStrict")(localDateTime.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  
  inline def parse(text: String): typings.jsJodaCore.mod.ZonedDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
  inline def parse(text: String, formatter: typings.jsJodaCore.mod.DateTimeFormatter): typings.jsJodaCore.mod.ZonedDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.ZonedDateTime]
}
