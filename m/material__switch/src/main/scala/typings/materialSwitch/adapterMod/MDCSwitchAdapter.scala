package typings.materialSwitch.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSwitchAdapter extends js.Object {
  /**
    * Adds a CSS class to the root element.
    */
  def addClass(className: String): Unit
  /**
    * Removes a CSS class from the root element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets checked state of the native HTML control underlying the switch.
    */
  def setNativeControlChecked(checked: Boolean): Unit
  /**
    * Sets the disabled state of the native HTML control underlying the switch.
    */
  def setNativeControlDisabled(disabled: Boolean): Unit
}

object MDCSwitchAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    removeClass: String => Unit,
    setNativeControlChecked: Boolean => Unit,
    setNativeControlDisabled: Boolean => Unit
  ): MDCSwitchAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), removeClass = js.Any.fromFunction1(removeClass), setNativeControlChecked = js.Any.fromFunction1(setNativeControlChecked), setNativeControlDisabled = js.Any.fromFunction1(setNativeControlDisabled))
  
    __obj.asInstanceOf[MDCSwitchAdapter]
  }
}

