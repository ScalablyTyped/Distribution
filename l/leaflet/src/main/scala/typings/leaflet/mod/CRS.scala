package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CRS extends js.Object {
  var code: js.UndefOr[String] = js.native
  var infinite: Boolean = js.native
  var wrapLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var wrapLng: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  def distance(latlng1: LatLngExpression, latlng2: LatLngExpression): Double = js.native
  def getProjectedBounds(zoom: Double): Bounds_ = js.native
  def latLngToPoint(latlng: LatLngExpression, zoom: Double): Point_ = js.native
  def pointToLatLng(point: PointExpression, zoom: Double): LatLng_ = js.native
  def project(latlng: LatLngLiteral): Point_ = js.native
  def project(latlng: LatLng_): Point_ = js.native
  def scale(zoom: Double): Double = js.native
  def unproject(point: PointExpression): LatLng_ = js.native
  def wrapLatLng(latlng: LatLngLiteral): LatLng_ = js.native
  def wrapLatLng(latlng: LatLng_): LatLng_ = js.native
  def zoom(scale: Double): Double = js.native
}

@JSImport("leaflet", "CRS")
@js.native
object CRS extends js.Object {
  val EPSG3395: CRS = js.native
  val EPSG3857: CRS = js.native
  val EPSG4326: CRS = js.native
  val Earth: CRS = js.native
  val Simple: CRS = js.native
}

