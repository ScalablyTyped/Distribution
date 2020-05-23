package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundOverlay extends MVCObject {
  def getBounds(): LatLngBounds = js.native
  def getMap(): Map[Element] = js.native
  def getOpacity(): Double = js.native
  def getUrl(): String = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
}

