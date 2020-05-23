package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayView extends MVCObject {
  def draw(): Unit = js.native
  def getMap(): Map[Element] | StreetViewPanorama = js.native
  def getPanes(): MapPanes = js.native
  def getProjection(): MapCanvasProjection = js.native
  def onAdd(): Unit = js.native
  def onRemove(): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setMap(map: StreetViewPanorama): Unit = js.native
}

