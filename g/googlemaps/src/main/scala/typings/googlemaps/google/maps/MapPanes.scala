package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes Maps JavaScript API} */
trait MapPanes extends js.Object {
  /**
    * This pane contains the info window. (Pane 4).
    * It is above all map overlays.
    * @see {@link overlayMouseTarget pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.floatPane Maps JavaScript API}
    */
  val floatPane: Element
  /**
    * This pane is the lowest pane and is above the tiles. (Pane 0).
    * It may not receive DOM events.
    * @see {@link overlayLayer pane above}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.mapPane Maps JavaScript API}
    */
  val mapPane: Element
  /**
    * This pane contains markers. (Pane 2).
    * It may not receive DOM events.
    * @see {@link floatPane pane above}
    * @see {@link overlayLayer pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.markerLayer Maps JavaScript API}
    */
  val markerLayer: Element
  /**
    * This pane contains polylines, polygons, ground overlays and tile layer overlays. (Pane 1).
    * It may not receive DOM events.
    * @see {@link markerLayer pane above}
    * @see {@link mapPane pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.overlayLayer Maps JavaScript API}
    */
  val overlayLayer: Element
  /**
    * This pane contains elements that receive DOM events. (Pane 3).
    * @see {@link floatPane pane above}
    * @see {@link markerLayer pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.overlayMouseTarget Maps JavaScript API}
    */
  val overlayMouseTarget: Element
}

object MapPanes {
  @scala.inline
  def apply(
    floatPane: Element,
    mapPane: Element,
    markerLayer: Element,
    overlayLayer: Element,
    overlayMouseTarget: Element
  ): MapPanes = {
    val __obj = js.Dynamic.literal(floatPane = floatPane.asInstanceOf[js.Any], mapPane = mapPane.asInstanceOf[js.Any], markerLayer = markerLayer.asInstanceOf[js.Any], overlayLayer = overlayLayer.asInstanceOf[js.Any], overlayMouseTarget = overlayMouseTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanes]
  }
}

