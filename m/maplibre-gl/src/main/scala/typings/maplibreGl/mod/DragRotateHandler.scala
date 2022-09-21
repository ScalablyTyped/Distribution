package typings.maplibreGl.mod

import typings.maplibreGl.anon.PitchWithRotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "DragRotateHandler")
@js.native
open class DragRotateHandler protected () extends StObject {
  /**
  	 * @param {Object} [options]
  	 * @param {number} [options.bearingSnap] The threshold, measured in degrees, that determines when the map's
  	 *   bearing will snap to north.
  	 * @param {bool} [options.pitchWithRotate=true] Control the map pitch in addition to the bearing
  	 * @private
  	 */
  def this(options: PitchWithRotate, mouseRotate: MouseRotateHandler, mousePitch: MousePitchHandler) = this()
  
  var _mousePitch: MousePitchHandler = js.native
  
  var _mouseRotate: MouseRotateHandler = js.native
  
  var _pitchWithRotate: Boolean = js.native
  
  /**
  	 * Disables the "drag to rotate" interaction.
  	 *
  	 * @example
  	 * map.dragRotate.disable();
  	 */
  def disable(): scala.Unit = js.native
  
  /**
  	 * Enables the "drag to rotate" interaction.
  	 *
  	 * @example
  	 * map.dragRotate.enable();
  	 */
  def enable(): scala.Unit = js.native
  
  /**
  	 * Returns a Boolean indicating whether the "drag to rotate" interaction is active, i.e. currently being used.
  	 *
  	 * @returns {boolean} `true` if the "drag to rotate" interaction is active.
  	 */
  def isActive(): Boolean = js.native
  
  /**
  	 * Returns a Boolean indicating whether the "drag to rotate" interaction is enabled.
  	 *
  	 * @returns {boolean} `true` if the "drag to rotate" interaction is enabled.
  	 */
  def isEnabled(): Boolean = js.native
}
