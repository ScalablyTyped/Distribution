package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ZoneRulesProvider")
@js.native
class ZoneRulesProvider () extends StObject
object ZoneRulesProvider {
  
  @JSImport("js-joda", "ZoneRulesProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getAvailableZoneIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableZoneIds")().asInstanceOf[js.Array[String]]
  
  /* static member */
  inline def getRules(zoneId: String): ZoneRules = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")(zoneId.asInstanceOf[js.Any]).asInstanceOf[ZoneRules]
}
