package typings.materialTabs

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typings.materialTabs.anon.FRAMESELECTOR
import typings.materialTabs.anon.INDICATORBACK
import typings.materialTabs.anon.PartialMDCTabBarScrollerA
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab-bar-scroller/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
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
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    
    val cssClasses: INDICATORBACK = js.native
    
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    
    val strings: FRAMESELECTOR = js.native
  }
  
  @js.native
  class default () extends MDCTabBarScrollerFoundation {
    def this(adapter: PartialMDCTabBarScrollerA) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    val cssClasses: INDICATORBACK = js.native
    
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    
    val strings: FRAMESELECTOR = js.native
  }
}
