package typings.atMaterialTabDashScroller

import typings.atMaterialBase.foundationMod.MDCFoundation
import typings.atMaterialTabDashScroller.adapterMod.MDCTabScrollerAdapter
import typings.atMaterialTabDashScroller.foundationMod.MDCTabScrollerFoundation
import typings.atMaterialTabDashScroller.rtlDashScrollerMod.MDCTabScrollerRTL
import typings.std.Event
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab-scroller/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCTabScrollerFoundation () extends MDCFoundation[MDCTabScrollerAdapter] {
    def this(adapter: Partial[MDCTabScrollerAdapter]) = this()
    // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
    /* CompleteClass */
    override def destroy(): Unit = js.native
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
      * Increment the scroll value by the scrollXIncrement
      * @param scrollXIncrement The value by which to increment the scroll position
      */
    def incrementScroll(scrollXIncrement: Double): Unit = js.native
    // Subclasses should override this method to perform initialization routines (registering events, etc.)
    /* CompleteClass */
    override def init(): Unit = js.native
    /**
      * Scrolls to the given scrollX value
      */
    def scrollTo(scrollX: Double): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTabScrollerFoundation {
    def this(adapter: Partial[MDCTabScrollerAdapter]) = this()
  }
  
  /* static members */
  @js.native
  object MDCTabScrollerFoundation extends js.Object {
    val cssClasses: Anon_ANIMATING = js.native
    val defaultAdapter: MDCTabScrollerAdapter = js.native
    val strings: Anon_AREASELECTOR = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: Anon_ANIMATING = js.native
    val defaultAdapter: MDCTabScrollerAdapter = js.native
    val strings: Anon_AREASELECTOR = js.native
  }
  
}

