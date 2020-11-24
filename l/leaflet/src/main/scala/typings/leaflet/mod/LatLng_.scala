package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "LatLng")
@js.native
class LatLng_ protected () extends _LatLngExpression {
  def this(latitude: Double, longitude: Double) = this()
  def this(latitude: Double, longitude: Double, altitude: Double) = this()
  
  var alt: js.UndefOr[Double] = js.native
  
  def distanceTo(otherLatLng: LatLngExpression): Double = js.native
  
  def equals(otherLatLng: LatLngExpression): Boolean = js.native
  def equals(otherLatLng: LatLngExpression, maxMargin: Double): Boolean = js.native
  
  var lat: Double = js.native
  
  var lng: Double = js.native
  
  def toBounds(sizeInMeters: Double): LatLngBounds_ = js.native
  
  def wrap(): LatLng_ = js.native
}
