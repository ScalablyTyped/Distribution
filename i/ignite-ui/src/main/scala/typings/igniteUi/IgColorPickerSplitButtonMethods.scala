package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgColorPickerSplitButtonMethods extends StObject {
  
  /**
    * Collapse the widget.
    *
    * @param e
    */
  def collapse(e: js.Object): js.Object
  
  /**
    * Destroys the widget.
    */
  def destroy(): js.Object
  
  /**
    * Expands the widget.
    *
    * @param e
    */
  def expand(e: js.Object): js.Object
  
  /**
    * Sets the color of the split button
    *
    * @param color The color value to be set.
    */
  def setColor(color: String): js.Object
  
  /**
    * Switch to given igToolbar button.
    *
    * @param button . The button jQuery element.
    */
  def switchToButton(button: js.Object): Unit
  
  /**
    * Toggle widget state between collapsed and expanded.
    *
    * @param e The igSplitButton to be expanded/collapsed.
    */
  def toggle(e: js.Object): js.Object
  
  def widget(): Unit
}
object IgColorPickerSplitButtonMethods {
  
  inline def apply(
    collapse: js.Object => js.Object,
    destroy: () => js.Object,
    expand: js.Object => js.Object,
    setColor: String => js.Object,
    switchToButton: js.Object => Unit,
    toggle: js.Object => js.Object,
    widget: () => Unit
  ): IgColorPickerSplitButtonMethods = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction1(collapse), destroy = js.Any.fromFunction0(destroy), expand = js.Any.fromFunction1(expand), setColor = js.Any.fromFunction1(setColor), switchToButton = js.Any.fromFunction1(switchToButton), toggle = js.Any.fromFunction1(toggle), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgColorPickerSplitButtonMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgColorPickerSplitButtonMethods] (val x: Self) extends AnyVal {
    
    inline def setCollapse(value: js.Object => js.Object): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: () => js.Object): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setExpand(value: js.Object => js.Object): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    inline def setSetColor(value: String => js.Object): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
    
    inline def setSwitchToButton(value: js.Object => Unit): Self = StObject.set(x, "switchToButton", js.Any.fromFunction1(value))
    
    inline def setToggle(value: js.Object => js.Object): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    inline def setWidget(value: () => Unit): Self = StObject.set(x, "widget", js.Any.fromFunction0(value))
  }
}
