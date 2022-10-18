package typings.materialTabs

import typings.materialBase.Element
import typings.materialTabs.anon.ACTIVE
import typings.materialTabs.anon.CHANGEEVENT
import typings.materialTabs.anon.FRAMESELECTOR
import typings.materialTabs.anon.INDICATORBACK
import typings.materialTabs.anon.PartialMDCTabAdapter
import typings.materialTabs.anon.PartialMDCTabBarAdapter
import typings.materialTabs.anon.PartialMDCTabBarScrollerA
import typings.materialTabs.anon.SELECTEDEVENT
import typings.materialTabs.anon.UPGRADED
import typings.materialTabs.tabAdapterMod.MDCTabAdapter
import typings.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import typings.materialTabs.tabBarScrollerAdapterMod.MDCTabBarScrollerAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/tabs", JSImport.Default)
  @js.native
  open class default ()
    extends typings.materialTabs.tabBarScrollerIndexMod.default {
    def this(adapter: PartialMDCTabBarScrollerA) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/tabs", "default.cssClasses")
    @js.native
    val cssClasses: INDICATORBACK = js.native
    
    @JSImport("@material/tabs", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    
    @JSImport("@material/tabs", "default.strings")
    @js.native
    val strings: FRAMESELECTOR = js.native
  }
  
  @JSImport("@material/tabs", "MDCTab")
  @js.native
  open class MDCTab protected ()
    extends typings.materialTabs.tabIndexMod.MDCTab {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialTabs.tabFoundationMod.MDCTabFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCTab {
    
    @JSImport("@material/tabs", "MDCTab")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTabs.tabComponentMod.MDCTab = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTabs.tabComponentMod.MDCTab]
  }
  
  @JSImport("@material/tabs", "MDCTabBar")
  @js.native
  open class MDCTabBar protected ()
    extends typings.materialTabs.tabBarIndexMod.MDCTabBar {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTabs.tabBarFoundationMod.MDCTabBarFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tabs", "MDCTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTabs.tabBarComponentMod.MDCTabBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTabs.tabBarComponentMod.MDCTabBar]
  }
  
  @JSImport("@material/tabs", "MDCTabBarFoundation")
  @js.native
  open class MDCTabBarFoundation ()
    extends typings.materialTabs.tabBarIndexMod.MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  object MDCTabBarFoundation {
    
    @JSImport("@material/tabs", "MDCTabBarFoundation.cssClasses")
    @js.native
    val cssClasses: UPGRADED = js.native
    
    @JSImport("@material/tabs", "MDCTabBarFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    @JSImport("@material/tabs", "MDCTabBarFoundation.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
  
  @JSImport("@material/tabs", "MDCTabBarScroller")
  @js.native
  open class MDCTabBarScroller protected ()
    extends typings.materialTabs.tabBarScrollerIndexMod.MDCTabBarScroller {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTabs.tabBarScrollerFoundationMod.MDCTabBarScrollerFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTabBarScroller {
    
    @JSImport("@material/tabs", "MDCTabBarScroller")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTabs.tabBarScrollerComponentMod.MDCTabBarScroller = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTabs.tabBarScrollerComponentMod.MDCTabBarScroller]
  }
  
  @JSImport("@material/tabs", "MDCTabBarScrollerFoundation")
  @js.native
  open class MDCTabBarScrollerFoundation ()
    extends typings.materialTabs.tabBarScrollerIndexMod.MDCTabBarScrollerFoundation {
    def this(adapter: PartialMDCTabBarScrollerA) = this()
  }
  /* static members */
  object MDCTabBarScrollerFoundation {
    
    @JSImport("@material/tabs", "MDCTabBarScrollerFoundation.cssClasses")
    @js.native
    val cssClasses: INDICATORBACK = js.native
    
    @JSImport("@material/tabs", "MDCTabBarScrollerFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    
    @JSImport("@material/tabs", "MDCTabBarScrollerFoundation.strings")
    @js.native
    val strings: FRAMESELECTOR = js.native
  }
  
  @JSImport("@material/tabs", "MDCTabFoundation")
  @js.native
  open class MDCTabFoundation ()
    extends typings.materialTabs.tabIndexMod.MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  /* static members */
  object MDCTabFoundation {
    
    @JSImport("@material/tabs", "MDCTabFoundation.cssClasses")
    @js.native
    val cssClasses: ACTIVE = js.native
    
    @JSImport("@material/tabs", "MDCTabFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabAdapter = js.native
    
    @JSImport("@material/tabs", "MDCTabFoundation.strings")
    @js.native
    val strings: SELECTEDEVENT = js.native
  }
  
  object tabBarCssClasses {
    
    @JSImport("@material/tabs", "tabBarCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabBarCssClasses.UPGRADED")
    @js.native
    def UPGRADED: String = js.native
    inline def UPGRADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPGRADED")(x.asInstanceOf[js.Any])
  }
  
  object tabBarScrollerCssClasses {
    
    @JSImport("@material/tabs", "tabBarScrollerCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabBarScrollerCssClasses.INDICATOR_BACK")
    @js.native
    def INDICATOR_BACK: String = js.native
    inline def INDICATOR_BACK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_BACK")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerCssClasses.INDICATOR_ENABLED")
    @js.native
    def INDICATOR_ENABLED: String = js.native
    inline def INDICATOR_ENABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_ENABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerCssClasses.INDICATOR_FORWARD")
    @js.native
    def INDICATOR_FORWARD: String = js.native
    inline def INDICATOR_FORWARD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_FORWARD")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerCssClasses.TAB")
    @js.native
    def TAB: String = js.native
    inline def TAB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB")(x.asInstanceOf[js.Any])
  }
  
  object tabBarScrollerStrings {
    
    @JSImport("@material/tabs", "tabBarScrollerStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabBarScrollerStrings.FRAME_SELECTOR")
    @js.native
    def FRAME_SELECTOR: String = js.native
    inline def FRAME_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAME_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerStrings.INDICATOR_BACK_SELECTOR")
    @js.native
    def INDICATOR_BACK_SELECTOR: String = js.native
    inline def INDICATOR_BACK_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_BACK_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerStrings.INDICATOR_FORWARD_SELECTOR")
    @js.native
    def INDICATOR_FORWARD_SELECTOR: String = js.native
    inline def INDICATOR_FORWARD_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_FORWARD_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerStrings.TABS_SELECTOR")
    @js.native
    def TABS_SELECTOR: String = js.native
    inline def TABS_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TABS_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerStrings.TAB_SELECTOR")
    @js.native
    def TAB_SELECTOR: String = js.native
    inline def TAB_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object tabBarStrings {
    
    @JSImport("@material/tabs", "tabBarStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabBarStrings.CHANGE_EVENT")
    @js.native
    def CHANGE_EVENT: String = js.native
    inline def CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarStrings.INDICATOR_SELECTOR")
    @js.native
    def INDICATOR_SELECTOR: String = js.native
    inline def INDICATOR_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarStrings.TAB_SELECTOR")
    @js.native
    def TAB_SELECTOR: String = js.native
    inline def TAB_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object tabCssClasses {
    
    @JSImport("@material/tabs", "tabCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabCssClasses.ACTIVE")
    @js.native
    def ACTIVE: String = js.native
    inline def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
  }
  
  object tabStrings {
    
    @JSImport("@material/tabs", "tabStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabStrings.SELECTED_EVENT")
    @js.native
    def SELECTED_EVENT: String = js.native
    inline def SELECTED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_EVENT")(x.asInstanceOf[js.Any])
  }
}
