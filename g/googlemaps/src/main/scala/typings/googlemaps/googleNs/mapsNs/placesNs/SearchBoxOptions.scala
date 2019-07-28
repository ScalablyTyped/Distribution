package typings.googlemaps.googleNs.mapsNs.placesNs

import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import typings.googlemaps.googleNs.mapsNs.LatLngBoundsLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBoxOptions extends js.Object {
  var bounds: LatLngBounds | LatLngBoundsLiteral
}

object SearchBoxOptions {
  @scala.inline
  def apply(bounds: LatLngBounds | LatLngBoundsLiteral): SearchBoxOptions = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchBoxOptions]
  }
}

