package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Circle")
@js.native
class Circle[P] protected () extends CircleMarker[P] {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: CircleMarkerOptions) = this()
  def this(latlng: LatLngExpression, radius: scala.Double) = this()
  def this(latlng: LatLngExpression, radius: scala.Double, options: CircleMarkerOptions) = this()
   // deprecated!
  def getBounds(): LatLngBounds = js.native
}

