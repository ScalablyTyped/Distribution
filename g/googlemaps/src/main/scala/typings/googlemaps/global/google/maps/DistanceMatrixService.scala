package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.DistanceMatrixRequest
import typings.googlemaps.google.maps.DistanceMatrixResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.DistanceMatrixService")
@js.native
class DistanceMatrixService ()
  extends typings.googlemaps.google.maps.DistanceMatrixService {
  /* CompleteClass */
  override def getDistanceMatrix(
    request: DistanceMatrixRequest,
    callback: js.Function2[
      /* response */ DistanceMatrixResponse, 
      /* status */ typings.googlemaps.google.maps.DistanceMatrixStatus, 
      Unit
    ]
  ): Unit = js.native
}

