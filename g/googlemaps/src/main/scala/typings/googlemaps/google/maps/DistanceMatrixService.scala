package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMatrixService extends js.Object {
  def getDistanceMatrix(
    request: DistanceMatrixRequest,
    callback: js.Function2[/* response */ DistanceMatrixResponse, /* status */ DistanceMatrixStatus, Unit]
  ): Unit
}

object DistanceMatrixService {
  @scala.inline
  def apply(
    getDistanceMatrix: (DistanceMatrixRequest, js.Function2[/* response */ DistanceMatrixResponse, /* status */ DistanceMatrixStatus, Unit]) => Unit
  ): DistanceMatrixService = {
    val __obj = js.Dynamic.literal(getDistanceMatrix = js.Any.fromFunction2(getDistanceMatrix))
    __obj.asInstanceOf[DistanceMatrixService]
  }
}

