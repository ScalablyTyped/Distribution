package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineTouchedEvent extends js.Object {
  var afterIndex: scala.Double
  var latlng: scala.Double
}

object LineTouchedEvent {
  @scala.inline
  def apply(afterIndex: scala.Double, latlng: scala.Double): LineTouchedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterIndex")(afterIndex)
    __obj.updateDynamic("latlng")(latlng)
    __obj.asInstanceOf[LineTouchedEvent]
  }
}

