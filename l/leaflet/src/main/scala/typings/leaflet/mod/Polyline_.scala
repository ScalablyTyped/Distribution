package typings.leaflet.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Polyline")
@js.native
class Polyline_[T /* <: GeometryObject */, P] protected () extends Path {
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
  
  def addLatLng(latlng: js.Array[LatLngExpression]): this.type = js.native
  def addLatLng(latlng: js.Array[LatLngExpression], latlngs: js.Array[LatLng_]): this.type = js.native
  def addLatLng(latlng: LatLngExpression): this.type = js.native
  def addLatLng(latlng: LatLngExpression, latlngs: js.Array[LatLng_]): this.type = js.native
  
  def closestLayerPoint(p: Point_): Point_ = js.native
  
  var feature: js.UndefOr[Feature[T, P]] = js.native
  
  def getBounds(): LatLngBounds_ = js.native
  
  def getCenter(): LatLng_ = js.native
  
  def getLatLngs(): js.Array[(js.Array[js.Array[LatLng_] | LatLng_]) | LatLng_] = js.native
  
  def isEmpty(): Boolean = js.native
  
  @JSName("options")
  var options_Polyline_ : PolylineOptions = js.native
  
  def setLatLngs(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): this.type = js.native
  
  def toGeoJSON(): Feature[T, P] = js.native
}
