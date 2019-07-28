package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.ElevationService")
@js.native
class ElevationService () extends js.Object {
  def getElevationAlongPath(
    request: PathElevationRequest,
    callback: js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]
  ): Unit = js.native
  def getElevationForLocations(
    request: LocationElevationRequest,
    callback: js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]
  ): Unit = js.native
}

