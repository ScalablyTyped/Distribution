package typings.materialNotchedOutline.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCNotchedOutlineAdapter extends js.Object {
  
  /**
    * Adds a class to the root element.
    */
  def addClass(className: String): Unit = js.native
  
  /**
    * Removes a class from the root element.
    */
  def removeClass(className: String): Unit = js.native
  
  /**
    * Removes the width style property from the notch element.
    */
  def removeNotchWidthProperty(): Unit = js.native
  
  /**
    * Sets the width style property of the notch element.
    */
  def setNotchWidthProperty(width: Double): Unit = js.native
}
object MDCNotchedOutlineAdapter {
  
  @scala.inline
  def apply(
    addClass: String => Unit,
    removeClass: String => Unit,
    removeNotchWidthProperty: () => Unit,
    setNotchWidthProperty: Double => Unit
  ): MDCNotchedOutlineAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), removeClass = js.Any.fromFunction1(removeClass), removeNotchWidthProperty = js.Any.fromFunction0(removeNotchWidthProperty), setNotchWidthProperty = js.Any.fromFunction1(setNotchWidthProperty))
    __obj.asInstanceOf[MDCNotchedOutlineAdapter]
  }
  
  @scala.inline
  implicit class MDCNotchedOutlineAdapterOps[Self <: MDCNotchedOutlineAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveNotchWidthProperty(value: () => Unit): Self = this.set("removeNotchWidthProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetNotchWidthProperty(value: Double => Unit): Self = this.set("setNotchWidthProperty", js.Any.fromFunction1(value))
  }
}
