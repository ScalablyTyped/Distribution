package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.YearMonth")
@js.native
/* private */ open class YearMonth ()
  extends typings.jsJodaCore.mod.YearMonth
/* static members */
object YearMonth {
  
  @JSGlobal("JSJoda.YearMonth")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.YearMonth.FROM")
  @js.native
  def FROM: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.YearMonth] = js.native
  inline def FROM_=(x: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.YearMonth]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typings.jsJodaCore.mod.TemporalAccessor): typings.jsJodaCore.mod.YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.YearMonth]
  
  inline def now(): typings.jsJodaCore.mod.YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.jsJodaCore.mod.YearMonth]
  inline def now(zoneIdOrClock: typings.jsJodaCore.mod.Clock): typings.jsJodaCore.mod.YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.YearMonth]
  inline def now(zoneIdOrClock: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.YearMonth]
  
  inline def of(year: Double, monthOrNumber: Double): typings.jsJodaCore.mod.YearMonth = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], monthOrNumber.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.YearMonth]
  inline def of(year: Double, monthOrNumber: typings.jsJodaCore.mod.Month): typings.jsJodaCore.mod.YearMonth = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], monthOrNumber.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.YearMonth]
  
  inline def parse(text: String): typings.jsJodaCore.mod.YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.YearMonth]
  inline def parse(text: String, formatter: typings.jsJodaCore.mod.DateTimeFormatter): typings.jsJodaCore.mod.YearMonth = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.YearMonth]
}
