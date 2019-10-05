package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationResult extends js.Object {
  var elevation: Double
  var location: LatLng
  var resolution: Double
}

object ElevationResult {
  @scala.inline
  def apply(elevation: Double, location: LatLng, resolution: Double): ElevationResult = {
    val __obj = js.Dynamic.literal(elevation = elevation, location = location, resolution = resolution)
  
    __obj.asInstanceOf[ElevationResult]
  }
}

