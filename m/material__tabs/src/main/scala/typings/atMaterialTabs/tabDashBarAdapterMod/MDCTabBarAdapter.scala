package typings.atMaterialTabs.tabDashBarAdapterMod

import typings.atMaterialTabs.Anon_ActiveTabIndex
import typings.atMaterialTabs.atMaterialTabsBooleans.`true`
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabBarAdapter extends js.Object {
  def addClass(className: String): Unit
  def bindOnMDCTabSelectedEvent(): Unit
  def deregisterResizeHandler(handler: EventListener): Unit
  def getComputedLeftForTabAtIndex(index: Double): Double
  def getComputedWidthForTabAtIndex(index: Double): Double
  def getNumberOfTabs(): Double
  def getOffsetWidth(): Double
  def getOffsetWidthForIndicator(): Double
  def isDefaultPreventedOnClickForTabAtIndex(index: Double): Boolean
  def isTabActiveAtIndex(index: Double): Boolean
  def measureTabAtIndex(index: Double): Unit
  def notifyChange(evtData: Anon_ActiveTabIndex): Unit
  def registerResizeHandler(handler: EventListener): Unit
  def removeClass(className: String): Unit
  def setPreventDefaultOnClickForTabAtIndex(index: Double, preventDefaultOnClick: Boolean): Unit
  def setStyleForIndicator(propertyName: String, value: String): Unit
  @JSName("setTabActiveAtIndex")
  def setTabActiveAtIndex_true(index: Double, isActive: `true`): Unit
  def unbindOnMDCTabSelectedEvent(): Unit
}

object MDCTabBarAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    bindOnMDCTabSelectedEvent: () => Unit,
    deregisterResizeHandler: EventListener => Unit,
    getComputedLeftForTabAtIndex: Double => Double,
    getComputedWidthForTabAtIndex: Double => Double,
    getNumberOfTabs: () => Double,
    getOffsetWidth: () => Double,
    getOffsetWidthForIndicator: () => Double,
    isDefaultPreventedOnClickForTabAtIndex: Double => Boolean,
    isTabActiveAtIndex: Double => Boolean,
    measureTabAtIndex: Double => Unit,
    notifyChange: Anon_ActiveTabIndex => Unit,
    registerResizeHandler: EventListener => Unit,
    removeClass: String => Unit,
    setPreventDefaultOnClickForTabAtIndex: (Double, Boolean) => Unit,
    setStyleForIndicator: (String, String) => Unit,
    setTabActiveAtIndex: (Double, `true`) => Unit,
    unbindOnMDCTabSelectedEvent: () => Unit
  ): MDCTabBarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), bindOnMDCTabSelectedEvent = js.Any.fromFunction0(bindOnMDCTabSelectedEvent), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), getComputedLeftForTabAtIndex = js.Any.fromFunction1(getComputedLeftForTabAtIndex), getComputedWidthForTabAtIndex = js.Any.fromFunction1(getComputedWidthForTabAtIndex), getNumberOfTabs = js.Any.fromFunction0(getNumberOfTabs), getOffsetWidth = js.Any.fromFunction0(getOffsetWidth), getOffsetWidthForIndicator = js.Any.fromFunction0(getOffsetWidthForIndicator), isDefaultPreventedOnClickForTabAtIndex = js.Any.fromFunction1(isDefaultPreventedOnClickForTabAtIndex), isTabActiveAtIndex = js.Any.fromFunction1(isTabActiveAtIndex), measureTabAtIndex = js.Any.fromFunction1(measureTabAtIndex), notifyChange = js.Any.fromFunction1(notifyChange), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), removeClass = js.Any.fromFunction1(removeClass), setPreventDefaultOnClickForTabAtIndex = js.Any.fromFunction2(setPreventDefaultOnClickForTabAtIndex), setStyleForIndicator = js.Any.fromFunction2(setStyleForIndicator), setTabActiveAtIndex = js.Any.fromFunction2(setTabActiveAtIndex), unbindOnMDCTabSelectedEvent = js.Any.fromFunction0(unbindOnMDCTabSelectedEvent))
  
    __obj.asInstanceOf[MDCTabBarAdapter]
  }
}

