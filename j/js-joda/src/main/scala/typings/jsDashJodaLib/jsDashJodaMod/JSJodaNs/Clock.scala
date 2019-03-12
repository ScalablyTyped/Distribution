package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clock extends js.Object {
  def instant(): Instant
  def millis(): scala.Double
  def zone(): js.Any
}

object Clock {
  @scala.inline
  def apply(instant: () => Instant, millis: () => scala.Double, zone: () => js.Any): Clock = {
    val __obj = js.Dynamic.literal(instant = js.Any.fromFunction0(instant), millis = js.Any.fromFunction0(millis), zone = js.Any.fromFunction0(zone))
  
    __obj.asInstanceOf[Clock]
  }
}

