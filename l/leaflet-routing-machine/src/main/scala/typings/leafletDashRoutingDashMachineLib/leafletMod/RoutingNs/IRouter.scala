package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait IRouter extends js.Object {
  def route(
    waypoints: js.Array[Waypoint],
    callback: js.Function2[/* error */ js.UndefOr[IError], /* routes */ js.UndefOr[js.Array[IRoute]], _]
  ): scala.Unit = js.native
  def route(
    waypoints: js.Array[Waypoint],
    callback: js.Function2[/* error */ js.UndefOr[IError], /* routes */ js.UndefOr[js.Array[IRoute]], _],
    context: js.Object
  ): scala.Unit = js.native
  def route(
    waypoints: js.Array[Waypoint],
    callback: js.Function2[/* error */ js.UndefOr[IError], /* routes */ js.UndefOr[js.Array[IRoute]], _],
    context: js.Object,
    options: RoutingOptions
  ): scala.Unit = js.native
}

