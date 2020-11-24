package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgColorPickerSplitButtonMethods extends js.Object {
  
  /**
    * Collapse the widget.
    *
    * @param e
    */
  def collapse(e: js.Object): js.Object = js.native
  
  /**
    * Destroys the widget.
    */
  def destroy(): js.Object = js.native
  
  /**
    * Expands the widget.
    *
    * @param e
    */
  def expand(e: js.Object): js.Object = js.native
  
  /**
    * Sets the color of the split button
    *
    * @param color The color value to be set.
    */
  def setColor(color: String): js.Object = js.native
  
  /**
    * Switch to given igToolbar button.
    *
    * @param button . The button jQuery element.
    */
  def switchToButton(button: js.Object): Unit = js.native
  
  /**
    * Toggle widget state between collapsed and expanded.
    *
    * @param e The igSplitButton to be expanded/collapsed.
    */
  def toggle(e: js.Object): js.Object = js.native
  
  def widget(): Unit = js.native
}
object IgColorPickerSplitButtonMethods {
  
  @scala.inline
  def apply(
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
  implicit class IgColorPickerSplitButtonMethodsOps[Self <: IgColorPickerSplitButtonMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollapse(value: js.Object => js.Object): Self = this.set("collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => js.Object): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpand(value: js.Object => js.Object): Self = this.set("expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetColor(value: String => js.Object): Self = this.set("setColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitchToButton(value: js.Object => Unit): Self = this.set("switchToButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggle(value: js.Object => js.Object): Self = this.set("toggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidget(value: () => Unit): Self = this.set("widget", js.Any.fromFunction0(value))
  }
}
