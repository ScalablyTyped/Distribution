package typings.maplibreGl.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IControl extends StObject {
  
  /**
  	 * Optionally provide a default position for this control. If this method
  	 * is implemented and {@link Map#addControl} is called without the `position`
  	 * parameter, the value returned by getDefaultPosition will be used as the
  	 * control's position.
  	 *
  	 * @function
  	 * @memberof IControl
  	 * @instance
  	 * @name getDefaultPosition
  	 * @returns {ControlPosition} a control position, one of the values valid in addControl.
  	 */
  val getDefaultPosition: js.UndefOr[js.Function0[ControlPosition]] = js.undefined
  
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
  def onAdd(map: Map): HTMLElement
  
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
  def onRemove(map: Map): scala.Unit
}
object IControl {
  
  inline def apply(onAdd: Map => HTMLElement, onRemove: Map => scala.Unit): IControl = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove))
    __obj.asInstanceOf[IControl]
  }
  
  extension [Self <: IControl](x: Self) {
    
    inline def setGetDefaultPosition(value: () => ControlPosition): Self = StObject.set(x, "getDefaultPosition", js.Any.fromFunction0(value))
    
    inline def setGetDefaultPositionUndefined: Self = StObject.set(x, "getDefaultPosition", js.undefined)
    
    inline def setOnAdd(value: Map => HTMLElement): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnRemove(value: Map => scala.Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
  }
}
