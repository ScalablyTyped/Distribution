package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsRenderer extends MVCObject {
  def getDirections(): DirectionsResult = js.native
  def getMap(): Map[Element] = js.native
  def getPanel(): Element = js.native
  def getRouteIndex(): Double = js.native
  def setDirections(directions: DirectionsResult): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setOptions(options: DirectionsRendererOptions): Unit = js.native
  def setPanel(panel: Element): Unit = js.native
  def setRouteIndex(routeIndex: Double): Unit = js.native
}

