package typings.materialTabBar

import typings.materialBase.componentMod.MDCComponent
import typings.materialTab.componentMod.MDCTabFactory
import typings.materialTabBar.foundationMod.MDCTabBarFoundation
import typings.materialTabScroller.componentMod.MDCTabScrollerFactory
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tab-bar/component", "MDCTabBar")
  @js.native
  class MDCTabBar protected () extends MDCComponent[MDCTabBarFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCTabBarFoundation, args: js.Any*) = this()
    
    /**
      * Activates the tab at the given index
      * @param index The index of the tab
      */
    def activateTab(index: Double): Unit = js.native
    
    def focusOnActivate_=(focusOnActivate: Boolean): Unit = js.native
    
    def initialize(): Unit = js.native
    def initialize(tabFactory: Unit, tabScrollerFactory: MDCTabScrollerFactory): Unit = js.native
    def initialize(tabFactory: MDCTabFactory): Unit = js.native
    def initialize(tabFactory: MDCTabFactory, tabScrollerFactory: MDCTabScrollerFactory): Unit = js.native
    
    /**
      * Scrolls the tab at the given index into view
      * @param index THe index of the tab
      */
    def scrollIntoView(index: Double): Unit = js.native
    
    def useAutomaticActivation_=(useAutomaticActivation: Boolean): Unit = js.native
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tab-bar/component", "MDCTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): MDCTabBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTabBar]
  }
}
