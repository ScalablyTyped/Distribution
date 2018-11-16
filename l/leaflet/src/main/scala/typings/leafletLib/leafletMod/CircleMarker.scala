package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "CircleMarker")
@js.native
class CircleMarker[P] protected () extends Path {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: CircleMarkerOptions) = this()
  var feature: js.UndefOr[geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Point, P]] = js.native
  @JSName("options")
  var options_CircleMarker: CircleMarkerOptions = js.native
  def getLatLng(): LatLng = js.native
  def getRadius(): scala.Double = js.native
  def setLatLng(latLng: LatLngExpression): this.type = js.native
  def setRadius(radius: scala.Double): this.type = js.native
  def toGeoJSON(): geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Point, P] = js.native
}

