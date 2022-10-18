package typings.maplibreGl.mod

import typings.maplibreGl.anon.`0`
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "KeyboardHandler")
@js.native
/**
	* @private
	*/
open class KeyboardHandler () extends StObject {
  
  var _active: Boolean = js.native
  
  var _bearingStep: Double = js.native
  
  var _enabled: Boolean = js.native
  
  var _panStep: Double = js.native
  
  var _pitchStep: Double = js.native
  
  var _rotationDisabled: Boolean = js.native
  
  /**
  	 * Disables the "keyboard rotate and zoom" interaction.
  	 *
  	 * @example
  	 *   map.keyboard.disable();
  	 */
  def disable(): scala.Unit = js.native
  
  /**
  	 * Disables the "keyboard pan/rotate" interaction, leaving the
  	 * "keyboard zoom" interaction enabled.
  	 *
  	 * @example
  	 *   map.keyboard.disableRotation();
  	 */
  def disableRotation(): scala.Unit = js.native
  
  /**
  	 * Enables the "keyboard rotate and zoom" interaction.
  	 *
  	 * @example
  	 *   map.keyboard.enable();
  	 */
  def enable(): scala.Unit = js.native
  
  /**
  	 * Enables the "keyboard pan/rotate" interaction.
  	 *
  	 * @example
  	 *   map.keyboard.enable();
  	 *   map.keyboard.enableRotation();
  	 */
  def enableRotation(): scala.Unit = js.native
  
  /**
  	 * Returns true if the handler is enabled and has detected the start of a
  	 * zoom/rotate gesture.
  	 *
  	 * @returns {boolean} `true` if the handler is enabled and has detected the
  	 * start of a zoom/rotate gesture.
  	 */
  def isActive(): Boolean = js.native
  
  /**
  	 * Returns a Boolean indicating whether the "keyboard rotate and zoom"
  	 * interaction is enabled.
  	 *
  	 * @returns {boolean} `true` if the "keyboard rotate and zoom"
  	 * interaction is enabled.
  	 */
  def isEnabled(): Boolean = js.native
  
  def keydown(e: KeyboardEvent): `0` = js.native
  
  def reset(): scala.Unit = js.native
}
