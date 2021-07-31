package typings.materialTabs

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTabs.anon.CHANGEEVENT
import typings.materialTabs.anon.PartialMDCTabBarAdapter
import typings.materialTabs.anon.UPGRADED
import typings.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarFoundationMod {
  
  @JSImport("@material/tabs/tab-bar/foundation", JSImport.Default)
  @js.native
  class default () extends MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/tabs/tab-bar/foundation", "default.cssClasses")
    @js.native
    val cssClasses: UPGRADED = js.native
    
    @JSImport("@material/tabs/tab-bar/foundation", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    @JSImport("@material/tabs/tab-bar/foundation", "default.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
  
  @JSImport("@material/tabs/tab-bar/foundation", "MDCTabBarFoundation")
  @js.native
  class MDCTabBarFoundation () extends MDCFoundation[MDCTabBarAdapter] {
    def this(adapter: PartialMDCTabBarAdapter) = this()
    
    def getActiveTabIndex(): Double = js.native
    
    def layout(): Unit = js.native
    
    def switchToTabAtIndex(index: Double, shouldNotify: Boolean): Unit = js.native
  }
  /* static members */
  object MDCTabBarFoundation {
    
    @JSImport("@material/tabs/tab-bar/foundation", "MDCTabBarFoundation.cssClasses")
    @js.native
    val cssClasses: UPGRADED = js.native
    
    @JSImport("@material/tabs/tab-bar/foundation", "MDCTabBarFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    @JSImport("@material/tabs/tab-bar/foundation", "MDCTabBarFoundation.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
}
