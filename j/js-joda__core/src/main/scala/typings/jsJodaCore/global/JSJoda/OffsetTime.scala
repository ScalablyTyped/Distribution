package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.OffsetTime")
@js.native
/* private */ open class OffsetTime ()
  extends typings.jsJodaCore.mod.OffsetTime
/* static members */
object OffsetTime {
  
  @JSGlobal("JSJoda.OffsetTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.OffsetTime.FROM")
  @js.native
  def FROM: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.OffsetTime] = js.native
  inline def FROM_=(x: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.OffsetTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.OffsetTime.MAX")
  @js.native
  def MAX: typings.jsJodaCore.mod.OffsetTime = js.native
  inline def MAX_=(x: typings.jsJodaCore.mod.OffsetTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.OffsetTime.MIN")
  @js.native
  def MIN: typings.jsJodaCore.mod.OffsetTime = js.native
  inline def MIN_=(x: typings.jsJodaCore.mod.OffsetTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typings.jsJodaCore.mod.TemporalAccessor): typings.jsJodaCore.mod.OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.OffsetTime]
  
  inline def now(): typings.jsJodaCore.mod.OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.jsJodaCore.mod.OffsetTime]
  inline def now(clockOrZone: typings.jsJodaCore.mod.Clock): typings.jsJodaCore.mod.OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.OffsetTime]
  inline def now(clockOrZone: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.OffsetTime]
  
  inline def of(
    hour: Double,
    minute: Double,
    second: Double,
    nanoOfSecond: Double,
    offset: typings.jsJodaCore.mod.ZoneOffset
  ): typings.jsJodaCore.mod.OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.OffsetTime]
  inline def of(time: typings.jsJodaCore.mod.LocalTime, offset: typings.jsJodaCore.mod.ZoneOffset): typings.jsJodaCore.mod.OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.OffsetTime]
  
  inline def ofInstant(instant: typings.jsJodaCore.mod.Instant, zone: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.OffsetTime]
  
  inline def parse(text: String): typings.jsJodaCore.mod.OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.OffsetTime]
  inline def parse(text: String, formatter: typings.jsJodaCore.mod.DateTimeFormatter): typings.jsJodaCore.mod.OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.OffsetTime]
}
