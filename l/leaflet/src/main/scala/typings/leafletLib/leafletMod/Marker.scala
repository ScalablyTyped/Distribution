package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Marker")
@js.native
class Marker[P] protected () extends Layer {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: MarkerOptions) = this()
  var dragging: js.UndefOr[Handler] = js.native
  var feature: js.UndefOr[geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Point, P]] = js.native
  // Properties
  var options: MarkerOptions = js.native
  def getElement(): js.UndefOr[stdLib.HTMLElement] = js.native
  def getIcon(): Icon[IconOptions] | DivIcon = js.native
  def getLatLng(): LatLng = js.native
  def setIcon(icon: DivIcon): this.type = js.native
  def setIcon(icon: Icon[IconOptions]): this.type = js.native
  def setLatLng(latlng: LatLngExpression): this.type = js.native
  def setOpacity(opacity: scala.Double): this.type = js.native
  def setZIndexOffset(offset: scala.Double): this.type = js.native
  def toGeoJSON(): geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Point, P] = js.native
}

