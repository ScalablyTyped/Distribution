package typings.materialTabScroller

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTabScroller.adapterMod.MDCTabScrollerAdapter
import typings.materialTabScroller.anon.PartialMDCTabScrollerAdap
import typings.materialTabScroller.rtlScrollerMod.MDCTabScrollerRTL
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/tab-scroller/foundation", JSImport.Default)
  @js.native
  class default () extends MDCTabScrollerFoundation {
    def this(adapter: PartialMDCTabScrollerAdap) = this()
  }
  
  @JSImport("@material/tab-scroller/foundation", "MDCTabScrollerFoundation")
  @js.native
  class MDCTabScrollerFoundation () extends MDCFoundation[MDCTabScrollerAdapter] {
    def this(adapter: PartialMDCTabScrollerAdap) = this()
    
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
      * Scrolls to the given scrollX value
      */
    def scrollTo(scrollX: Double): Unit = js.native
  }
}
