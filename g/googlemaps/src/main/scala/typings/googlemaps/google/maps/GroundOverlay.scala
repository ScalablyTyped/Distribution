package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.GroundOverlay")
@js.native
class GroundOverlay protected () extends MVCObject {
  def this(url: String, bounds: LatLngBounds) = this()
  def this(url: String, bounds: LatLngBoundsLiteral) = this()
  def this(url: String, bounds: LatLngBoundsLiteral, opts: GroundOverlayOptions) = this()
  def this(url: String, bounds: LatLngBounds, opts: GroundOverlayOptions) = this()
  def getBounds(): LatLngBounds = js.native
  def getMap(): Map[Element] = js.native
  def getOpacity(): Double = js.native
  def getUrl(): String = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
}

