package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.OverlayView")
@js.native
class OverlayView () extends MVCObject {
  def draw(): Unit = js.native
  def getMap(): Map[Element] | StreetViewPanorama = js.native
  def getPanes(): MapPanes = js.native
  def getProjection(): MapCanvasProjection = js.native
  def onAdd(): Unit = js.native
  def onRemove(): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setMap(map: StreetViewPanorama): Unit = js.native
}

/* static members */
@JSGlobal("google.maps.OverlayView")
@js.native
object OverlayView extends js.Object {
  /**
    * Stops click, tap, drag, and wheel events on the element from bubbling up to the map. Use this to prevent map dragging and zooming, as well as map "click" events.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#OverlayView.preventMapHitsAndGesturesFrom Maps JavaScript API}
    */
  def preventMapHitsAndGesturesFrom(element: Element): Unit = js.native
  /**
    * Stops click or tap on the element from bubbling up to the map. Use this to prevent the map from triggering "click" events.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#OverlayView.preventMapHitsFrom Maps JavaScript API}
    */
  def preventMapHitsFrom(element: Element): Unit = js.native
}

