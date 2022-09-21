package typings.maplibreGl.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "DragPanHandler")
@js.native
open class DragPanHandler protected () extends StObject {
  /**
  	 * @private
  	*/
  def this(el: HTMLElement, mousePan: MousePanHandler, touchPan: TouchPanHandler) = this()
  
  var _el: HTMLElement = js.native
  
  var _inertiaOptions: DragPanOptions = js.native
  
  var _mousePan: MousePanHandler = js.native
  
  var _touchPan: TouchPanHandler = js.native
  
  /**
  	 * Disables the "drag to pan" interaction.
  	 *
  	 * @example
  	 * map.dragPan.disable();
  	 */
  def disable(): scala.Unit = js.native
  
  /**
  	 * Enables the "drag to pan" interaction.
  	 *
  	 * @param {Object} [options] Options object
  	 * @param {number} [options.linearity=0] factor used to scale the drag velocity
  	 * @param {Function} [options.easing=bezier(0, 0, 0.3, 1)] easing function applled to `map.panTo` when applying the drag.
  	 * @param {number} [options.maxSpeed=1400] the maximum value of the drag velocity.
  	 * @param {number} [options.deceleration=2500] the rate at which the speed reduces after the pan ends.
  	 *
  	 * @example
  	 *   map.dragPan.enable();
  	 * @example
  	 *   map.dragPan.enable({
  	 *      linearity: 0.3,
  	 *      easing: bezier(0, 0, 0.3, 1),
  	 *      maxSpeed: 1400,
  	 *      deceleration: 2500,
  	 *   });
  	 */
  def enable(): scala.Unit = js.native
  def enable(options: DragPanOptions): scala.Unit = js.native
  
  /**
  	 * Returns a Boolean indicating whether the "drag to pan" interaction is active, i.e. currently being used.
  	 *
  	 * @returns {boolean} `true` if the "drag to pan" interaction is active.
  	 */
  def isActive(): Boolean = js.native
  
  /**
  	 * Returns a Boolean indicating whether the "drag to pan" interaction is enabled.
  	 *
  	 * @returns {boolean} `true` if the "drag to pan" interaction is enabled.
  	 */
  def isEnabled(): Boolean = js.native
}
