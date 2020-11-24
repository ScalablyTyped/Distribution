package typings.materialTabs

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTabs.anon.CHANGEEVENT
import typings.materialTabs.anon.PartialMDCTabBarAdapter
import typings.materialTabs.anon.UPGRADED
import typings.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab-bar/foundation", JSImport.Namespace)
@js.native
object tabBarFoundationMod extends js.Object {
  
  @js.native
  class MDCTabBarFoundation () extends MDCFoundation[MDCTabBarAdapter] {
    def this(adapter: PartialMDCTabBarAdapter) = this()
    
    def getActiveTabIndex(): Double = js.native
    
    def layout(): Unit = js.native
    
    def switchToTabAtIndex(index: Double, shouldNotify: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    
    val cssClasses: UPGRADED = js.native
    
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    val strings: CHANGEEVENT = js.native
  }
  
  @js.native
  class default () extends MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    val cssClasses: UPGRADED = js.native
    
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    val strings: CHANGEEVENT = js.native
  }
}
