package typings.materialRipple.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialRipple.materialRippleStrings.resize
import typings.materialRipple.typesMod.MDCRipplePoint
import typings.std.ClientRect
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/ripple.@material/ripple/adapter.MDCRippleAdapter> */
@js.native
trait PartialMDCRippleAdapter extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var browserSupportsCssVars: js.UndefOr[js.Function0[Boolean]] = js.native
  var computeBoundingRect: js.UndefOr[js.Function0[ClientRect]] = js.native
  var containsEventTarget: js.UndefOr[js.Function1[/* target */ EventTarget | Null, Boolean]] = js.native
  var deregisterDocumentInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var deregisterInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var deregisterResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
  var getWindowPageOffset: js.UndefOr[js.Function0[MDCRipplePoint]] = js.native
  var isSurfaceActive: js.UndefOr[js.Function0[Boolean]] = js.native
  var isSurfaceDisabled: js.UndefOr[js.Function0[Boolean]] = js.native
  var isUnbounded: js.UndefOr[js.Function0[Boolean]] = js.native
  var registerDocumentInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var registerInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var registerResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var updateCssVariable: js.UndefOr[js.Function2[/* varName */ String, /* value */ String | Null, Unit]] = js.native
}

object PartialMDCRippleAdapter {
  @scala.inline
  def apply(): PartialMDCRippleAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCRippleAdapter]
  }
  @scala.inline
  implicit class PartialMDCRippleAdapterOps[Self <: PartialMDCRippleAdapter] (val x: Self) extends AnyVal {
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
    def setBrowserSupportsCssVars(value: () => Boolean): Self = this.set("browserSupportsCssVars", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBrowserSupportsCssVars: Self = this.set("browserSupportsCssVars", js.undefined)
    @scala.inline
    def setComputeBoundingRect(value: () => ClientRect): Self = this.set("computeBoundingRect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComputeBoundingRect: Self = this.set("computeBoundingRect", js.undefined)
    @scala.inline
    def setContainsEventTarget(value: /* target */ EventTarget | Null => Boolean): Self = this.set("containsEventTarget", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContainsEventTarget: Self = this.set("containsEventTarget", js.undefined)
    @scala.inline
    def setDeregisterDocumentInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterDocumentInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeregisterDocumentInteractionHandler: Self = this.set("deregisterDocumentInteractionHandler", js.undefined)
    @scala.inline
    def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeregisterInteractionHandler: Self = this.set("deregisterInteractionHandler", js.undefined)
    @scala.inline
    def setDeregisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = this.set("deregisterResizeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeregisterResizeHandler: Self = this.set("deregisterResizeHandler", js.undefined)
    @scala.inline
    def setGetWindowPageOffset(value: () => MDCRipplePoint): Self = this.set("getWindowPageOffset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWindowPageOffset: Self = this.set("getWindowPageOffset", js.undefined)
    @scala.inline
    def setIsSurfaceActive(value: () => Boolean): Self = this.set("isSurfaceActive", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsSurfaceActive: Self = this.set("isSurfaceActive", js.undefined)
    @scala.inline
    def setIsSurfaceDisabled(value: () => Boolean): Self = this.set("isSurfaceDisabled", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsSurfaceDisabled: Self = this.set("isSurfaceDisabled", js.undefined)
    @scala.inline
    def setIsUnbounded(value: () => Boolean): Self = this.set("isUnbounded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsUnbounded: Self = this.set("isUnbounded", js.undefined)
    @scala.inline
    def setRegisterDocumentInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerDocumentInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRegisterDocumentInteractionHandler: Self = this.set("registerDocumentInteractionHandler", js.undefined)
    @scala.inline
    def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRegisterInteractionHandler: Self = this.set("registerInteractionHandler", js.undefined)
    @scala.inline
    def setRegisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = this.set("registerResizeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRegisterResizeHandler: Self = this.set("registerResizeHandler", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    @scala.inline
    def setUpdateCssVariable(value: (/* varName */ String, /* value */ String | Null) => Unit): Self = this.set("updateCssVariable", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdateCssVariable: Self = this.set("updateCssVariable", js.undefined)
  }
  
}

