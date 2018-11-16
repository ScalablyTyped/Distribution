package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.DirectionsService")
@js.native
class DirectionsService () extends js.Object {
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, scala.Unit]
  ): scala.Unit = js.native
}

