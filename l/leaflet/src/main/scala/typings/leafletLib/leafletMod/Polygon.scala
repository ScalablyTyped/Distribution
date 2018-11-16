package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Polygon")
@js.native
class Polygon[P] protected ()
  extends Polyline[geojsonLib.geojsonMod.Polygon | geojsonLib.geojsonMod.MultiPolygon, P] {
  def this(latlngs: js.Array[LatLngExpression | (js.Array[LatLngExpression | js.Array[LatLngExpression]])]) = this()
  def this(latlngs: js.Array[LatLngExpression | (js.Array[LatLngExpression | js.Array[LatLngExpression]])], options: PolylineOptions) = this()
}

