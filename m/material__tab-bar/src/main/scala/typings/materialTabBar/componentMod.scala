package typings.materialTabBar

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialTab.componentMod.MDCTabFactory
import typings.materialTabBar.foundationMod.MDCTabBarFoundation
import typings.materialTabScroller.componentMod.MDCTabScrollerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tab-bar/component", "MDCTabBar")
  @js.native
  open class MDCTabBar protected () extends MDCComponent[MDCTabBarFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTabBarFoundation, args: Any*) = this()
    
    /**
      * Activates the tab at the given index
      * @param index The index of the tab
      */
    def activateTab(index: Double): Unit = js.native
    
    def focusOnActivate_=(focusOnActivate: Boolean): Unit = js.native
    
    /**
      * Returns all the tab elements in a nice clean array
      */
    /* private */ var getTabElements: Any = js.native
    
    /* private */ var handleKeyDown: Any = js.native
    
    /* private */ var handleTabInteraction: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(tabFactory: Unit, tabScrollerFactory: MDCTabScrollerFactory): Unit = js.native
    def initialize(tabFactory: MDCTabFactory): Unit = js.native
    def initialize(tabFactory: MDCTabFactory, tabScrollerFactory: MDCTabScrollerFactory): Unit = js.native
    
    /**
      * Instantiates tab components on all child tab elements
      */
    /* private */ var instantiateTabs: Any = js.native
    
    /**
      * Instantiates tab scroller component on the child tab scroller element
      */
    /* private */ var instantiatetabScroller: Any = js.native
    
    /**
      * Scrolls the tab at the given index into view
      * @param index THe index of the tab
      */
    def scrollIntoView(index: Double): Unit = js.native
    
    /* private */ var tabList: Any = js.native
    
    /* private */ var tabScroller: Any = js.native
    
    def useAutomaticActivation_=(useAutomaticActivation: Boolean): Unit = js.native
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tab-bar/component", "MDCTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCTabBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTabBar]
  }
}
