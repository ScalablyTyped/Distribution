package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneId")
@js.native
class ZoneId ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId {
  /* CompleteClass */
  override def equals(other: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def normalized(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId = js.native
  /* CompleteClass */
  override def rules(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneRules = js.native
}

@JSImport("js-joda", "ZoneId")
@js.native
object ZoneId extends js.Object {
  var SYSTEM: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId = js.native
  var UTC: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId = js.native
  def getAvailableZoneIds(): js.Array[java.lang.String] = js.native
  def of(zoneId: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId = js.native
  def ofOffset(prefix: java.lang.String, offset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId = js.native
  def systemDefault(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId = js.native
}

