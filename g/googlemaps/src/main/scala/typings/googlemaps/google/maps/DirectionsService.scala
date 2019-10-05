package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.DirectionsService")
@js.native
class DirectionsService () extends js.Object {
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]
  ): Unit = js.native
}

