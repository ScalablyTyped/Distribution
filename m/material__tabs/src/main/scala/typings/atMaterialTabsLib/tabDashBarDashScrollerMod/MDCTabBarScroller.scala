package typings
package atMaterialTabsLib.tabDashBarDashScrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar-scroller", "MDCTabBarScroller")
@js.native
class MDCTabBarScroller ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialTabsLib.tabDashBarDashScrollerAdapterMod.MDCTabBarScrollerAdapter, 
      atMaterialTabsLib.tabDashBarDashScrollerFoundationMod.default
    ] {
  val tabBar: atMaterialTabsLib.tabDashBarMod.MDCTabBar = js.native
  def initialize(): scala.Unit = js.native
  def initialize(tabBarFactory: js.Function1[/* root */ stdLib.Element, atMaterialTabsLib.tabDashBarMod.MDCTabBar]): scala.Unit = js.native
  def layout(): scala.Unit = js.native
}

@JSImport("@material/tabs/tab-bar-scroller", "MDCTabBarScroller")
@js.native
object MDCTabBarScroller extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialTabsLib.tabDashBarDashScrollerMod.MDCTabBarScroller = js.native
}

