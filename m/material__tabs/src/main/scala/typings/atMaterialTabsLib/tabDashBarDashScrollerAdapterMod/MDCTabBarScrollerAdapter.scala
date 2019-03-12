package typings
package atMaterialTabsLib.tabDashBarDashScrollerAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabBarScrollerAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def addClassToBackIndicator(className: java.lang.String): scala.Unit
  def addClassToForwardIndicator(className: java.lang.String): scala.Unit
  def deregisterBackIndicatorClickHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterCapturedInteractionHandler(evt: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def deregisterForwardIndicatorClickHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterWindowResizeHandler(handler: stdLib.EventListener): scala.Unit
  def eventTargetHasClass(target: stdLib.EventTarget, className: java.lang.String): scala.Boolean
  def getComputedLeftForTabAtIndex(): scala.Double
  def getComputedWidthForTabAtIndex(): scala.Double
  def getNumberOfTabs(): scala.Double
  def getOffsetLeftForEventTarget(target: stdLib.EventTarget): scala.Double
  def getOffsetWidthForEventTarget(target: stdLib.EventTarget): scala.Double
  def getOffsetWidthForScrollFrame(): scala.Double
  def getOffsetWidthForTabBar(): scala.Double
  def getScrollLeftForScrollFrame(): scala.Double
  def isRTL(): scala.Boolean
  def registerBackIndicatorClickHandler(handler: stdLib.EventListener): scala.Unit
  def registerCapturedInteractionHandler(evt: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def registerForwardIndicatorClickHandler(handler: stdLib.EventListener): scala.Unit
  def registerWindowResizeHandler(handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def removeClassFromBackIndicator(className: java.lang.String): scala.Unit
  def removeClassFromForwardIndicator(className: java.lang.String): scala.Unit
  def setScrollLeftForScrollFrame(scrollLeftAmount: scala.Double): scala.Unit
  def setTransformStyleForTabBar(value: java.lang.String): scala.Unit
}

object MDCTabBarScrollerAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    addClassToBackIndicator: java.lang.String => scala.Unit,
    addClassToForwardIndicator: java.lang.String => scala.Unit,
    deregisterBackIndicatorClickHandler: stdLib.EventListener => scala.Unit,
    deregisterCapturedInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    deregisterForwardIndicatorClickHandler: stdLib.EventListener => scala.Unit,
    deregisterWindowResizeHandler: stdLib.EventListener => scala.Unit,
    eventTargetHasClass: (stdLib.EventTarget, java.lang.String) => scala.Boolean,
    getComputedLeftForTabAtIndex: () => scala.Double,
    getComputedWidthForTabAtIndex: () => scala.Double,
    getNumberOfTabs: () => scala.Double,
    getOffsetLeftForEventTarget: stdLib.EventTarget => scala.Double,
    getOffsetWidthForEventTarget: stdLib.EventTarget => scala.Double,
    getOffsetWidthForScrollFrame: () => scala.Double,
    getOffsetWidthForTabBar: () => scala.Double,
    getScrollLeftForScrollFrame: () => scala.Double,
    isRTL: () => scala.Boolean,
    registerBackIndicatorClickHandler: stdLib.EventListener => scala.Unit,
    registerCapturedInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    registerForwardIndicatorClickHandler: stdLib.EventListener => scala.Unit,
    registerWindowResizeHandler: stdLib.EventListener => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    removeClassFromBackIndicator: java.lang.String => scala.Unit,
    removeClassFromForwardIndicator: java.lang.String => scala.Unit,
    setScrollLeftForScrollFrame: scala.Double => scala.Unit,
    setTransformStyleForTabBar: java.lang.String => scala.Unit
  ): MDCTabBarScrollerAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassToBackIndicator = js.Any.fromFunction1(addClassToBackIndicator), addClassToForwardIndicator = js.Any.fromFunction1(addClassToForwardIndicator), deregisterBackIndicatorClickHandler = js.Any.fromFunction1(deregisterBackIndicatorClickHandler), deregisterCapturedInteractionHandler = js.Any.fromFunction2(deregisterCapturedInteractionHandler), deregisterForwardIndicatorClickHandler = js.Any.fromFunction1(deregisterForwardIndicatorClickHandler), deregisterWindowResizeHandler = js.Any.fromFunction1(deregisterWindowResizeHandler), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), getComputedLeftForTabAtIndex = js.Any.fromFunction0(getComputedLeftForTabAtIndex), getComputedWidthForTabAtIndex = js.Any.fromFunction0(getComputedWidthForTabAtIndex), getNumberOfTabs = js.Any.fromFunction0(getNumberOfTabs), getOffsetLeftForEventTarget = js.Any.fromFunction1(getOffsetLeftForEventTarget), getOffsetWidthForEventTarget = js.Any.fromFunction1(getOffsetWidthForEventTarget), getOffsetWidthForScrollFrame = js.Any.fromFunction0(getOffsetWidthForScrollFrame), getOffsetWidthForTabBar = js.Any.fromFunction0(getOffsetWidthForTabBar), getScrollLeftForScrollFrame = js.Any.fromFunction0(getScrollLeftForScrollFrame), isRTL = js.Any.fromFunction0(isRTL), registerBackIndicatorClickHandler = js.Any.fromFunction1(registerBackIndicatorClickHandler), registerCapturedInteractionHandler = js.Any.fromFunction2(registerCapturedInteractionHandler), registerForwardIndicatorClickHandler = js.Any.fromFunction1(registerForwardIndicatorClickHandler), registerWindowResizeHandler = js.Any.fromFunction1(registerWindowResizeHandler), removeClass = js.Any.fromFunction1(removeClass), removeClassFromBackIndicator = js.Any.fromFunction1(removeClassFromBackIndicator), removeClassFromForwardIndicator = js.Any.fromFunction1(removeClassFromForwardIndicator), setScrollLeftForScrollFrame = js.Any.fromFunction1(setScrollLeftForScrollFrame), setTransformStyleForTabBar = js.Any.fromFunction1(setTransformStyleForTabBar))
  
    __obj.asInstanceOf[MDCTabBarScrollerAdapter]
  }
}

