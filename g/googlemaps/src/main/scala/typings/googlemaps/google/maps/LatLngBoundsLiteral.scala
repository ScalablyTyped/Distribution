package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.places._LocationBias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngBoundsLiteral extends _LocationBias {
  var east: Double
  var north: Double
  var south: Double
  var west: Double
}

object LatLngBoundsLiteral {
  @scala.inline
  def apply(east: Double, north: Double, south: Double, west: Double): LatLngBoundsLiteral = {
    val __obj = js.Dynamic.literal(east = east, north = north, south = south, west = west)
  
    __obj.asInstanceOf[LatLngBoundsLiteral]
  }
}

