package typings.materialTabs

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typings.materialTabs.anon.FRAMESELECTOR
import typings.materialTabs.anon.INDICATORBACK
import typings.materialTabs.anon.PartialMDCTabBarScrollerA
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/tabs/tab-bar-scroller/foundation", JSImport.Default)
  @js.native
  class default () extends MDCTabBarScrollerFoundation {
    def this(adapter: PartialMDCTabBarScrollerA) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/tabs/tab-bar-scroller/foundation", "default.cssClasses")
    @js.native
    val cssClasses: INDICATORBACK = js.native
    
    @JSImport("@material/tabs/tab-bar-scroller/foundation", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    
    @JSImport("@material/tabs/tab-bar-scroller/foundation", "default.strings")
    @js.native
    val strings: FRAMESELECTOR = js.native
  }
  
  @JSImport("@material/tabs/tab-bar-scroller/foundation", "MDCTabBarScrollerFoundation")
  @js.native
  class MDCTabBarScrollerFoundation () extends MDCFoundation[MDCTabBarScrollerAdapter] {
    def this(adapter: PartialMDCTabBarScrollerA) = this()
    
    def layout(): Unit = js.native
    
    def scrollBack(): Unit = js.native
    def scrollBack(evt: MouseEvent): Unit = js.native
    
    def scrollForward(): Unit = js.native
    def scrollForward(evt: MouseEvent): Unit = js.native
    
    def scrollToTabAtIndex(index: Double): Unit = js.native
  }
  /* static members */
  object MDCTabBarScrollerFoundation {
    
    @JSImport("@material/tabs/tab-bar-scroller/foundation", "MDCTabBarScrollerFoundation.cssClasses")
    @js.native
    val cssClasses: INDICATORBACK = js.native
    
    @JSImport("@material/tabs/tab-bar-scroller/foundation", "MDCTabBarScrollerFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    
    @JSImport("@material/tabs/tab-bar-scroller/foundation", "MDCTabBarScrollerFoundation.strings")
    @js.native
    val strings: FRAMESELECTOR = js.native
  }
}
