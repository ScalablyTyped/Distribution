package typings.materialChips

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialChips.anon.ADDEDANNOUNCEMENTATTRIBUTE
import typings.materialChips.anon.CHECKMARK
import typings.materialChips.anon.PartialMDCChipAdapter
import typings.materialChips.chipAdapterMod.MDCChipAdapter
import typings.materialChips.trailingactionTypesMod.MDCChipTrailingActionNavigationEvent
import typings.std.ClientRect
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.TransitionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip/foundation", JSImport.Namespace)
@js.native
object chipFoundationMod extends js.Object {
  @js.native
  class MDCChipFoundation () extends MDCFoundation[MDCChipAdapter] {
    def this(adapter: PartialMDCChipAdapter) = this()
    /**
      * Begins the exit animation which leads to removal of the chip.
      */
    def beginExit(): Unit = js.native
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
    def getDimensions(): ClientRect = js.native
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
    def isEditable(): Boolean = js.native
    def isEditing(): Boolean = js.native
    def isSelected(): Boolean = js.native
    /**
      * Called by the chip set to remove focus from the chip actions.
      */
    def removeFocus(): Unit = js.native
    def setSelected(selected: Boolean): Unit = js.native
    def setSelectedFromChipSet(selected: Boolean, shouldNotifyClients: Boolean): Unit = js.native
    def setShouldFocusPrimaryActionOnClick(shouldFocus: Boolean): Unit = js.native
    def setShouldRemoveOnTrailingIconClick(shouldRemove: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCChipFoundation {
    def this(adapter: PartialMDCChipAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCChipFoundation extends js.Object {
    def cssClasses: CHECKMARK = js.native
    def defaultAdapter: MDCChipAdapter = js.native
    def strings: ADDEDANNOUNCEMENTATTRIBUTE = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: CHECKMARK = js.native
    def defaultAdapter: MDCChipAdapter = js.native
    def strings: ADDEDANNOUNCEMENTATTRIBUTE = js.native
  }
  
}

