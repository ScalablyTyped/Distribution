package typings.interactjsTypes.anon

import typings.std.DOMHighResTimeStamp
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/core/types.NativePointerEventType> */
trait PartialNativePointerEvent extends StObject {
  
  var AT_TARGET: js.UndefOr[Double] = js.undefined
  
  var BUBBLING_PHASE: js.UndefOr[Double] = js.undefined
  
  var CAPTURING_PHASE: js.UndefOr[Double] = js.undefined
  
  var NONE: js.UndefOr[Double] = js.undefined
  
  var altKey: js.UndefOr[Boolean] = js.undefined
  
  var bubbles: js.UndefOr[Boolean] = js.undefined
  
  var button: js.UndefOr[Double] = js.undefined
  
  var buttons: js.UndefOr[Double] = js.undefined
  
  var cancelBubble: js.UndefOr[Boolean] = js.undefined
  
  var cancelable: js.UndefOr[Boolean] = js.undefined
  
  var clientX: js.UndefOr[Double] = js.undefined
  
  var clientY: js.UndefOr[Double] = js.undefined
  
  var composed: js.UndefOr[Boolean] = js.undefined
  
  var composedPath: js.UndefOr[js.Function0[js.Array[typings.std.EventTarget]]] = js.undefined
  
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  
  var currentTarget: js.UndefOr[typings.std.EventTarget | Null] = js.undefined
  
  var defaultPrevented: js.UndefOr[Boolean] = js.undefined
  
  var detail: js.UndefOr[Double] = js.undefined
  
  var eventPhase: js.UndefOr[Double] = js.undefined
  
  var getCoalescedEvents: js.UndefOr[js.Function0[js.Array[typings.std.PointerEvent]]] = js.undefined
  
  var getModifierState: js.UndefOr[js.Function1[/* keyArg */ String, Boolean]] = js.undefined
  
