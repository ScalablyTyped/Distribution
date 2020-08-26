package typings.materialTextfield.adapterMod

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTextfield.typesMod.MDCTextFieldNativeInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTextFieldInputAdapter extends js.Object {
  /**
    * Deregisters an event listener on the native input element for a given event.
    */
  def deregisterInputInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * @return The native `<input>` element, or an object with the same shape.
    * Note that this method can return null, which the foundation will handle gracefully.
    */
  def getNativeInput(): MDCTextFieldNativeInputElement | Null = js.native
  /**
    * @return true if the textfield is focused. We achieve this via `document.activeElement === this.root`.
    */
  def isFocused(): Boolean = js.native
  /**
    * Registers an event listener on the native input element for a given event.
    */
  def registerInputInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
}

object MDCTextFieldInputAdapter {
  @scala.inline
  def apply(
    deregisterInputInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    getNativeInput: () => MDCTextFieldNativeInputElement | Null,
    isFocused: () => Boolean,
    registerInputInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit
  ): MDCTextFieldInputAdapter = {
    val __obj = js.Dynamic.literal(deregisterInputInteractionHandler = js.Any.fromFunction2(deregisterInputInteractionHandler), getNativeInput = js.Any.fromFunction0(getNativeInput), isFocused = js.Any.fromFunction0(isFocused), registerInputInteractionHandler = js.Any.fromFunction2(registerInputInteractionHandler))
    __obj.asInstanceOf[MDCTextFieldInputAdapter]
  }
  @scala.inline
  implicit class MDCTextFieldInputAdapterOps[Self <: MDCTextFieldInputAdapter] (val x: Self) extends AnyVal {
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
    def setDeregisterInputInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterInputInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setGetNativeInput(value: () => MDCTextFieldNativeInputElement | Null): Self = this.set("getNativeInput", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFocused(value: () => Boolean): Self = this.set("isFocused", js.Any.fromFunction0(value))
    @scala.inline
    def setRegisterInputInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerInputInteractionHandler", js.Any.fromFunction2(value))
  }
  
}

