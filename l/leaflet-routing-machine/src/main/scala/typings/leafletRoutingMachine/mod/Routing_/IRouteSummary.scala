package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IRouteSummary extends js.Object {
  var totalDistance: Double
  var totalTime: Double
}

object IRouteSummary {
  @scala.inline
  def apply(totalDistance: Double, totalTime: Double): IRouteSummary = {
    val __obj = js.Dynamic.literal(totalDistance = totalDistance.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteSummary]
  }
}

