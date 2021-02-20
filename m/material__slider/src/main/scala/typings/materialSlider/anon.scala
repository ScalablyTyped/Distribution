package typings.materialSlider

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialSlider.typesMod.Thumb
import typings.materialSlider.typesMod.TickMark
import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@material/slider.@material/slider/adapter.MDCSliderAdapter> */
  @js.native
  trait PartialMDCSliderAdapter extends StObject {
    
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
    implicit class PartialMDCSliderAdapterMutableBuilder[Self <: PartialMDCSliderAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setAddThumbClass(value: (/* className */ String, /* thumb */ Thumb) => Unit): Self = StObject.set(x, "addThumbClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddThumbClassUndefined: Self = StObject.set(x, "addThumbClass", js.undefined)
      
      @scala.inline
      def setDeregisterBodyEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterBodyEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeregisterBodyEventHandlerUndefined: Self = StObject.set(x, "deregisterBodyEventHandler", js.undefined)
      
      @scala.inline
      def setDeregisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeregisterEventHandlerUndefined: Self = StObject.set(x, "deregisterEventHandler", js.undefined)
      
      @scala.inline
      def setDeregisterThumbEventHandler(
        value: (/* thumb */ Thumb, /* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit
      ): Self = StObject.set(x, "deregisterThumbEventHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDeregisterThumbEventHandlerUndefined: Self = StObject.set(x, "deregisterThumbEventHandler", js.undefined)
      
      @scala.inline
      def setDeregisterWindowEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterWindowEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeregisterWindowEventHandlerUndefined: Self = StObject.set(x, "deregisterWindowEventHandler", js.undefined)
      
      @scala.inline
      def setEmitChangeEvent(value: (/* value */ Double, /* thumb */ Thumb) => Unit): Self = StObject.set(x, "emitChangeEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmitChangeEventUndefined: Self = StObject.set(x, "emitChangeEvent", js.undefined)
      
      @scala.inline
      def setEmitDragEndEvent(value: (/* value */ Double, /* thumb */ Thumb) => Unit): Self = StObject.set(x, "emitDragEndEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmitDragEndEventUndefined: Self = StObject.set(x, "emitDragEndEvent", js.undefined)
      
      @scala.inline
      def setEmitDragStartEvent(value: (/* value */ Double, /* thumb */ Thumb) => Unit): Self = StObject.set(x, "emitDragStartEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmitDragStartEventUndefined: Self = StObject.set(x, "emitDragStartEvent", js.undefined)
      
      @scala.inline
      def setEmitInputEvent(value: (/* value */ Double, /* thumb */ Thumb) => Unit): Self = StObject.set(x, "emitInputEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmitInputEventUndefined: Self = StObject.set(x, "emitInputEvent", js.undefined)
      
      @scala.inline
      def setFocusThumb(value: /* thumb */ Thumb => Unit): Self = StObject.set(x, "focusThumb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusThumbUndefined: Self = StObject.set(x, "focusThumb", js.undefined)
      
      @scala.inline
      def setGetAttribute(value: /* attribute */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
      
      @scala.inline
      def setGetBoundingClientRect(value: () => ClientRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBoundingClientRectUndefined: Self = StObject.set(x, "getBoundingClientRect", js.undefined)
      
      @scala.inline
      def setGetThumbAttribute(value: (/* attribute */ String, /* thumb */ Thumb) => String | Null): Self = StObject.set(x, "getThumbAttribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetThumbAttributeUndefined: Self = StObject.set(x, "getThumbAttribute", js.undefined)
      
      @scala.inline
      def setGetThumbBoundingClientRect(value: /* thumb */ Thumb => ClientRect): Self = StObject.set(x, "getThumbBoundingClientRect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetThumbBoundingClientRectUndefined: Self = StObject.set(x, "getThumbBoundingClientRect", js.undefined)
      
      @scala.inline
      def setGetThumbKnobWidth(value: /* thumb */ Thumb => Double): Self = StObject.set(x, "getThumbKnobWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetThumbKnobWidthUndefined: Self = StObject.set(x, "getThumbKnobWidth", js.undefined)
      
      @scala.inline
      def setGetValueToAriaValueTextFn(value: () => (js.Function1[/* value */ Double, String]) | Null): Self = StObject.set(x, "getValueToAriaValueTextFn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueToAriaValueTextFnUndefined: Self = StObject.set(x, "getValueToAriaValueTextFn", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      @scala.inline
      def setIsThumbFocused(value: /* thumb */ Thumb => Boolean): Self = StObject.set(x, "isThumbFocused", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsThumbFocusedUndefined: Self = StObject.set(x, "isThumbFocused", js.undefined)
      
      @scala.inline
      def setRegisterBodyEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerBodyEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterBodyEventHandlerUndefined: Self = StObject.set(x, "registerBodyEventHandler", js.undefined)
      
      @scala.inline
      def setRegisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterEventHandlerUndefined: Self = StObject.set(x, "registerEventHandler", js.undefined)
      
      @scala.inline
      def setRegisterThumbEventHandler(
        value: (/* thumb */ Thumb, /* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit
      ): Self = StObject.set(x, "registerThumbEventHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRegisterThumbEventHandlerUndefined: Self = StObject.set(x, "registerThumbEventHandler", js.undefined)
      
      @scala.inline
      def setRegisterWindowEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerWindowEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterWindowEventHandlerUndefined: Self = StObject.set(x, "registerWindowEventHandler", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setRemoveThumbClass(value: (/* className */ String, /* thumb */ Thumb) => Unit): Self = StObject.set(x, "removeThumbClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveThumbClassUndefined: Self = StObject.set(x, "removeThumbClass", js.undefined)
      
      @scala.inline
      def setRemoveThumbStyleProperty(value: (/* propertyName */ String, /* thumb */ Thumb) => Unit): Self = StObject.set(x, "removeThumbStyleProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveThumbStylePropertyUndefined: Self = StObject.set(x, "removeThumbStyleProperty", js.undefined)
      
      @scala.inline
      def setRemoveTrackActiveStyleProperty(value: /* propertyName */ String => Unit): Self = StObject.set(x, "removeTrackActiveStyleProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveTrackActiveStylePropertyUndefined: Self = StObject.set(x, "removeTrackActiveStyleProperty", js.undefined)
      
      @scala.inline
      def setSetPointerCapture(value: /* pointerId */ Double => Unit): Self = StObject.set(x, "setPointerCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPointerCaptureUndefined: Self = StObject.set(x, "setPointerCapture", js.undefined)
      
      @scala.inline
      def setSetThumbAttribute(value: (/* attribute */ String, /* value */ String, /* thumb */ Thumb) => Unit): Self = StObject.set(x, "setThumbAttribute", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetThumbAttributeUndefined: Self = StObject.set(x, "setThumbAttribute", js.undefined)
      
      @scala.inline
      def setSetThumbStyleProperty(value: (/* propertyName */ String, /* value */ String, /* thumb */ Thumb) => Unit): Self = StObject.set(x, "setThumbStyleProperty", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetThumbStylePropertyUndefined: Self = StObject.set(x, "setThumbStyleProperty", js.undefined)
      
      @scala.inline
      def setSetTrackActiveStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setTrackActiveStyleProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetTrackActiveStylePropertyUndefined: Self = StObject.set(x, "setTrackActiveStyleProperty", js.undefined)
      
      @scala.inline
      def setSetValueIndicatorText(value: (/* value */ Double, /* thumb */ Thumb) => Unit): Self = StObject.set(x, "setValueIndicatorText", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetValueIndicatorTextUndefined: Self = StObject.set(x, "setValueIndicatorText", js.undefined)
      
      @scala.inline
      def setUpdateTickMarks(value: /* tickMarks */ js.Array[TickMark] => Unit): Self = StObject.set(x, "updateTickMarks", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateTickMarksUndefined: Self = StObject.set(x, "updateTickMarks", js.undefined)
    }
  }
  
  @js.native
  trait SkipInitialUIUpdate extends StObject {
    
    var skipInitialUIUpdate: js.UndefOr[Boolean] = js.native
  }
  object SkipInitialUIUpdate {
    
    @scala.inline
    def apply(): SkipInitialUIUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipInitialUIUpdate]
    }
    
    @scala.inline
    implicit class SkipInitialUIUpdateMutableBuilder[Self <: SkipInitialUIUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSkipInitialUIUpdate(value: Boolean): Self = StObject.set(x, "skipInitialUIUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipInitialUIUpdateUndefined: Self = StObject.set(x, "skipInitialUIUpdate", js.undefined)
    }
  }
  
  @js.native
  trait SkipUpdateUI extends StObject {
    
    var skipUpdateUI: js.UndefOr[Boolean] = js.native
  }
  object SkipUpdateUI {
    
    @scala.inline
    def apply(): SkipUpdateUI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipUpdateUI]
    }
    
    @scala.inline
    implicit class SkipUpdateUIMutableBuilder[Self <: SkipUpdateUI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSkipUpdateUI(value: Boolean): Self = StObject.set(x, "skipUpdateUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUpdateUIUndefined: Self = StObject.set(x, "skipUpdateUI", js.undefined)
    }
  }
}
