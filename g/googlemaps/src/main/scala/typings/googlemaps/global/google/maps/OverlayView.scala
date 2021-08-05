package typings.googlemaps.global.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.OverlayView")
@js.native
class OverlayView ()
  extends StObject
     with typings.googlemaps.google.maps.OverlayView
object OverlayView {
  
  @JSGlobal("google.maps.OverlayView")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Stops click, tap, drag, and wheel events on the element from bubbling up to the map. Use this to prevent map dragging and zooming, as well as map "click" events.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#OverlayView.preventMapHitsAndGesturesFrom Maps JavaScript API}
    */
  /* static member */
  inline def preventMapHitsAndGesturesFrom(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventMapHitsAndGesturesFrom")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Stops click or tap on the element from bubbling up to the map. Use this to prevent the map from triggering "click" events.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#OverlayView.preventMapHitsFrom Maps JavaScript API}
    */
  /* static member */
  inline def preventMapHitsFrom(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventMapHitsFrom")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
