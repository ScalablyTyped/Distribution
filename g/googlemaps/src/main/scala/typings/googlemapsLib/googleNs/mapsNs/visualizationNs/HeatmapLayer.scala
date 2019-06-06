package typings
package googlemapsLib.googleNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.visualization.HeatmapLayer")
@js.native
class HeatmapLayer ()
  extends googlemapsLib.googleNs.mapsNs.MVCObject {
  def this(opts: HeatmapLayerOptions) = this()
  def getData[T /* <: googlemapsLib.googleNs.mapsNs.LatLng | WeightedLocation */](): googlemapsLib.googleNs.mapsNs.MVCArray[T] = js.native
  def getMap(): googlemapsLib.googleNs.mapsNs.Map = js.native
  def setData(
    data: googlemapsLib.googleNs.mapsNs.MVCArray[googlemapsLib.googleNs.mapsNs.LatLng | WeightedLocation]
  ): scala.Unit = js.native
  def setData(data: js.Array[googlemapsLib.googleNs.mapsNs.LatLng | WeightedLocation]): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: googlemapsLib.googleNs.mapsNs.Map): scala.Unit = js.native
  def setOptions(options: HeatmapLayerOptions): scala.Unit = js.native
}

