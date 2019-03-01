package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelayEndEvents extends js.Object {
  var delayEndEvents: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DelayEndEvents {
  @scala.inline
  def apply(delayEndEvents: scala.Int | scala.Double = null): Anon_DelayEndEvents = {
    val __obj = js.Dynamic.literal()
    if (delayEndEvents != null) __obj.updateDynamic("delayEndEvents")(delayEndEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DelayEndEvents]
  }
}

