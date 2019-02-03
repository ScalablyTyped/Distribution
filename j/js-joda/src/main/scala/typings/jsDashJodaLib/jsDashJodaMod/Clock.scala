package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Clock")
@js.native
abstract class Clock ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock {
  /* CompleteClass */
  override def instant(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  /* CompleteClass */
  override def millis(): scala.Double = js.native
  /* CompleteClass */
  override def zone(): js.Any = js.native
}

/* static members */
@JSImport("js-joda", "Clock")
@js.native
object Clock extends js.Object {
  def fixed(
    fixedInstant: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant,
    zoneOffset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock = js.native
  def system(zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock = js.native
  def systemDefaultZone(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock = js.native
  def systemUTC(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock = js.native
}

