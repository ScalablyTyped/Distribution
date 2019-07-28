package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationElevationRequest extends js.Object {
  var locations: js.Array[LatLng]
}

object LocationElevationRequest {
  @scala.inline
  def apply(locations: js.Array[LatLng]): LocationElevationRequest = {
    val __obj = js.Dynamic.literal(locations = locations)
  
    __obj.asInstanceOf[LocationElevationRequest]
  }
}

