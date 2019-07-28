package typings.jsDashJoda.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Clock")
@js.native
abstract class Clock () extends js.Object {
  def instant(): Instant = js.native
  def millis(): Double = js.native
  def zone(): js.Any = js.native
}

/* static members */
@JSImport("js-joda", "Clock")
@js.native
object Clock extends js.Object {
  def fixed(fixedInstant: Instant, zoneOffset: ZoneOffset): Clock = js.native
  def system(zone: ZoneId): Clock = js.native
  def systemDefaultZone(): Clock = js.native
  def systemUTC(): Clock = js.native
}

