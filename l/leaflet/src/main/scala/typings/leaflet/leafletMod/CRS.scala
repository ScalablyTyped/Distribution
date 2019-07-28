package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CRS extends js.Object {
  var code: js.UndefOr[String] = js.native
  var infinite: Boolean = js.native
  var wrapLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var wrapLng: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  def distance(latlng1: LatLngExpression, latlng2: LatLngExpression): Double = js.native
  def getProjectedBounds(zoom: Double): Bounds = js.native
  def latLngToPoint(latlng: LatLngExpression, zoom: Double): Point = js.native
  def pointToLatLng(point: PointExpression, zoom: Double): LatLng = js.native
  def project(latlng: LatLng): Point = js.native
  def project(latlng: LatLngLiteral): Point = js.native
  def scale(zoom: Double): Double = js.native
  def unproject(point: PointExpression): LatLng = js.native
  def wrapLatLng(latlng: LatLng): LatLng = js.native
  def wrapLatLng(latlng: LatLngLiteral): LatLng = js.native
  def zoom(scale: Double): Double = js.native
}

