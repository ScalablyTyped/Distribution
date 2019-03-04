package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationResult extends js.Object {
  var elevation: scala.Double
  var location: LatLng
  var resolution: scala.Double
}

object ElevationResult {
  @scala.inline
  def apply(elevation: scala.Double, location: LatLng, resolution: scala.Double): ElevationResult = {
    val __obj = js.Dynamic.literal(elevation = elevation, location = location, resolution = resolution)
  
    __obj.asInstanceOf[ElevationResult]
  }
}

