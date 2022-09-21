package typings.materialTabScroller

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTabScroller.adapterMod.MDCTabScrollerAdapter
import typings.materialTabScroller.anon.PartialMDCTabScrollerAdap
import typings.materialTabScroller.rtlScrollerMod.MDCTabScrollerRTL
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/tab-scroller/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCTabScrollerFoundation {
    def this(adapter: PartialMDCTabScrollerAdap) = this()
  }
  
  @JSImport("@material/tab-scroller/foundation", "MDCTabScrollerFoundation")
  @js.native
  open class MDCTabScrollerFoundation () extends MDCFoundation[MDCTabScrollerAdapter] {
    def this(adapter: PartialMDCTabScrollerAdap) = this()
    
    /**
      * Animates the tab scrolling
      * @param animation The animation to apply
      */
    /* private */ var animate: Any = js.native
    
    /**
      * @return translateX value from a CSS matrix transform function string.
      */
    /* private */ var calculateCurrentTranslateX: Any = js.native
    
    /* private */ var calculateScrollEdges: Any = js.native
    
    /**
      * Calculates a safe scroll value that is > 0 and < the max scroll value
      * @param scrollX The distance to scroll
      */
    /* private */ var clampScrollValue: Any = js.native
    
    /* private */ var computeCurrentScrollPositionRTL: Any = js.native
    
    /**
      * Gets the current scroll position during animation
      */
    /* private */ var getAnimatingScrollPosition: Any = js.native
    
    /**
      * Internal method to compute the increment scroll operation values.
      * @param scrollX The desired scroll position increment
      * @return MDCTabScrollerAnimation with the sanitized values for performing the scroll operation.
      */
    /* private */ var getIncrementScrollOperation: Any = js.native
    
    /**
      * @return Browser-specific {@link MDCTabScrollerRTL} instance.
      */
    def getRTLScroller(): MDCTabScrollerRTL = js.native
    
    /**
      * Computes the current visual scroll position
      */
    def getScrollPosition(): Double = js.native
    
    /**
      * Handles interaction events that occur during transition
      */
    def handleInteraction(): Unit = js.native
    
    /**
      * Handles the transitionend event
      */
    def handleTransitionEnd(evt: Event): Unit = js.native
    
    /**
      * Increment the scroll value by the scrollXIncrement using animation.
      * @param scrollXIncrement The value by which to increment the scroll position
      */
    def incrementScroll(scrollXIncrement: Double): Unit = js.native
    
    /**
      * Increment the scroll value by the scrollXIncrement without animation.
      * @param scrollXIncrement The value by which to increment the scroll position
      */
    def incrementScrollImmediate(scrollXIncrement: Double): Unit = js.native
    
    /**
      * Controls whether we should handle the transitionend and interaction events during the animation.
      */
    /* private */ var isAnimating: Any = js.native
    
    /* private */ var isRTL: Any = js.native
    
    /**
      * Determines the RTL Scroller to use
      */
    /* private */ var rtlScrollerFactory: Any = js.native
    
    /**
      * The MDCTabScrollerRTL instance varies per browser and allows us to encapsulate the peculiar browser behavior
      * of RTL scrolling in it's own class.
      */
    /* private */ var rtlScrollerInstance: Any = js.native
    
    /**
      * Scrolls to the given scrollX value
      */
    def scrollTo(scrollX: Double): Unit = js.native
    
    /**
      * Internal scroll method
      * @param scrollX The new scroll position
      */
    /* private */ var scrollToImpl: Any = js.native
    
    /**
      * Internal RTL scroll method
      * @param scrollX The new scroll position
      */
    /* private */ var scrollToImplRTL: Any = js.native
    
    /**
      * Stops scroll animation
      */
    /* private */ var stopScrollAnimation: Any = js.native
  }
}
