package typings.googlemaps.google.maps.visualization

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.MVCArray
import typings.googlemaps.google.maps.MVCObject
import typings.googlemaps.google.maps.Map
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.visualization.HeatmapLayer")
@js.native
class HeatmapLayer () extends MVCObject {
  def this(opts: HeatmapLayerOptions) = this()
  def getData(): MVCArray[LatLng | WeightedLocation] = js.native
  def getMap(): Map[Element] = js.native
  def setData(data: js.Array[LatLng | WeightedLocation]): Unit = js.native
  def setData(data: MVCArray[LatLng | WeightedLocation]): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setOptions(options: HeatmapLayerOptions): Unit = js.native
}

