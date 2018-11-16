package typings
package googlemapsLib.googleNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.visualization.MapsEngineLayer")
@js.native
class MapsEngineLayer protected ()
  extends googlemapsLib.googleNs.mapsNs.MVCObject {
  def this(options: MapsEngineLayerOptions) = this()
  def getLayerId(): java.lang.String = js.native
  def getLayerKey(): java.lang.String = js.native
  def getMap(): googlemapsLib.googleNs.mapsNs.Map = js.native
  def getMapId(): java.lang.String = js.native
  def getOpacity(): scala.Double = js.native
  def getProperties(): MapsEngineLayerProperties = js.native
  def getStatus(): MapsEngineStatus = js.native
  def getZIndex(): scala.Double = js.native
  def setLayerId(layerId: java.lang.String): scala.Unit = js.native
  def setLayerKey(layerKey: java.lang.String): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: googlemapsLib.googleNs.mapsNs.Map): scala.Unit = js.native
  def setMapId(mapId: java.lang.String): scala.Unit = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  def setOptions(options: MapsEngineLayerOptions): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

