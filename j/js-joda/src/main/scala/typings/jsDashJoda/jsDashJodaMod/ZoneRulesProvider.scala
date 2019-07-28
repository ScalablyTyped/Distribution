package typings.jsDashJoda.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneRulesProvider")
@js.native
class ZoneRulesProvider () extends js.Object

/* static members */
@JSImport("js-joda", "ZoneRulesProvider")
@js.native
object ZoneRulesProvider extends js.Object {
  def getAvailableZoneIds(): js.Array[String] = js.native
  def getRules(zoneId: String): ZoneRules = js.native
}

