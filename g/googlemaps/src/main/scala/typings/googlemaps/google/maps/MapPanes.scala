package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes Maps JavaScript API} */
@js.native
trait MapPanes extends js.Object {
  
  /**
    * This pane contains the info window. (Pane 4).
    * It is above all map overlays.
    * @see {@link overlayMouseTarget pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.floatPane Maps JavaScript API}
    */
  val floatPane: Element = js.native
  
  /**
    * This pane is the lowest pane and is above the tiles. (Pane 0).
    * It may not receive DOM events.
    * @see {@link overlayLayer pane above}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.mapPane Maps JavaScript API}
    */
  val mapPane: Element = js.native
  
  /**
    * This pane contains markers. (Pane 2).
    * It may not receive DOM events.
    * @see {@link floatPane pane above}
    * @see {@link overlayLayer pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.markerLayer Maps JavaScript API}
    */
  val markerLayer: Element = js.native
  
  /**
    * This pane contains polylines, polygons, ground overlays and tile layer overlays. (Pane 1).
    * It may not receive DOM events.
    * @see {@link markerLayer pane above}
    * @see {@link mapPane pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.overlayLayer Maps JavaScript API}
    */
  val overlayLayer: Element = js.native
  
  /**
    * This pane contains elements that receive DOM events. (Pane 3).
    * @see {@link floatPane pane above}
    * @see {@link markerLayer pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.overlayMouseTarget Maps JavaScript API}
    */
  val overlayMouseTarget: Element = js.native
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
  
  @scala.inline
  implicit class MapPanesOps[Self <: MapPanes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFloatPane(value: Element): Self = this.set("floatPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapPane(value: Element): Self = this.set("mapPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerLayer(value: Element): Self = this.set("markerLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayLayer(value: Element): Self = this.set("overlayLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayMouseTarget(value: Element): Self = this.set("overlayMouseTarget", value.asInstanceOf[js.Any])
  }
}
