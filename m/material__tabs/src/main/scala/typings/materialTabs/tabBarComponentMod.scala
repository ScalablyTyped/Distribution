package typings.materialTabs

import typings.materialBase.componentMod.MDCComponent
import typings.materialTabs.tabBarFoundationMod.MDCTabBarFoundation
import typings.materialTabs.tabComponentMod.MDCTab
import typings.materialTabs.tabComponentMod.MDCTabFactory
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab-bar/component", JSImport.Namespace)
@js.native
object tabBarComponentMod extends js.Object {
  
  @js.native
  class MDCTabBar () extends MDCComponent[MDCTabBarFoundation] {
    
    var activeTab: MDCTab = js.native
    
    var activeTabIndex: Double = js.native
    
    def initialize(): Unit = js.native
    def initialize(tabFactory: MDCTabFactory): Unit = js.native
    
    def layout(): Unit = js.native
    
    var root_ : HTMLElement = js.native
    
    val tabs: js.Array[MDCTab] = js.native
  }
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    
    def attachTo(root: Element): MDCTabBar = js.native
  }
  
  type MDCTabBarFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCTabBarFoundation], MDCTabBar]
}
