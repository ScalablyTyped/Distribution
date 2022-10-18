package typings.materialChips

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialChips.anon.PartialMDCChipAdapterAddClass
import typings.materialChips.deprecatedChipAdapterMod.MDCChipAdapter
import typings.materialChips.deprecatedTrailingactionTypesMod.MDCChipTrailingActionNavigationEvent
import typings.std.DOMRect
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.TransitionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedChipFoundationMod {
  
  @JSImport("@material/chips/deprecated/chip/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCChipFoundation {
    def this(adapter: PartialMDCChipAdapterAddClass) = this()
  }
  
  @JSImport("@material/chips/deprecated/chip/foundation", "MDCChipFoundation")
  @js.native
  open class MDCChipFoundation () extends MDCFoundation[MDCChipAdapter] {
    def this(adapter: PartialMDCChipAdapterAddClass) = this()
    
    /**
      * Begins the exit animation which leads to removal of the chip.
      */
    def beginExit(): Unit = js.native
    
    /* private */ var eventFromPrimaryAction: Any = js.native
    
    /* private */ var finishEditing: Any = js.native
    
    /* private */ var focusNextAction: Any = js.native
    
    /**
      * Called by the chip set to focus the primary action.
      *
      */
    def focusPrimaryAction(): Unit = js.native
    
    /**
      * Called by the chip set to focus the trailing action (if present), otherwise
      * gives focus to the trailing action.
      */
    def focusTrailingAction(): Unit = js.native
    
    def getDimensions(): DOMRect = js.native
    
    /* private */ var getDirection: Any = js.native
    
    /* private */ var getFocusBehavior: Any = js.native
    
    def getShouldRemoveOnTrailingIconClick(): Boolean = js.native
    
    def handleClick(): Unit = js.native
    
    def handleDoubleClick(): Unit = js.native
    
    def handleFocusIn(evt: FocusEvent): Unit = js.native
    
    def handleFocusOut(evt: FocusEvent): Unit = js.native
    
    /**
      * Handles a keydown event from the root element.
      */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    /**
      * Handles an interaction event on the trailing icon element. This is used to
      * prevent the ripple from activating on interaction with the trailing icon.
      */
    def handleTrailingActionInteraction(): Unit = js.native
    
    def handleTrailingActionNavigation(evt: MDCChipTrailingActionNavigationEvent): Unit = js.native
    
    /**
      * Handles a transition end event on the root element.
      */
    def handleTransitionEnd(evt: TransitionEvent): Unit = js.native
    
    /* private */ var isDeleteAction: Any = js.native
    
    def isEditable(): Boolean = js.native
    
    def isEditing(): Boolean = js.native
    
    def isSelected(): Boolean = js.native
    
    /* private */ var notifyIgnoredSelection: Any = js.native
    
    /* private */ var notifySelection: Any = js.native
    
    /* private */ var removeChip: Any = js.native
    
    /**
      * Called by the chip set to remove focus from the chip actions.
      */
    def removeFocus(): Unit = js.native
    
    /* private */ var setPrimaryActionFocusable: Any = js.native
    
    def setSelected(selected: Boolean): Unit = js.native
    
    def setSelectedFromChipSet(selected: Boolean, shouldNotifyClients: Boolean): Unit = js.native
    
    /* private */ var setSelectedImpl: Any = js.native
    
    def setShouldFocusPrimaryActionOnClick(shouldFocus: Boolean): Unit = js.native
    
    def setShouldRemoveOnTrailingIconClick(shouldRemove: Boolean): Unit = js.native
    
    /* private */ var shouldFinishEditing: Any = js.native
    
    /**
      * Whether the primary action should receive focus on click. Should only be
      * set to true for clients who programmatically give focus to a different
      * element on the page when a chip is clicked (like a menu).
      */
    /* private */ var shouldFocusPrimaryActionOnClick: Any = js.native
    
    /* private */ var shouldNotifyInteraction: Any = js.native
    
    /** Whether a trailing icon click should immediately trigger exit/removal of the chip. */
    /* private */ var shouldRemoveOnTrailingIconClick: Any = js.native
    
    /* private */ var shouldStartEditing: Any = js.native
    
    /* private */ var startEditing: Any = js.native
  }
}
