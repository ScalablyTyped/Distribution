package typings.materialTabScroller

import typings.materialBase.componentMod.MDCComponent
import typings.materialTabScroller.foundationMod.MDCTabScrollerFoundation
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tab-scroller/component", "MDCTabScroller")
  @js.native
  class MDCTabScroller protected () extends MDCComponent[MDCTabScrollerFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCTabScrollerFoundation, args: js.Any*) = this()
    
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
  object MDCTabScroller {
    
    @JSImport("@material/tab-scroller/component", "MDCTabScroller.attachTo")
    @js.native
    def attachTo(root: Element): MDCTabScroller = js.native
  }
  
  type MDCTabScrollerFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTabScrollerFoundation], 
    MDCTabScroller
  ]
}
