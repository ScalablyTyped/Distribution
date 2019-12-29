package typings.atMaterialTabDashScroller

import typings.atMaterialBase.componentMod.MDCComponent
import typings.atMaterialBase.foundationMod.default
import typings.atMaterialTabDashScroller.foundationMod.MDCTabScrollerFoundation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab-scroller/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCTabScroller () extends MDCComponent[MDCTabScrollerFoundation, default[MDCTabScrollerFoundation]] {
    /**
      * Returns the width of the scroll content
      */
    def getScrollContentWidth(): Double = js.native
    /**
      * Returns the current visual scroll position
      */
    def getScrollPosition(): Double = js.native
    /**
      * Increments the scroll value by the given amount
      * @param scrollXIncrement The pixel value by which to increment the scroll value
      */
    def incrementScroll(scrollXIncrement: Double): Unit = js.native
    def initialize(): Unit = js.native
    /**
      * Scrolls to the given pixel position
      * @param scrollX The pixel value to scroll to
      */
    def scrollTo(scrollX: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabScroller extends js.Object {
    def attachTo(root: Element): MDCTabScroller = js.native
  }
  
  type MDCTabScrollerFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTabScrollerFoundation], 
    MDCTabScroller
  ]
}

