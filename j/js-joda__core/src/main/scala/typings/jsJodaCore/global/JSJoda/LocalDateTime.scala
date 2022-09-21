package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.LocalDateTime")
@js.native
/* private */ open class LocalDateTime ()
  extends typings.jsJodaCore.mod.LocalDateTime
/* static members */
object LocalDateTime {
  
  @JSGlobal("JSJoda.LocalDateTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.LocalDateTime.FROM")
  @js.native
  def FROM: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.LocalDateTime] = js.native
  inline def FROM_=(x: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.LocalDateTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.LocalDateTime.MAX")
  @js.native
  def MAX: typings.jsJodaCore.mod.LocalDateTime = js.native
  inline def MAX_=(x: typings.jsJodaCore.mod.LocalDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.LocalDateTime.MIN")
  @js.native
  def MIN: typings.jsJodaCore.mod.LocalDateTime = js.native
  inline def MIN_=(x: typings.jsJodaCore.mod.LocalDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typings.jsJodaCore.mod.TemporalAccessor): typings.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  
  inline def now(): typings.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def now(clockOrZone: typings.jsJodaCore.mod.Clock): typings.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def now(clockOrZone: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  
  inline def of(date: typings.jsJodaCore.mod.LocalDate, time: typings.jsJodaCore.mod.LocalTime): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double, minute: Double): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double, minute: Double, second: Double): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double, minute: Unit, second: Double): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Unit, minute: Double): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Unit, minute: Double, second: Double): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Unit, minute: Unit, second: Double): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: typings.jsJodaCore.mod.Month, dayOfMonth: Double): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: typings.jsJodaCore.mod.Month, dayOfMonth: Double, hour: Double): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: typings.jsJodaCore.mod.Month, dayOfMonth: Double, hour: Unit, minute: Double): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typings.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  
  inline def ofEpochSecond(epochSecond: Double, nanoOfSecond: Double, offset: typings.jsJodaCore.mod.ZoneOffset): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochSecond")(epochSecond.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def ofEpochSecond(epochSecond: Double, offset: typings.jsJodaCore.mod.ZoneOffset): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochSecond")(epochSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  
  inline def ofInstant(instant: typings.jsJodaCore.mod.Instant): typings.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def ofInstant(instant: typings.jsJodaCore.mod.Instant, zoneId: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zoneId.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  
  inline def parse(text: String): typings.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
  inline def parse(text: String, formatter: typings.jsJodaCore.mod.DateTimeFormatter): typings.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDateTime]
}
