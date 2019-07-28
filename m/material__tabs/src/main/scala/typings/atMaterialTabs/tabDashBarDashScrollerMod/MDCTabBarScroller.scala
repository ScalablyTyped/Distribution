package typings.atMaterialTabs.tabDashBarDashScrollerMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialTabs.tabDashBarDashScrollerAdapterMod.MDCTabBarScrollerAdapter
import typings.atMaterialTabs.tabDashBarMod.MDCTabBar
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar-scroller", "MDCTabBarScroller")
@js.native
class MDCTabBarScroller ()
  extends default[
      MDCTabBarScrollerAdapter, 
      typings.atMaterialTabs.tabDashBarDashScrollerFoundationMod.default
    ] {
  val tabBar: MDCTabBar = js.native
  def initialize(): Unit = js.native
  def initialize(tabBarFactory: js.Function1[/* root */ Element, MDCTabBar]): Unit = js.native
  def layout(): Unit = js.native
}

/* static members */
@JSImport("@material/tabs/tab-bar-scroller", "MDCTabBarScroller")
@js.native
object MDCTabBarScroller extends js.Object {
  def attachTo(root: Element): MDCTabBarScroller = js.native
}

