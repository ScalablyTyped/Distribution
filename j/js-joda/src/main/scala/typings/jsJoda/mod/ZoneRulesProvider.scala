package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ZoneRulesProvider")
@js.native
class ZoneRulesProvider () extends StObject
object ZoneRulesProvider {
  
  /* static member */
  @JSImport("js-joda", "ZoneRulesProvider.getAvailableZoneIds")
  @js.native
  def getAvailableZoneIds(): js.Array[String] = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneRulesProvider.getRules")
  @js.native
  def getRules(zoneId: String): ZoneRules = js.native
}
