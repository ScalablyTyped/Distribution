package typings.atMaterialTabs

import typings.atMaterialTabs.tabDashBarAdapterMod.MDCTabBarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar/foundation", JSImport.Namespace)
@js.native
object tabDashBarFoundationMod extends js.Object {
  @js.native
  trait MDCTabBarFoundation
    extends typings.atMaterialBase.foundationMod.default[MDCTabBarAdapter] {
    def getActiveTabIndex(): Double = js.native
    def layout(): Unit = js.native
    def switchToTabAtIndex(index: Double, shouldNotify: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTabBarFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialTabs.tabDashBarConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    val strings: typings.atMaterialTabs.tabDashBarConstantsMod.strings = js.native
  }
  
}

