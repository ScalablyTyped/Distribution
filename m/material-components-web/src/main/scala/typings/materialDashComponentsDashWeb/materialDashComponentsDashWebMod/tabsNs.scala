package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialTabs.tabAdapterMod.MDCTabAdapter
import typings.atMaterialTabs.tabDashBarAdapterMod.MDCTabBarAdapter
import typings.atMaterialTabs.tabDashBarDashScrollerAdapterMod.MDCTabBarScrollerAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "tabs")
@js.native
object tabsNs extends js.Object {
  @js.native
  class MDCTab ()
    extends typings.atMaterialTabs.atMaterialTabsMod.MDCTab
  
  @js.native
  class MDCTabBar ()
    extends typings.atMaterialTabs.atMaterialTabsMod.MDCTabBar
  
  @js.native
  class MDCTabBarFoundation ()
    extends typings.atMaterialTabs.atMaterialTabsMod.MDCTabBarFoundation
  
  @js.native
  class MDCTabBarScroller ()
    extends typings.atMaterialTabs.atMaterialTabsMod.MDCTabBarScroller
  
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends typings.atMaterialTabs.atMaterialTabsMod.MDCTabBarScrollerFoundation
  
  @js.native
  class MDCTabFoundation ()
    extends typings.atMaterialTabs.atMaterialTabsMod.MDCTabFoundation
  
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

