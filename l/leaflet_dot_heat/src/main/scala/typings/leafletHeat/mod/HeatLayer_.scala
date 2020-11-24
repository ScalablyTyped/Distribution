package typings.leafletHeat.mod

import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.TileLayer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatLayer_ extends TileLayer_ {
  
  def addLatLng(latlng: LatLng_): HeatLayer_ = js.native
  def addLatLng(latlng: HeatLatLngTuple): HeatLayer_ = js.native
  
  def setLatLngs(latlngs: js.Array[LatLng_ | HeatLatLngTuple]): HeatLayer_ = js.native
  
  def setOptions(options: HeatMapOptions): HeatLayer_ = js.native
}
