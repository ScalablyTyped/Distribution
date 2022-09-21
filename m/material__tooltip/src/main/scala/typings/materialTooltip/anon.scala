package typings.materialTooltip

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTooltip.constantsMod.CssClasses
import typings.materialTooltip.constantsMod.PositionWithCaret
import typings.materialTooltip.constantsMod.XPosition
import typings.materialTooltip.constantsMod.YPosition
import typings.std.DOMRect
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/tooltip.@material/tooltip/adapter.MDCTooltipAdapter> */
  trait PartialMDCTooltipAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ CssClasses, Unit]] = js.undefined
    
    var anchorContainsElement: js.UndefOr[js.Function1[/* element */ HTMLElement, Boolean]] = js.undefined
    
    var clearTooltipCaretStyles: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var deregisterAnchorEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var deregisterDocumentEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var deregisterEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var deregisterWindowEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var focusAnchorElement: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var getActiveElement: js.UndefOr[js.Function0[Element | Null]] = js.undefined
    
    var getAnchorAttribute: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.undefined
    
    var getAnchorBoundingRect: js.UndefOr[js.Function0[DOMRect | Null]] = js.undefined
    
    var getAttribute: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.undefined
    
    var getComputedStyleProperty: js.UndefOr[js.Function1[/* propertyName */ String, String]] = js.undefined
    
    var getParentBoundingRect: js.UndefOr[js.Function0[DOMRect | Null]] = js.undefined
    
    var getTooltipCaretBoundingRect: js.UndefOr[js.Function0[DOMRect | Null]] = js.undefined
    
    var getTooltipSize: js.UndefOr[js.Function0[Height]] = js.undefined
    
    var getViewportHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getViewportWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ CssClasses, Boolean]] = js.undefined
    
    var isRTL: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var notifyHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var registerAnchorEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var registerDocumentEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var registerEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var registerWindowEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var removeAttribute: js.UndefOr[js.Function1[/* attr */ String, Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ CssClasses, Unit]] = js.undefined
    
    var setAnchorAttribute: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.undefined
    
    var setAttribute: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.undefined
    
    var setStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.undefined
    
    var setSurfaceAnimationStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.undefined
    
    var setTooltipCaretStyle: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.undefined
    
    var tooltipContainsElement: js.UndefOr[js.Function1[/* element */ HTMLElement, Boolean]] = js.undefined
  }
  object PartialMDCTooltipAdapter {
    
    inline def apply(): PartialMDCTooltipAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTooltipAdapter]
    }
    
    extension [Self <: PartialMDCTooltipAdapter](x: Self) {
      
      inline def setAddClass(value: /* className */ CssClasses => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setAnchorContainsElement(value: /* element */ HTMLElement => Boolean): Self = StObject.set(x, "anchorContainsElement", js.Any.fromFunction1(value))
      
      inline def setAnchorContainsElementUndefined: Self = StObject.set(x, "anchorContainsElement", js.undefined)
      
      inline def setClearTooltipCaretStyles(value: () => Unit): Self = StObject.set(x, "clearTooltipCaretStyles", js.Any.fromFunction0(value))
      
      inline def setClearTooltipCaretStylesUndefined: Self = StObject.set(x, "clearTooltipCaretStyles", js.undefined)
      
      inline def setDeregisterAnchorEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterAnchorEventHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterAnchorEventHandlerUndefined: Self = StObject.set(x, "deregisterAnchorEventHandler", js.undefined)
      
      inline def setDeregisterDocumentEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterDocumentEventHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterDocumentEventHandlerUndefined: Self = StObject.set(x, "deregisterDocumentEventHandler", js.undefined)
      
      inline def setDeregisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterEventHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterEventHandlerUndefined: Self = StObject.set(x, "deregisterEventHandler", js.undefined)
      
      inline def setDeregisterWindowEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterWindowEventHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterWindowEventHandlerUndefined: Self = StObject.set(x, "deregisterWindowEventHandler", js.undefined)
      
      inline def setFocusAnchorElement(value: () => Unit): Self = StObject.set(x, "focusAnchorElement", js.Any.fromFunction0(value))
      
      inline def setFocusAnchorElementUndefined: Self = StObject.set(x, "focusAnchorElement", js.undefined)
      
      inline def setGetActiveElement(value: () => Element | Null): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction0(value))
      
      inline def setGetActiveElementUndefined: Self = StObject.set(x, "getActiveElement", js.undefined)
      
      inline def setGetAnchorAttribute(value: /* attr */ String => String | Null): Self = StObject.set(x, "getAnchorAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAnchorAttributeUndefined: Self = StObject.set(x, "getAnchorAttribute", js.undefined)
      
      inline def setGetAnchorBoundingRect(value: () => DOMRect | Null): Self = StObject.set(x, "getAnchorBoundingRect", js.Any.fromFunction0(value))
      
      inline def setGetAnchorBoundingRectUndefined: Self = StObject.set(x, "getAnchorBoundingRect", js.undefined)
      
      inline def setGetAttribute(value: /* attr */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
      
      inline def setGetComputedStyleProperty(value: /* propertyName */ String => String): Self = StObject.set(x, "getComputedStyleProperty", js.Any.fromFunction1(value))
      
      inline def setGetComputedStylePropertyUndefined: Self = StObject.set(x, "getComputedStyleProperty", js.undefined)
      
      inline def setGetParentBoundingRect(value: () => DOMRect | Null): Self = StObject.set(x, "getParentBoundingRect", js.Any.fromFunction0(value))
      
      inline def setGetParentBoundingRectUndefined: Self = StObject.set(x, "getParentBoundingRect", js.undefined)
      
      inline def setGetTooltipCaretBoundingRect(value: () => DOMRect | Null): Self = StObject.set(x, "getTooltipCaretBoundingRect", js.Any.fromFunction0(value))
      
      inline def setGetTooltipCaretBoundingRectUndefined: Self = StObject.set(x, "getTooltipCaretBoundingRect", js.undefined)
      
      inline def setGetTooltipSize(value: () => Height): Self = StObject.set(x, "getTooltipSize", js.Any.fromFunction0(value))
      
      inline def setGetTooltipSizeUndefined: Self = StObject.set(x, "getTooltipSize", js.undefined)
      
      inline def setGetViewportHeight(value: () => Double): Self = StObject.set(x, "getViewportHeight", js.Any.fromFunction0(value))
      
      inline def setGetViewportHeightUndefined: Self = StObject.set(x, "getViewportHeight", js.undefined)
      
      inline def setGetViewportWidth(value: () => Double): Self = StObject.set(x, "getViewportWidth", js.Any.fromFunction0(value))
      
      inline def setGetViewportWidthUndefined: Self = StObject.set(x, "getViewportWidth", js.undefined)
      
      inline def setHasClass(value: /* className */ CssClasses => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      inline def setNotifyHidden(value: () => Unit): Self = StObject.set(x, "notifyHidden", js.Any.fromFunction0(value))
      
      inline def setNotifyHiddenUndefined: Self = StObject.set(x, "notifyHidden", js.undefined)
      
      inline def setRegisterAnchorEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerAnchorEventHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterAnchorEventHandlerUndefined: Self = StObject.set(x, "registerAnchorEventHandler", js.undefined)
      
      inline def setRegisterDocumentEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerDocumentEventHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterDocumentEventHandlerUndefined: Self = StObject.set(x, "registerDocumentEventHandler", js.undefined)
      
      inline def setRegisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerEventHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterEventHandlerUndefined: Self = StObject.set(x, "registerEventHandler", js.undefined)
      
      inline def setRegisterWindowEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerWindowEventHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterWindowEventHandlerUndefined: Self = StObject.set(x, "registerWindowEventHandler", js.undefined)
      
      inline def setRemoveAttribute(value: /* attr */ String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setRemoveAttributeUndefined: Self = StObject.set(x, "removeAttribute", js.undefined)
      
      inline def setRemoveClass(value: /* className */ CssClasses => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetAnchorAttribute(value: (/* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAnchorAttribute", js.Any.fromFunction2(value))
      
      inline def setSetAnchorAttributeUndefined: Self = StObject.set(x, "setAnchorAttribute", js.undefined)
      
      inline def setSetAttribute(value: (/* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetAttributeUndefined: Self = StObject.set(x, "setAttribute", js.undefined)
      
      inline def setSetStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2(value))
      
      inline def setSetStylePropertyUndefined: Self = StObject.set(x, "setStyleProperty", js.undefined)
      
      inline def setSetSurfaceAnimationStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setSurfaceAnimationStyleProperty", js.Any.fromFunction2(value))
      
      inline def setSetSurfaceAnimationStylePropertyUndefined: Self = StObject.set(x, "setSurfaceAnimationStyleProperty", js.undefined)
      
      inline def setSetTooltipCaretStyle(value: (/* propertyName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setTooltipCaretStyle", js.Any.fromFunction2(value))
      
      inline def setSetTooltipCaretStyleUndefined: Self = StObject.set(x, "setTooltipCaretStyle", js.undefined)
      
      inline def setTooltipContainsElement(value: /* element */ HTMLElement => Boolean): Self = StObject.set(x, "tooltipContainsElement", js.Any.fromFunction1(value))
      
      inline def setTooltipContainsElementUndefined: Self = StObject.set(x, "tooltipContainsElement", js.undefined)
    }
  }
  
  trait WithCaretPos extends StObject {
    
    var withCaretPos: js.UndefOr[PositionWithCaret] = js.undefined
    
    var xPos: js.UndefOr[XPosition] = js.undefined
    
    var yPos: js.UndefOr[YPosition] = js.undefined
  }
  object WithCaretPos {
    
    inline def apply(): WithCaretPos = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithCaretPos]
    }
    
    extension [Self <: WithCaretPos](x: Self) {
      
      inline def setWithCaretPos(value: PositionWithCaret): Self = StObject.set(x, "withCaretPos", value.asInstanceOf[js.Any])
      
      inline def setWithCaretPosUndefined: Self = StObject.set(x, "withCaretPos", js.undefined)
      
      inline def setXPos(value: XPosition): Self = StObject.set(x, "xPos", value.asInstanceOf[js.Any])
      
      inline def setXPosUndefined: Self = StObject.set(x, "xPos", js.undefined)
      
      inline def setYPos(value: YPosition): Self = StObject.set(x, "yPos", value.asInstanceOf[js.Any])
      
      inline def setYPosUndefined: Self = StObject.set(x, "yPos", js.undefined)
    }
  }
}
