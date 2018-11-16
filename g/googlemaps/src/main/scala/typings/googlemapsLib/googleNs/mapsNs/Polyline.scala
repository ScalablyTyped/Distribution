package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Polyline")
@js.native
class Polyline () extends MVCObject {
  def this(opts: PolylineOptions) = this()
  def getDraggable(): scala.Boolean = js.native
  def getEditable(): scala.Boolean = js.native
  def getMap(): Map = js.native
  def getPath(): MVCArray[LatLng] = js.native
  def getVisible(): scala.Boolean = js.native
  def setDraggable(draggable: scala.Boolean): scala.Unit = js.native
  def setEditable(editable: scala.Boolean): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOptions(options: PolylineOptions): scala.Unit = js.native
  def setPath(path: MVCArray[LatLng]): scala.Unit = js.native
  def setPath(path: js.Array[LatLng | LatLngLiteral]): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
}

