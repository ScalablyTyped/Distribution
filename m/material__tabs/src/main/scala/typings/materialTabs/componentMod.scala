package typings.materialTabs

import typings.materialBase.componentMod.MDCComponent
import typings.materialTabs.foundationMod.MDCTabBarScrollerFoundation
import typings.materialTabs.tabBarComponentMod.MDCTabBar
import typings.materialTabs.tabBarComponentMod.MDCTabBarFactory
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tabs/tab-bar-scroller/component", "MDCTabBarScroller")
  @js.native
  class MDCTabBarScroller protected () extends MDCComponent[MDCTabBarScrollerFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCTabBarScrollerFoundation, args: js.Any*) = this()
    
    def initialize(): Unit = js.native
    def initialize(tabBarFactory: MDCTabBarFactory): Unit = js.native
    
    def layout(): Unit = js.native
    
    var root_ : HTMLElement = js.native
    
    val tabBar: MDCTabBar = js.native
  }
  /* static members */
  object MDCTabBarScroller {
    
    @JSImport("@material/tabs/tab-bar-scroller/component", "MDCTabBarScroller")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): MDCTabBarScroller = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTabBarScroller]
  }
}
