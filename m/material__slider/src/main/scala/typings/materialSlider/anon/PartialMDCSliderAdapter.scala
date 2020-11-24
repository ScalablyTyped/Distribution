package typings.materialSlider.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialSlider.typesMod.Thumb
import typings.materialSlider.typesMod.TickMark
import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/slider.@material/slider/adapter.MDCSliderAdapter> */
@js.native
trait PartialMDCSliderAdapter extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var addThumbClass: js.UndefOr[js.Function2[/* className */ String, /* thumb */ Thumb, Unit]] = js.native
  
  var deregisterBodyEventHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var deregisterEventHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var deregisterThumbEventHandler: js.UndefOr[
    js.Function3[
      /* thumb */ Thumb, 
      /* evtType */ EventType, 
      /* handler */ SpecificEventListener[EventType], 
      Unit
    ]
  ] = js.native
  
  var deregisterWindowEventHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var emitChangeEvent: js.UndefOr[js.Function2[/* value */ Double, /* thumb */ Thumb, Unit]] = js.native
  
  var emitDragEndEvent: js.UndefOr[js.Function2[/* value */ Double, /* thumb */ Thumb, Unit]] = js.native
  
  var emitDragStartEvent: js.UndefOr[js.Function2[/* value */ Double, /* thumb */ Thumb, Unit]] = js.native
  
  var emitInputEvent: js.UndefOr[js.Function2[/* value */ Double, /* thumb */ Thumb, Unit]] = js.native
  
  var focusThumb: js.UndefOr[js.Function1[/* thumb */ Thumb, Unit]] = js.native
  
  var getAttribute: js.UndefOr[js.Function1[/* attribute */ String, String | Null]] = js.native
  
  var getBoundingClientRect: js.UndefOr[js.Function0[ClientRect]] = js.native
  
  var getThumbAttribute: js.UndefOr[js.Function2[/* attribute */ String, /* thumb */ Thumb, String | Null]] = js.native
  
  var getThumbBoundingClientRect: js.UndefOr[js.Function1[/* thumb */ Thumb, ClientRect]] = js.native
  
  var getThumbKnobWidth: js.UndefOr[js.Function1[/* thumb */ Thumb, Double]] = js.native
  
  var getValueToAriaValueTextFn: js.UndefOr[js.Function0[(js.Function1[/* value */ Double, String]) | Null]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var isRTL: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isThumbFocused: js.UndefOr[js.Function1[/* thumb */ Thumb, Boolean]] = js.native
  
  var registerBodyEventHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var registerEventHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var registerThumbEventHandler: js.UndefOr[
    js.Function3[
      /* thumb */ Thumb, 
      /* evtType */ EventType, 
      /* handler */ SpecificEventListener[EventType], 
      Unit
    ]
  ] = js.native
  
  var registerWindowEventHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var removeThumbClass: js.UndefOr[js.Function2[/* className */ String, /* thumb */ Thumb, Unit]] = js.native
  
  var removeThumbStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* thumb */ Thumb, Unit]] = js.native
  
  var removeTrackActiveStyleProperty: js.UndefOr[js.Function1[/* propertyName */ String, Unit]] = js.native
  
  var setPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.native
  
  var setThumbAttribute: js.UndefOr[
    js.Function3[/* attribute */ String, /* value */ String, /* thumb */ Thumb, Unit]
  ] = js.native
  
  var setThumbStyleProperty: js.UndefOr[
    js.Function3[/* propertyName */ String, /* value */ String, /* thumb */ Thumb, Unit]
  ] = js.native
  
  var setTrackActiveStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.native
  
  var setValueIndicatorText: js.UndefOr[js.Function2[/* value */ Double, /* thumb */ Thumb, Unit]] = js.native
  
  var updateTickMarks: js.UndefOr[js.Function1[/* tickMarks */ js.Array[TickMark], Unit]] = js.native
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
    def setAddThumbClass(value: (/* className */ String, /* thumb */ Thumb) => Unit): Self = this.set("addThumbClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAddThumbClass: Self = this.set("addThumbClass", js.undefined)
    
    @scala.inline
    def setDeregisterBodyEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterBodyEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeregisterBodyEventHandler: Self = this.set("deregisterBodyEventHandler", js.undefined)
    
    @scala.inline
    def setDeregisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeregisterEventHandler: Self = this.set("deregisterEventHandler", js.undefined)
    
    @scala.inline
    def setDeregisterThumbEventHandler(
      value: (/* thumb */ Thumb, /* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit
    ): Self = this.set("deregisterThumbEventHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeregisterThumbEventHandler: Self = this.set("deregisterThumbEventHandler", js.undefined)
    
    @scala.inline
    def setDeregisterWindowEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterWindowEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeregisterWindowEventHandler: Self = this.set("deregisterWindowEventHandler", js.undefined)
    
    @scala.inline
    def setEmitChangeEvent(value: (/* value */ Double, /* thumb */ Thumb) => Unit): Self = this.set("emitChangeEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEmitChangeEvent: Self = this.set("emitChangeEvent", js.undefined)
    
    @scala.inline
    def setEmitDragEndEvent(value: (/* value */ Double, /* thumb */ Thumb) => Unit): Self = this.set("emitDragEndEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEmitDragEndEvent: Self = this.set("emitDragEndEvent", js.undefined)
    
    @scala.inline
    def setEmitDragStartEvent(value: (/* value */ Double, /* thumb */ Thumb) => Unit): Self = this.set("emitDragStartEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEmitDragStartEvent: Self = this.set("emitDragStartEvent", js.undefined)
    
    @scala.inline
    def setEmitInputEvent(value: (/* value */ Double, /* thumb */ Thumb) => Unit): Self = this.set("emitInputEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEmitInputEvent: Self = this.set("emitInputEvent", js.undefined)
    
    @scala.inline
    def setFocusThumb(value: /* thumb */ Thumb => Unit): Self = this.set("focusThumb", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusThumb: Self = this.set("focusThumb", js.undefined)
    
    @scala.inline
    def setGetAttribute(value: /* attribute */ String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAttribute: Self = this.set("getAttribute", js.undefined)
    
    @scala.inline
    def setGetBoundingClientRect(value: () => ClientRect): Self = this.set("getBoundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBoundingClientRect: Self = this.set("getBoundingClientRect", js.undefined)
    
    @scala.inline
    def setGetThumbAttribute(value: (/* attribute */ String, /* thumb */ Thumb) => String | Null): Self = this.set("getThumbAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetThumbAttribute: Self = this.set("getThumbAttribute", js.undefined)
    
    @scala.inline
    def setGetThumbBoundingClientRect(value: /* thumb */ Thumb => ClientRect): Self = this.set("getThumbBoundingClientRect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetThumbBoundingClientRect: Self = this.set("getThumbBoundingClientRect", js.undefined)
    
    @scala.inline
    def setGetThumbKnobWidth(value: /* thumb */ Thumb => Double): Self = this.set("getThumbKnobWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetThumbKnobWidth: Self = this.set("getThumbKnobWidth", js.undefined)
    
    @scala.inline
    def setGetValueToAriaValueTextFn(value: () => (js.Function1[/* value */ Double, String]) | Null): Self = this.set("getValueToAriaValueTextFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValueToAriaValueTextFn: Self = this.set("getValueToAriaValueTextFn", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setIsRTL(value: () => Boolean): Self = this.set("isRTL", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setIsThumbFocused(value: /* thumb */ Thumb => Boolean): Self = this.set("isThumbFocused", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsThumbFocused: Self = this.set("isThumbFocused", js.undefined)
    
    @scala.inline
    def setRegisterBodyEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerBodyEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRegisterBodyEventHandler: Self = this.set("registerBodyEventHandler", js.undefined)
    
    @scala.inline
    def setRegisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRegisterEventHandler: Self = this.set("registerEventHandler", js.undefined)
    
    @scala.inline
    def setRegisterThumbEventHandler(
      value: (/* thumb */ Thumb, /* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit
    ): Self = this.set("registerThumbEventHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRegisterThumbEventHandler: Self = this.set("registerThumbEventHandler", js.undefined)
    
    @scala.inline
    def setRegisterWindowEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerWindowEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRegisterWindowEventHandler: Self = this.set("registerWindowEventHandler", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setRemoveThumbClass(value: (/* className */ String, /* thumb */ Thumb) => Unit): Self = this.set("removeThumbClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveThumbClass: Self = this.set("removeThumbClass", js.undefined)
    
    @scala.inline
    def setRemoveThumbStyleProperty(value: (/* propertyName */ String, /* thumb */ Thumb) => Unit): Self = this.set("removeThumbStyleProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveThumbStyleProperty: Self = this.set("removeThumbStyleProperty", js.undefined)
    
    @scala.inline
    def setRemoveTrackActiveStyleProperty(value: /* propertyName */ String => Unit): Self = this.set("removeTrackActiveStyleProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveTrackActiveStyleProperty: Self = this.set("removeTrackActiveStyleProperty", js.undefined)
    
    @scala.inline
    def setSetPointerCapture(value: /* pointerId */ Double => Unit): Self = this.set("setPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPointerCapture: Self = this.set("setPointerCapture", js.undefined)
    
    @scala.inline
    def setSetThumbAttribute(value: (/* attribute */ String, /* value */ String, /* thumb */ Thumb) => Unit): Self = this.set("setThumbAttribute", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetThumbAttribute: Self = this.set("setThumbAttribute", js.undefined)
    
    @scala.inline
    def setSetThumbStyleProperty(value: (/* propertyName */ String, /* value */ String, /* thumb */ Thumb) => Unit): Self = this.set("setThumbStyleProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetThumbStyleProperty: Self = this.set("setThumbStyleProperty", js.undefined)
    
    @scala.inline
    def setSetTrackActiveStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = this.set("setTrackActiveStyleProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetTrackActiveStyleProperty: Self = this.set("setTrackActiveStyleProperty", js.undefined)
    
    @scala.inline
    def setSetValueIndicatorText(value: (/* value */ Double, /* thumb */ Thumb) => Unit): Self = this.set("setValueIndicatorText", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetValueIndicatorText: Self = this.set("setValueIndicatorText", js.undefined)
    
    @scala.inline
    def setUpdateTickMarks(value: /* tickMarks */ js.Array[TickMark] => Unit): Self = this.set("updateTickMarks", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateTickMarks: Self = this.set("updateTickMarks", js.undefined)
  }
}
