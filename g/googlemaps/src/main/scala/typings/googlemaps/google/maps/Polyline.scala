package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline extends MVCObject {
  def getDraggable(): Boolean = js.native
  def getEditable(): Boolean = js.native
  def getMap(): Map[Element] = js.native
  def getPath(): MVCArray[LatLng] = js.native
  def getVisible(): Boolean = js.native
  def setDraggable(draggable: Boolean): Unit = js.native
  def setEditable(editable: Boolean): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setOptions(options: PolylineOptions): Unit = js.native
  def setPath(path: js.Array[LatLng | LatLngLiteral]): Unit = js.native
  def setPath(path: MVCArray[LatLng]): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
}

