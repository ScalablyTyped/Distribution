package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "LatLng")
@js.native
class LatLng protected () extends _LatLngExpression {
  def this(latitude: scala.Double, longitude: scala.Double) = this()
  def this(latitude: scala.Double, longitude: scala.Double, altitude: scala.Double) = this()
  var alt: js.UndefOr[scala.Double] = js.native
  var lat: scala.Double = js.native
  var lng: scala.Double = js.native
  def distanceTo(otherLatLng: LatLngExpression): scala.Double = js.native
  def equals(otherLatLng: LatLngExpression): scala.Boolean = js.native
  def equals(otherLatLng: LatLngExpression, maxMargin: scala.Double): scala.Boolean = js.native
  def toBounds(sizeInMeters: scala.Double): LatLngBounds = js.native
  def wrap(): LatLng = js.native
}

