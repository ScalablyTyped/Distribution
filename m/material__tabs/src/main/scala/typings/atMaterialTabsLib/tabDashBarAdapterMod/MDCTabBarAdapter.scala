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
    addClass: js.Function1[java.lang.String, scala.Unit],
    bindOnMDCTabSelectedEvent: js.Function0[scala.Unit],
    deregisterResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    getComputedLeftForTabAtIndex: js.Function1[scala.Double, scala.Double],
    getComputedWidthForTabAtIndex: js.Function1[scala.Double, scala.Double],
    getNumberOfTabs: js.Function0[scala.Double],
    getOffsetWidth: js.Function0[scala.Double],
    getOffsetWidthForIndicator: js.Function0[scala.Double],
    isDefaultPreventedOnClickForTabAtIndex: js.Function1[scala.Double, scala.Boolean],
    isTabActiveAtIndex: js.Function1[scala.Double, scala.Boolean],
    measureTabAtIndex: js.Function1[scala.Double, scala.Unit],
    notifyChange: js.Function1[atMaterialTabsLib.Anon_ActiveTabIndex, scala.Unit],
    registerResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    setPreventDefaultOnClickForTabAtIndex: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    setStyleForIndicator: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setTabActiveAtIndex: js.Function2[scala.Double, atMaterialTabsLib.atMaterialTabsLibNumbers.`true`, scala.Unit],
    unbindOnMDCTabSelectedEvent: js.Function0[scala.Unit]
  ): MDCTabBarAdapter = {
    val __obj = js.Dynamic.literal(addClass = addClass, bindOnMDCTabSelectedEvent = bindOnMDCTabSelectedEvent, deregisterResizeHandler = deregisterResizeHandler, getComputedLeftForTabAtIndex = getComputedLeftForTabAtIndex, getComputedWidthForTabAtIndex = getComputedWidthForTabAtIndex, getNumberOfTabs = getNumberOfTabs, getOffsetWidth = getOffsetWidth, getOffsetWidthForIndicator = getOffsetWidthForIndicator, isDefaultPreventedOnClickForTabAtIndex = isDefaultPreventedOnClickForTabAtIndex, isTabActiveAtIndex = isTabActiveAtIndex, measureTabAtIndex = measureTabAtIndex, notifyChange = notifyChange, registerResizeHandler = registerResizeHandler, removeClass = removeClass, setPreventDefaultOnClickForTabAtIndex = setPreventDefaultOnClickForTabAtIndex, setStyleForIndicator = setStyleForIndicator, setTabActiveAtIndex = setTabActiveAtIndex, unbindOnMDCTabSelectedEvent = unbindOnMDCTabSelectedEvent)
  
    __obj.asInstanceOf[MDCTabBarAdapter]
  }
}

