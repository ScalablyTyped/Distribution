package typings.atMaterialTabs

import typings.atMaterialTabs.tabDashBarDashScrollerAdapterMod.MDCTabBarScrollerAdapter
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar-scroller/foundation", JSImport.Namespace)
@js.native
object tabDashBarDashScrollerFoundationMod extends js.Object {
  @js.native
  trait MDCTabBarScrollerFoundation
    extends typings.atMaterialBase.foundationMod.default[MDCTabBarScrollerAdapter] {
    def layout(): Unit = js.native
    def scrollBack(): Unit = js.native
    def scrollBack(evt: Event): Unit = js.native
    def scrollForward(): Unit = js.native
    def scrollForward(evt: Event): Unit = js.native
    def scrollToTabAtIndex(index: Double): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTabBarScrollerFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialTabs.tabDashBarDashScrollerConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    val strings: typings.atMaterialTabs.tabDashBarDashScrollerConstantsMod.strings = js.native
  }
  
}

