package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "ZoneRulesProvider")
@js.native
open class ZoneRulesProvider () extends StObject
/* static members */
object ZoneRulesProvider {
  
  @JSImport("@js-joda/core", "ZoneRulesProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAvailableZoneIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableZoneIds")().asInstanceOf[js.Array[String]]
  
  inline def getRules(zoneId: String): ZoneRules = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")(zoneId.asInstanceOf[js.Any]).asInstanceOf[ZoneRules]
}
