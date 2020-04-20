package typings.leafletRoutingMachine.mod.Routing_

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
    val __obj = js.Dynamic.literal(afterIndex = afterIndex.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineTouchedEvent]
  }
}

