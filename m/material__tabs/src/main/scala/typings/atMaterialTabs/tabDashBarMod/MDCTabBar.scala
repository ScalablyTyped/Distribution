package typings.atMaterialTabs.tabDashBarMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialTabs.tabDashBarAdapterMod.MDCTabBarAdapter
import typings.atMaterialTabs.tabMod.MDCTab
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar", "MDCTabBar")
@js.native
class MDCTabBar ()
  extends default[MDCTabBarAdapter, typings.atMaterialTabs.tabDashBarFoundationMod.default] {
  var activeTab: MDCTab = js.native
  var activeTabIndex: Double = js.native
  val tabs: js.Array[MDCTab] = js.native
  def initialize(): Unit = js.native
  def initialize(tabFactory: js.Function1[/* el */ Element, MDCTab]): Unit = js.native
  def layout(): Unit = js.native
}

/* static members */
@JSImport("@material/tabs/tab-bar", "MDCTabBar")
@js.native
object MDCTabBar extends js.Object {
  def attachTo(root: Element): MDCTabBar = js.native
}

