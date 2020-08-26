package typings.materialLineRipple.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/line-ripple.@material/line-ripple/adapter.MDCLineRippleAdapter> */
@js.native
trait PartialMDCLineRippleAdapt extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var deregisterEventHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  var registerEventHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var setStyle: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.native
}

object PartialMDCLineRippleAdapt {
  @scala.inline
  def apply(): PartialMDCLineRippleAdapt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCLineRippleAdapt]
  }
  @scala.inline
  implicit class PartialMDCLineRippleAdaptOps[Self <: PartialMDCLineRippleAdapt] (val x: Self) extends AnyVal {
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
    def setDeregisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterEventHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeregisterEventHandler: Self = this.set("deregisterEventHandler", js.undefined)
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    @scala.inline
    def setRegisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerEventHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRegisterEventHandler: Self = this.set("registerEventHandler", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    @scala.inline
    def setSetStyle(value: (/* propertyName */ String, /* value */ String) => Unit): Self = this.set("setStyle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
  }
  
}

