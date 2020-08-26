package typings.materialSlider.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialSlider.materialSliderStrings.resize
import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/slider.@material/slider/adapter.MDCSliderAdapter> */
@js.native
trait PartialMDCSliderAdapter extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var computeBoundingRect: js.UndefOr[js.Function0[ClientRect]] = js.native
  var deregisterBodyInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var deregisterInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var deregisterResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
  var deregisterThumbContainerInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var getAttribute: js.UndefOr[js.Function1[/* name */ String, String | Null]] = js.native
  var getTabIndex: js.UndefOr[js.Function0[Double]] = js.native
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  var isRTL: js.UndefOr[js.Function0[Boolean]] = js.native
  var notifyChange: js.UndefOr[js.Function0[Unit]] = js.native
  var notifyInput: js.UndefOr[js.Function0[Unit]] = js.native
  var registerBodyInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var registerInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var registerResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
  var registerThumbContainerInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var removeAttribute: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var setAttribute: js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]] = js.native
  var setMarkerValue: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var setThumbContainerStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.native
  var setTrackMarkers: js.UndefOr[js.Function3[/* step */ Double, /* max */ Double, /* min */ Double, Unit]] = js.native
  var setTrackStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.native
}

object PartialMDCSliderAdapter {
  @scala.inline
  def apply(): PartialMDCSliderAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCSliderAdapter]
  }
  @scala.inline
  implicit class PartialMDCSliderAdapterOps[Self <: PartialMDCSliderAdapter] (val x: Self) extends AnyVal {
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
    def setComputeBoundingRect(value: () => ClientRect): Self = this.set("computeBoundingRect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComputeBoundingRect: Self = this.set("computeBoundingRect", js.undefined)
    @scala.inline
    def setDeregisterBodyInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterBodyInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeregisterBodyInteractionHandler: Self = this.set("deregisterBodyInteractionHandler", js.undefined)
    @scala.inline
    def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeregisterInteractionHandler: Self = this.set("deregisterInteractionHandler", js.undefined)
    @scala.inline
    def setDeregisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = this.set("deregisterResizeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeregisterResizeHandler: Self = this.set("deregisterResizeHandler", js.undefined)
    @scala.inline
    def setDeregisterThumbContainerInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterThumbContainerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeregisterThumbContainerInteractionHandler: Self = this.set("deregisterThumbContainerInteractionHandler", js.undefined)
    @scala.inline
    def setGetAttribute(value: /* name */ String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAttribute: Self = this.set("getAttribute", js.undefined)
    @scala.inline
    def setGetTabIndex(value: () => Double): Self = this.set("getTabIndex", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTabIndex: Self = this.set("getTabIndex", js.undefined)
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    @scala.inline
    def setIsRTL(value: () => Boolean): Self = this.set("isRTL", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    @scala.inline
    def setNotifyChange(value: () => Unit): Self = this.set("notifyChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNotifyChange: Self = this.set("notifyChange", js.undefined)
    @scala.inline
    def setNotifyInput(value: () => Unit): Self = this.set("notifyInput", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNotifyInput: Self = this.set("notifyInput", js.undefined)
    @scala.inline
    def setRegisterBodyInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerBodyInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRegisterBodyInteractionHandler: Self = this.set("registerBodyInteractionHandler", js.undefined)
    @scala.inline
    def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRegisterInteractionHandler: Self = this.set("registerInteractionHandler", js.undefined)
    @scala.inline
    def setRegisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = this.set("registerResizeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRegisterResizeHandler: Self = this.set("registerResizeHandler", js.undefined)
    @scala.inline
    def setRegisterThumbContainerInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerThumbContainerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRegisterThumbContainerInteractionHandler: Self = this.set("registerThumbContainerInteractionHandler", js.undefined)
    @scala.inline
    def setRemoveAttribute(value: /* name */ String => Unit): Self = this.set("removeAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAttribute: Self = this.set("removeAttribute", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    @scala.inline
    def setSetAttribute(value: (/* name */ String, /* value */ String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetAttribute: Self = this.set("setAttribute", js.undefined)
    @scala.inline
    def setSetMarkerValue(value: /* value */ Double => Unit): Self = this.set("setMarkerValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMarkerValue: Self = this.set("setMarkerValue", js.undefined)
    @scala.inline
    def setSetThumbContainerStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = this.set("setThumbContainerStyleProperty", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetThumbContainerStyleProperty: Self = this.set("setThumbContainerStyleProperty", js.undefined)
    @scala.inline
    def setSetTrackMarkers(value: (/* step */ Double, /* max */ Double, /* min */ Double) => Unit): Self = this.set("setTrackMarkers", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetTrackMarkers: Self = this.set("setTrackMarkers", js.undefined)
    @scala.inline
    def setSetTrackStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = this.set("setTrackStyleProperty", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetTrackStyleProperty: Self = this.set("setTrackStyleProperty", js.undefined)
  }
  
}

