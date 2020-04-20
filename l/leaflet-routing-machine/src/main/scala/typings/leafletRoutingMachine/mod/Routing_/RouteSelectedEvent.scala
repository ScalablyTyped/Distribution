package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSelectedEvent extends js.Object {
  var route: IRoute
}

object RouteSelectedEvent {
  @scala.inline
  def apply(route: IRoute): RouteSelectedEvent = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSelectedEvent]
  }
}

