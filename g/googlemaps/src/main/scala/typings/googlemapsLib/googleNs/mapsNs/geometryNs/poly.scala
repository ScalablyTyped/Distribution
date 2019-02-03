package typings
package googlemapsLib.googleNs.mapsNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.geometry.poly")
@js.native
class poly () extends js.Object

/* static members */
@JSGlobal("google.maps.geometry.poly")
@js.native
object poly extends js.Object {
  def containsLocation(point: googlemapsLib.googleNs.mapsNs.LatLng, polygon: googlemapsLib.googleNs.mapsNs.Polygon): scala.Boolean = js.native
  def isLocationOnEdge(point: googlemapsLib.googleNs.mapsNs.LatLng, poly: googlemapsLib.googleNs.mapsNs.Polygon): scala.Boolean = js.native
  def isLocationOnEdge(
    point: googlemapsLib.googleNs.mapsNs.LatLng,
    poly: googlemapsLib.googleNs.mapsNs.Polygon,
    tolerance: scala.Double
  ): scala.Boolean = js.native
  def isLocationOnEdge(point: googlemapsLib.googleNs.mapsNs.LatLng, poly: googlemapsLib.googleNs.mapsNs.Polyline): scala.Boolean = js.native
  def isLocationOnEdge(
    point: googlemapsLib.googleNs.mapsNs.LatLng,
    poly: googlemapsLib.googleNs.mapsNs.Polyline,
    tolerance: scala.Double
  ): scala.Boolean = js.native
}

