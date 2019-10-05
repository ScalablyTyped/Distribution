package typings.leafletDotHeat.leafletMod

import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatLayer extends TileLayer {
  def addLatLng(latlng: LatLng): HeatLayer = js.native
  def addLatLng(latlng: HeatLatLngTuple): HeatLayer = js.native
  def setLatLngs(latlngs: js.Array[LatLng | HeatLatLngTuple]): HeatLayer = js.native
  def setOptions(options: HeatMapOptions): HeatLayer = js.native
}

@JSImport("leaflet", "heatLayer")
@js.native
object heatLayer extends js.Object {
  def apply(latlngs: js.Array[LatLng | HeatLatLngTuple], options: HeatMapOptions): HeatLayer = js.native
}

