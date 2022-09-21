package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.Duration")
@js.native
/* private */ open class Duration ()
  extends typings.jsJodaCore.mod.Duration
/* static members */
object Duration {
  
  @JSGlobal("JSJoda.Duration")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.Duration.ZERO")
  @js.native
  def ZERO: typings.jsJodaCore.mod.Duration = js.native
  inline def ZERO_=(x: typings.jsJodaCore.mod.Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  inline def between(startInclusive: typings.jsJodaCore.mod.Temporal, endExclusive: typings.jsJodaCore.mod.Temporal): typings.jsJodaCore.mod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(startInclusive.asInstanceOf[js.Any], endExclusive.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.Duration]
  
  inline def from(amount: typings.jsJodaCore.mod.TemporalAmount): typings.jsJodaCore.mod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(amount.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Duration]
  
  inline def of(amount: Double, unit: typings.jsJodaCore.mod.TemporalUnit): typings.jsJodaCore.mod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(amount.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.Duration]
  
  inline def ofDays(days: Double): typings.jsJodaCore.mod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofDays")(days.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Duration]
  
  inline def ofHours(hours: Double): typings.jsJodaCore.mod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofHours")(hours.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Duration]
  
  inline def ofMillis(millis: Double): typings.jsJodaCore.mod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofMillis")(millis.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Duration]
  
  inline def ofMinutes(minutes: Double): typings.jsJodaCore.mod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofMinutes")(minutes.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Duration]
  
  inline def ofNanos(nanos: Double): typings.jsJodaCore.mod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNanos")(nanos.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Duration]
  
  inline def ofSeconds(seconds: Double): typings.jsJodaCore.mod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("ofSeconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Duration]
  inline def ofSeconds(seconds: Double, nanoAdjustment: Double): typings.jsJodaCore.mod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("ofSeconds")(seconds.asInstanceOf[js.Any], nanoAdjustment.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.Duration]
  
  inline def parse(text: String): typings.jsJodaCore.mod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Duration]
}
