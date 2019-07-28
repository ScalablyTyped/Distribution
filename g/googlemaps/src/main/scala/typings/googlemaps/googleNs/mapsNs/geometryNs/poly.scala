package typings.googlemaps.googleNs.mapsNs.geometryNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.Polygon
import typings.googlemaps.googleNs.mapsNs.Polyline
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
  def containsLocation(point: LatLng, polygon: Polygon): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polygon): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polygon, tolerance: Double): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polyline): Boolean = js.native
  def isLocationOnEdge(point: LatLng, poly: Polyline, tolerance: Double): Boolean = js.native
}

