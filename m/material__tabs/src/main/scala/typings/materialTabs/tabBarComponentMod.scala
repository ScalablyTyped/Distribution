package typings.materialTabs

import typings.materialBase.componentMod.MDCComponent
import typings.materialTabs.tabBarFoundationMod.MDCTabBarFoundation
import typings.materialTabs.tabComponentMod.MDCTab
import typings.materialTabs.tabComponentMod.MDCTabFactory
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarComponentMod {
  
  @JSImport("@material/tabs/tab-bar/component", "MDCTabBar")
  @js.native
  class MDCTabBar protected () extends MDCComponent[MDCTabBarFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCTabBarFoundation, args: js.Any*) = this()
    
    var activeTab: MDCTab = js.native
    
    var activeTabIndex: Double = js.native
    
    def initialize(): Unit = js.native
    def initialize(tabFactory: MDCTabFactory): Unit = js.native
    
    def layout(): Unit = js.native
    
    var root_ : HTMLElement = js.native
    
    val tabs: js.Array[MDCTab] = js.native
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tabs/tab-bar/component", "MDCTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): MDCTabBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTabBar]
  }
  
  type MDCTabBarFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCTabBarFoundation], MDCTabBar]
}
