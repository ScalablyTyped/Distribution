package typings.materialFormField.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/form-field.@material/form-field/adapter.MDCFormFieldAdapter> */
@js.native
trait PartialMDCFormFieldAdapte extends js.Object {
  var activateInputRipple: js.UndefOr[js.Function0[Unit]] = js.native
  var deactivateInputRipple: js.UndefOr[js.Function0[Unit]] = js.native
  var deregisterInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var registerInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
}

object PartialMDCFormFieldAdapte {
  @scala.inline
  def apply(): PartialMDCFormFieldAdapte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCFormFieldAdapte]
  }
  @scala.inline
  implicit class PartialMDCFormFieldAdapteOps[Self <: PartialMDCFormFieldAdapte] (val x: Self) extends AnyVal {
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
    def deleteActivateInputRipple: Self = this.set("activateInputRipple", js.undefined)
    @scala.inline
    def setDeactivateInputRipple(value: () => Unit): Self = this.set("deactivateInputRipple", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDeactivateInputRipple: Self = this.set("deactivateInputRipple", js.undefined)
    @scala.inline
    def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeregisterInteractionHandler: Self = this.set("deregisterInteractionHandler", js.undefined)
    @scala.inline
    def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRegisterInteractionHandler: Self = this.set("registerInteractionHandler", js.undefined)
  }
  
}

