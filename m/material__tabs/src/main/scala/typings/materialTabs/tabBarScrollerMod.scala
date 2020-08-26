package typings.materialTabs

import typings.materialBase.componentMod.default
import typings.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typings.materialTabs.tabBarMod.MDCTabBar
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar-scroller", JSImport.Namespace)
@js.native
object tabBarScrollerMod extends js.Object {
  @js.native
  class MDCTabBarScroller () extends default[MDCTabBarScrollerAdapter] {
    val tabBar: MDCTabBar = js.native
    def initialize(): Unit = js.native
    def initialize(tabBarFactory: js.Function1[/* root */ Element, MDCTabBar]): Unit = js.native
    def layout(): Unit = js.native
  }
  
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends typings.materialTabs.foundationMod.default
  
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    def attachTo(root: Element): MDCTabBarScroller = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    val cssClasses: typings.materialTabs.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    val strings: typings.materialTabs.constantsMod.strings = js.native
  }
  
}

