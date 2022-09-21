package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.ZoneRules")
@js.native
abstract class ZoneRules ()
  extends typings.jsJodaCore.mod.ZoneRules
/* static members */
object ZoneRules {
  
  @JSGlobal("JSJoda.ZoneRules")
  @js.native
  val ^ : js.Any = js.native
  
  inline def of(offest: typings.jsJodaCore.mod.ZoneOffset): typings.jsJodaCore.mod.ZoneRules = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(offest.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.ZoneRules]
}
