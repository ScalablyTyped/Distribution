package typings
package leafletDotHeatLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatLayer
  extends leafletLib.leafletMod.TileLayer {
  def addLatLng(latlng: HeatLatLngTuple): HeatLayer = js.native
  def addLatLng(latlng: leafletLib.leafletMod.LatLng): HeatLayer = js.native
  def setLatLngs(latlngs: js.Array[leafletLib.leafletMod.LatLng | HeatLatLngTuple]): HeatLayer = js.native
  def setOptions(options: HeatMapOptions): HeatLayer = js.native
}

