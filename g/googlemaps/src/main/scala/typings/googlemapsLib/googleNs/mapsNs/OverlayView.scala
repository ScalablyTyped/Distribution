package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.OverlayView")
@js.native
class OverlayView () extends MVCObject {
  def draw(): scala.Unit = js.native
  def getMap(): Map | StreetViewPanorama = js.native
  def getPanes(): MapPanes = js.native
  def getProjection(): MapCanvasProjection = js.native
  def onAdd(): scala.Unit = js.native
  def onRemove(): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setMap(map: StreetViewPanorama): scala.Unit = js.native
}

