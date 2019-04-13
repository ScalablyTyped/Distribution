package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Clock")
@js.native
abstract class Clock () extends js.Object {
  def instant(): Instant = js.native
  def millis(): scala.Double = js.native
  def zone(): js.Any = js.native
}

/* static members */
@JSImport("js-joda", "Clock")
@js.native
object Clock extends js.Object {
  def fixed(
    fixedInstant: jsDashJodaLib.jsDashJodaMod.Instant,
    zoneOffset: jsDashJodaLib.jsDashJodaMod.ZoneOffset
  ): jsDashJodaLib.jsDashJodaMod.Clock = js.native
  def system(zone: jsDashJodaLib.jsDashJodaMod.ZoneId): jsDashJodaLib.jsDashJodaMod.Clock = js.native
  def systemDefaultZone(): jsDashJodaLib.jsDashJodaMod.Clock = js.native
  def systemUTC(): jsDashJodaLib.jsDashJodaMod.Clock = js.native
}

