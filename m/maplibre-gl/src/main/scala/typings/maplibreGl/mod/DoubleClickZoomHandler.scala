package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "DoubleClickZoomHandler")
@js.native
open class DoubleClickZoomHandler protected () extends StObject {
  /**
  	 * @private
  	*/
  def this(clickZoom: ClickZoomHandler, TapZoom: TapZoomHandler) = this()
  
  var _clickZoom: ClickZoomHandler = js.native
  
  var _tapZoom: TapZoomHandler = js.native
  
  /**
  	 * Disables the "double click to zoom" interaction.
  	 *
  	 * @example
  	 * map.doubleClickZoom.disable();
  	 */
  def disable(): scala.Unit = js.native
  
  /**
  	 * Enables the "double click to zoom" interaction.
  	 *
  	 * @example
  	 * map.doubleClickZoom.enable();
  	 */
  def enable(): scala.Unit = js.native
  
  /**
  	 * Returns a Boolean indicating whether the "double click to zoom" interaction is active, i.e. currently being used.
  	 *
  	 * @returns {boolean} `true` if the "double click to zoom" interaction is active.
  	 */
  def isActive(): Boolean = js.native
  
  /**
  	 * Returns a Boolean indicating whether the "double click to zoom" interaction is enabled.
  	 *
  	 * @returns {boolean} `true` if the "double click to zoom" interaction is enabled.
  	 */
  def isEnabled(): Boolean = js.native
}
