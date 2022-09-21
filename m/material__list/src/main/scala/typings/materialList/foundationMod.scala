package typings.materialList

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialList.adapterMod.MDCListAdapter
import typings.materialList.anon.PartialMDCListAdapter
import typings.materialList.typesMod.MDCListIndex
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/list/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCListFoundation {
    def this(adapter: PartialMDCListAdapter) = this()
  }
  
  @JSImport("@material/list/foundation", "MDCListFoundation")
  @js.native
  open class MDCListFoundation () extends MDCFoundation[MDCListAdapter] {
    def this(adapter: PartialMDCListAdapter) = this()
    
    /* private */ var areDisabledItemsFocusable: Any = js.native
    
    /* private */ var ariaCurrentAttrValue: Any = js.native
    
    /* private */ var checkboxListToggleAll: Any = js.native
    
    /**
      * Clears the typeahead buffer.
      */
    def clearTypeaheadBuffer(): Unit = js.native
    
    def focusFirstElement(): Double = js.native
    
    def focusInitialElement(): Double = js.native
    
    /* private */ var focusItemAtIndex: Any = js.native
    
    def focusLastElement(): Double = js.native
    
    /**
      * Focuses the next element on the list.
      */
    def focusNextElement(index: Double): Double = js.native
    
    /**
      * Focuses the previous element on the list.
      */
    def focusPrevElement(index: Double): Double = js.native
    
    /* private */ var focusedItemIndex: Any = js.native
    
    /* private */ var getFirstSelectedOrFocusedItemIndex: Any = js.native
    
    /** Returns the index of the item that was last focused. */
    def getFocusedItemIndex(): Double = js.native
    
    def getSelectedIndex(): MDCListIndex = js.native
    
    /** @return Index of the first selected item based on the DOM state. */
    /* private */ var getSelectedIndexFromDOM: Any = js.native
    
    /**
      * Returns the attribute to use for indicating selection status.
      */
    /* private */ var getSelectionAttribute: Any = js.native
    
    /**
      * Click handler for the list.
      *
      * @param index Index for the item that has been clicked.
      * @param isCheckboxAlreadyUpdatedInAdapter Whether the checkbox for
      *   the list item has already been updated in the adapter. This attribute
      *   should be set to `true` when e.g. the click event directly landed on
      *   the underlying native checkbox element which would cause the checked
      *   state to be already toggled within `adapter.isCheckboxCheckedAtIndex`.
      */
    def handleClick(index: Double, isCheckboxAlreadyUpdatedInAdapter: Boolean): Unit = js.native
    def handleClick(index: Double, isCheckboxAlreadyUpdatedInAdapter: Boolean, event: MouseEvent): Unit = js.native
    
    /**
      * Focus in handler for the list items.
      */
    def handleFocusIn(listItemIndex: Double): Unit = js.native
    
    /**
      * Focus out handler for the list items.
      */
    def handleFocusOut(listItemIndex: Double): Unit = js.native
    
    /**
      * Key handler for the list.
      */
    def handleKeydown(event: KeyboardEvent, isRootListItem: Boolean, listItemIndex: Double): Unit = js.native
    
    /* private */ var hasTypeahead: Any = js.native
    
    /* private */ var isCheckboxList: Any = js.native
    
    /* private */ var isIndexDisabled: Any = js.native
    
    /* private */ var isIndexInRange: Any = js.native
    
    /* private */ var isIndexValid: Any = js.native
    
    /* private */ var isRadioList: Any = js.native
    
    /**
      * @return Return true if it is single selectin list, checkbox list or radio
      *     list.
      */
    /* private */ var isSelectableList: Any = js.native
    
    /* private */ var isSingleSelectionList: Any = js.native
    
    /**
      * @return Whether typeahead is currently matching a user-specified prefix.
      */
    def isTypeaheadInProgress(): Boolean = js.native
    
    /* private */ var isVertical: Any = js.native
    
    /* private */ var lastSelectedIndex: Any = js.native
    
    def layout(): Unit = js.native
    
    /**
      * Automatically determines whether the list is single selection list. If so,
      * initializes the internal state to match the selected item.
      */
    /* private */ var maybeInitializeSingleSelection: Any = js.native
    
    /* private */ var selectedIndex: Any = js.native
    
    /**
      * Sets aria attribute for single selection at given index.
      */
    /* private */ var setAriaForSingleSelectionAtIndex: Any = js.native
    
    /* private */ var setCheckboxAtIndex: Any = js.native
    
    def setDisabledItemsFocusable(value: Boolean): Unit = js.native
    
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
    
    /**
      * Toggles radio at give index. Radio doesn't change the checked state if it
      * is already checked.
      */
    /* private */ var setRadioAtIndex: Any = js.native
    
    def setSelectedIndex(index: MDCListIndex): Unit = js.native
    def setSelectedIndex(index: MDCListIndex, options: SelectionUpdateOptions): Unit = js.native
    
    /**
      * Sets selected index on user action, toggles checkboxes in checkbox lists
      * by default, unless `isCheckboxAlreadyUpdatedInAdapter` is set to `true`.
      *
      * In cases where `isCheckboxAlreadyUpdatedInAdapter` is set to `true`, the
      * UI is just updated to reflect the value returned by the adapter.
      *
      * When calling this, make sure user interaction does not toggle disabled
      * list items.
      */
    /* private */ var setSelectedIndexOnAction: Any = js.native
    
    /** Toggles single-selection behavior. */
    def setSingleSelection(value: Boolean): Unit = js.native
    
    /* private */ var setSingleSelectionAtIndex: Any = js.native
    
    /* private */ var setTabindexAtIndex: Any = js.native
    
    /* private */ var setTabindexToFirstSelectedOrFocusedItem: Any = js.native
    
    /** Toggle use of the "activated" CSS class. */
    def setUseActivatedClass(useActivated: Boolean): Unit = js.native
    
    /**
      * Toggles use of the selected attribute (true for aria-selected, false for
      * aria-checked).
      */
    def setUseSelectedAttribute(useSelected: Boolean): Unit = js.native
    
    /**
      * Toggles orientation direction for keyboard navigation (true for vertical,
      * false for horizontal).
      */
    def setVerticalOrientation(value: Boolean): Unit = js.native
    
    /** Toggles focus wrapping with keyboard navigation. */
    def setWrapFocus(value: Boolean): Unit = js.native
    
    /* private */ var sortedIndexByFirstChar: Any = js.native
    
    /* private */ var toggleCheckboxAtIndex: Any = js.native
    
    /**
      * Toggles the state of all checkboxes in the given range (inclusive) based on
      * the state of the checkbox at the `toggleIndex`. To determine whether to set
      * the given range to checked or unchecked, read the value of the checkbox at
      * the `toggleIndex` and negate it. Then apply that new checked state to all
      * checkboxes in the range.
      * @param fromIndex The start of the range of checkboxes to toggle
      * @param toIndex The end of the range of checkboxes to toggle
      * @param toggleIndex The index that will be used to determine the new state
      *     of the given checkbox range.
      */
    /* private */ var toggleCheckboxRange: Any = js.native
    
    /**
      * Initializes the MDCListTextAndIndex data structure by indexing the current
      * list items by primary text.
      *
      * @return The primary texts of all the list items sorted by first character.
      */
    /* private */ var typeaheadInitSortedIndex: Any = js.native
    
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
    
    /* private */ val typeaheadState: Any = js.native
    
    /* private */ var useActivatedClass: Any = js.native
    
    /* private */ var useSelectedAttr: Any = js.native
    
    /* private */ var wrapFocus: Any = js.native
  }
  
  trait SelectionUpdateOptions extends StObject {
    
    /**
      * Whether the UI should be updated regardless of whether the
      * selection would be a noop according to the foundation state.
      * https://github.com/material-components/material-components-web/commit/5d060518804437aa1ae3152562f1bb78b1af4aa6.
      */
    var forceUpdate: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the update was triggered by a user interaction. */
    var isUserInteraction: js.UndefOr[Boolean] = js.undefined
  }
  object SelectionUpdateOptions {
    
    inline def apply(): SelectionUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionUpdateOptions]
    }
    
    extension [Self <: SelectionUpdateOptions](x: Self) {
      
      inline def setForceUpdate(value: Boolean): Self = StObject.set(x, "forceUpdate", value.asInstanceOf[js.Any])
      
      inline def setForceUpdateUndefined: Self = StObject.set(x, "forceUpdate", js.undefined)
      
      inline def setIsUserInteraction(value: Boolean): Self = StObject.set(x, "isUserInteraction", value.asInstanceOf[js.Any])
      
      inline def setIsUserInteractionUndefined: Self = StObject.set(x, "isUserInteraction", js.undefined)
    }
  }
}
