package typings.maplibreGl.mod

import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TerrainControl")
@js.native
open class TerrainControl protected ()
  extends StObject
     with IControl {
  def this(options: TerrainSpecification) = this()
  
  var _container: HTMLElement = js.native
  
  var _map: Map = js.native
  
  var _terrainButton: HTMLButtonElement = js.native
  
  def _toggleTerrain(): scala.Unit = js.native
  
  def _updateTerrainIcon(): scala.Unit = js.native
  
  /**
  	 * Register a control on the map and give it a chance to register event listeners
  	 * and resources. This method is called by {@link Map#addControl}
  	 * internally.
  	 *
  	 * @function
  	 * @memberof IControl
  	 * @instance
  	 * @name onAdd
  	 * @param {Map} map the Map this control will be added to
  	 * @returns {HTMLElement} The control's container element. This should
  	 * be created by the control and returned by onAdd without being attached
  	 * to the DOM: the map will insert the control's element into the DOM
  	 * as necessary.
  	 */
  /* CompleteClass */
  override def onAdd(map: Map): HTMLElement = js.native
  
  def onRemove(): scala.Unit = js.native
  /**
  	 * Unregister a control on the map and give it a chance to detach event listeners
  	 * and resources. This method is called by {@link Map#removeControl}
  	 * internally.
  	 *
  	 * @function
  	 * @memberof IControl
  	 * @instance
  	 * @name onRemove
  	 * @param {Map} map the Map this control will be removed from
  	 * @returns {undefined} there is no required return value for this method
  	 */
  /* CompleteClass */
  override def onRemove(map: Map): scala.Unit = js.native
  
  var options: TerrainSpecification = js.native
}
