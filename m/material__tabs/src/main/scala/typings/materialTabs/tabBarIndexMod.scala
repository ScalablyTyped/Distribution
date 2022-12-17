package typings.materialTabs

import typings.materialBase.Element
import typings.materialTabs.anon.CHANGEEVENT
import typings.materialTabs.anon.PartialMDCTabBarAdapter
import typings.materialTabs.anon.UPGRADED
import typings.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarIndexMod {
  
  @JSImport("@material/tabs/tab-bar/index", "MDCTabBar")
  @js.native
  open class MDCTabBar protected ()
    extends typings.materialTabs.tabBarComponentMod.MDCTabBar {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTabs.tabBarFoundationMod.MDCTabBarFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tabs/tab-bar/index", "MDCTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTabs.tabBarComponentMod.MDCTabBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTabs.tabBarComponentMod.MDCTabBar]
  }
  
  @JSImport("@material/tabs/tab-bar/index", "MDCTabBarFoundation")
  @js.native
  open class MDCTabBarFoundation ()
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
    inline def UPGRADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPGRADED")(x.asInstanceOf[js.Any])
  }
  
  object tabBarStrings {
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings.CHANGE_EVENT")
    @js.native
    def CHANGE_EVENT: String = js.native
    inline def CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings.INDICATOR_SELECTOR")
    @js.native
    def INDICATOR_SELECTOR: String = js.native
    inline def INDICATOR_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings.TAB_SELECTOR")
    @js.native
    def TAB_SELECTOR: String = js.native
    inline def TAB_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
