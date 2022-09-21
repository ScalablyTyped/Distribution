package typings.materialTooltip

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTooltip.anon.WithCaretPos
import typings.materialTooltip.constantsMod.AnchorBoundaryType
import typings.materialTooltip.foundationMod.MDCTooltipFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tooltip/component", "MDCTooltip")
  @js.native
  open class MDCTooltip protected () extends MDCComponent[MDCTooltipFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTooltipFoundation, args: Any*) = this()
    
    /* private */ var anchorElem: Any = js.native
    
    /**
      * Method that allows user to specify additional elements that should have a
      * scroll event listener attached to it. This should be used in instances
      * where the anchor element is placed inside a scrollable container (that is
      * not the body element), and will ensure that the tooltip will stay attached
      * to the anchor on scroll.
      */
    def attachScrollHandler(
      addEventListenerFn: js.Function2[/* event */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
    ): Unit = js.native
    
    /* private */ var handleClick: Any = js.native
    
    /* private */ var handleFocus: Any = js.native
    
    /* private */ var handleMouseEnter: Any = js.native
    
    /* private */ var handleMouseLeave: Any = js.native
    
    /* private */ var handleTouchend: Any = js.native
    
    /* private */ var handleTouchstart: Any = js.native
    
    /* private */ var handleTransitionEnd: Any = js.native
    
    def hide(): Unit = js.native
    
    def initialize(): Unit = js.native
    
    def isShown(): Boolean = js.native
    
    /* private */ var isTooltipPersistent: Any = js.native
    
    /* private */ var isTooltipRich: Any = js.native
    
    /**
      * Must be used in conjunction with #attachScrollHandler. Removes the scroll
      * event handler from elements on the page.
      */
    def removeScrollHandler(
      removeEventHandlerFn: js.Function2[/* event */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
    ): Unit = js.native
    
    def setAnchorBoundaryType(`type`: AnchorBoundaryType): Unit = js.native
    
    def setHideDelay(delayMs: Double): Unit = js.native
    
    def setShowDelay(delayMs: Double): Unit = js.native
    
    def setTooltipPosition(position: WithCaretPos): Unit = js.native
  }
  /* static members */
  object MDCTooltip {
    
    @JSImport("@material/tooltip/component", "MDCTooltip")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCTooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTooltip]
  }
}
