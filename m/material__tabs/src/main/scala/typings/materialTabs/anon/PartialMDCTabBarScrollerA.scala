package typings.materialTabs.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTabs.materialTabsStrings.click
import typings.materialTabs.materialTabsStrings.resize
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/tabs.@material/tabs/tab-bar-scroller/adapter.MDCTabBarScrollerAdapter> */
@js.native
trait PartialMDCTabBarScrollerA extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var addClassToBackIndicator: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var addClassToForwardIndicator: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var deregisterBackIndicatorClickHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[click], Unit]] = js.native
  
  var deregisterCapturedInteractionHandler: js.UndefOr[
    js.Function2[/* evt */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var deregisterForwardIndicatorClickHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[click], Unit]] = js.native
  
  var deregisterWindowResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
  
  var eventTargetHasClass: js.UndefOr[js.Function2[/* target */ Element, /* className */ String, Boolean]] = js.native
  
  var getComputedLeftForTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  
  var getComputedWidthForTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  
  var getNumberOfTabs: js.UndefOr[js.Function0[Double]] = js.native
  
  var getOffsetLeftForEventTarget: js.UndefOr[js.Function1[/* target */ HTMLElement, Double]] = js.native
  
  var getOffsetWidthForEventTarget: js.UndefOr[js.Function1[/* target */ HTMLElement, Double]] = js.native
  
  var getOffsetWidthForScrollFrame: js.UndefOr[js.Function0[Double]] = js.native
  
  var getOffsetWidthForTabBar: js.UndefOr[js.Function0[Double]] = js.native
  
  var getScrollLeftForScrollFrame: js.UndefOr[js.Function0[Double]] = js.native
  
  var isRTL: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var registerBackIndicatorClickHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[click], Unit]] = js.native
  
  var registerCapturedInteractionHandler: js.UndefOr[
    js.Function2[/* evt */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var registerForwardIndicatorClickHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[click], Unit]] = js.native
  
  var registerWindowResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var removeClassFromBackIndicator: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var removeClassFromForwardIndicator: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var setScrollLeftForScrollFrame: js.UndefOr[js.Function1[/* scrollLeftAmount */ Double, Unit]] = js.native
  
  var setTransformStyleForTabBar: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
}
object PartialMDCTabBarScrollerA {
  
