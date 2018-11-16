package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Rectangle")
@js.native
class Rectangle () extends MVCObject {
  def this(opts: RectangleOptions) = this()
  def getBounds(): LatLngBounds = js.native
  def getDraggable(): scala.Boolean = js.native
  def getEditable(): scala.Boolean = js.native
  def getMap(): Map = js.native
  def getVisible(): scala.Boolean = js.native
  def setBounds(bounds: LatLngBounds): scala.Unit = js.native
  def setBounds(bounds: LatLngBoundsLiteral): scala.Unit = js.native
  def setDraggable(draggable: scala.Boolean): scala.Unit = js.native
  def setEditable(editable: scala.Boolean): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOptions(options: RectangleOptions): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
}

