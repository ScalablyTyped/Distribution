package typings.atMaterialTabs

import typings.atMaterialTabs.tabDashBarDashScrollerAdapterMod.MDCTabBarScrollerAdapter
import typings.atMaterialTabs.tabDashBarDashScrollerFoundationMod.default
import typings.atMaterialTabs.tabDashBarDashScrollerMod.MDCTabBarScroller
import typings.atMaterialTabs.tabDashBarMod.MDCTabBar
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar-scroller", JSImport.Namespace)
@js.native
object tabDashBarDashScrollerMod extends js.Object {
  @js.native
  class MDCTabBarScroller ()
    extends typings.atMaterialBase.componentMod.default[MDCTabBarScrollerAdapter, default] {
    val tabBar: MDCTabBar = js.native
    def initialize(): Unit = js.native
    def initialize(tabBarFactory: js.Function1[/* root */ Element, MDCTabBar]): Unit = js.native
    def layout(): Unit = js.native
  }
  
  @js.native
  class MDCTabBarScrollerFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    def attachTo(root: Element): MDCTabBarScroller = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    val cssClasses: typings.atMaterialTabs.tabDashBarDashScrollerConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    val strings: typings.atMaterialTabs.tabDashBarDashScrollerConstantsMod.strings = js.native
  }
  
}

