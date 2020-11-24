package typings.materialTabs

import typings.materialTabs.adapterMod.MDCTabBarScrollerAdapter
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
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCTab ()
    extends typings.materialTabs.tabIndexMod.MDCTab
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    
    def attachTo(root: Element): typings.materialTabs.tabComponentMod.MDCTab = js.native
  }
  
  @js.native
  class MDCTabBar ()
    extends typings.materialTabs.tabBarIndexMod.MDCTabBar
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    
    def attachTo(root: Element): typings.materialTabs.tabBarComponentMod.MDCTabBar = js.native
  }
  
  @js.native
  class MDCTabBarFoundation ()
    extends typings.materialTabs.tabBarIndexMod.MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    
    val cssClasses: UPGRADED = js.native
    
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    val strings: CHANGEEVENT = js.native
  }
  
  @js.native
  class MDCTabBarScroller ()
    extends typings.materialTabs.indexMod.MDCTabBarScroller
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    
    def attachTo(root: Element): typings.materialTabs.componentMod.MDCTabBarScroller = js.native
  }
  
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends typings.materialTabs.indexMod.MDCTabBarScrollerFoundation {
    def this(adapter: PartialMDCTabBarScrollerA) = this()
  }
  /* static members */
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    
    val cssClasses: INDICATORBACK = js.native
    
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    
    val strings: FRAMESELECTOR = js.native
  }
  
  @js.native
  class MDCTabFoundation ()
    extends typings.materialTabs.tabIndexMod.MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    
    val cssClasses: ACTIVE = js.native
    
    val defaultAdapter: MDCTabAdapter = js.native
    
    val strings: SELECTEDEVENT = js.native
  }
  
  @js.native
  object tabBarCssClasses extends js.Object {
    
    var UPGRADED: String = js.native
  }
  
  @js.native
  object tabBarScrollerCssClasses extends js.Object {
    
    var INDICATOR_BACK: String = js.native
    
    var INDICATOR_ENABLED: String = js.native
    
    var INDICATOR_FORWARD: String = js.native
    
    var TAB: String = js.native
  }
  
  @js.native
  object tabBarScrollerStrings extends js.Object {
    
    var FRAME_SELECTOR: String = js.native
    
    var INDICATOR_BACK_SELECTOR: String = js.native
    
    var INDICATOR_FORWARD_SELECTOR: String = js.native
    
    var TABS_SELECTOR: String = js.native
    
    var TAB_SELECTOR: String = js.native
  }
  
  @js.native
  object tabBarStrings extends js.Object {
    
    var CHANGE_EVENT: String = js.native
    
    var INDICATOR_SELECTOR: String = js.native
    
    var TAB_SELECTOR: String = js.native
  }
  
  @js.native
  object tabCssClasses extends js.Object {
    
    var ACTIVE: String = js.native
  }
  
  @js.native
  object tabStrings extends js.Object {
    
    var SELECTED_EVENT: String = js.native
  }
}
