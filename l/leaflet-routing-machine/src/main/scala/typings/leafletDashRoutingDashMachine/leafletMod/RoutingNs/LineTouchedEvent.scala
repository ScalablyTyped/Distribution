package typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineTouchedEvent extends js.Object {
  var afterIndex: Double
  var latlng: Double
}

object LineTouchedEvent {
  @scala.inline
  def apply(afterIndex: Double, latlng: Double): LineTouchedEvent = {
    val __obj = js.Dynamic.literal(afterIndex = afterIndex, latlng = latlng)
  
    __obj.asInstanceOf[LineTouchedEvent]
  }
}