  @scala.inline
  def apply(): PartialMDCTabBarScrollerA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTabBarScrollerA]
  }
  
  @scala.inline
  implicit class PartialMDCTabBarScrollerAOps[Self <: PartialMDCTabBarScrollerA] (val x: Self) extends AnyVal {
    
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
    def setAddClassToBackIndicator(value: /* className */ String => Unit): Self = this.set("addClassToBackIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClassToBackIndicator: Self = this.set("addClassToBackIndicator", js.undefined)
    
    @scala.inline
    def setAddClassToForwardIndicator(value: /* className */ String => Unit): Self = this.set("addClassToForwardIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClassToForwardIndicator: Self = this.set("addClassToForwardIndicator", js.undefined)
    
    @scala.inline
    def setDeregisterBackIndicatorClickHandler(value: /* handler */ SpecificEventListener[click] => Unit): Self = this.set("deregisterBackIndicatorClickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeregisterBackIndicatorClickHandler: Self = this.set("deregisterBackIndicatorClickHandler", js.undefined)
    
    @scala.inline
    def setDeregisterCapturedInteractionHandler(value: (/* evt */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterCapturedInteractionHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeregisterCapturedInteractionHandler: Self = this.set("deregisterCapturedInteractionHandler", js.undefined)
    
    @scala.inline
    def setDeregisterForwardIndicatorClickHandler(value: /* handler */ SpecificEventListener[click] => Unit): Self = this.set("deregisterForwardIndicatorClickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeregisterForwardIndicatorClickHandler: Self = this.set("deregisterForwardIndicatorClickHandler", js.undefined)
    
    @scala.inline
    def setDeregisterWindowResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = this.set("deregisterWindowResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeregisterWindowResizeHandler: Self = this.set("deregisterWindowResizeHandler", js.undefined)
    
    @scala.inline
    def setEventTargetHasClass(value: (/* target */ Element, /* className */ String) => Boolean): Self = this.set("eventTargetHasClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEventTargetHasClass: Self = this.set("eventTargetHasClass", js.undefined)
    
    @scala.inline
    def setGetComputedLeftForTabAtIndex(value: /* index */ Double => Double): Self = this.set("getComputedLeftForTabAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetComputedLeftForTabAtIndex: Self = this.set("getComputedLeftForTabAtIndex", js.undefined)
    
    @scala.inline
    def setGetComputedWidthForTabAtIndex(value: /* index */ Double => Double): Self = this.set("getComputedWidthForTabAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetComputedWidthForTabAtIndex: Self = this.set("getComputedWidthForTabAtIndex", js.undefined)
    
    @scala.inline
    def setGetNumberOfTabs(value: () => Double): Self = this.set("getNumberOfTabs", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNumberOfTabs: Self = this.set("getNumberOfTabs", js.undefined)
    
    @scala.inline
    def setGetOffsetLeftForEventTarget(value: /* target */ HTMLElement => Double): Self = this.set("getOffsetLeftForEventTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOffsetLeftForEventTarget: Self = this.set("getOffsetLeftForEventTarget", js.undefined)
    
    @scala.inline
    def setGetOffsetWidthForEventTarget(value: /* target */ HTMLElement => Double): Self = this.set("getOffsetWidthForEventTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOffsetWidthForEventTarget: Self = this.set("getOffsetWidthForEventTarget", js.undefined)
    
    @scala.inline
    def setGetOffsetWidthForScrollFrame(value: () => Double): Self = this.set("getOffsetWidthForScrollFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetWidthForScrollFrame: Self = this.set("getOffsetWidthForScrollFrame", js.undefined)
    
    @scala.inline
    def setGetOffsetWidthForTabBar(value: () => Double): Self = this.set("getOffsetWidthForTabBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetWidthForTabBar: Self = this.set("getOffsetWidthForTabBar", js.undefined)
    
    @scala.inline
    def setGetScrollLeftForScrollFrame(value: () => Double): Self = this.set("getScrollLeftForScrollFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollLeftForScrollFrame: Self = this.set("getScrollLeftForScrollFrame", js.undefined)
    
    @scala.inline
    def setIsRTL(value: () => Boolean): Self = this.set("isRTL", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setRegisterBackIndicatorClickHandler(value: /* handler */ SpecificEventListener[click] => Unit): Self = this.set("registerBackIndicatorClickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRegisterBackIndicatorClickHandler: Self = this.set("registerBackIndicatorClickHandler", js.undefined)
    
    @scala.inline
    def setRegisterCapturedInteractionHandler(value: (/* evt */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerCapturedInteractionHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRegisterCapturedInteractionHandler: Self = this.set("registerCapturedInteractionHandler", js.undefined)
    
    @scala.inline
    def setRegisterForwardIndicatorClickHandler(value: /* handler */ SpecificEventListener[click] => Unit): Self = this.set("registerForwardIndicatorClickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRegisterForwardIndicatorClickHandler: Self = this.set("registerForwardIndicatorClickHandler", js.undefined)
    
    @scala.inline
    def setRegisterWindowResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = this.set("registerWindowResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRegisterWindowResizeHandler: Self = this.set("registerWindowResizeHandler", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setRemoveClassFromBackIndicator(value: /* className */ String => Unit): Self = this.set("removeClassFromBackIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClassFromBackIndicator: Self = this.set("removeClassFromBackIndicator", js.undefined)
    
    @scala.inline
    def setRemoveClassFromForwardIndicator(value: /* className */ String => Unit): Self = this.set("removeClassFromForwardIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClassFromForwardIndicator: Self = this.set("removeClassFromForwardIndicator", js.undefined)
    
    @scala.inline
    def setSetScrollLeftForScrollFrame(value: /* scrollLeftAmount */ Double => Unit): Self = this.set("setScrollLeftForScrollFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetScrollLeftForScrollFrame: Self = this.set("setScrollLeftForScrollFrame", js.undefined)
    
    @scala.inline
    def setSetTransformStyleForTabBar(value: /* value */ String => Unit): Self = this.set("setTransformStyleForTabBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTransformStyleForTabBar: Self = this.set("setTransformStyleForTabBar", js.undefined)
  }
}
