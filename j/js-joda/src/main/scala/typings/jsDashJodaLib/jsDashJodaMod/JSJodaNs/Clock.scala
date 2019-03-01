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
  def apply(instant: js.Function0[Instant], millis: js.Function0[scala.Double], zone: js.Function0[js.Any]): Clock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instant")(instant)
    __obj.updateDynamic("millis")(millis)
    __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[Clock]
  }
}

