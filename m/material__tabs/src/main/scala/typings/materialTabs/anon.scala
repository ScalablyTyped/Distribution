package typings.materialTabs

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTabs.materialTabsStrings.click
import typings.materialTabs.materialTabsStrings.resize
import typings.materialTabs.tabBarTypesMod.MDCTabBarChangeEventDetail
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ACTIVE extends StObject {
    
    var ACTIVE: String
  }
  object ACTIVE {
    
    inline def apply(ACTIVE: String): ACTIVE = {
      val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any])
      __obj.asInstanceOf[ACTIVE]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ACTIVE] (val x: Self) extends AnyVal {
      
      inline def setACTIVE(value: String): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
    }
  }
  
  trait CHANGEEVENT extends StObject {
    
    var CHANGE_EVENT: String
    
    var INDICATOR_SELECTOR: String
    
    var TAB_SELECTOR: String
  }
  object CHANGEEVENT {
    
    inline def apply(CHANGE_EVENT: String, INDICATOR_SELECTOR: String, TAB_SELECTOR: String): CHANGEEVENT = {
      val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], INDICATOR_SELECTOR = INDICATOR_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[CHANGEEVENT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CHANGEEVENT] (val x: Self) extends AnyVal {
      
      inline def setCHANGE_EVENT(value: String): Self = StObject.set(x, "CHANGE_EVENT", value.asInstanceOf[js.Any])
      
      inline def setINDICATOR_SELECTOR(value: String): Self = StObject.set(x, "INDICATOR_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setTAB_SELECTOR(value: String): Self = StObject.set(x, "TAB_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  trait FRAMESELECTOR extends StObject {
    
    var FRAME_SELECTOR: String
    
    var INDICATOR_BACK_SELECTOR: String
    
    var INDICATOR_FORWARD_SELECTOR: String
    
    var TABS_SELECTOR: String
    
    var TAB_SELECTOR: String
  }
  object FRAMESELECTOR {
    
    inline def apply(
      FRAME_SELECTOR: String,
      INDICATOR_BACK_SELECTOR: String,
      INDICATOR_FORWARD_SELECTOR: String,
      TABS_SELECTOR: String,
      TAB_SELECTOR: String
    ): FRAMESELECTOR = {
      val __obj = js.Dynamic.literal(FRAME_SELECTOR = FRAME_SELECTOR.asInstanceOf[js.Any], INDICATOR_BACK_SELECTOR = INDICATOR_BACK_SELECTOR.asInstanceOf[js.Any], INDICATOR_FORWARD_SELECTOR = INDICATOR_FORWARD_SELECTOR.asInstanceOf[js.Any], TABS_SELECTOR = TABS_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[FRAMESELECTOR]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FRAMESELECTOR] (val x: Self) extends AnyVal {
      
      inline def setFRAME_SELECTOR(value: String): Self = StObject.set(x, "FRAME_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setINDICATOR_BACK_SELECTOR(value: String): Self = StObject.set(x, "INDICATOR_BACK_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setINDICATOR_FORWARD_SELECTOR(value: String): Self = StObject.set(x, "INDICATOR_FORWARD_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setTABS_SELECTOR(value: String): Self = StObject.set(x, "TABS_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setTAB_SELECTOR(value: String): Self = StObject.set(x, "TAB_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  trait INDICATORBACK extends StObject {
    
    var INDICATOR_BACK: String
    
    var INDICATOR_ENABLED: String
    
    var INDICATOR_FORWARD: String
    
    var TAB: String
  }
  object INDICATORBACK {
    
    inline def apply(INDICATOR_BACK: String, INDICATOR_ENABLED: String, INDICATOR_FORWARD: String, TAB: String): INDICATORBACK = {
      val __obj = js.Dynamic.literal(INDICATOR_BACK = INDICATOR_BACK.asInstanceOf[js.Any], INDICATOR_ENABLED = INDICATOR_ENABLED.asInstanceOf[js.Any], INDICATOR_FORWARD = INDICATOR_FORWARD.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any])
      __obj.asInstanceOf[INDICATORBACK]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INDICATORBACK] (val x: Self) extends AnyVal {
      
      inline def setINDICATOR_BACK(value: String): Self = StObject.set(x, "INDICATOR_BACK", value.asInstanceOf[js.Any])
      
      inline def setINDICATOR_ENABLED(value: String): Self = StObject.set(x, "INDICATOR_ENABLED", value.asInstanceOf[js.Any])
      
      inline def setINDICATOR_FORWARD(value: String): Self = StObject.set(x, "INDICATOR_FORWARD", value.asInstanceOf[js.Any])
      
      inline def setTAB(value: String): Self = StObject.set(x, "TAB", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/tabs.@material/tabs/tab/adapter.MDCTabAdapter> */
  trait PartialMDCTabAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var deregisterInteractionHandler: js.UndefOr[
        js.Function2[/* type */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var getOffsetLeft: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var notifySelected: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var registerInteractionHandler: js.UndefOr[
        js.Function2[/* type */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  }
  object PartialMDCTabAdapter {
    
    inline def apply(): PartialMDCTabAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTabAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMDCTabAdapter] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setDeregisterInteractionHandler(value: (/* type */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterInteractionHandlerUndefined: Self = StObject.set(x, "deregisterInteractionHandler", js.undefined)
      
      inline def setGetOffsetLeft(value: () => Double): Self = StObject.set(x, "getOffsetLeft", js.Any.fromFunction0(value))
      
      inline def setGetOffsetLeftUndefined: Self = StObject.set(x, "getOffsetLeft", js.undefined)
      
      inline def setGetOffsetWidth(value: () => Double): Self = StObject.set(x, "getOffsetWidth", js.Any.fromFunction0(value))
      
      inline def setGetOffsetWidthUndefined: Self = StObject.set(x, "getOffsetWidth", js.undefined)
      
      inline def setNotifySelected(value: () => Unit): Self = StObject.set(x, "notifySelected", js.Any.fromFunction0(value))
      
      inline def setNotifySelectedUndefined: Self = StObject.set(x, "notifySelected", js.undefined)
      
      inline def setRegisterInteractionHandler(value: (/* type */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterInteractionHandlerUndefined: Self = StObject.set(x, "registerInteractionHandler", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@material/tabs.@material/tabs/tab-bar/adapter.MDCTabBarAdapter> */
  trait PartialMDCTabBarAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var bindOnMDCTabSelectedEvent: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var deregisterResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.undefined
    
    var getComputedLeftForTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
    
    var getComputedWidthForTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
    
    var getNumberOfTabs: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetWidthForIndicator: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var isDefaultPreventedOnClickForTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.undefined
    
    var isTabActiveAtIndex: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.undefined
    
    var measureTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var notifyChange: js.UndefOr[js.Function1[/* evtData */ MDCTabBarChangeEventDetail, Unit]] = js.undefined
    
    var registerResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setPreventDefaultOnClickForTabAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* preventDefaultOnClick */ Boolean, Unit]] = js.undefined
    
    var setStyleForIndicator: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.undefined
    
    var setTabActiveAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* isActive */ Boolean, Unit]] = js.undefined
    
    var unbindOnMDCTabSelectedEvent: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PartialMDCTabBarAdapter {
    
    inline def apply(): PartialMDCTabBarAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTabBarAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMDCTabBarAdapter] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setBindOnMDCTabSelectedEvent(value: () => Unit): Self = StObject.set(x, "bindOnMDCTabSelectedEvent", js.Any.fromFunction0(value))
      
      inline def setBindOnMDCTabSelectedEventUndefined: Self = StObject.set(x, "bindOnMDCTabSelectedEvent", js.undefined)
      
      inline def setDeregisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = StObject.set(x, "deregisterResizeHandler", js.Any.fromFunction1(value))
      
      inline def setDeregisterResizeHandlerUndefined: Self = StObject.set(x, "deregisterResizeHandler", js.undefined)
      
      inline def setGetComputedLeftForTabAtIndex(value: /* index */ Double => Double): Self = StObject.set(x, "getComputedLeftForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetComputedLeftForTabAtIndexUndefined: Self = StObject.set(x, "getComputedLeftForTabAtIndex", js.undefined)
      
      inline def setGetComputedWidthForTabAtIndex(value: /* index */ Double => Double): Self = StObject.set(x, "getComputedWidthForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetComputedWidthForTabAtIndexUndefined: Self = StObject.set(x, "getComputedWidthForTabAtIndex", js.undefined)
      
      inline def setGetNumberOfTabs(value: () => Double): Self = StObject.set(x, "getNumberOfTabs", js.Any.fromFunction0(value))
      
      inline def setGetNumberOfTabsUndefined: Self = StObject.set(x, "getNumberOfTabs", js.undefined)
      
      inline def setGetOffsetWidth(value: () => Double): Self = StObject.set(x, "getOffsetWidth", js.Any.fromFunction0(value))
      
      inline def setGetOffsetWidthForIndicator(value: () => Double): Self = StObject.set(x, "getOffsetWidthForIndicator", js.Any.fromFunction0(value))
      
      inline def setGetOffsetWidthForIndicatorUndefined: Self = StObject.set(x, "getOffsetWidthForIndicator", js.undefined)
      
      inline def setGetOffsetWidthUndefined: Self = StObject.set(x, "getOffsetWidth", js.undefined)
      
      inline def setIsDefaultPreventedOnClickForTabAtIndex(value: /* index */ Double => Boolean): Self = StObject.set(x, "isDefaultPreventedOnClickForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setIsDefaultPreventedOnClickForTabAtIndexUndefined: Self = StObject.set(x, "isDefaultPreventedOnClickForTabAtIndex", js.undefined)
      
      inline def setIsTabActiveAtIndex(value: /* index */ Double => Boolean): Self = StObject.set(x, "isTabActiveAtIndex", js.Any.fromFunction1(value))
      
      inline def setIsTabActiveAtIndexUndefined: Self = StObject.set(x, "isTabActiveAtIndex", js.undefined)
      
      inline def setMeasureTabAtIndex(value: /* index */ Double => Unit): Self = StObject.set(x, "measureTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setMeasureTabAtIndexUndefined: Self = StObject.set(x, "measureTabAtIndex", js.undefined)
      
      inline def setNotifyChange(value: /* evtData */ MDCTabBarChangeEventDetail => Unit): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1(value))
      
      inline def setNotifyChangeUndefined: Self = StObject.set(x, "notifyChange", js.undefined)
      
      inline def setRegisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = StObject.set(x, "registerResizeHandler", js.Any.fromFunction1(value))
      
      inline def setRegisterResizeHandlerUndefined: Self = StObject.set(x, "registerResizeHandler", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetPreventDefaultOnClickForTabAtIndex(value: (/* index */ Double, /* preventDefaultOnClick */ Boolean) => Unit): Self = StObject.set(x, "setPreventDefaultOnClickForTabAtIndex", js.Any.fromFunction2(value))
      
      inline def setSetPreventDefaultOnClickForTabAtIndexUndefined: Self = StObject.set(x, "setPreventDefaultOnClickForTabAtIndex", js.undefined)
      
      inline def setSetStyleForIndicator(value: (/* propertyName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleForIndicator", js.Any.fromFunction2(value))
      
      inline def setSetStyleForIndicatorUndefined: Self = StObject.set(x, "setStyleForIndicator", js.undefined)
      
      inline def setSetTabActiveAtIndex(value: (/* index */ Double, /* isActive */ Boolean) => Unit): Self = StObject.set(x, "setTabActiveAtIndex", js.Any.fromFunction2(value))
      
      inline def setSetTabActiveAtIndexUndefined: Self = StObject.set(x, "setTabActiveAtIndex", js.undefined)
      
      inline def setUnbindOnMDCTabSelectedEvent(value: () => Unit): Self = StObject.set(x, "unbindOnMDCTabSelectedEvent", js.Any.fromFunction0(value))
      
      inline def setUnbindOnMDCTabSelectedEventUndefined: Self = StObject.set(x, "unbindOnMDCTabSelectedEvent", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@material/tabs.@material/tabs/tab-bar-scroller/adapter.MDCTabBarScrollerAdapter> */
  trait PartialMDCTabBarScrollerA extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var addClassToBackIndicator: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var addClassToForwardIndicator: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var deregisterBackIndicatorClickHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[click], Unit]] = js.undefined
    
    var deregisterCapturedInteractionHandler: js.UndefOr[
        js.Function2[/* evt */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var deregisterForwardIndicatorClickHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[click], Unit]] = js.undefined
    
    var deregisterWindowResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.undefined
    
    var eventTargetHasClass: js.UndefOr[js.Function2[/* target */ Element, /* className */ String, Boolean]] = js.undefined
    
    var getComputedLeftForTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
    
    var getComputedWidthForTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
    
    var getNumberOfTabs: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetLeftForEventTarget: js.UndefOr[js.Function1[/* target */ HTMLElement, Double]] = js.undefined
    
    var getOffsetWidthForEventTarget: js.UndefOr[js.Function1[/* target */ HTMLElement, Double]] = js.undefined
    
    var getOffsetWidthForScrollFrame: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetWidthForTabBar: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getScrollLeftForScrollFrame: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var isRTL: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var registerBackIndicatorClickHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[click], Unit]] = js.undefined
    
    var registerCapturedInteractionHandler: js.UndefOr[
        js.Function2[/* evt */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var registerForwardIndicatorClickHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[click], Unit]] = js.undefined
    
    var registerWindowResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var removeClassFromBackIndicator: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var removeClassFromForwardIndicator: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setScrollLeftForScrollFrame: js.UndefOr[js.Function1[/* scrollLeftAmount */ Double, Unit]] = js.undefined
    
    var setTransformStyleForTabBar: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  }
  object PartialMDCTabBarScrollerA {
    
    inline def apply(): PartialMDCTabBarScrollerA = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTabBarScrollerA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMDCTabBarScrollerA] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassToBackIndicator(value: /* className */ String => Unit): Self = StObject.set(x, "addClassToBackIndicator", js.Any.fromFunction1(value))
      
      inline def setAddClassToBackIndicatorUndefined: Self = StObject.set(x, "addClassToBackIndicator", js.undefined)
      
      inline def setAddClassToForwardIndicator(value: /* className */ String => Unit): Self = StObject.set(x, "addClassToForwardIndicator", js.Any.fromFunction1(value))
      
      inline def setAddClassToForwardIndicatorUndefined: Self = StObject.set(x, "addClassToForwardIndicator", js.undefined)
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setDeregisterBackIndicatorClickHandler(value: /* handler */ SpecificEventListener[click] => Unit): Self = StObject.set(x, "deregisterBackIndicatorClickHandler", js.Any.fromFunction1(value))
      
      inline def setDeregisterBackIndicatorClickHandlerUndefined: Self = StObject.set(x, "deregisterBackIndicatorClickHandler", js.undefined)
      
      inline def setDeregisterCapturedInteractionHandler(value: (/* evt */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterCapturedInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterCapturedInteractionHandlerUndefined: Self = StObject.set(x, "deregisterCapturedInteractionHandler", js.undefined)
      
      inline def setDeregisterForwardIndicatorClickHandler(value: /* handler */ SpecificEventListener[click] => Unit): Self = StObject.set(x, "deregisterForwardIndicatorClickHandler", js.Any.fromFunction1(value))
      
      inline def setDeregisterForwardIndicatorClickHandlerUndefined: Self = StObject.set(x, "deregisterForwardIndicatorClickHandler", js.undefined)
      
      inline def setDeregisterWindowResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = StObject.set(x, "deregisterWindowResizeHandler", js.Any.fromFunction1(value))
      
      inline def setDeregisterWindowResizeHandlerUndefined: Self = StObject.set(x, "deregisterWindowResizeHandler", js.undefined)
      
      inline def setEventTargetHasClass(value: (/* target */ Element, /* className */ String) => Boolean): Self = StObject.set(x, "eventTargetHasClass", js.Any.fromFunction2(value))
      
      inline def setEventTargetHasClassUndefined: Self = StObject.set(x, "eventTargetHasClass", js.undefined)
      
      inline def setGetComputedLeftForTabAtIndex(value: /* index */ Double => Double): Self = StObject.set(x, "getComputedLeftForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetComputedLeftForTabAtIndexUndefined: Self = StObject.set(x, "getComputedLeftForTabAtIndex", js.undefined)
      
      inline def setGetComputedWidthForTabAtIndex(value: /* index */ Double => Double): Self = StObject.set(x, "getComputedWidthForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetComputedWidthForTabAtIndexUndefined: Self = StObject.set(x, "getComputedWidthForTabAtIndex", js.undefined)
      
      inline def setGetNumberOfTabs(value: () => Double): Self = StObject.set(x, "getNumberOfTabs", js.Any.fromFunction0(value))
      
      inline def setGetNumberOfTabsUndefined: Self = StObject.set(x, "getNumberOfTabs", js.undefined)
      
      inline def setGetOffsetLeftForEventTarget(value: /* target */ HTMLElement => Double): Self = StObject.set(x, "getOffsetLeftForEventTarget", js.Any.fromFunction1(value))
      
      inline def setGetOffsetLeftForEventTargetUndefined: Self = StObject.set(x, "getOffsetLeftForEventTarget", js.undefined)
      
      inline def setGetOffsetWidthForEventTarget(value: /* target */ HTMLElement => Double): Self = StObject.set(x, "getOffsetWidthForEventTarget", js.Any.fromFunction1(value))
      
      inline def setGetOffsetWidthForEventTargetUndefined: Self = StObject.set(x, "getOffsetWidthForEventTarget", js.undefined)
      
      inline def setGetOffsetWidthForScrollFrame(value: () => Double): Self = StObject.set(x, "getOffsetWidthForScrollFrame", js.Any.fromFunction0(value))
      
      inline def setGetOffsetWidthForScrollFrameUndefined: Self = StObject.set(x, "getOffsetWidthForScrollFrame", js.undefined)
      
      inline def setGetOffsetWidthForTabBar(value: () => Double): Self = StObject.set(x, "getOffsetWidthForTabBar", js.Any.fromFunction0(value))
      
      inline def setGetOffsetWidthForTabBarUndefined: Self = StObject.set(x, "getOffsetWidthForTabBar", js.undefined)
      
      inline def setGetScrollLeftForScrollFrame(value: () => Double): Self = StObject.set(x, "getScrollLeftForScrollFrame", js.Any.fromFunction0(value))
      
      inline def setGetScrollLeftForScrollFrameUndefined: Self = StObject.set(x, "getScrollLeftForScrollFrame", js.undefined)
      
      inline def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      inline def setRegisterBackIndicatorClickHandler(value: /* handler */ SpecificEventListener[click] => Unit): Self = StObject.set(x, "registerBackIndicatorClickHandler", js.Any.fromFunction1(value))
      
      inline def setRegisterBackIndicatorClickHandlerUndefined: Self = StObject.set(x, "registerBackIndicatorClickHandler", js.undefined)
      
      inline def setRegisterCapturedInteractionHandler(value: (/* evt */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerCapturedInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterCapturedInteractionHandlerUndefined: Self = StObject.set(x, "registerCapturedInteractionHandler", js.undefined)
      
      inline def setRegisterForwardIndicatorClickHandler(value: /* handler */ SpecificEventListener[click] => Unit): Self = StObject.set(x, "registerForwardIndicatorClickHandler", js.Any.fromFunction1(value))
      
      inline def setRegisterForwardIndicatorClickHandlerUndefined: Self = StObject.set(x, "registerForwardIndicatorClickHandler", js.undefined)
      
      inline def setRegisterWindowResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = StObject.set(x, "registerWindowResizeHandler", js.Any.fromFunction1(value))
      
      inline def setRegisterWindowResizeHandlerUndefined: Self = StObject.set(x, "registerWindowResizeHandler", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassFromBackIndicator(value: /* className */ String => Unit): Self = StObject.set(x, "removeClassFromBackIndicator", js.Any.fromFunction1(value))
      
      inline def setRemoveClassFromBackIndicatorUndefined: Self = StObject.set(x, "removeClassFromBackIndicator", js.undefined)
      
      inline def setRemoveClassFromForwardIndicator(value: /* className */ String => Unit): Self = StObject.set(x, "removeClassFromForwardIndicator", js.Any.fromFunction1(value))
      
      inline def setRemoveClassFromForwardIndicatorUndefined: Self = StObject.set(x, "removeClassFromForwardIndicator", js.undefined)
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetScrollLeftForScrollFrame(value: /* scrollLeftAmount */ Double => Unit): Self = StObject.set(x, "setScrollLeftForScrollFrame", js.Any.fromFunction1(value))
      
      inline def setSetScrollLeftForScrollFrameUndefined: Self = StObject.set(x, "setScrollLeftForScrollFrame", js.undefined)
      
      inline def setSetTransformStyleForTabBar(value: /* value */ String => Unit): Self = StObject.set(x, "setTransformStyleForTabBar", js.Any.fromFunction1(value))
      
      inline def setSetTransformStyleForTabBarUndefined: Self = StObject.set(x, "setTransformStyleForTabBar", js.undefined)
    }
  }
  
  trait SELECTEDEVENT extends StObject {
    
    var SELECTED_EVENT: String
  }
  object SELECTEDEVENT {
    
    inline def apply(SELECTED_EVENT: String): SELECTEDEVENT = {
      val __obj = js.Dynamic.literal(SELECTED_EVENT = SELECTED_EVENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[SELECTEDEVENT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SELECTEDEVENT] (val x: Self) extends AnyVal {
      
      inline def setSELECTED_EVENT(value: String): Self = StObject.set(x, "SELECTED_EVENT", value.asInstanceOf[js.Any])
    }
  }
  
  trait UPGRADED extends StObject {
    
    var UPGRADED: String
  }
  object UPGRADED {
    
    inline def apply(UPGRADED: String): UPGRADED = {
      val __obj = js.Dynamic.literal(UPGRADED = UPGRADED.asInstanceOf[js.Any])
      __obj.asInstanceOf[UPGRADED]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UPGRADED] (val x: Self) extends AnyVal {
      
      inline def setUPGRADED(value: String): Self = StObject.set(x, "UPGRADED", value.asInstanceOf[js.Any])
    }
  }
}
