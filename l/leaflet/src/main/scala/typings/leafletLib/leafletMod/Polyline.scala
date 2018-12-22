package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Polyline")
@js.native
class Polyline[T /* <: geojsonLib.geojsonMod.GeometryObject */, P] protected () extends Path {
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
  var feature: js.UndefOr[geojsonLib.geojsonMod.Feature[T, P]] = js.native
  @JSName("options")
  var options_Polyline: PolylineOptions = js.native
  def addLatLng(latlng: js.Array[LatLngExpression]): this.type = js.native
  def addLatLng(latlng: LatLngExpression): this.type = js.native
  def getBounds(): LatLngBounds = js.native
  def getCenter(): LatLng = js.native
  def getLatLngs(): js.Array[LatLng] | js.Array[js.Array[LatLng]] | js.Array[js.Array[js.Array[LatLng]]] = js.native
  def isEmpty(): scala.Boolean = js.native
  def setLatLngs(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): this.type = js.native
  def toGeoJSON(): geojsonLib.geojsonMod.Feature[T, P] = js.native
}

