package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.maplibreGlStrings.click
import typings.maplibreGl.maplibreGlStrings.contextmenu
import typings.maplibreGl.maplibreGlStrings.dblclick
import typings.maplibreGl.maplibreGlStrings.mousedown
import typings.maplibreGl.maplibreGlStrings.mouseenter
import typings.maplibreGl.maplibreGlStrings.mouseleave
import typings.maplibreGl.maplibreGlStrings.mousemove
import typings.maplibreGl.maplibreGlStrings.mouseout
import typings.maplibreGl.maplibreGlStrings.mouseover
import typings.maplibreGl.maplibreGlStrings.mouseup
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.maplibreGl.mod.MapLibreEvent because var conflicts: `type`. Inlined target, originalEvent */ @JSImport("maplibre-gl", "MapMouseEvent")
@js.native
open class MapMouseEvent protected () extends Event {
  /**
  	 * @private
  	 */
  def this(`type`: String, map: Map, originalEvent: MouseEvent) = this()
  def this(`type`: String, map: Map, originalEvent: MouseEvent, data: Any) = this()
  
  var _defaultPrevented: Boolean = js.native
  
  /**
  	 * `true` if `preventDefault` has been called.
  	 * @private
  	 */
  def defaultPrevented: Boolean = js.native
  
  /**
  	 * The geographic location on the map of the mouse cursor.
  	 */
  var lngLat: LngLat = js.native
  
  /**
  	 * The DOM event which caused the map event.
  	 */
  var originalEvent: MouseEvent = js.native
  
  /**
  	 * The pixel coordinates of the mouse cursor, relative to the map and measured from the top left corner.
  	 */
  var point: ^ = js.native
  
  /**
  	 * Prevents subsequent default processing of the event by the map.
  	 *
  	 * Calling this method will prevent the following default map behaviors:
  	 *
  	 *   * On `mousedown` events, the behavior of {@link DragPanHandler}
  	 *   * On `mousedown` events, the behavior of {@link DragRotateHandler}
  	 *   * On `mousedown` events, the behavior of {@link BoxZoomHandler}
  	 *   * On `dblclick` events, the behavior of {@link DoubleClickZoomHandler}
  	 *
  	 */
  def preventDefault(): scala.Unit = js.native
  
  /**
  	 * The `Map` object that fired the event.
  	 */
  var target: Map = js.native
  
  /**
  	 * The event type (one of {@link Map.event:mousedown},
  	 * {@link Map.event:mouseup},
  	 * {@link Map.event:click},
  	 * {@link Map.event:dblclick},
  	 * {@link Map.event:mousemove},
  	 * {@link Map.event:mouseover},
  	 * {@link Map.event:mouseenter},
  	 * {@link Map.event:mouseleave},
  	 * {@link Map.event:mouseout},
  	 * {@link Map.event:contextmenu}).
  	 */
  @JSName("type")
  var type_MapMouseEvent: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu = js.native
}
