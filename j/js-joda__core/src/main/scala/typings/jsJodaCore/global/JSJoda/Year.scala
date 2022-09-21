package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.Year")
@js.native
/* private */ open class Year ()
  extends typings.jsJodaCore.mod.Year
/* static members */
object Year {
  
  @JSGlobal("JSJoda.Year")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.Year.FROM")
  @js.native
  def FROM: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.Year] = js.native
  inline def FROM_=(x: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.Year]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.Year.MAX_VALUE")
  @js.native
  def MAX_VALUE: Double = js.native
  inline def MAX_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.Year.MIN_VALUE")
  @js.native
  def MIN_VALUE: Double = js.native
  inline def MIN_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typings.jsJodaCore.mod.TemporalAccessor): typings.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Year]
  
  inline def isLeap(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeap")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def now(): typings.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.jsJodaCore.mod.Year]
  inline def now(zoneIdOrClock: typings.jsJodaCore.mod.Clock): typings.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Year]
  inline def now(zoneIdOrClock: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Year]
  
  inline def of(isoYear: Double): typings.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(isoYear.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Year]
  
  inline def parse(text: String): typings.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Year]
  inline def parse(text: String, formatter: typings.jsJodaCore.mod.DateTimeFormatter): typings.jsJodaCore.mod.Year = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.Year]
}
