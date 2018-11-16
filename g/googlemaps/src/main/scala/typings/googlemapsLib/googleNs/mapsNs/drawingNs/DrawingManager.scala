package typings
package googlemapsLib.googleNs.mapsNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.drawing.DrawingManager")
@js.native
class DrawingManager ()
  extends googlemapsLib.googleNs.mapsNs.MVCObject {
  def this(options: DrawingManagerOptions) = this()
  def getDrawingMode(): OverlayType = js.native
  def getMap(): googlemapsLib.googleNs.mapsNs.Map = js.native
  def setDrawingMode(): scala.Unit = js.native
  def setDrawingMode(drawingMode: OverlayType): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: googlemapsLib.googleNs.mapsNs.Map): scala.Unit = js.native
  def setOptions(options: DrawingManagerOptions): scala.Unit = js.native
}

