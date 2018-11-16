package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name

trait IRoute extends js.Object {
  var coordinates: js.UndefOr[js.Array[leafletLib.leafletMod.LatLng]] = js.undefined
  var instructions: js.UndefOr[js.Array[IInstruction]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var summary: js.UndefOr[IRouteSummary] = js.undefined
  var waypoints: js.UndefOr[js.Array[leafletLib.leafletMod.LatLng]] = js.undefined
}

