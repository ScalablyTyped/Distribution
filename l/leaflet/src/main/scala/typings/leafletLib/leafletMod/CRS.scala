package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CRS extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.native
  var infinite: scala.Boolean = js.native
  var wrapLat: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.native
  var wrapLng: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.native
  def distance(latlng1: LatLngExpression, latlng2: LatLngExpression): scala.Double = js.native
  def getProjectedBounds(zoom: scala.Double): Bounds = js.native
  def latLngToPoint(latlng: LatLngExpression, zoom: scala.Double): Point = js.native
  def pointToLatLng(point: PointExpression, zoom: scala.Double): LatLng = js.native
  def project(latlng: LatLng): Point = js.native
  def project(latlng: LatLngLiteral): Point = js.native
  def scale(zoom: scala.Double): scala.Double = js.native
  def unproject(point: PointExpression): LatLng = js.native
  def wrapLatLng(latlng: LatLng): LatLng = js.native
  def wrapLatLng(latlng: LatLngLiteral): LatLng = js.native
  def zoom(scale: scala.Double): scala.Double = js.native
}

