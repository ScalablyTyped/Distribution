package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneRegion")
@js.native
class ZoneRegion ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneRegion {
  /* CompleteClass */
  override def equals(other: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def id(): java.lang.String = js.native
  /* CompleteClass */
  override def normalized(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId = js.native
  /* CompleteClass */
  override def rules(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneRules = js.native
}

/* static members */
@JSImport("js-joda", "ZoneRegion")
@js.native
object ZoneRegion extends js.Object {
  def ofId(zoneId: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId = js.native
}

