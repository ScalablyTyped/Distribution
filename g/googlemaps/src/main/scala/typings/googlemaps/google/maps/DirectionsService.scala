package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsService extends js.Object {
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]
  ): Unit
}

object DirectionsService {
  @scala.inline
  def apply(
    route: (DirectionsRequest, js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]) => Unit
  ): DirectionsService = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction2(route))
    __obj.asInstanceOf[DirectionsService]
  }
}

