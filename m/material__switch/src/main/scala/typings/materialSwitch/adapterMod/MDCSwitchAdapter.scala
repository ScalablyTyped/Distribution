package typings.materialSwitch.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCSwitchAdapter extends js.Object {
  
  /**
    * Adds a CSS class to the root element.
    */
  def addClass(className: String): Unit = js.native
  
  /**
    * Removes a CSS class from the root element.
    */
  def removeClass(className: String): Unit = js.native
  
  /**
    * Sets an attribute value of the native HTML control underlying the switch.
    */
  def setNativeControlAttr(attr: String, value: String): Unit = js.native
  
  /**
    * Sets checked state of the native HTML control underlying the switch.
    */
  def setNativeControlChecked(checked: Boolean): Unit = js.native
  
  /**
    * Sets the disabled state of the native HTML control underlying the switch.
    */
  def setNativeControlDisabled(disabled: Boolean): Unit = js.native
}
object MDCSwitchAdapter {
  
  @scala.inline
  def apply(
    addClass: String => Unit,
    removeClass: String => Unit,
    setNativeControlAttr: (String, String) => Unit,
    setNativeControlChecked: Boolean => Unit,
    setNativeControlDisabled: Boolean => Unit
  ): MDCSwitchAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), removeClass = js.Any.fromFunction1(removeClass), setNativeControlAttr = js.Any.fromFunction2(setNativeControlAttr), setNativeControlChecked = js.Any.fromFunction1(setNativeControlChecked), setNativeControlDisabled = js.Any.fromFunction1(setNativeControlDisabled))
    __obj.asInstanceOf[MDCSwitchAdapter]
  }
  
  @scala.inline
  implicit class MDCSwitchAdapterOps[Self <: MDCSwitchAdapter] (val x: Self) extends AnyVal {
    
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
    def setSetNativeControlAttr(value: (String, String) => Unit): Self = this.set("setNativeControlAttr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetNativeControlChecked(value: Boolean => Unit): Self = this.set("setNativeControlChecked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNativeControlDisabled(value: Boolean => Unit): Self = this.set("setNativeControlDisabled", js.Any.fromFunction1(value))
  }
}
