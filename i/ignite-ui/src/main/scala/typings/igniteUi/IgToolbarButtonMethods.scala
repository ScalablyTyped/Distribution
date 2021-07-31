package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgToolbarButtonMethods extends StObject {
  
  /**
    * Activate toolbar button
    *
    * @param event
    */
  def activate(event: js.Object): Unit
  
  /**
    * Deactivate toolbar button
    *
    * @param event
    */
  def deactivate(event: js.Object): Unit
  
  /**
    * Destroy the widget.
    */
  def destroy(): Unit
  
  /**
    * Toggle toolbar button
    */
  def toggle(): Unit
  
  /**
    * Returns the element that represents this widget.
    */
  def widget(): js.Object
}
object IgToolbarButtonMethods {
  
  @scala.inline
  def apply(
    activate: js.Object => Unit,
    deactivate: js.Object => Unit,
    destroy: () => Unit,
    toggle: () => Unit,
    widget: () => js.Object
  ): IgToolbarButtonMethods = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), deactivate = js.Any.fromFunction1(deactivate), destroy = js.Any.fromFunction0(destroy), toggle = js.Any.fromFunction0(toggle), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgToolbarButtonMethods]
  }
  
  @scala.inline
  implicit class IgToolbarButtonMethodsMutableBuilder[Self <: IgToolbarButtonMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: js.Object => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeactivate(value: js.Object => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidget(value: () => js.Object): Self = StObject.set(x, "widget", js.Any.fromFunction0(value))
  }
}
