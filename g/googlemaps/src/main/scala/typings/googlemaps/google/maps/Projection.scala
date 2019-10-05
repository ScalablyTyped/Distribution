package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  def fromLatLngToPoint(latLng: LatLng): Point = js.native
  def fromLatLngToPoint(latLng: LatLng, point: Point): Point = js.native
  def fromPointToLatLng(pixel: Point): LatLng = js.native
  def fromPointToLatLng(pixel: Point, noWrap: Boolean): LatLng = js.native
}

