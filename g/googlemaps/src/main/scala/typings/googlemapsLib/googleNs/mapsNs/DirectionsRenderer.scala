package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.DirectionsRenderer")
@js.native
class DirectionsRenderer () extends MVCObject {
  def this(opts: DirectionsRendererOptions) = this()
  def getDirections(): DirectionsResult = js.native
  def getMap(): Map = js.native
  def getPanel(): stdLib.Element = js.native
  def getRouteIndex(): scala.Double = js.native
  def setDirections(directions: DirectionsResult): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOptions(options: DirectionsRendererOptions): scala.Unit = js.native
  def setPanel(panel: stdLib.Element): scala.Unit = js.native
  def setRouteIndex(routeIndex: scala.Double): scala.Unit = js.native
}

