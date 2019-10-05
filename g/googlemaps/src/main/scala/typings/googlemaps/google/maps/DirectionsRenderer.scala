package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.DirectionsRenderer")
@js.native
class DirectionsRenderer () extends MVCObject {
  def this(opts: DirectionsRendererOptions) = this()
  def getDirections(): DirectionsResult = js.native
  def getMap(): Map = js.native
  def getPanel(): Element = js.native
  def getRouteIndex(): Double = js.native
  def setDirections(directions: DirectionsResult): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(options: DirectionsRendererOptions): Unit = js.native
  def setPanel(panel: Element): Unit = js.native
  def setRouteIndex(routeIndex: Double): Unit = js.native
}

