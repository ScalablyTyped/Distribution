package typings.materialTabs

import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTabs.materialTabsStrings.resize
import typings.materialTabs.tabBarTypesMod.MDCTabBarChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarAdapterMod {
  
  trait MDCTabBarAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def bindOnMDCTabSelectedEvent(): Unit
    
    @JSName("deregisterResizeHandler")
    def deregisterResizeHandler_resize(handler: SpecificEventListener[resize]): Unit
    
    def getComputedLeftForTabAtIndex(index: Double): Double
    
    def getComputedWidthForTabAtIndex(index: Double): Double
    
    def getNumberOfTabs(): Double
    
    def getOffsetWidth(): Double
    
    def getOffsetWidthForIndicator(): Double
    
    def isDefaultPreventedOnClickForTabAtIndex(index: Double): Boolean
    
    def isTabActiveAtIndex(index: Double): Boolean
    
    def measureTabAtIndex(index: Double): Unit
    
    def notifyChange(evtData: MDCTabBarChangeEventDetail): Unit
    
    @JSName("registerResizeHandler")
    def registerResizeHandler_resize(handler: SpecificEventListener[resize]): Unit
    
    def removeClass(className: String): Unit
    
    def setPreventDefaultOnClickForTabAtIndex(index: Double, preventDefaultOnClick: Boolean): Unit
    
    def setStyleForIndicator(propertyName: String, value: String): Unit
    
    def setTabActiveAtIndex(index: Double, isActive: Boolean): Unit
    
    def unbindOnMDCTabSelectedEvent(): Unit
  }
  object MDCTabBarAdapter {
    
    inline def apply(
      addClass: String => Unit,
      bindOnMDCTabSelectedEvent: () => Unit,
      deregisterResizeHandler: SpecificEventListener[resize] => Unit,
      getComputedLeftForTabAtIndex: Double => Double,
      getComputedWidthForTabAtIndex: Double => Double,
      getNumberOfTabs: () => Double,
      getOffsetWidth: () => Double,
      getOffsetWidthForIndicator: () => Double,
      isDefaultPreventedOnClickForTabAtIndex: Double => Boolean,
      isTabActiveAtIndex: Double => Boolean,
      measureTabAtIndex: Double => Unit,
      notifyChange: MDCTabBarChangeEventDetail => Unit,
      registerResizeHandler: SpecificEventListener[resize] => Unit,
      removeClass: String => Unit,
      setPreventDefaultOnClickForTabAtIndex: (Double, Boolean) => Unit,
      setStyleForIndicator: (String, String) => Unit,
      setTabActiveAtIndex: (Double, Boolean) => Unit,
      unbindOnMDCTabSelectedEvent: () => Unit
    ): MDCTabBarAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), bindOnMDCTabSelectedEvent = js.Any.fromFunction0(bindOnMDCTabSelectedEvent), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), getComputedLeftForTabAtIndex = js.Any.fromFunction1(getComputedLeftForTabAtIndex), getComputedWidthForTabAtIndex = js.Any.fromFunction1(getComputedWidthForTabAtIndex), getNumberOfTabs = js.Any.fromFunction0(getNumberOfTabs), getOffsetWidth = js.Any.fromFunction0(getOffsetWidth), getOffsetWidthForIndicator = js.Any.fromFunction0(getOffsetWidthForIndicator), isDefaultPreventedOnClickForTabAtIndex = js.Any.fromFunction1(isDefaultPreventedOnClickForTabAtIndex), isTabActiveAtIndex = js.Any.fromFunction1(isTabActiveAtIndex), measureTabAtIndex = js.Any.fromFunction1(measureTabAtIndex), notifyChange = js.Any.fromFunction1(notifyChange), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), removeClass = js.Any.fromFunction1(removeClass), setPreventDefaultOnClickForTabAtIndex = js.Any.fromFunction2(setPreventDefaultOnClickForTabAtIndex), setStyleForIndicator = js.Any.fromFunction2(setStyleForIndicator), setTabActiveAtIndex = js.Any.fromFunction2(setTabActiveAtIndex), unbindOnMDCTabSelectedEvent = js.Any.fromFunction0(unbindOnMDCTabSelectedEvent))
      __obj.asInstanceOf[MDCTabBarAdapter]
    }
    
    extension [Self <: MDCTabBarAdapter](x: Self) {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setBindOnMDCTabSelectedEvent(value: () => Unit): Self = StObject.set(x, "bindOnMDCTabSelectedEvent", js.Any.fromFunction0(value))
      
      inline def setDeregisterResizeHandler(value: SpecificEventListener[resize] => Unit): Self = StObject.set(x, "deregisterResizeHandler", js.Any.fromFunction1(value))
      
      inline def setGetComputedLeftForTabAtIndex(value: Double => Double): Self = StObject.set(x, "getComputedLeftForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetComputedWidthForTabAtIndex(value: Double => Double): Self = StObject.set(x, "getComputedWidthForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetNumberOfTabs(value: () => Double): Self = StObject.set(x, "getNumberOfTabs", js.Any.fromFunction0(value))
      
      inline def setGetOffsetWidth(value: () => Double): Self = StObject.set(x, "getOffsetWidth", js.Any.fromFunction0(value))
      
      inline def setGetOffsetWidthForIndicator(value: () => Double): Self = StObject.set(x, "getOffsetWidthForIndicator", js.Any.fromFunction0(value))
      
      inline def setIsDefaultPreventedOnClickForTabAtIndex(value: Double => Boolean): Self = StObject.set(x, "isDefaultPreventedOnClickForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setIsTabActiveAtIndex(value: Double => Boolean): Self = StObject.set(x, "isTabActiveAtIndex", js.Any.fromFunction1(value))
      
      inline def setMeasureTabAtIndex(value: Double => Unit): Self = StObject.set(x, "measureTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setNotifyChange(value: MDCTabBarChangeEventDetail => Unit): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1(value))
      
      inline def setRegisterResizeHandler(value: SpecificEventListener[resize] => Unit): Self = StObject.set(x, "registerResizeHandler", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetPreventDefaultOnClickForTabAtIndex(value: (Double, Boolean) => Unit): Self = StObject.set(x, "setPreventDefaultOnClickForTabAtIndex", js.Any.fromFunction2(value))
      
      inline def setSetStyleForIndicator(value: (String, String) => Unit): Self = StObject.set(x, "setStyleForIndicator", js.Any.fromFunction2(value))
      
      inline def setSetTabActiveAtIndex(value: (Double, Boolean) => Unit): Self = StObject.set(x, "setTabActiveAtIndex", js.Any.fromFunction2(value))
      
      inline def setUnbindOnMDCTabSelectedEvent(value: () => Unit): Self = StObject.set(x, "unbindOnMDCTabSelectedEvent", js.Any.fromFunction0(value))
    }
  }
}
