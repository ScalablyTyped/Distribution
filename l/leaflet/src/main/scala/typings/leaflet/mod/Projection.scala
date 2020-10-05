package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projection extends js.Object {
  var bounds: Bounds_ = js.native
  def project(latlng: LatLngLiteral): Point_ = js.native
  def project(latlng: LatLng_): Point_ = js.native
  def unproject(point: PointExpression): LatLng_ = js.native
}

@JSImport("leaflet", "Projection")
@js.native
object Projection extends js.Object {
  val LonLat: Projection = js.native
  val Mercator: Projection = js.native
  val SphericalMercator: Projection = js.native
}

