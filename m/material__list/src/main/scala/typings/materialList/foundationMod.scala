package typings.materialList

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialList.adapterMod.MDCListAdapter
import typings.materialList.anon.PartialMDCListAdapter
import typings.materialList.typesMod.MDCListIndex
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/list/foundation", JSImport.Default)
  @js.native
  class default () extends MDCListFoundation {
    def this(adapter: PartialMDCListAdapter) = this()
  }
  
  @JSImport("@material/list/foundation", "MDCListFoundation")
  @js.native
  class MDCListFoundation () extends MDCFoundation[MDCListAdapter] {
    def this(adapter: PartialMDCListAdapter) = this()
    
    /**
      * Clears the typeahead buffer.
      */
    def clearTypeaheadBuffer(): Unit = js.native
    
    def focusFirstElement(): Double = js.native
    
    def focusLastElement(): Double = js.native
    
    /**
      * Focuses the next element on the list.
      */
    def focusNextElement(index: Double): Double = js.native
    
    /**
      * Focuses the previous element on the list.
      */
    def focusPrevElement(index: Double): Double = js.native
    
    def getSelectedIndex(): MDCListIndex = js.native
    
    /**
      * Click handler for the list.
      */
    def handleClick(index: Double, toggleCheckbox: Boolean): Unit = js.native
    
    /**
      * Focus in handler for the list items.
      */
    def handleFocusIn(_underscore: FocusEvent, listItemIndex: Double): Unit = js.native
    
    /**
      * Focus out handler for the list items.
      */
    def handleFocusOut(_underscore: FocusEvent, listItemIndex: Double): Unit = js.native
    
    /**
      * Key handler for the list.
      */
    def handleKeydown(event: KeyboardEvent, isRootListItem: Boolean, listItemIndex: Double): Unit = js.native
    
    /**
      * @return Whether typeahead is currently matching a user-specified prefix.
      */
    def isTypeaheadInProgress(): Boolean = js.native
    
    def layout(): Unit = js.native
    
    /**
      * @param itemIndex Index of the list item
      * @param isEnabled Sets the list item to enabled or disabled.
      */
    def setEnabled(itemIndex: Double, isEnabled: Boolean): Unit = js.native
    
    /**
      * Sets whether typeahead is enabled on the list.
      * @param hasTypeahead Whether typeahead is enabled.
      */
    def setHasTypeahead(hasTypeahead: Boolean): Unit = js.native
    
    def setSelectedIndex(index: MDCListIndex): Unit = js.native
    
    /**
      * Sets the isSingleSelectionList_ private variable.
      */
    def setSingleSelection(value: Boolean): Unit = js.native
    
    /**
      * Sets the useActivatedClass_ private variable.
      */
    def setUseActivatedClass(useActivated: Boolean): Unit = js.native
    
    /**
      * Sets the isVertical_ private variable.
      */
    def setVerticalOrientation(value: Boolean): Unit = js.native
    
    /**
      * Sets the private wrapFocus_ variable.
      */
    def setWrapFocus(value: Boolean): Unit = js.native
    
    /**
      * Given the next desired character from the user, adds it to the typeahead
      * buffer. Then, attempts to find the next option matching the buffer. Wraps
      * around if at the end of options.
      *
      * @param nextChar The next character to add to the prefix buffer.
      * @param startingIndex The index from which to start matching. Only relevant
      *     when starting a new match sequence. To start a new match sequence,
      *     clear the buffer using `clearTypeaheadBuffer`, or wait for the buffer
      *     to clear after a set interval defined in list foundation. Defaults to
      *     the currently focused index.
      * @return The index of the matched item, or -1 if no match.
      */
    def typeaheadMatchItem(nextChar: String): Double = js.native
    def typeaheadMatchItem(nextChar: String, startingIndex: Double): Double = js.native
    def typeaheadMatchItem(nextChar: String, startingIndex: Double, skipFocus: Boolean): Double = js.native
    def typeaheadMatchItem(nextChar: String, startingIndex: Unit, skipFocus: Boolean): Double = js.native
  }
}
