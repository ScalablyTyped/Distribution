package typings.googlemaps.googleNs.mapsNs.visualizationNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.MVCArray
import typings.googlemaps.googleNs.mapsNs.MVCObject
import typings.googlemaps.googleNs.mapsNs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.visualization.HeatmapLayer")
@js.native
class HeatmapLayer () extends MVCObject {
  def this(opts: HeatmapLayerOptions) = this()
  def getData[T /* <: LatLng | WeightedLocation */](): MVCArray[T] = js.native
  def getMap(): Map = js.native
  def setData(data: js.Array[LatLng | WeightedLocation]): Unit = js.native
  def setData(data: MVCArray[LatLng | WeightedLocation]): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(options: HeatmapLayerOptions): Unit = js.native
}

