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