  var getPredictedEvents: js.UndefOr[js.Function0[js.Array[typings.std.PointerEvent]]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var initEvent: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.undefined
  
  var initMouseEvent: js.UndefOr[
    js.Function14[
      /* typeArg */ String, 
      /* canBubbleArg */ Boolean, 
      /* cancelableArg */ Boolean, 
      /* viewArg */ Window, 
      /* detailArg */ Double, 
      /* screenXArg */ Double, 
      /* screenYArg */ Double, 
      /* clientXArg */ Double, 
      /* clientYArg */ Double, 
      /* ctrlKeyArg */ Boolean, 
      /* altKeyArg */ Boolean, 
      /* shiftKeyArg */ Boolean, 
      /* metaKeyArg */ Boolean, 
      /* buttonArg */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var initUIEvent: js.UndefOr[js.Function1[/* typeArg */ String, Unit]] = js.undefined
  
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  
  var isTrusted: js.UndefOr[Boolean] = js.undefined
  
  var metaKey: js.UndefOr[Boolean] = js.undefined
  
  var movementX: js.UndefOr[Double] = js.undefined
  
  var movementY: js.UndefOr[Double] = js.undefined
  
  var offsetX: js.UndefOr[Double] = js.undefined
  
  var offsetY: js.UndefOr[Double] = js.undefined
  
  var pageX: js.UndefOr[Double] = js.undefined
  
  var pageY: js.UndefOr[Double] = js.undefined
  
  var pointerId: js.UndefOr[Double] = js.undefined
  
  var pointerType: js.UndefOr[String] = js.undefined
  
  var pressure: js.UndefOr[Double] = js.undefined
  
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var relatedTarget: js.UndefOr[typings.std.EventTarget | Null] = js.undefined
  
  var returnValue: js.UndefOr[Boolean] = js.undefined
  
  var screenX: js.UndefOr[Double] = js.undefined
  
  var screenY: js.UndefOr[Double] = js.undefined
  
  var shiftKey: js.UndefOr[Boolean] = js.undefined
  
  var srcElement: js.UndefOr[typings.std.EventTarget | Null] = js.undefined
  
  var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var tangentialPressure: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[typings.std.EventTarget | Null] = js.undefined
  
  var tiltX: js.UndefOr[Double] = js.undefined
  
  var tiltY: js.UndefOr[Double] = js.undefined
  
  var timeStamp: js.UndefOr[DOMHighResTimeStamp] = js.undefined
  
  var twist: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var view: js.UndefOr[Window | Null] = js.undefined
  
  var which: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object PartialNativePointerEvent {
  
  inline def apply(): PartialNativePointerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNativePointerEvent]
  }
  
  extension [Self <: PartialNativePointerEvent](x: Self) {
    
    inline def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
    
    inline def setAT_TARGETUndefined: Self = StObject.set(x, "AT_TARGET", js.undefined)
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    inline def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setBUBBLING_PHASEUndefined: Self = StObject.set(x, "BUBBLING_PHASE", js.undefined)
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setCAPTURING_PHASEUndefined: Self = StObject.set(x, "CAPTURING_PHASE", js.undefined)
    
    inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    inline def setCancelBubbleUndefined: Self = StObject.set(x, "cancelBubble", js.undefined)
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    inline def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
    
    inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    inline def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedPath(value: () => js.Array[typings.std.EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
    
    inline def setComposedPathUndefined: Self = StObject.set(x, "composedPath", js.undefined)
    
    inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    inline def setCurrentTarget(value: typings.std.EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
    
    inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setDefaultPreventedUndefined: Self = StObject.set(x, "defaultPrevented", js.undefined)
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setEventPhaseUndefined: Self = StObject.set(x, "eventPhase", js.undefined)
    
    inline def setGetCoalescedEvents(value: () => js.Array[typings.std.PointerEvent]): Self = StObject.set(x, "getCoalescedEvents", js.Any.fromFunction0(value))
    
    inline def setGetCoalescedEventsUndefined: Self = StObject.set(x, "getCoalescedEvents", js.undefined)
    
    inline def setGetModifierState(value: /* keyArg */ String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
    
    inline def setGetModifierStateUndefined: Self = StObject.set(x, "getModifierState", js.undefined)
    
    inline def setGetPredictedEvents(value: () => js.Array[typings.std.PointerEvent]): Self = StObject.set(x, "getPredictedEvents", js.Any.fromFunction0(value))
    
    inline def setGetPredictedEventsUndefined: Self = StObject.set(x, "getPredictedEvents", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
    
    inline def setInitEventUndefined: Self = StObject.set(x, "initEvent", js.undefined)
    
    inline def setInitMouseEvent(
      value: (/* typeArg */ String, /* canBubbleArg */ Boolean, /* cancelableArg */ Boolean, /* viewArg */ Window, /* detailArg */ Double, /* screenXArg */ Double, /* screenYArg */ Double, /* clientXArg */ Double, /* clientYArg */ Double, /* ctrlKeyArg */ Boolean, /* altKeyArg */ Boolean, /* shiftKeyArg */ Boolean, /* metaKeyArg */ Boolean, /* buttonArg */ Double) => Unit
    ): Self = StObject.set(x, "initMouseEvent", js.Any.fromFunction14(value))
    
    inline def setInitMouseEventUndefined: Self = StObject.set(x, "initMouseEvent", js.undefined)
    
    inline def setInitUIEvent(value: /* typeArg */ String => Unit): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction1(value))
    
    inline def setInitUIEventUndefined: Self = StObject.set(x, "initUIEvent", js.undefined)
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
    
    inline def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
    
    inline def setMovementXUndefined: Self = StObject.set(x, "movementX", js.undefined)
    
    inline def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
    
    inline def setMovementYUndefined: Self = StObject.set(x, "movementY", js.undefined)
    
    inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setNONEUndefined: Self = StObject.set(x, "NONE", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerIdUndefined: Self = StObject.set(x, "pointerId", js.undefined)
    
    inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
    
    inline def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    
    inline def setPressureUndefined: Self = StObject.set(x, "pressure", js.undefined)
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setRelatedTarget(value: typings.std.EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    inline def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    inline def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    inline def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    
    inline def setSrcElement(value: typings.std.EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
    
    inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
    
    inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
    
    inline def setStopImmediatePropagationUndefined: Self = StObject.set(x, "stopImmediatePropagation", js.undefined)
    
    inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    
    inline def setTangentialPressure(value: Double): Self = StObject.set(x, "tangentialPressure", value.asInstanceOf[js.Any])
    
    inline def setTangentialPressureUndefined: Self = StObject.set(x, "tangentialPressure", js.undefined)
    
    inline def setTarget(value: typings.std.EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTiltX(value: Double): Self = StObject.set(x, "tiltX", value.asInstanceOf[js.Any])
    
    inline def setTiltXUndefined: Self = StObject.set(x, "tiltX", js.undefined)
    
    inline def setTiltY(value: Double): Self = StObject.set(x, "tiltY", value.asInstanceOf[js.Any])
    
    inline def setTiltYUndefined: Self = StObject.set(x, "tiltY", js.undefined)
    
    inline def setTimeStamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    
    inline def setTwist(value: Double): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
    
    inline def setTwistUndefined: Self = StObject.set(x, "twist", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setView(value: Window): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    
    inline def setWhichUndefined: Self = StObject.set(x, "which", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
