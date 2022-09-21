package typings.materialTooltip

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTooltip.adapterMod.MDCTooltipAdapter
import typings.materialTooltip.anon.PartialMDCTooltipAdapter
import typings.materialTooltip.anon.WithCaretPos
import typings.materialTooltip.constantsMod.AnchorBoundaryType
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/tooltip/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCTooltipFoundation {
    def this(adapter: PartialMDCTooltipAdapter) = this()
  }
  
  @JSImport("@material/tooltip/foundation", "MDCTooltipFoundation")
  @js.native
  open class MDCTooltipFoundation () extends MDCFoundation[MDCTooltipAdapter] {
    def this(adapter: PartialMDCTooltipAdapter) = this()
    
    /* private */ val addAncestorScrollEventListeners: Any = js.native
    
    /* private */ val anchorBlurHandler: Any = js.native
    
    /* private */ var anchorGap: Any = js.native
    
    /* private */ var anchorRect: Any = js.native
    
    /* private */ val animFrame: Any = js.native
    
    /**
      * Method that allows user to specify additional elements that should have a
      * scroll event listener attached to it. This should be used in instances
      * where the anchor element is placed inside a scrollable container, and will
      * ensure that the tooltip will stay attached to the anchor on scroll.
      */
    def attachScrollHandler(
      addEventListenerFn: js.Function2[/* event */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
    ): Unit = js.native
    
    /**
      * Given a PositionWithCaret, determines the correct styles to position the
      * caret properly on the rich tooltip.
      */
    /* private */ var calculateCaretPositionOnTooltip: Any = js.native
    
    /**
      * Calculates the position of the tooltip. A tooltip will be placed beneath
      * the anchor element and aligned either with the 'start'/'end' edge of the
      * anchor element or the 'center'.
      *
      * Tooltip alignment is selected such that the tooltip maintains a threshold
      * distance away from the viewport (defaulting to 'center' alignment). If the
      * placement of the anchor prevents this threshold distance from being
      * maintained, the tooltip is positioned so that it does not collide with the
      * viewport.
      *
      * Users can specify an alignment, however, if this alignment results in the
      * tooltip colliding with the viewport, this specification is overwritten.
      */
    /* private */ var calculateTooltipStyles: Any = js.native
    
    /* private */ var calculateTooltipWithCaretStyles: Any = js.native
    
    /**
      * Calculates the `left` distance for the tooltip.
      * Returns the distance value and a string indicating the x-axis transform-
      * origin that should be used when animating the tooltip.
      */
    /* private */ var calculateXTooltipDistance: Any = js.native
    
    /* private */ var calculateXWithCaretDistanceOptions: Any = js.native
    
    /**
      * Calculates the `top` distance for the tooltip.
      * Returns the distance value and a string indicating the y-axis transform-
      * origin that should be used when animating the tooltip.
      */
    /* private */ var calculateYTooltipDistance: Any = js.native
    
    /* private */ var calculateYWithCaretDistanceOptions: Any = js.native
    
    /**
      * Returns the corresponding PositionWithCaret enum for the proivded
      * XPositionWithCaret and YPositionWithCaret enums. This mapping exists so our
      * public API accepts only PositionWithCaret enums (as all combinations of
      * XPositionWithCaret and YPositionWithCaret are not valid), but internally we
      * can calculate the X and Y positions of a rich tooltip with caret
      * separately.
      */
    /* private */ var caretPositionOptionsMapping: Any = js.native
    
    /* private */ var clearAllAnimationClasses: Any = js.native
    
    /* private */ var clearHideTimeout: Any = js.native
    
    /* private */ var clearShowTimeout: Any = js.native
    
    /**
      * Given a list of valid position options for a rich tooltip with caret,
      * returns the option that should be used.
      */
    /* private */ var determineTooltipWithCaretDistance: Any = js.native
    
    /**
      * Given the values for the horizontal alignments of the tooltip, calculates
      * which of these options would result in the tooltip maintaining the required
      * threshold distance vs which would result in the tooltip staying within the
      * viewport.
      *
      * A Set of values is returned holding the distances that would honor the
      * above requirements. Following the logic for determining the tooltip
      * position, if all alignments violate the threshold, then the returned Set
      * contains values that keep the tooltip within the viewport.
      */
    /* private */ var determineValidPositionOptions: Any = js.native
    
    /**
      * Given the values for above/below alignment of the tooltip, calculates
      * which of these options would result in the tooltip maintaining the required
      * threshold distance vs which would result in the tooltip staying within the
      * viewport.
      *
      * A Set of values is returned holding the distances that would honor the
      * above requirements. Following the logic for determining the tooltip
      * position, if all possible alignments violate the threshold, then the
      * returned Set contains values that keep the tooltip within the viewport.
      */
    /* private */ var determineValidYPositionOptions: Any = js.native
    
    /* private */ val documentClickHandler: Any = js.native
    
    /* private */ val documentKeydownHandler: Any = js.native
    
    /* private */ var frameId: Any = js.native
    
    /**
      * Method for generating a horizontal and vertical position for the tooltip if
      * all other calculated values are considered invalid. This would only happen
      * in situations of very small viewports/large tooltips.
      */
    /* private */ var generateBackupPositionOption: Any = js.native
    
    /* private */ var handleAnchorBlur: Any = js.native
    
    def handleAnchorClick(): Unit = js.native
    
    def handleAnchorFocus(evt: FocusEvent): Unit = js.native
    
    def handleAnchorMouseEnter(): Unit = js.native
    
    def handleAnchorMouseLeave(): Unit = js.native
    
    def handleAnchorTouchend(): Unit = js.native
    
    def handleAnchorTouchstart(): Unit = js.native
    
    def handleDocumentClick(evt: MouseEvent): Unit = js.native
    
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    /* private */ var handleRichTooltipFocusOut: Any = js.native
    
    /* private */ var handleTooltipMouseEnter: Any = js.native
    
    /* private */ var handleTooltipMouseLeave: Any = js.native
    
    def handleTransitionEnd(): Unit = js.native
    
    /**
      * On window resize or scroll, check the anchor position and size and
      * repostion tooltip if necessary.
      */
    /* private */ var handleWindowChangeEvent: Any = js.native
    
    /* private */ var handleWindowScrollEvent: Any = js.native
    
    /* private */ var hasCaret: Any = js.native
    
    def hide(): Unit = js.native
    
    /* private */ var hideDelayMs: Any = js.native
    
    /* private */ var hideTimeout: Any = js.native
    
    /* private */ var interactiveTooltip: Any = js.native
    
    def isPersistent(): Boolean = js.native
    
    def isRich(): Boolean = js.native
    
    def isShown(): Boolean = js.native
    
    /* private */ var isTooltipMultiline: Any = js.native
    
    /* private */ val minViewportTooltipThreshold: Any = js.native
    
    /* private */ var parentRect: Any = js.native
    
    /* private */ var persistentTooltip: Any = js.native
    
    /* private */ var positionDoesntCollideWithViewport: Any = js.native
    
    /* private */ var positionHonorsViewportThreshold: Any = js.native
    
    /* private */ var positionPlainTooltip: Any = js.native
    
    /* private */ var positionRichTooltip: Any = js.native
    
    /* private */ var preventContextMenuOnLongTouch: Any = js.native
    
    /* private */ val removeAncestorScrollEventListeners: Any = js.native
    
    /**
      * Must be used in conjunction with #attachScrollHandler. Removes the scroll
      * event handler from elements on the page.
      */
    def removeScrollHandler(
      removeEventHandlerFn: js.Function2[/* event */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
    ): Unit = js.native
    
    /* private */ var repositionTooltipOnAnchorMove: Any = js.native
    
    /* private */ var richTooltip: Any = js.native
    
    /* private */ val richTooltipFocusOutHandler: Any = js.native
    
    def setAnchorBoundaryType(`type`: AnchorBoundaryType): Unit = js.native
    
    /**
      * Given a PositionWithCaret, applies the correct styles to the caret element
      * so that it is positioned properly on the rich tooltip.
      * Returns the x and y positions of the caret, to be used as the
      * transform-origin on the tooltip itself for entrance animations.
      */
    /* private */ var setCaretPositionStyles: Any = js.native
    
    def setHideDelay(delayMs: Double): Unit = js.native
    
    def setShowDelay(delayMs: Double): Unit = js.native
    
    def setTooltipPosition(position: WithCaretPos): Unit = js.native
    
    def show(): Unit = js.native
    
    /* private */ var showDelayMs: Any = js.native
    
    /* private */ var showTimeout: Any = js.native
    
    /* private */ val tooltipMouseEnterHandler: Any = js.native
    
    /* private */ val tooltipMouseLeaveHandler: Any = js.native
    
    /* private */ var tooltipPositionWithCaret: Any = js.native
    
    /* private */ var tooltipShown: Any = js.native
    
    /**
      * Given a list of x/y position options for a rich tooltip with caret, checks
      * if valid x/y combinations of these position options are either within the
      * viewport threshold, or simply within the viewport. Returns a map with the
      * valid x/y position combinations that all either honor the viewport
      * threshold or are simply inside within the viewport.
      */
    /* private */ var validateTooltipWithCaretDistances: Any = js.native
    
    /* private */ val windowResizeHandler: Any = js.native
    
    /* private */ val windowScrollHandler: Any = js.native
    
    /* private */ var xTooltipPos: Any = js.native
    
    /* private */ var yPositionDoesntCollideWithViewport: Any = js.native
    
    /* private */ var yPositionHonorsViewportThreshold: Any = js.native
    
    /* private */ var yTooltipPos: Any = js.native
  }
}
