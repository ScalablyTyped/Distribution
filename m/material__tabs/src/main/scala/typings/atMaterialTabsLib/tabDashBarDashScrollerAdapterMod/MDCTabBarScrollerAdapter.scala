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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(addClass)
    __obj.updateDynamic("addClassToBackIndicator")(addClassToBackIndicator)
    __obj.updateDynamic("addClassToForwardIndicator")(addClassToForwardIndicator)
    __obj.updateDynamic("deregisterBackIndicatorClickHandler")(deregisterBackIndicatorClickHandler)
    __obj.updateDynamic("deregisterCapturedInteractionHandler")(deregisterCapturedInteractionHandler)
    __obj.updateDynamic("deregisterForwardIndicatorClickHandler")(deregisterForwardIndicatorClickHandler)
    __obj.updateDynamic("deregisterWindowResizeHandler")(deregisterWindowResizeHandler)
    __obj.updateDynamic("eventTargetHasClass")(eventTargetHasClass)
    __obj.updateDynamic("getComputedLeftForTabAtIndex")(getComputedLeftForTabAtIndex)
    __obj.updateDynamic("getComputedWidthForTabAtIndex")(getComputedWidthForTabAtIndex)
    __obj.updateDynamic("getNumberOfTabs")(getNumberOfTabs)
    __obj.updateDynamic("getOffsetLeftForEventTarget")(getOffsetLeftForEventTarget)
    __obj.updateDynamic("getOffsetWidthForEventTarget")(getOffsetWidthForEventTarget)
    __obj.updateDynamic("getOffsetWidthForScrollFrame")(getOffsetWidthForScrollFrame)
    __obj.updateDynamic("getOffsetWidthForTabBar")(getOffsetWidthForTabBar)
    __obj.updateDynamic("getScrollLeftForScrollFrame")(getScrollLeftForScrollFrame)
    __obj.updateDynamic("isRTL")(isRTL)
    __obj.updateDynamic("registerBackIndicatorClickHandler")(registerBackIndicatorClickHandler)
    __obj.updateDynamic("registerCapturedInteractionHandler")(registerCapturedInteractionHandler)
    __obj.updateDynamic("registerForwardIndicatorClickHandler")(registerForwardIndicatorClickHandler)
    __obj.updateDynamic("registerWindowResizeHandler")(registerWindowResizeHandler)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.updateDynamic("removeClassFromBackIndicator")(removeClassFromBackIndicator)
    __obj.updateDynamic("removeClassFromForwardIndicator")(removeClassFromForwardIndicator)
    __obj.updateDynamic("setScrollLeftForScrollFrame")(setScrollLeftForScrollFrame)
    __obj.updateDynamic("setTransformStyleForTabBar")(setTransformStyleForTabBar)
    __obj.asInstanceOf[MDCTabBarScrollerAdapter]
  }
}

