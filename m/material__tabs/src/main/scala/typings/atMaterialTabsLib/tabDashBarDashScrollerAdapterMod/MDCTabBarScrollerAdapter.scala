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
    addClass: js.Function1[java.lang.String, scala.Unit],
    addClassToBackIndicator: js.Function1[java.lang.String, scala.Unit],
    addClassToForwardIndicator: js.Function1[java.lang.String, scala.Unit],
    deregisterBackIndicatorClickHandler: js.Function1[stdLib.EventListener, scala.Unit],
    deregisterCapturedInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    deregisterForwardIndicatorClickHandler: js.Function1[stdLib.EventListener, scala.Unit],
    deregisterWindowResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    eventTargetHasClass: js.Function2[stdLib.EventTarget, java.lang.String, scala.Boolean],
    getComputedLeftForTabAtIndex: js.Function0[scala.Double],
    getComputedWidthForTabAtIndex: js.Function0[scala.Double],
    getNumberOfTabs: js.Function0[scala.Double],
    getOffsetLeftForEventTarget: js.Function1[stdLib.EventTarget, scala.Double],
    getOffsetWidthForEventTarget: js.Function1[stdLib.EventTarget, scala.Double],
    getOffsetWidthForScrollFrame: js.Function0[scala.Double],
    getOffsetWidthForTabBar: js.Function0[scala.Double],
    getScrollLeftForScrollFrame: js.Function0[scala.Double],
    isRTL: js.Function0[scala.Boolean],
    registerBackIndicatorClickHandler: js.Function1[stdLib.EventListener, scala.Unit],
    registerCapturedInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    registerForwardIndicatorClickHandler: js.Function1[stdLib.EventListener, scala.Unit],
    registerWindowResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    removeClassFromBackIndicator: js.Function1[java.lang.String, scala.Unit],
    removeClassFromForwardIndicator: js.Function1[java.lang.String, scala.Unit],
    setScrollLeftForScrollFrame: js.Function1[scala.Double, scala.Unit],
    setTransformStyleForTabBar: js.Function1[java.lang.String, scala.Unit]
  ): MDCTabBarScrollerAdapter = {
    val __obj = js.Dynamic.literal(addClass = addClass, addClassToBackIndicator = addClassToBackIndicator, addClassToForwardIndicator = addClassToForwardIndicator, deregisterBackIndicatorClickHandler = deregisterBackIndicatorClickHandler, deregisterCapturedInteractionHandler = deregisterCapturedInteractionHandler, deregisterForwardIndicatorClickHandler = deregisterForwardIndicatorClickHandler, deregisterWindowResizeHandler = deregisterWindowResizeHandler, eventTargetHasClass = eventTargetHasClass, getComputedLeftForTabAtIndex = getComputedLeftForTabAtIndex, getComputedWidthForTabAtIndex = getComputedWidthForTabAtIndex, getNumberOfTabs = getNumberOfTabs, getOffsetLeftForEventTarget = getOffsetLeftForEventTarget, getOffsetWidthForEventTarget = getOffsetWidthForEventTarget, getOffsetWidthForScrollFrame = getOffsetWidthForScrollFrame, getOffsetWidthForTabBar = getOffsetWidthForTabBar, getScrollLeftForScrollFrame = getScrollLeftForScrollFrame, isRTL = isRTL, registerBackIndicatorClickHandler = registerBackIndicatorClickHandler, registerCapturedInteractionHandler = registerCapturedInteractionHandler, registerForwardIndicatorClickHandler = registerForwardIndicatorClickHandler, registerWindowResizeHandler = registerWindowResizeHandler, removeClass = removeClass, removeClassFromBackIndicator = removeClassFromBackIndicator, removeClassFromForwardIndicator = removeClassFromForwardIndicator, setScrollLeftForScrollFrame = setScrollLeftForScrollFrame, setTransformStyleForTabBar = setTransformStyleForTabBar)
  
    __obj.asInstanceOf[MDCTabBarScrollerAdapter]
  }
}

