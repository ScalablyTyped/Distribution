package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("JSJoda.Clock")
@js.native
open class Clock ()
  extends typings.jsJodaCore.mod.Clock
/* static members */
object Clock {
  
  @JSGlobal("JSJoda.Clock")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixed(fixedInstant: typings.jsJodaCore.mod.Instant, zoneId: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.Clock = (^.asInstanceOf[js.Dynamic].applyDynamic("fixed")(fixedInstant.asInstanceOf[js.Any], zoneId.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.Clock]
  
  inline def offset(baseClock: typings.jsJodaCore.mod.Clock, offsetDuration: typings.jsJodaCore.mod.Duration): typings.jsJodaCore.mod.Clock = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(baseClock.asInstanceOf[js.Any], offsetDuration.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.Clock]
  
  inline def system(zone: typings.jsJodaCore.mod.ZoneId): typings.jsJodaCore.mod.Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("system")(zone.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Clock]
  
  inline def systemDefaultZone(): typings.jsJodaCore.mod.Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("systemDefaultZone")().asInstanceOf[typings.jsJodaCore.mod.Clock]
  
  inline def systemUTC(): typings.jsJodaCore.mod.Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("systemUTC")().asInstanceOf[typings.jsJodaCore.mod.Clock]
}
