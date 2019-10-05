package typings.googlemaps.google.maps.drawing

import typings.googlemaps.google.maps.MVCObject
import typings.googlemaps.google.maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.drawing.DrawingManager")
@js.native
class DrawingManager () extends MVCObject {
  def this(options: DrawingManagerOptions) = this()
  def getDrawingMode(): OverlayType = js.native
  def getMap(): Map = js.native
  def setDrawingMode(): Unit = js.native
  def setDrawingMode(drawingMode: OverlayType): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(options: DrawingManagerOptions): Unit = js.native
}

