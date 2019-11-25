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
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElevationResult]
  }
}

