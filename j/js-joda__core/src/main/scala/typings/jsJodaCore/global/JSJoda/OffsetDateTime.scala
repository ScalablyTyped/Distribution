package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.OffsetDateTime")
@js.native
/* private */ open class OffsetDateTime ()
  extends typings.jsJodaCore.mod.OffsetDateTime
/* static members */
object OffsetDateTime {
  
  @JSGlobal("JSJoda.OffsetDateTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.OffsetDateTime.FROM")
  @js.native
  def FROM: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.OffsetDateTime] = js.native
  inline def FROM_=(x: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.OffsetDateTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.OffsetDateTime.MAX")
  @js.native
  def MAX: typings.jsJodaCore.mod.OffsetDateTime = js.native
  inline def MAX_=(x: typings.jsJodaCore.mod.OffsetDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.OffsetDateTime.MIN")
  @js.native
  def MIN: typings.jsJodaCore.mod.OffsetDateTime = js.native
  inline def MIN_=(x: typings.jsJodaCore.mod.OffsetDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typings.jsJodaCore.mod.TemporalAccessor): typings.jsJodaCore.mod.OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.OffsetDateTime]
  
  inline def now(): typings.jsJodaCore.mod.OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.jsJodaCore.mod.OffsetDateTime]
  inline def now(clockOrZone: typings.jsJodaCore.mod.Clock): typings.jsJodaCore.mod.OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.OffsetDateTime]
  inline def now(clockOrZone: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.OffsetDateTime]
  
  inline def of(dateTime: typings.jsJodaCore.mod.LocalDateTime, offset: typings.jsJodaCore.mod.ZoneOffset): typings.jsJodaCore.mod.OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(dateTime.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.OffsetDateTime]
  inline def of(
    date: typings.jsJodaCore.mod.LocalDate,
    time: typings.jsJodaCore.mod.LocalTime,
    offset: typings.jsJodaCore.mod.ZoneOffset
  ): typings.jsJodaCore.mod.OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.OffsetDateTime]
  inline def of(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoOfSecond: Double,
    offset: typings.jsJodaCore.mod.ZoneOffset
  ): typings.jsJodaCore.mod.OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.OffsetDateTime]
  
  inline def ofInstant(instant: typings.jsJodaCore.mod.Instant, zone: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.OffsetDateTime]
  
  inline def parse(text: String): typings.jsJodaCore.mod.OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.OffsetDateTime]
  inline def parse(text: String, formatter: typings.jsJodaCore.mod.DateTimeFormatter): typings.jsJodaCore.mod.OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.OffsetDateTime]
}
