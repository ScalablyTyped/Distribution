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

