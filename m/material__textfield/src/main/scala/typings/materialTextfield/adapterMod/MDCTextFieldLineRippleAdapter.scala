package typings.materialTextfield.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCTextFieldLineRippleAdapter extends js.Object {
  
  /**
    * Activates the line ripple.
    */
  def activateLineRipple(): Unit = js.native
  
  /**
    * Deactivates the line ripple.
    */
  def deactivateLineRipple(): Unit = js.native
  
  /**
    * Sets the transform origin of the line ripple.
    */
  def setLineRippleTransformOrigin(normalizedX: Double): Unit = js.native
}
object MDCTextFieldLineRippleAdapter {
  
  @scala.inline
  def apply(
    activateLineRipple: () => Unit,
    deactivateLineRipple: () => Unit,
    setLineRippleTransformOrigin: Double => Unit
  ): MDCTextFieldLineRippleAdapter = {
    val __obj = js.Dynamic.literal(activateLineRipple = js.Any.fromFunction0(activateLineRipple), deactivateLineRipple = js.Any.fromFunction0(deactivateLineRipple), setLineRippleTransformOrigin = js.Any.fromFunction1(setLineRippleTransformOrigin))
    __obj.asInstanceOf[MDCTextFieldLineRippleAdapter]
  }
  
  @scala.inline
  implicit class MDCTextFieldLineRippleAdapterOps[Self <: MDCTextFieldLineRippleAdapter] (val x: Self) extends AnyVal {
    
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
    def setActivateLineRipple(value: () => Unit): Self = this.set("activateLineRipple", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeactivateLineRipple(value: () => Unit): Self = this.set("deactivateLineRipple", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLineRippleTransformOrigin(value: Double => Unit): Self = this.set("setLineRippleTransformOrigin", js.Any.fromFunction1(value))
  }
}
