package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBoxOptions extends js.Object {
  var bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral
}

object SearchBoxOptions {
  @scala.inline
  def apply(
    bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral
  ): SearchBoxOptions = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchBoxOptions]
  }
}

