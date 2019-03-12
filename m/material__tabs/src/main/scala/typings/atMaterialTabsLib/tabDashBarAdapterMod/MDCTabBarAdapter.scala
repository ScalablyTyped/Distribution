package typings
package atMaterialTabsLib.tabDashBarAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabBarAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def bindOnMDCTabSelectedEvent(): scala.Unit
  def deregisterResizeHandler(handler: stdLib.EventListener): scala.Unit
  def getComputedLeftForTabAtIndex(index: scala.Double): scala.Double
  def getComputedWidthForTabAtIndex(index: scala.Double): scala.Double
  def getNumberOfTabs(): scala.Double
  def getOffsetWidth(): scala.Double
  def getOffsetWidthForIndicator(): scala.Double
  def isDefaultPreventedOnClickForTabAtIndex(index: scala.Double): scala.Boolean
  def isTabActiveAtIndex(index: scala.Double): scala.Boolean
  def measureTabAtIndex(index: scala.Double): scala.Unit
  def notifyChange(evtData: atMaterialTabsLib.Anon_ActiveTabIndex): scala.Unit
  def registerResizeHandler(handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def setPreventDefaultOnClickForTabAtIndex(index: scala.Double, preventDefaultOnClick: scala.Boolean): scala.Unit
  def setStyleForIndicator(propertyName: java.lang.String, value: java.lang.String): scala.Unit
  def setTabActiveAtIndex(index: scala.Double, isActive: atMaterialTabsLib.atMaterialTabsLibNumbers.`true`): scala.Unit
  def unbindOnMDCTabSelectedEvent(): scala.Unit
}

object MDCTabBarAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    bindOnMDCTabSelectedEvent: () => scala.Unit,
    deregisterResizeHandler: stdLib.EventListener => scala.Unit,
    getComputedLeftForTabAtIndex: scala.Double => scala.Double,
    getComputedWidthForTabAtIndex: scala.Double => scala.Double,
    getNumberOfTabs: () => scala.Double,
    getOffsetWidth: () => scala.Double,
    getOffsetWidthForIndicator: () => scala.Double,
    isDefaultPreventedOnClickForTabAtIndex: scala.Double => scala.Boolean,
    isTabActiveAtIndex: scala.Double => scala.Boolean,
    measureTabAtIndex: scala.Double => scala.Unit,
    notifyChange: atMaterialTabsLib.Anon_ActiveTabIndex => scala.Unit,
    registerResizeHandler: stdLib.EventListener => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    setPreventDefaultOnClickForTabAtIndex: (scala.Double, scala.Boolean) => scala.Unit,
    setStyleForIndicator: (java.lang.String, java.lang.String) => scala.Unit,
    setTabActiveAtIndex: (scala.Double, atMaterialTabsLib.atMaterialTabsLibNumbers.`true`) => scala.Unit,
    unbindOnMDCTabSelectedEvent: () => scala.Unit
  ): MDCTabBarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), bindOnMDCTabSelectedEvent = js.Any.fromFunction0(bindOnMDCTabSelectedEvent), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), getComputedLeftForTabAtIndex = js.Any.fromFunction1(getComputedLeftForTabAtIndex), getComputedWidthForTabAtIndex = js.Any.fromFunction1(getComputedWidthForTabAtIndex), getNumberOfTabs = js.Any.fromFunction0(getNumberOfTabs), getOffsetWidth = js.Any.fromFunction0(getOffsetWidth), getOffsetWidthForIndicator = js.Any.fromFunction0(getOffsetWidthForIndicator), isDefaultPreventedOnClickForTabAtIndex = js.Any.fromFunction1(isDefaultPreventedOnClickForTabAtIndex), isTabActiveAtIndex = js.Any.fromFunction1(isTabActiveAtIndex), measureTabAtIndex = js.Any.fromFunction1(measureTabAtIndex), notifyChange = js.Any.fromFunction1(notifyChange), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), removeClass = js.Any.fromFunction1(removeClass), setPreventDefaultOnClickForTabAtIndex = js.Any.fromFunction2(setPreventDefaultOnClickForTabAtIndex), setStyleForIndicator = js.Any.fromFunction2(setStyleForIndicator), setTabActiveAtIndex = js.Any.fromFunction2(setTabActiveAtIndex), unbindOnMDCTabSelectedEvent = js.Any.fromFunction0(unbindOnMDCTabSelectedEvent))
  
    __obj.asInstanceOf[MDCTabBarAdapter]
  }
}

