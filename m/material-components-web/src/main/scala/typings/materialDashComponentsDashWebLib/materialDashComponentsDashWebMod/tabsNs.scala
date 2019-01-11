package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "tabs")
@js.native
object tabsNs extends js.Object {
  @js.native
  class MDCTab ()
    extends atMaterialTabsLib.atMaterialTabsMod.MDCTab
  
  @js.native
  class MDCTabBar ()
    extends atMaterialTabsLib.atMaterialTabsMod.MDCTabBar
  
  @js.native
  class MDCTabBarFoundation ()
    extends atMaterialTabsLib.atMaterialTabsMod.MDCTabBarFoundation
  
  @js.native
  class MDCTabBarScroller ()
    extends atMaterialTabsLib.atMaterialTabsMod.MDCTabBarScroller
  
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends atMaterialTabsLib.atMaterialTabsMod.MDCTabBarScrollerFoundation
  
  @js.native
  class MDCTabFoundation ()
    extends atMaterialTabsLib.atMaterialTabsMod.MDCTabFoundation
  
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialTabsLib.tabMod.MDCTab = js.native
  }
  
  @js.native
  object MDCTabBar extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialTabsLib.tabDashBarMod.MDCTabBar = js.native
  }
  
  @js.native
  object MDCTabBarFoundation extends js.Object {
    val cssClasses: atMaterialTabsLib.tabDashBarConstantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialTabsLib.tabDashBarAdapterMod.MDCTabBarAdapter = js.native
    val strings: atMaterialTabsLib.tabDashBarConstantsMod.strings = js.native
  }
  
  @js.native
  object MDCTabBarScroller extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialTabsLib.tabDashBarDashScrollerMod.MDCTabBarScroller = js.native
  }
  
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    val cssClasses: atMaterialTabsLib.tabDashBarDashScrollerConstantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialTabsLib.tabDashBarDashScrollerAdapterMod.MDCTabBarScrollerAdapter = js.native
    val strings: atMaterialTabsLib.tabDashBarDashScrollerConstantsMod.strings = js.native
  }
  
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: atMaterialTabsLib.tabConstantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialTabsLib.tabAdapterMod.MDCTabAdapter = js.native
    val strings: atMaterialTabsLib.tabConstantsMod.strings = js.native
  }
  
}

