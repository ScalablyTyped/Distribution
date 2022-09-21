package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.maplibreGlStrings.touchcancel
import typings.maplibreGl.maplibreGlStrings.touchend
import typings.maplibreGl.maplibreGlStrings.touchmove
import typings.maplibreGl.maplibreGlStrings.touchstart
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.maplibreGl.mod.MapLibreEvent because var conflicts: `type`. Inlined target, originalEvent */ @JSImport("maplibre-gl", "MapTouchEvent")
@js.native
open class MapTouchEvent protected () extends Event {
  /**
  	 * @private
  	 */
  def this(`type`: String, map: Map, originalEvent: TouchEvent) = this()
  
  var _defaultPrevented: Boolean = js.native
  
  /**
  	 * `true` if `preventDefault` has been called.
  	 * @private
  	 */
  def defaultPrevented: Boolean = js.native
  
  /**
  	 * The geographic location on the map of the center of the touch event points.
  	 */
  var lngLat: LngLat = js.native
  
  /**
  	 * The geographical locations on the map corresponding to a
  	 * [touch event's `touches`](https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/touches) property.
  	 */
  var lngLats: js.Array[LngLat] = js.native
  
  /**
  	 * The DOM event which caused the map event.
  	 */
  var originalEvent: TouchEvent = js.native
  
  /**
  	 * The pixel coordinates of the center of the touch event points, relative to the map and measured from the top left
  	 * corner.
  	 */
  var point: ^ = js.native
  
  /**
  	 * The array of pixel coordinates corresponding to a
  	 * [touch event's `touches`](https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/touches) property.
  	 */
  var points: js.Array[^] = js.native
  
  /**
  	 * Prevents subsequent default processing of the event by the map.
  	 *
  	 * Calling this method will prevent the following default map behaviors:
  	 *
  	 *   * On `touchstart` events, the behavior of {@link DragPanHandler}
  	 *   * On `touchstart` events, the behavior of {@link TouchZoomRotateHandler}
  	 *
  	 */
  def preventDefault(): scala.Unit = js.native
  
  /**
  	 * The `Map` object that fired the event.
  	 */
  var target: Map = js.native
  
  /**
  	 * The event type.
  	 */
  @JSName("type")
  var type_MapTouchEvent: touchstart | touchmove | touchend | touchcancel = js.native
}
