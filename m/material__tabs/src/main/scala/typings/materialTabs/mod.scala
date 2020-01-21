package typings.materialTabs

import typings.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typings.materialTabs.tabAdapterMod.MDCTabAdapter
import typings.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import typings.materialTabs.tabBarFoundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCTab ()
    extends typings.materialTabs.tabMod.MDCTab
  
  @js.native
  class MDCTabBar ()
    extends typings.materialTabs.tabBarMod.MDCTabBar
  
  @js.native
  class MDCTabBarFoundation () extends default
  
  @js.native
  class MDCTabBarScroller ()
    extends typings.materialTabs.tabBarScrollerMod.MDCTabBarScroller
  
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends typings.materialTabs.foundationMod.default
  
  @js.native
  class MDCTabFoundation ()
    extends typings.materialTabs.tabFoundationMod.default
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): typings.materialTabs.tabMod.MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    def attachTo(root: Element): typings.materialTabs.tabBarMod.MDCTabBar = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    val cssClasses: typings.materialTabs.tabBarConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    val strings: typings.materialTabs.tabBarConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    def attachTo(root: Element): typings.materialTabs.tabBarScrollerMod.MDCTabBarScroller = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    val cssClasses: typings.materialTabs.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    val strings: typings.materialTabs.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typings.materialTabs.tabConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typings.materialTabs.tabConstantsMod.strings = js.native
  }
  
}

