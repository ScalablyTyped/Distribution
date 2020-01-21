package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "latLngBounds")
@js.native
object latLngBounds extends js.Object {
  def apply(latlngs: js.Array[LatLngExpression]): LatLngBounds_ = js.native
  def apply(southWest: LatLngExpression, northEast: LatLngExpression): LatLngBounds_ = js.native
}

