package typings.materialTabs.adapterMod

import typings.std.EventListener
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabBarScrollerAdapter extends js.Object {
  def addClass(className: String): Unit
  def addClassToBackIndicator(className: String): Unit
  def addClassToForwardIndicator(className: String): Unit
  def deregisterBackIndicatorClickHandler(handler: EventListener): Unit
  def deregisterCapturedInteractionHandler(evt: String, handler: EventListener): Unit
  def deregisterForwardIndicatorClickHandler(handler: EventListener): Unit
  def deregisterWindowResizeHandler(handler: EventListener): Unit
  def eventTargetHasClass(target: EventTarget, className: String): Boolean
  def getComputedLeftForTabAtIndex(): Double
  def getComputedWidthForTabAtIndex(): Double
  def getNumberOfTabs(): Double
  def getOffsetLeftForEventTarget(target: EventTarget): Double
  def getOffsetWidthForEventTarget(target: EventTarget): Double
  def getOffsetWidthForScrollFrame(): Double
  def getOffsetWidthForTabBar(): Double
  def getScrollLeftForScrollFrame(): Double
  def isRTL(): Boolean
  def registerBackIndicatorClickHandler(handler: EventListener): Unit
  def registerCapturedInteractionHandler(evt: String, handler: EventListener): Unit
  def registerForwardIndicatorClickHandler(handler: EventListener): Unit
  def registerWindowResizeHandler(handler: EventListener): Unit
  def removeClass(className: String): Unit
  def removeClassFromBackIndicator(className: String): Unit
  def removeClassFromForwardIndicator(className: String): Unit
  def setScrollLeftForScrollFrame(scrollLeftAmount: Double): Unit
  def setTransformStyleForTabBar(value: String): Unit
}

object MDCTabBarScrollerAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    addClassToBackIndicator: String => Unit,
    addClassToForwardIndicator: String => Unit,
    deregisterBackIndicatorClickHandler: EventListener => Unit,
    deregisterCapturedInteractionHandler: (String, EventListener) => Unit,
    deregisterForwardIndicatorClickHandler: EventListener => Unit,
    deregisterWindowResizeHandler: EventListener => Unit,
    eventTargetHasClass: (EventTarget, String) => Boolean,
    getComputedLeftForTabAtIndex: () => Double,
    getComputedWidthForTabAtIndex: () => Double,
    getNumberOfTabs: () => Double,
    getOffsetLeftForEventTarget: EventTarget => Double,
    getOffsetWidthForEventTarget: EventTarget => Double,
    getOffsetWidthForScrollFrame: () => Double,
    getOffsetWidthForTabBar: () => Double,
    getScrollLeftForScrollFrame: () => Double,
    isRTL: () => Boolean,
    registerBackIndicatorClickHandler: EventListener => Unit,
    registerCapturedInteractionHandler: (String, EventListener) => Unit,
    registerForwardIndicatorClickHandler: EventListener => Unit,
    registerWindowResizeHandler: EventListener => Unit,
    removeClass: String => Unit,
    removeClassFromBackIndicator: String => Unit,
    removeClassFromForwardIndicator: String => Unit,
    setScrollLeftForScrollFrame: Double => Unit,
    setTransformStyleForTabBar: String => Unit
  ): MDCTabBarScrollerAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassToBackIndicator = js.Any.fromFunction1(addClassToBackIndicator), addClassToForwardIndicator = js.Any.fromFunction1(addClassToForwardIndicator), deregisterBackIndicatorClickHandler = js.Any.fromFunction1(deregisterBackIndicatorClickHandler), deregisterCapturedInteractionHandler = js.Any.fromFunction2(deregisterCapturedInteractionHandler), deregisterForwardIndicatorClickHandler = js.Any.fromFunction1(deregisterForwardIndicatorClickHandler), deregisterWindowResizeHandler = js.Any.fromFunction1(deregisterWindowResizeHandler), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), getComputedLeftForTabAtIndex = js.Any.fromFunction0(getComputedLeftForTabAtIndex), getComputedWidthForTabAtIndex = js.Any.fromFunction0(getComputedWidthForTabAtIndex), getNumberOfTabs = js.Any.fromFunction0(getNumberOfTabs), getOffsetLeftForEventTarget = js.Any.fromFunction1(getOffsetLeftForEventTarget), getOffsetWidthForEventTarget = js.Any.fromFunction1(getOffsetWidthForEventTarget), getOffsetWidthForScrollFrame = js.Any.fromFunction0(getOffsetWidthForScrollFrame), getOffsetWidthForTabBar = js.Any.fromFunction0(getOffsetWidthForTabBar), getScrollLeftForScrollFrame = js.Any.fromFunction0(getScrollLeftForScrollFrame), isRTL = js.Any.fromFunction0(isRTL), registerBackIndicatorClickHandler = js.Any.fromFunction1(registerBackIndicatorClickHandler), registerCapturedInteractionHandler = js.Any.fromFunction2(registerCapturedInteractionHandler), registerForwardIndicatorClickHandler = js.Any.fromFunction1(registerForwardIndicatorClickHandler), registerWindowResizeHandler = js.Any.fromFunction1(registerWindowResizeHandler), removeClass = js.Any.fromFunction1(removeClass), removeClassFromBackIndicator = js.Any.fromFunction1(removeClassFromBackIndicator), removeClassFromForwardIndicator = js.Any.fromFunction1(removeClassFromForwardIndicator), setScrollLeftForScrollFrame = js.Any.fromFunction1(setScrollLeftForScrollFrame), setTransformStyleForTabBar = js.Any.fromFunction1(setTransformStyleForTabBar))
  
    __obj.asInstanceOf[MDCTabBarScrollerAdapter]
  }
}

