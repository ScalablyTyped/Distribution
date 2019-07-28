package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Rectangle")
@js.native
class Rectangle[P] protected () extends Polygon[P] {
  def this(latLngBounds: LatLngBoundsExpression) = this()
  def this(latLngBounds: LatLngBoundsExpression, options: PolylineOptions) = this()
  def setBounds(latLngBounds: LatLngBoundsExpression): this.type = js.native
}

