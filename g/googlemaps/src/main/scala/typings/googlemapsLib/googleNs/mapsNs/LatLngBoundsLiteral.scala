package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngBoundsLiteral
  extends googlemapsLib.googleNs.mapsNs.placesNs._LocationBias {
  var east: scala.Double
  var north: scala.Double
  var south: scala.Double
  var west: scala.Double
}

object LatLngBoundsLiteral {
  @scala.inline
  def apply(east: scala.Double, north: scala.Double, south: scala.Double, west: scala.Double): LatLngBoundsLiteral = {
    val __obj = js.Dynamic.literal(east = east, north = north, south = south, west = west)
  
    __obj.asInstanceOf[LatLngBoundsLiteral]
  }
}

