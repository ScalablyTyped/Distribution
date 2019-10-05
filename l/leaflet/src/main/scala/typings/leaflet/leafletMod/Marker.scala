package typings.leaflet.leafletMod

import typings.geojson.geojsonMod.Feature
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Marker")
@js.native
class Marker[P] protected () extends Layer {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: MarkerOptions) = this()
  var dragging: js.UndefOr[Handler] = js.native
  var feature: js.UndefOr[Feature[typings.geojson.geojsonMod.Point, P]] = js.native
  // Properties
  var options: MarkerOptions = js.native
  def getElement(): js.UndefOr[HTMLElement] = js.native
  def getIcon(): Icon[IconOptions] | DivIcon = js.native
  def getLatLng(): LatLng = js.native
  def setIcon(icon: DivIcon): this.type = js.native
  def setIcon(icon: Icon[IconOptions]): this.type = js.native
  def setLatLng(latlng: LatLngExpression): this.type = js.native
  def setOpacity(opacity: Double): this.type = js.native
  def setZIndexOffset(offset: Double): this.type = js.native
  def toGeoJSON(): Feature[typings.geojson.geojsonMod.Point, P] = js.native
}

@JSImport("leaflet", "marker")
@js.native
object marker extends js.Object {
  def apply(latlng: LatLngExpression): Marker[_] = js.native
  def apply(latlng: LatLngExpression, options: MarkerOptions): Marker[_] = js.native
}

