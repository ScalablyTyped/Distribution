package typings.leaflet.mod

import typings.leaflet.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "latLng")
@js.native
object latLng extends js.Object {
  
  def apply(coords: js.Tuple3[Double, Double, Double]): LatLng_ = js.native
  def apply(coords: Alt): LatLng_ = js.native
  def apply(coords: LatLngLiteral): LatLng_ = js.native
  def apply(coords: LatLngTuple): LatLng_ = js.native
  def apply(latitude: Double, longitude: Double): LatLng_ = js.native
  def apply(latitude: Double, longitude: Double, altitude: Double): LatLng_ = js.native
}
