package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.Period")
@js.native
/* private */ open class Period ()
  extends typings.jsJodaCore.mod.Period
/* static members */
object Period {
  
  @JSGlobal("JSJoda.Period")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.Period.ZERO")
  @js.native
  def ZERO: typings.jsJodaCore.mod.Period = js.native
  inline def ZERO_=(x: typings.jsJodaCore.mod.Period): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  inline def between(startDate: typings.jsJodaCore.mod.LocalDate, endDate: typings.jsJodaCore.mod.LocalDate): typings.jsJodaCore.mod.Period = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.Period]
  
  inline def from(amount: typings.jsJodaCore.mod.TemporalAmount): typings.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(amount.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Period]
  
  inline def of(years: Double, months: Double, days: Double): typings.jsJodaCore.mod.Period = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(years.asInstanceOf[js.Any], months.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.Period]
  
  inline def ofDays(days: Double): typings.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofDays")(days.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Period]
  
  inline def ofMonths(months: Double): typings.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofMonths")(months.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Period]
  
  inline def ofWeeks(weeks: Double): typings.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofWeeks")(weeks.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Period]
  
  inline def ofYears(years: Double): typings.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofYears")(years.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Period]
  
  inline def parse(text: String): typings.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Period]
}
