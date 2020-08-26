package typings.materialTabs

import typings.materialBase.componentMod.default
import typings.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import typings.materialTabs.tabMod.MDCTab
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar", JSImport.Namespace)
@js.native
object tabBarMod extends js.Object {
  @js.native
  class MDCTabBar () extends default[MDCTabBarAdapter] {
    var activeTab: MDCTab = js.native
    var activeTabIndex: Double = js.native
    val tabs: js.Array[MDCTab] = js.native
    def initialize(): Unit = js.native
    def initialize(tabFactory: js.Function1[/* el */ Element, MDCTab]): Unit = js.native
    def layout(): Unit = js.native
  }
  
  @js.native
  class MDCTabBarFoundation ()
    extends typings.materialTabs.tabBarFoundationMod.default
  
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    def attachTo(root: Element): MDCTabBar = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    val cssClasses: typings.materialTabs.tabBarConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    val strings: typings.materialTabs.tabBarConstantsMod.strings = js.native
  }
  
}

