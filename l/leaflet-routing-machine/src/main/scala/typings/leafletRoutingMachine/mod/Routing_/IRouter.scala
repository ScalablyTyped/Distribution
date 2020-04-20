package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait IRouter extends js.Object {
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function2[/* error */ js.UndefOr[IError], /* routes */ js.UndefOr[js.Array[IRoute]], _]
  ): Unit = js.native
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function2[/* error */ js.UndefOr[IError], /* routes */ js.UndefOr[js.Array[IRoute]], _],
    context: js.Object
  ): Unit = js.native
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function2[/* error */ js.UndefOr[IError], /* routes */ js.UndefOr[js.Array[IRoute]], _],
    context: js.Object,
    options: RoutingOptions
  ): Unit = js.native
}

