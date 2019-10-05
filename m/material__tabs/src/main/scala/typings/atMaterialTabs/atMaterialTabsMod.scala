package typings.atMaterialTabs

import typings.atMaterialTabs.tabAdapterMod.MDCTabAdapter
import typings.atMaterialTabs.tabDashBarAdapterMod.MDCTabBarAdapter
import typings.atMaterialTabs.tabDashBarDashScrollerAdapterMod.MDCTabBarScrollerAdapter
import typings.atMaterialTabs.tabDashBarFoundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs", JSImport.Namespace)
@js.native
object atMaterialTabsMod extends js.Object {
  @js.native
  class MDCTab ()
    extends typings.atMaterialTabs.tabMod.MDCTab
  
  @js.native
  class MDCTabBar ()
    extends typings.atMaterialTabs.tabDashBarMod.MDCTabBar
  
  @js.native
  class MDCTabBarFoundation () extends default
  
  @js.native
  class MDCTabBarScroller ()
    extends typings.atMaterialTabs.tabDashBarDashScrollerMod.MDCTabBarScroller
  
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends typings.atMaterialTabs.tabDashBarDashScrollerFoundationMod.default
  
  @js.native
  class MDCTabFoundation ()
    extends typings.atMaterialTabs.tabFoundationMod.default
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): typings.atMaterialTabs.tabMod.MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    def attachTo(root: Element): typings.atMaterialTabs.tabDashBarMod.MDCTabBar = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    val cssClasses: typings.atMaterialTabs.tabDashBarConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    val strings: typings.atMaterialTabs.tabDashBarConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    def attachTo(root: Element): typings.atMaterialTabs.tabDashBarDashScrollerMod.MDCTabBarScroller = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    val cssClasses: typings.atMaterialTabs.tabDashBarDashScrollerConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    val strings: typings.atMaterialTabs.tabDashBarDashScrollerConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typings.atMaterialTabs.tabConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typings.atMaterialTabs.tabConstantsMod.strings = js.native
  }
  
}

