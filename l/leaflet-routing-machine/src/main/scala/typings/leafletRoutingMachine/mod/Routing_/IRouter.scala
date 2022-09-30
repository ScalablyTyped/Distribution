package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
@js.native
trait IRouter extends StObject {
  
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function2[/* error */ js.UndefOr[IError], /* routes */ js.UndefOr[js.Array[IRoute]], Any]
  ): Unit = js.native
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function2[/* error */ js.UndefOr[IError], /* routes */ js.UndefOr[js.Array[IRoute]], Any],
    context: js.Object
  ): Unit = js.native
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function2[/* error */ js.UndefOr[IError], /* routes */ js.UndefOr[js.Array[IRoute]], Any],
    context: js.Object,
    options: RoutingOptions
  ): Unit = js.native
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function2[/* error */ js.UndefOr[IError], /* routes */ js.UndefOr[js.Array[IRoute]], Any],
    context: Unit,
    options: RoutingOptions
  ): Unit = js.native
}
