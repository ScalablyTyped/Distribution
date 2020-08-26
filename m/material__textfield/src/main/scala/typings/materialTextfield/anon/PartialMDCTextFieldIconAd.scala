package typings.materialTextfield.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/textfield.@material/textfield/icon/adapter.MDCTextFieldIconAdapter> */
@js.native
trait PartialMDCTextFieldIconAd extends js.Object {
  var deregisterInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var getAttr: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.native
  var notifyIconAction: js.UndefOr[js.Function0[Unit]] = js.native
  var registerInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var removeAttr: js.UndefOr[js.Function1[/* attr */ String, Unit]] = js.native
  var setAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.native
  var setContent: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
}

object PartialMDCTextFieldIconAd {
  @scala.inline
  def apply(): PartialMDCTextFieldIconAd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldIconAd]
  }
  @scala.inline
  implicit class PartialMDCTextFieldIconAdOps[Self <: PartialMDCTextFieldIconAd] (val x: Self) extends AnyVal {
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
    def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeregisterInteractionHandler: Self = this.set("deregisterInteractionHandler", js.undefined)
    @scala.inline
    def setGetAttr(value: /* attr */ String => String | Null): Self = this.set("getAttr", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAttr: Self = this.set("getAttr", js.undefined)
    @scala.inline
    def setNotifyIconAction(value: () => Unit): Self = this.set("notifyIconAction", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNotifyIconAction: Self = this.set("notifyIconAction", js.undefined)
    @scala.inline
    def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRegisterInteractionHandler: Self = this.set("registerInteractionHandler", js.undefined)
    @scala.inline
    def setRemoveAttr(value: /* attr */ String => Unit): Self = this.set("removeAttr", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAttr: Self = this.set("removeAttr", js.undefined)
    @scala.inline
    def setSetAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = this.set("setAttr", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetAttr: Self = this.set("setAttr", js.undefined)
    @scala.inline
    def setSetContent(value: /* content */ String => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetContent: Self = this.set("setContent", js.undefined)
  }
  
}

