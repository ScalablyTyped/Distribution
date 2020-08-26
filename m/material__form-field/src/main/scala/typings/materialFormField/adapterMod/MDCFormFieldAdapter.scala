package typings.materialFormField.adapterMod

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCFormFieldAdapter extends js.Object {
  def activateInputRipple(): Unit = js.native
  def deactivateInputRipple(): Unit = js.native
  def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
}

object MDCFormFieldAdapter {
  @scala.inline
  def apply(
    activateInputRipple: () => Unit,
    deactivateInputRipple: () => Unit,
    deregisterInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    registerInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit
  ): MDCFormFieldAdapter = {
    val __obj = js.Dynamic.literal(activateInputRipple = js.Any.fromFunction0(activateInputRipple), deactivateInputRipple = js.Any.fromFunction0(deactivateInputRipple), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler))
    __obj.asInstanceOf[MDCFormFieldAdapter]
  }
  @scala.inline
  implicit class MDCFormFieldAdapterOps[Self <: MDCFormFieldAdapter] (val x: Self) extends AnyVal {
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
    def setActivateInputRipple(value: () => Unit): Self = this.set("activateInputRipple", js.Any.fromFunction0(value))
    @scala.inline
    def setDeactivateInputRipple(value: () => Unit): Self = this.set("deactivateInputRipple", js.Any.fromFunction0(value))
    @scala.inline
    def setDeregisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
  }
  
}

