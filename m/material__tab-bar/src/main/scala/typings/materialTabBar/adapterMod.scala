package typings.materialTabBar

import typings.materialTab.typesMod.MDCTabDimensions
import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCTabBarAdapter extends StObject {
    
    /**
      * Activates the tab at the given index with the given client rect
      * @param index The index of the tab to activate
      * @param clientRect The client rect of the previously active Tab Indicator
      */
    def activateTabAtIndex(index: Double): Unit = js.native
    def activateTabAtIndex(index: Double, clientRect: ClientRect): Unit = js.native
    
    /**
      * Deactivates the tab at the given index
      * @param index The index of the tab to deactivate
      */
    def deactivateTabAtIndex(index: Double): Unit = js.native
    
    /**
      * Focuses the tab at the given index
      * @param index The index of the tab to focus
      */
    def focusTabAtIndex(index: Double): Unit = js.native
    
    /**
      * Returns the index of the focused tab
      */
    def getFocusedTabIndex(): Double = js.native
    
    /**
      * Returns the index of the given tab
      * @param id The ID of the tab whose index to determine
      */
    def getIndexOfTabById(id: String): Double = js.native
    
    /**
      * Returns the root element's offsetWidth
      */
    def getOffsetWidth(): Double = js.native
    
    /**
      * Returns the index of the previously active tab
      */
    def getPreviousActiveTabIndex(): Double = js.native
    
    /**
      * Returns the width of the scroll content
      */
    def getScrollContentWidth(): Double = js.native
    
    /**
      * Returns the current scroll position
      */
    def getScrollPosition(): Double = js.native
    
    /**
      * Returns the tab dimensions of the tab at the given index
      * @param index The index of the tab
      */
    def getTabDimensionsAtIndex(index: Double): MDCTabDimensions = js.native
    
    /**
      * Returns the client rect of the tab's indicator
      * @param index The index of the tab
      */
    def getTabIndicatorClientRectAtIndex(index: Double): ClientRect = js.native
    
    /**
      * Returns the length of the tab list
      */
    def getTabListLength(): Double = js.native
    
    /**
      * Increments the current scroll position by the given amount
      * @param scrollXIncrement The amount to increment scroll
      */
    def incrementScroll(scrollXIncrement: Double): Unit = js.native
    
    /**
      * Returns if the Tab Bar language direction is RTL
      */
    def isRTL(): Boolean = js.native
    
    /**
      * Emits the MDCTabBar:activated event
      * @param index The index of the activated tab
      */
    def notifyTabActivated(index: Double): Unit = js.native
    
    /**
      * Scrolls to the given position
      * @param scrollX The position to scroll to
      */
    def scrollTo(scrollX: Double): Unit = js.native
    
    /**
      * Sets the tab at the given index to be activated
      * @param index The index of the tab to activate
      */
    def setActiveTab(index: Double): Unit = js.native
  }
}
