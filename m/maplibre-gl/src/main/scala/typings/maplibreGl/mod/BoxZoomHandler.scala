package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.CameraAnimation
import typings.maplibreGl.anon.ClickTolerance
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "BoxZoomHandler")
@js.native
open class BoxZoomHandler protected () extends StObject {
  /**
  	 * @private
  	 */
  def this(map: Map, options: ClickTolerance) = this()
  
  var _active: Boolean = js.native
  
  var _box: HTMLElement = js.native
  
  var _clickTolerance: Double = js.native
  
  var _container: HTMLElement = js.native
  
  var _el: HTMLElement = js.native
  
  var _enabled: Boolean = js.native
  
  def _fireEvent(`type`: String, e: Any): Map = js.native
  
  var _lastPos: ^ = js.native
  
  var _map: Map = js.native
  
  var _startPos: ^ = js.native
  
  /**
  	 * Disables the "box zoom" interaction.
  	 *
  	 * @example
  	 *   map.boxZoom.disable();
  	 */
  def disable(): scala.Unit = js.native
  
  /**
  	 * Enables the "box zoom" interaction.
  	 *
  	 * @example
  	 *   map.boxZoom.enable();
  	 */
  def enable(): scala.Unit = js.native
  
  /**
  	 * Returns a Boolean indicating whether the "box zoom" interaction is active, i.e. currently being used.
  	 *
  	 * @returns {boolean} `true` if the "box zoom" interaction is active.
  	 */
  def isActive(): Boolean = js.native
  
  /**
  	 * Returns a Boolean indicating whether the "box zoom" interaction is enabled.
  	 *
  	 * @returns {boolean} `true` if the "box zoom" interaction is enabled.
  	 */
  def isEnabled(): Boolean = js.native
  
  def keydown(e: KeyboardEvent): scala.Unit = js.native
  
  def mousedown(e: MouseEvent, point: ^): scala.Unit = js.native
  
  def mousemoveWindow(e: MouseEvent, point: ^): scala.Unit = js.native
  
  def mouseupWindow(e: MouseEvent, point: ^): CameraAnimation = js.native
  
  def reset(): scala.Unit = js.native
}
