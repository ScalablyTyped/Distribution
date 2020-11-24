package typings.ink.useFocusManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends js.Object {
  
  /**
    * Disable focus management for all components. Currently active component (if there's one) will lose its focus.
    */
  var disableFocus: js.Function0[Unit] = js.native
  
  /**
    * Enable focus management for all components.
    */
  var enableFocus: js.Function0[Unit] = js.native
  
  /**
    * Switch focus to the next focusable component.
    * If there's no active component right now, focus will be given to the first focusable component.
    * If active component is the last in the list of focusable components, focus will be switched to the first component.
    */
  var focusNext: js.Function0[Unit] = js.native
  
  /**
    * Switch focus to the previous focusable component.
    * If there's no active component right now, focus will be given to the first focusable component.
    * If active component is the first in the list of focusable components, focus will be switched to the last component.
    */
  var focusPrevious: js.Function0[Unit] = js.native
}
object Output {
  
  @scala.inline
  def apply(
    disableFocus: () => Unit,
    enableFocus: () => Unit,
    focusNext: () => Unit,
    focusPrevious: () => Unit
  ): Output = {
    val __obj = js.Dynamic.literal(disableFocus = js.Any.fromFunction0(disableFocus), enableFocus = js.Any.fromFunction0(enableFocus), focusNext = js.Any.fromFunction0(focusNext), focusPrevious = js.Any.fromFunction0(focusPrevious))
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    
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
    def setDisableFocus(value: () => Unit): Self = this.set("disableFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableFocus(value: () => Unit): Self = this.set("enableFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocusNext(value: () => Unit): Self = this.set("focusNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocusPrevious(value: () => Unit): Self = this.set("focusPrevious", js.Any.fromFunction0(value))
  }
}
