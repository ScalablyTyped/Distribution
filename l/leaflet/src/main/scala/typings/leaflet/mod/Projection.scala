package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projection extends StObject {
  
  var bounds: Bounds_ = js.native
  
  def project(latlng: LatLngLiteral): Point_ = js.native
  def project(latlng: LatLng_): Point_ = js.native
  
  def unproject(point: PointExpression): LatLng_ = js.native
}
object Projection {
  
  @JSImport("leaflet", "Projection.LonLat")
  @js.native
  val LonLat: Projection = js.native
  
  @JSImport("leaflet", "Projection.Mercator")
  @js.native
  val Mercator: Projection = js.native
  
  @JSImport("leaflet", "Projection.SphericalMercator")
  @js.native
  val SphericalMercator: Projection = js.native
}
