package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IRouteSummary extends js.Object {
  var totalDistance: scala.Double
  var totalTime: scala.Double
}

object IRouteSummary {
  @scala.inline
  def apply(totalDistance: scala.Double, totalTime: scala.Double): IRouteSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("totalDistance")(totalDistance)
    __obj.updateDynamic("totalTime")(totalTime)
    __obj.asInstanceOf[IRouteSummary]
  }
}

