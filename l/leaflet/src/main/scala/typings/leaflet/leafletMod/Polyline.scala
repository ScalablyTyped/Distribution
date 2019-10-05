package typings.leaflet.leafletMod

import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.GeometryObject
import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Polyline")
@js.native
class Polyline[T /* <: GeometryObject */, P] protected () extends Path {
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
  var feature: js.UndefOr[Feature[T, P]] = js.native
  @JSName("options")
  var options_Polyline: PolylineOptions = js.native
  def addLatLng(latlng: js.Array[LatLngExpression]): this.type = js.native
  def addLatLng(latlng: LatLngExpression): this.type = js.native
  def getBounds(): LatLngBounds = js.native
  def getCenter(): LatLng = js.native
  def getLatLngs(): js.Array[(js.Array[js.Array[LatLng] | LatLng]) | LatLng] = js.native
  def isEmpty(): Boolean = js.native
  def setLatLngs(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): this.type = js.native
  def toGeoJSON(): Feature[T, P] = js.native
}

@JSImport("leaflet", "polyline")
@js.native
object polyline extends js.Object {
  def apply(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]): Polyline[LineString | MultiLineString, _] = js.native
  def apply(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions): Polyline[LineString | MultiLineString, _] = js.native
}

