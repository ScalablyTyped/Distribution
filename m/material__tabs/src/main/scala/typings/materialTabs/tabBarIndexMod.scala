package typings.materialTabs

import typings.materialTabs.anon.CHANGEEVENT
import typings.materialTabs.anon.PartialMDCTabBarAdapter
import typings.materialTabs.anon.UPGRADED
import typings.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarIndexMod {
  
  @JSImport("@material/tabs/tab-bar/index", "MDCTabBar")
  @js.native
  class MDCTabBar protected ()
    extends typings.materialTabs.tabBarComponentMod.MDCTabBar {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTabs.tabBarFoundationMod.MDCTabBarFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tabs/tab-bar/index", "MDCTabBar.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialTabs.tabBarComponentMod.MDCTabBar = js.native
  }
  
  @JSImport("@material/tabs/tab-bar/index", "MDCTabBarFoundation")
  @js.native
  class MDCTabBarFoundation ()
    extends typings.materialTabs.tabBarFoundationMod.MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  object MDCTabBarFoundation {
    
    @JSImport("@material/tabs/tab-bar/index", "MDCTabBarFoundation.cssClasses")
    @js.native
    val cssClasses: UPGRADED = js.native
    
    @JSImport("@material/tabs/tab-bar/index", "MDCTabBarFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    @JSImport("@material/tabs/tab-bar/index", "MDCTabBarFoundation.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
  
  object tabBarCssClasses {
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarCssClasses.UPGRADED")
    @js.native
    def UPGRADED: String = js.native
    @scala.inline
    def UPGRADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPGRADED")(x.asInstanceOf[js.Any])
  }
  
  object tabBarStrings {
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings.CHANGE_EVENT")
    @js.native
    def CHANGE_EVENT: String = js.native
    @scala.inline
    def CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings.INDICATOR_SELECTOR")
    @js.native
    def INDICATOR_SELECTOR: String = js.native
    @scala.inline
    def INDICATOR_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings.TAB_SELECTOR")
    @js.native
    def TAB_SELECTOR: String = js.native
    @scala.inline
    def TAB_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
