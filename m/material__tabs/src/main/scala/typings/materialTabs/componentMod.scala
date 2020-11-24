package typings.materialTabs

import typings.materialBase.componentMod.MDCComponent
import typings.materialTabs.foundationMod.MDCTabBarScrollerFoundation
import typings.materialTabs.tabBarComponentMod.MDCTabBar
import typings.materialTabs.tabBarComponentMod.MDCTabBarFactory
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab-bar-scroller/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCTabBarScroller () extends MDCComponent[MDCTabBarScrollerFoundation] {
    
    def initialize(): Unit = js.native
    def initialize(tabBarFactory: MDCTabBarFactory): Unit = js.native
    
    def layout(): Unit = js.native
    
    var root_ : HTMLElement = js.native
    
    val tabBar: MDCTabBar = js.native
  }
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    
    def attachTo(root: Element): MDCTabBarScroller = js.native
  }
}
