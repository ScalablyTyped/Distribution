package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.MonthDay")
@js.native
/* private */ open class MonthDay ()
  extends typings.jsJodaCore.mod.MonthDay
/* static members */
object MonthDay {
  
  @JSGlobal("JSJoda.MonthDay")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.MonthDay.FROM")
  @js.native
  def FROM: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.MonthDay] = js.native
  inline def FROM_=(x: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.MonthDay]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typings.jsJodaCore.mod.TemporalAccessor): typings.jsJodaCore.mod.MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.MonthDay]
  
  inline def now(): typings.jsJodaCore.mod.MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.jsJodaCore.mod.MonthDay]
  inline def now(zoneIdOrClock: typings.jsJodaCore.mod.Clock): typings.jsJodaCore.mod.MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.MonthDay]
  inline def now(zoneIdOrClock: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.MonthDay]
  
  inline def of(month: Double, dayOfMonth: Double): typings.jsJodaCore.mod.MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.MonthDay]
  inline def of(month: typings.jsJodaCore.mod.Month, dayOfMonth: Double): typings.jsJodaCore.mod.MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.MonthDay]
  
  inline def parse(text: String): typings.jsJodaCore.mod.MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.MonthDay]
  inline def parse(text: String, formatter: typings.jsJodaCore.mod.DateTimeFormatter): typings.jsJodaCore.mod.MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.MonthDay]
}
