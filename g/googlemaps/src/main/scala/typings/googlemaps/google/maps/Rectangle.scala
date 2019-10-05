package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Rectangle")
@js.native
class Rectangle () extends MVCObject {
  def this(opts: RectangleOptions) = this()
  def getBounds(): LatLngBounds = js.native
  def getDraggable(): Boolean = js.native
  def getEditable(): Boolean = js.native
  def getMap(): Map = js.native
  def getVisible(): Boolean = js.native
  def setBounds(bounds: LatLngBounds): Unit = js.native
  def setBounds(bounds: LatLngBoundsLiteral): Unit = js.native
  def setDraggable(draggable: Boolean): Unit = js.native
  def setEditable(editable: Boolean): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(options: RectangleOptions): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
}

