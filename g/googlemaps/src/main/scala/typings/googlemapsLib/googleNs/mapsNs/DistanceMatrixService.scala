package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.DistanceMatrixService")
@js.native
class DistanceMatrixService () extends js.Object {
  def getDistanceMatrix(
    request: DistanceMatrixRequest,
    callback: js.Function2[/* response */ DistanceMatrixResponse, /* status */ DistanceMatrixStatus, scala.Unit]
  ): scala.Unit = js.native
}

