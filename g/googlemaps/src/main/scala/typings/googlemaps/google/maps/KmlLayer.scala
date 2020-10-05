package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlLayer extends MVCObject {
  def getDefaultViewport(): LatLngBounds = js.native
  def getMap(): Map[Element] = js.native
  def getMetadata(): KmlLayerMetadata = js.native
  def getStatus(): KmlLayerStatus = js.native
  def getUrl(): String = js.native
  def getZIndex(): Double = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setOptions(options: KmlLayerOptions): Unit = js.native
  def setUrl(url: String): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

