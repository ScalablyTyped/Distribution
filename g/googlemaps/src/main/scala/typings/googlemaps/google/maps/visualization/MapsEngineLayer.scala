package typings.googlemaps.google.maps.visualization

import typings.googlemaps.google.maps.MVCObject
import typings.googlemaps.google.maps.Map
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait MapsEngineLayer extends MVCObject {
  
  def getLayerId(): String = js.native
  
  def getLayerKey(): String = js.native
  
  def getMap(): Map[Element] = js.native
  
  def getMapId(): String = js.native
  
  def getOpacity(): Double = js.native
  
  def getProperties(): MapsEngineLayerProperties = js.native
  
  def getStatus(): MapsEngineStatus = js.native
  
  def getZIndex(): Double = js.native
  
  def setLayerId(layerId: String): Unit = js.native
  
  def setLayerKey(layerKey: String): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  
  def setMapId(mapId: String): Unit = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
  
  def setOptions(options: MapsEngineLayerOptions): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
