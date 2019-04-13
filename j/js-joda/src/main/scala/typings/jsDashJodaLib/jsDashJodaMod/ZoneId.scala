package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneId")
@js.native
abstract class ZoneId () extends js.Object {
  def equals(other: js.Any): scala.Boolean = js.native
  def id(): java.lang.String = js.native
  def normalized(): ZoneId = js.native
  def rules(): ZoneRules = js.native
}

/* static members */
@JSImport("js-joda", "ZoneId")
@js.native
object ZoneId extends js.Object {
  var SYSTEM: jsDashJodaLib.jsDashJodaMod.ZoneId = js.native
  var UTC: jsDashJodaLib.jsDashJodaMod.ZoneId = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.ZoneId = js.native
  def getAvailableZoneIds(): js.Array[java.lang.String] = js.native
  def of(zoneId: java.lang.String): jsDashJodaLib.jsDashJodaMod.ZoneId = js.native
  def ofOffset(prefix: java.lang.String, offset: jsDashJodaLib.jsDashJodaMod.ZoneOffset): jsDashJodaLib.jsDashJodaMod.ZoneId = js.native
  def systemDefault(): jsDashJodaLib.jsDashJodaMod.ZoneId = js.native
}

