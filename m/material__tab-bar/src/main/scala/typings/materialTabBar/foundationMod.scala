package typings.materialTabBar

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTab.typesMod.MDCTabInteractionEvent
import typings.materialTabBar.adapterMod.MDCTabBarAdapter
import typings.materialTabBar.anon.PartialMDCTabBarAdapter
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/tab-bar/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  
  @JSImport("@material/tab-bar/foundation", "MDCTabBarFoundation")
  @js.native
  open class MDCTabBarFoundation () extends MDCFoundation[MDCTabBarAdapter] {
    def this(adapter: PartialMDCTabBarAdapter) = this()
    
    def activateTab(index: Double): Unit = js.native
    
    /**
      * Calculates the scroll increment that will make the tab at the given index visible
      * @param index The index of the tab
      * @param nextIndex The index of the next tab
      * @param scrollPosition The current scroll position
      * @param barWidth The width of the Tab Bar
      */
    /* private */ var calculateScrollIncrement: Any = js.native
    
    /**
      * Calculates the scroll increment that will make the tab at the given index visible in RTL
      * @param index The index of the tab
      * @param nextIndex The index of the next tab
      * @param scrollPosition The current scroll position
      * @param barWidth The width of the Tab Bar
      * @param scrollContentWidth The width of the scroll content
      */
    /* private */ var calculateScrollIncrementRTL: Any = js.native
    
    /**
      * Private method for determining the index of the destination tab based on what key was pressed
      * @param origin The original index from which to determine the destination
      * @param key The name of the key
      */
    /* private */ var determineTargetFromKey: Any = js.native
    
    /**
      * Determines the index of the adjacent tab closest to either edge of the Tab Bar
      * @param index The index of the tab
      * @param tabDimensions The dimensions of the tab
      * @param scrollPosition The current scroll position
      * @param barWidth The width of the tab bar
      */
    /* private */ var findAdjacentTabIndexClosestToEdge: Any = js.native
    
    /**
      * Determines the index of the adjacent tab closest to either edge of the Tab Bar in RTL
      * @param index The index of the tab
      * @param tabDimensions The dimensions of the tab
      * @param scrollPosition The current scroll position
      * @param barWidth The width of the tab bar
      * @param scrollContentWidth The width of the scroller content
      */
    /* private */ var findAdjacentTabIndexClosestToEdgeRTL: Any = js.native
    
    /**
      * Returns the key associated with a keydown event
      * @param evt The keydown event
      */
    /* private */ var getKeyFromEvent: Any = js.native
    
    def handleKeyDown(evt: KeyboardEvent): Unit = js.native
    
    /**
      * Handles the MDCTab:interacted event
      */
    def handleTabInteraction(evt: MDCTabInteractionEvent): Unit = js.native
    
    /**
      * Returns whether a given index is inclusively between the ends
      * @param index The index to test
      */
    /* private */ var indexIsInRange: Any = js.native
    
    /* private */ var isActivationKey: Any = js.native
    
    /**
      * Returns the view's RTL property
      */
    /* private */ var isRTL: Any = js.native
    
    /**
      * Scrolls the tab at the given index into view
      * @param index The tab index to make visible
      */
    def scrollIntoView(index: Double): Unit = js.native
    
    /**
      * Scrolls the tab at the given index into view for left-to-right user agents.
      * @param index The index of the tab to scroll into view
      */
    /* private */ var scrollIntoViewImpl: Any = js.native
    
    /**
      * Scrolls the tab at the given index into view in RTL
      * @param index The tab index to make visible
      */
    /* private */ var scrollIntoViewImplRTL: Any = js.native
    
    /**
      * Switches between automatic and manual activation modes.
      * See https://www.w3.org/TR/wai-aria-practices/#tabpanel for examples.
      */
    def setUseAutomaticActivation(useAutomaticActivation: Boolean): Unit = js.native
    
    /* private */ var useAutomaticActivation: Any = js.native
  }
}
