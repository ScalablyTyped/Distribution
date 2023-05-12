package typings.maplibreGl.mod

import typings.maplibreGl.anon.`5`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TouchZoomRotateHandler")
@js.native
open class TouchZoomRotateHandler protected () extends StObject {
  /**
  	 * @private
  	*/
  def this(
    el: HTMLElement,
    touchZoom: TouchZoomHandler,
    touchRotate: TouchRotateHandler,
    tapDragZoom: TapDragZoomHandler
  ) = this()
  
  var _el: HTMLElement = js.native
  
  var _enabled: Boolean = js.native
  
  var _rotationDisabled: Boolean = js.native
  
  var _tapDragZoom: TapDragZoomHandler = js.native
  
  var _touchRotate: TouchRotateHandler = js.native
  
  var _touchZoom: TouchZoomHandler = js.native
  
  /**
  	 * Disables the "pinch to rotate and zoom" interaction.
  	 *
  	 * @example
  	 *   map.touchZoomRotate.disable();
  	 */
  def disable(): scala.Unit = js.native
  
  /**
  	 * Disables the "pinch to rotate" interaction, leaving the "pinch to zoom"
  	 * interaction enabled.
  	 *
  	 * @example
  	 *   map.touchZoomRotate.disableRotation();
  	 */
  def disableRotation(): scala.Unit = js.native
  
  /**
  	 * Enables the "pinch to rotate and zoom" interaction.
  	 *
  	 * @param {Object} [options] Options object.
  	 * @param {string} [options.around] If "center" is passed, map will zoom around the center
  	 *
  	 * @example
  	 *   map.touchZoomRotate.enable();
  	 * @example
  	 *   map.touchZoomRotate.enable({ around: 'center' });
  	 */
  def enable(): scala.Unit = js.native
  def enable(options: `5`): scala.Unit = js.native
  
  /**
  	 * Enables the "pinch to rotate" interaction.
  	 *
  	 * @example
  	 *   map.touchZoomRotate.enable();
  	 *   map.touchZoomRotate.enableRotation();
  	 */
  def enableRotation(): scala.Unit = js.native
  
  /**
  	 * Returns true if the handler is enabled and has detected the start of a zoom/rotate gesture.
  	 *
  	 * @returns {boolean} //eslint-disable-line
  	 */
  def isActive(): Boolean = js.native
  
  /**
  	 * Returns a Boolean indicating whether the "pinch to rotate and zoom" interaction is enabled.
  	 *
  	 * @returns {boolean} `true` if the "pinch to rotate and zoom" interaction is enabled.
  	 */
  def isEnabled(): Boolean = js.native
}
