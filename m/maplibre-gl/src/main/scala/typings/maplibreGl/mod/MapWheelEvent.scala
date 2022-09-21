package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.wheel
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "MapWheelEvent")
@js.native
open class MapWheelEvent protected () extends Event {
  /**
  	 * @private
  	 */
  def this(`type`: String, map: Map, originalEvent: WheelEvent) = this()
  
  var _defaultPrevented: Boolean = js.native
  
  /**
  	 * `true` if `preventDefault` has been called.
  	 * @private
  	 */
  def defaultPrevented: Boolean = js.native
  
  /**
  	 * The DOM event which caused the map event.
  	 */
  var originalEvent: WheelEvent = js.native
  
  /**
  	 * Prevents subsequent default processing of the event by the map.
  	 *
  	 * Calling this method will prevent the the behavior of {@link ScrollZoomHandler}.
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
  var type_MapWheelEvent: wheel = js.native
}
