package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.LocalDate")
@js.native
/* private */ open class LocalDate ()
  extends typings.jsJodaCore.mod.LocalDate
/* static members */
object LocalDate {
  
  @JSGlobal("JSJoda.LocalDate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.LocalDate.EPOCH_0")
  @js.native
  def EPOCH_0: typings.jsJodaCore.mod.LocalDate = js.native
  inline def EPOCH_0_=(x: typings.jsJodaCore.mod.LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPOCH_0")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.LocalDate.FROM")
  @js.native
  def FROM: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.LocalDate] = js.native
  inline def FROM_=(x: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.LocalDate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.LocalDate.MAX")
  @js.native
  def MAX: typings.jsJodaCore.mod.LocalDate = js.native
  inline def MAX_=(x: typings.jsJodaCore.mod.LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.LocalDate.MIN")
  @js.native
  def MIN: typings.jsJodaCore.mod.LocalDate = js.native
  inline def MIN_=(x: typings.jsJodaCore.mod.LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typings.jsJodaCore.mod.TemporalAccessor): typings.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.LocalDate]
  
  inline def now(): typings.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.jsJodaCore.mod.LocalDate]
  inline def now(clockOrZone: typings.jsJodaCore.mod.Clock): typings.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.LocalDate]
  inline def now(clockOrZone: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.LocalDate]
  
  inline def of(year: Double, month: Double, dayOfMonth: Double): typings.jsJodaCore.mod.LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDate]
  inline def of(year: Double, month: typings.jsJodaCore.mod.Month, dayOfMonth: Double): typings.jsJodaCore.mod.LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDate]
  
  inline def ofEpochDay(epochDay: Double): typings.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochDay")(epochDay.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.LocalDate]
  
  inline def ofInstant(instant: typings.jsJodaCore.mod.Instant): typings.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.LocalDate]
  inline def ofInstant(instant: typings.jsJodaCore.mod.Instant, zoneId: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zoneId.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDate]
  
  inline def ofYearDay(year: Double, dayOfYear: Double): typings.jsJodaCore.mod.LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("ofYearDay")(year.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDate]
  
  inline def parse(text: String): typings.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.LocalDate]
  inline def parse(text: String, formatter: typings.jsJodaCore.mod.DateTimeFormatter): typings.jsJodaCore.mod.LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.LocalDate]
}
