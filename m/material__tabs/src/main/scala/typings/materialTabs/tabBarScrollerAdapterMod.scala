package typings.materialTabs

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTabs.materialTabsStrings.click
import typings.materialTabs.materialTabsStrings.resize
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarScrollerAdapterMod {
  
  trait MDCTabBarScrollerAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def addClassToBackIndicator(className: String): Unit
    
    def addClassToForwardIndicator(className: String): Unit
    
    @JSName("deregisterBackIndicatorClickHandler")
    def deregisterBackIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit
    
    def deregisterCapturedInteractionHandler[K /* <: EventType */](evt: K, handler: SpecificEventListener[K]): Unit
    
    @JSName("deregisterForwardIndicatorClickHandler")
    def deregisterForwardIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit
    
    @JSName("deregisterWindowResizeHandler")
    def deregisterWindowResizeHandler_resize(handler: SpecificEventListener[resize]): Unit
    
    def eventTargetHasClass(target: Element, className: String): Boolean
    
    def getComputedLeftForTabAtIndex(index: Double): Double
    
    def getComputedWidthForTabAtIndex(index: Double): Double
    
    def getNumberOfTabs(): Double
    
    def getOffsetLeftForEventTarget(target: HTMLElement): Double
    
    def getOffsetWidthForEventTarget(target: HTMLElement): Double
    
    def getOffsetWidthForScrollFrame(): Double
    
    def getOffsetWidthForTabBar(): Double
    
    def getScrollLeftForScrollFrame(): Double
    
    def isRTL(): Boolean
    
    @JSName("registerBackIndicatorClickHandler")
    def registerBackIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit
    
    def registerCapturedInteractionHandler[K /* <: EventType */](evt: K, handler: SpecificEventListener[K]): Unit
    
    @JSName("registerForwardIndicatorClickHandler")
    def registerForwardIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit
    
    @JSName("registerWindowResizeHandler")
    def registerWindowResizeHandler_resize(handler: SpecificEventListener[resize]): Unit
    
    def removeClass(className: String): Unit
    
    def removeClassFromBackIndicator(className: String): Unit
    
    def removeClassFromForwardIndicator(className: String): Unit
    
    def setScrollLeftForScrollFrame(scrollLeftAmount: Double): Unit
    
    def setTransformStyleForTabBar(value: String): Unit
  }
  object MDCTabBarScrollerAdapter {
    
    inline def apply(
      addClass: String => Unit,
      addClassToBackIndicator: String => Unit,
      addClassToForwardIndicator: String => Unit,
      deregisterBackIndicatorClickHandler: SpecificEventListener[click] => Unit,
      deregisterCapturedInteractionHandler: (Any, SpecificEventListener[Any]) => Unit,
      deregisterForwardIndicatorClickHandler: SpecificEventListener[click] => Unit,
      deregisterWindowResizeHandler: SpecificEventListener[resize] => Unit,
      eventTargetHasClass: (Element, String) => Boolean,
      getComputedLeftForTabAtIndex: Double => Double,
      getComputedWidthForTabAtIndex: Double => Double,
      getNumberOfTabs: () => Double,
      getOffsetLeftForEventTarget: HTMLElement => Double,
      getOffsetWidthForEventTarget: HTMLElement => Double,
      getOffsetWidthForScrollFrame: () => Double,
      getOffsetWidthForTabBar: () => Double,
      getScrollLeftForScrollFrame: () => Double,
      isRTL: () => Boolean,
      registerBackIndicatorClickHandler: SpecificEventListener[click] => Unit,
      registerCapturedInteractionHandler: (Any, SpecificEventListener[Any]) => Unit,
      registerForwardIndicatorClickHandler: SpecificEventListener[click] => Unit,
      registerWindowResizeHandler: SpecificEventListener[resize] => Unit,
      removeClass: String => Unit,
      removeClassFromBackIndicator: String => Unit,
      removeClassFromForwardIndicator: String => Unit,
      setScrollLeftForScrollFrame: Double => Unit,
      setTransformStyleForTabBar: String => Unit
    ): MDCTabBarScrollerAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassToBackIndicator = js.Any.fromFunction1(addClassToBackIndicator), addClassToForwardIndicator = js.Any.fromFunction1(addClassToForwardIndicator), deregisterBackIndicatorClickHandler = js.Any.fromFunction1(deregisterBackIndicatorClickHandler), deregisterCapturedInteractionHandler = js.Any.fromFunction2(deregisterCapturedInteractionHandler), deregisterForwardIndicatorClickHandler = js.Any.fromFunction1(deregisterForwardIndicatorClickHandler), deregisterWindowResizeHandler = js.Any.fromFunction1(deregisterWindowResizeHandler), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), getComputedLeftForTabAtIndex = js.Any.fromFunction1(getComputedLeftForTabAtIndex), getComputedWidthForTabAtIndex = js.Any.fromFunction1(getComputedWidthForTabAtIndex), getNumberOfTabs = js.Any.fromFunction0(getNumberOfTabs), getOffsetLeftForEventTarget = js.Any.fromFunction1(getOffsetLeftForEventTarget), getOffsetWidthForEventTarget = js.Any.fromFunction1(getOffsetWidthForEventTarget), getOffsetWidthForScrollFrame = js.Any.fromFunction0(getOffsetWidthForScrollFrame), getOffsetWidthForTabBar = js.Any.fromFunction0(getOffsetWidthForTabBar), getScrollLeftForScrollFrame = js.Any.fromFunction0(getScrollLeftForScrollFrame), isRTL = js.Any.fromFunction0(isRTL), registerBackIndicatorClickHandler = js.Any.fromFunction1(registerBackIndicatorClickHandler), registerCapturedInteractionHandler = js.Any.fromFunction2(registerCapturedInteractionHandler), registerForwardIndicatorClickHandler = js.Any.fromFunction1(registerForwardIndicatorClickHandler), registerWindowResizeHandler = js.Any.fromFunction1(registerWindowResizeHandler), removeClass = js.Any.fromFunction1(removeClass), removeClassFromBackIndicator = js.Any.fromFunction1(removeClassFromBackIndicator), removeClassFromForwardIndicator = js.Any.fromFunction1(removeClassFromForwardIndicator), setScrollLeftForScrollFrame = js.Any.fromFunction1(setScrollLeftForScrollFrame), setTransformStyleForTabBar = js.Any.fromFunction1(setTransformStyleForTabBar))
      __obj.asInstanceOf[MDCTabBarScrollerAdapter]
    }
    
    extension [Self <: MDCTabBarScrollerAdapter](x: Self) {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassToBackIndicator(value: String => Unit): Self = StObject.set(x, "addClassToBackIndicator", js.Any.fromFunction1(value))
      
      inline def setAddClassToForwardIndicator(value: String => Unit): Self = StObject.set(x, "addClassToForwardIndicator", js.Any.fromFunction1(value))
      
      inline def setDeregisterBackIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = StObject.set(x, "deregisterBackIndicatorClickHandler", js.Any.fromFunction1(value))
      
      inline def setDeregisterCapturedInteractionHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "deregisterCapturedInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterForwardIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = StObject.set(x, "deregisterForwardIndicatorClickHandler", js.Any.fromFunction1(value))
      
      inline def setDeregisterWindowResizeHandler(value: SpecificEventListener[resize] => Unit): Self = StObject.set(x, "deregisterWindowResizeHandler", js.Any.fromFunction1(value))
      
      inline def setEventTargetHasClass(value: (Element, String) => Boolean): Self = StObject.set(x, "eventTargetHasClass", js.Any.fromFunction2(value))
      
      inline def setGetComputedLeftForTabAtIndex(value: Double => Double): Self = StObject.set(x, "getComputedLeftForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetComputedWidthForTabAtIndex(value: Double => Double): Self = StObject.set(x, "getComputedWidthForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetNumberOfTabs(value: () => Double): Self = StObject.set(x, "getNumberOfTabs", js.Any.fromFunction0(value))
      
      inline def setGetOffsetLeftForEventTarget(value: HTMLElement => Double): Self = StObject.set(x, "getOffsetLeftForEventTarget", js.Any.fromFunction1(value))
      
      inline def setGetOffsetWidthForEventTarget(value: HTMLElement => Double): Self = StObject.set(x, "getOffsetWidthForEventTarget", js.Any.fromFunction1(value))
      
      inline def setGetOffsetWidthForScrollFrame(value: () => Double): Self = StObject.set(x, "getOffsetWidthForScrollFrame", js.Any.fromFunction0(value))
      
      inline def setGetOffsetWidthForTabBar(value: () => Double): Self = StObject.set(x, "getOffsetWidthForTabBar", js.Any.fromFunction0(value))
      
      inline def setGetScrollLeftForScrollFrame(value: () => Double): Self = StObject.set(x, "getScrollLeftForScrollFrame", js.Any.fromFunction0(value))
      
      inline def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      inline def setRegisterBackIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = StObject.set(x, "registerBackIndicatorClickHandler", js.Any.fromFunction1(value))
      
      inline def setRegisterCapturedInteractionHandler(value: (Any, SpecificEventListener[Any]) => Unit): Self = StObject.set(x, "registerCapturedInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterForwardIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = StObject.set(x, "registerForwardIndicatorClickHandler", js.Any.fromFunction1(value))
      
      inline def setRegisterWindowResizeHandler(value: SpecificEventListener[resize] => Unit): Self = StObject.set(x, "registerWindowResizeHandler", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassFromBackIndicator(value: String => Unit): Self = StObject.set(x, "removeClassFromBackIndicator", js.Any.fromFunction1(value))
      
      inline def setRemoveClassFromForwardIndicator(value: String => Unit): Self = StObject.set(x, "removeClassFromForwardIndicator", js.Any.fromFunction1(value))
      
      inline def setSetScrollLeftForScrollFrame(value: Double => Unit): Self = StObject.set(x, "setScrollLeftForScrollFrame", js.Any.fromFunction1(value))
      
      inline def setSetTransformStyleForTabBar(value: String => Unit): Self = StObject.set(x, "setTransformStyleForTabBar", js.Any.fromFunction1(value))
    }
  }
}
