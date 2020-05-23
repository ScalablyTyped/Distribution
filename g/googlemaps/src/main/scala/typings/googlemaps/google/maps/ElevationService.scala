package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationService extends js.Object {
  def getElevationAlongPath(
    request: PathElevationRequest,
    callback: js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]
  ): Unit
  def getElevationForLocations(
    request: LocationElevationRequest,
    callback: js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]
  ): Unit
}

object ElevationService {
  @scala.inline
  def apply(
    getElevationAlongPath: (PathElevationRequest, js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]) => Unit,
    getElevationForLocations: (LocationElevationRequest, js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]) => Unit
  ): ElevationService = {
    val __obj = js.Dynamic.literal(getElevationAlongPath = js.Any.fromFunction2(getElevationAlongPath), getElevationForLocations = js.Any.fromFunction2(getElevationForLocations))
    __obj.asInstanceOf[ElevationService]
  }
}

