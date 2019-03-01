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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(addClass)
    __obj.updateDynamic("bindOnMDCTabSelectedEvent")(bindOnMDCTabSelectedEvent)
    __obj.updateDynamic("deregisterResizeHandler")(deregisterResizeHandler)
    __obj.updateDynamic("getComputedLeftForTabAtIndex")(getComputedLeftForTabAtIndex)
    __obj.updateDynamic("getComputedWidthForTabAtIndex")(getComputedWidthForTabAtIndex)
    __obj.updateDynamic("getNumberOfTabs")(getNumberOfTabs)
    __obj.updateDynamic("getOffsetWidth")(getOffsetWidth)
    __obj.updateDynamic("getOffsetWidthForIndicator")(getOffsetWidthForIndicator)
    __obj.updateDynamic("isDefaultPreventedOnClickForTabAtIndex")(isDefaultPreventedOnClickForTabAtIndex)
    __obj.updateDynamic("isTabActiveAtIndex")(isTabActiveAtIndex)
    __obj.updateDynamic("measureTabAtIndex")(measureTabAtIndex)
    __obj.updateDynamic("notifyChange")(notifyChange)
    __obj.updateDynamic("registerResizeHandler")(registerResizeHandler)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.updateDynamic("setPreventDefaultOnClickForTabAtIndex")(setPreventDefaultOnClickForTabAtIndex)
    __obj.updateDynamic("setStyleForIndicator")(setStyleForIndicator)
    __obj.updateDynamic("setTabActiveAtIndex")(setTabActiveAtIndex)
    __obj.updateDynamic("unbindOnMDCTabSelectedEvent")(unbindOnMDCTabSelectedEvent)
    __obj.asInstanceOf[MDCTabBarAdapter]
  }
}

