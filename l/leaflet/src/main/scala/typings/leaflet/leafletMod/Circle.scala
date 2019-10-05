package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Circle")
@js.native
class Circle[P] protected () extends CircleMarker[P] {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: CircleMarkerOptions) = this()
  def this(latlng: LatLngExpression, radius: Double) = this()
  def this(latlng: LatLngExpression, radius: Double, options: CircleMarkerOptions) = this()
   // deprecated!
  def getBounds(): LatLngBounds = js.native
}

@JSImport("leaflet", "circle")
@js.native
object circle extends js.Object {
  def apply(latlng: LatLngExpression): Circle[_] = js.native
  def apply(latlng: LatLngExpression, options: CircleMarkerOptions): Circle[_] = js.native
  def apply(latlng: LatLngExpression, radius: Double): Circle[_] = js.native
  def apply(latlng: LatLngExpression, radius: Double, options: CircleMarkerOptions): Circle[_] = js.native
}

