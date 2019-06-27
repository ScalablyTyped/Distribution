package typings
package jsDashJodaLib.jsDashJodaMod

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
  def getAvailableZoneIds(): js.Array[java.lang.String] = js.native
  def getRules(zoneId: java.lang.String): jsDashJodaLib.jsDashJodaMod.ZoneRules = js.native
}

