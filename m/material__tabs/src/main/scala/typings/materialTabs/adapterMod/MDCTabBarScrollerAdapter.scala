package typings.materialTabs.adapterMod

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTabs.materialTabsStrings.click
import typings.materialTabs.materialTabsStrings.resize
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCTabBarScrollerAdapter extends js.Object {
  
  def addClass(className: String): Unit = js.native
  
  def addClassToBackIndicator(className: String): Unit = js.native
  
  def addClassToForwardIndicator(className: String): Unit = js.native
  
  @JSName("deregisterBackIndicatorClickHandler")
  def deregisterBackIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit = js.native
  
  def deregisterCapturedInteractionHandler[K /* <: EventType */](evt: K, handler: SpecificEventListener[K]): Unit = js.native
  
  @JSName("deregisterForwardIndicatorClickHandler")
  def deregisterForwardIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit = js.native
  
  @JSName("deregisterWindowResizeHandler")
  def deregisterWindowResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
  
  def eventTargetHasClass(target: Element, className: String): Boolean = js.native
  
  def getComputedLeftForTabAtIndex(index: Double): Double = js.native
  
  def getComputedWidthForTabAtIndex(index: Double): Double = js.native
  
  def getNumberOfTabs(): Double = js.native
  
  def getOffsetLeftForEventTarget(target: HTMLElement): Double = js.native
  
  def getOffsetWidthForEventTarget(target: HTMLElement): Double = js.native
  
  def getOffsetWidthForScrollFrame(): Double = js.native
  
  def getOffsetWidthForTabBar(): Double = js.native
  
  def getScrollLeftForScrollFrame(): Double = js.native
  
  def isRTL(): Boolean = js.native
  
  @JSName("registerBackIndicatorClickHandler")
  def registerBackIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit = js.native
  
  def registerCapturedInteractionHandler[K /* <: EventType */](evt: K, handler: SpecificEventListener[K]): Unit = js.native
  
  @JSName("registerForwardIndicatorClickHandler")
  def registerForwardIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit = js.native
  
  @JSName("registerWindowResizeHandler")
  def registerWindowResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
  
  def removeClass(className: String): Unit = js.native
  
  def removeClassFromBackIndicator(className: String): Unit = js.native
  
  def removeClassFromForwardIndicator(className: String): Unit = js.native
  
  def setScrollLeftForScrollFrame(scrollLeftAmount: Double): Unit = js.native
  
  def setTransformStyleForTabBar(value: String): Unit = js.native
}
object MDCTabBarScrollerAdapter {
  
  @scala.inline
  def apply(
    addClass: String => Unit,
    addClassToBackIndicator: String => Unit,
    addClassToForwardIndicator: String => Unit,
    deregisterBackIndicatorClickHandler: SpecificEventListener[click] => Unit,
    deregisterCapturedInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
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
    registerCapturedInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
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
  
  @scala.inline
  implicit class MDCTabBarScrollerAdapterOps[Self <: MDCTabBarScrollerAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddClassToBackIndicator(value: String => Unit): Self = this.set("addClassToBackIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddClassToForwardIndicator(value: String => Unit): Self = this.set("addClassToForwardIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeregisterBackIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = this.set("deregisterBackIndicatorClickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeregisterCapturedInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterCapturedInteractionHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeregisterForwardIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = this.set("deregisterForwardIndicatorClickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeregisterWindowResizeHandler(value: SpecificEventListener[resize] => Unit): Self = this.set("deregisterWindowResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventTargetHasClass(value: (Element, String) => Boolean): Self = this.set("eventTargetHasClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetComputedLeftForTabAtIndex(value: Double => Double): Self = this.set("getComputedLeftForTabAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetComputedWidthForTabAtIndex(value: Double => Double): Self = this.set("getComputedWidthForTabAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumberOfTabs(value: () => Double): Self = this.set("getNumberOfTabs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffsetLeftForEventTarget(value: HTMLElement => Double): Self = this.set("getOffsetLeftForEventTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOffsetWidthForEventTarget(value: HTMLElement => Double): Self = this.set("getOffsetWidthForEventTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOffsetWidthForScrollFrame(value: () => Double): Self = this.set("getOffsetWidthForScrollFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffsetWidthForTabBar(value: () => Double): Self = this.set("getOffsetWidthForTabBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScrollLeftForScrollFrame(value: () => Double): Self = this.set("getScrollLeftForScrollFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRTL(value: () => Boolean): Self = this.set("isRTL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterBackIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = this.set("registerBackIndicatorClickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterCapturedInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerCapturedInteractionHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterForwardIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = this.set("registerForwardIndicatorClickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterWindowResizeHandler(value: SpecificEventListener[resize] => Unit): Self = this.set("registerWindowResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClassFromBackIndicator(value: String => Unit): Self = this.set("removeClassFromBackIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClassFromForwardIndicator(value: String => Unit): Self = this.set("removeClassFromForwardIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScrollLeftForScrollFrame(value: Double => Unit): Self = this.set("setScrollLeftForScrollFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTransformStyleForTabBar(value: String => Unit): Self = this.set("setTransformStyleForTabBar", js.Any.fromFunction1(value))
  }
}
