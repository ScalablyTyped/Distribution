package typings.materialFloatingLabel.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/floating-label.@material/floating-label/adapter.MDCFloatingLabelAdapter> */
@js.native
trait PartialMDCFloatingLabelAd extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var deregisterInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var getWidth: js.UndefOr[js.Function0[Double]] = js.native
  var registerInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
}

object PartialMDCFloatingLabelAd {
  @scala.inline
  def apply(): PartialMDCFloatingLabelAd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCFloatingLabelAd]
  }
  @scala.inline
  implicit class PartialMDCFloatingLabelAdOps[Self <: PartialMDCFloatingLabelAd] (val x: Self) extends AnyVal {
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
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    @scala.inline
    def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeregisterInteractionHandler: Self = this.set("deregisterInteractionHandler", js.undefined)
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWidth: Self = this.set("getWidth", js.undefined)
    @scala.inline
    def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRegisterInteractionHandler: Self = this.set("registerInteractionHandler", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
  }
  
}

