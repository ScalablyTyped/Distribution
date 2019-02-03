package typings
package atMaterialTabsLib.tabDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar", "MDCTabBar")
@js.native
class MDCTabBar ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialTabsLib.tabDashBarAdapterMod.MDCTabBarAdapter, 
      atMaterialTabsLib.tabDashBarFoundationMod.default
    ] {
  var activeTab: atMaterialTabsLib.tabMod.MDCTab = js.native
  var activeTabIndex: scala.Double = js.native
  val tabs: js.Array[atMaterialTabsLib.tabMod.MDCTab] = js.native
  def initialize(): scala.Unit = js.native
  def initialize(tabFactory: js.Function1[/* el */ stdLib.Element, atMaterialTabsLib.tabMod.MDCTab]): scala.Unit = js.native
  def layout(): scala.Unit = js.native
}

/* static members */
@JSImport("@material/tabs/tab-bar", "MDCTabBar")
@js.native
object MDCTabBar extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialTabsLib.tabDashBarMod.MDCTabBar = js.native
}

