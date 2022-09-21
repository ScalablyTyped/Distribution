package typings.materialList

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialList.foundationMod.MDCListFoundation
import typings.materialList.typesMod.MDCListIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/list/component", "MDCList")
  @js.native
  open class MDCList protected () extends MDCComponent[MDCListFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCListFoundation, args: Any*) = this()
    
    /* private */ var classNameMap: Any = js.native
    
    def disabledItemsFocusable_=(areDisabledItemsFocusable: Boolean): Unit = js.native
    
    /**
      * Ensures that at least one item is focusable if the list is interactive and
      * doesn't specify a suitable tabindex.
      */
    /* private */ var ensureFocusable: Any = js.native
    
    /* private */ var focusInEventListener: Any = js.native
    
    /* private */ var focusOutEventListener: Any = js.native
    
    /**
      * Used to figure out which list item this event is targetting. Or returns -1
      * if there is no list item
      */
    /* private */ var getListItemIndex: Any = js.native
    
    /**
      * Extracts the primary text from a list item.
      * @param item The list item element.
      * @return The primary text in the element.
      */
    def getPrimaryText(item: typings.std.Element): String = js.native
    
    /* private */ var handleClick: Any = js.native
    
    /**
      * Used to figure out which element was clicked before sending the event to
      * the foundation.
      */
    /* private */ var handleClickEvent: Any = js.native
    
    /**
      * Used to figure out which element was clicked before sending the event to
      * the foundation.
      */
    /* private */ var handleFocusInEvent: Any = js.native
    
    /**
      * Used to figure out which element was clicked before sending the event to
      * the foundation.
      */
    /* private */ var handleFocusOutEvent: Any = js.native
    
    /* private */ var handleKeydown: Any = js.native
    
    /**
      * Used to figure out which element was focused when keydown event occurred
      * before sending the event to the foundation.
      */
    /* private */ var handleKeydownEvent: Any = js.native
    
    /**
      * Sets whether typeahead functionality is enabled on the list.
      * @param hasTypeahead Whether typeahead is enabled.
      */
    def hasTypeahead_=(hasTypeahead: Boolean): Unit = js.native
    
    /* private */ var initialFocusIndex: Any = js.native
    
    /**
      * Initialize selectedIndex value based on pre-selected list items.
      */
    def initializeListType(): Unit = js.native
    
    /* private */ var isEvolutionEnabled: Any = js.native
    
    /* private */ var isInteractive: Any = js.native
    
    def layout(): Unit = js.native
    
    def listElements: js.Array[typings.std.Element] = js.native
    
    def selectedIndex: MDCListIndex = js.native
    def selectedIndex_=(index: MDCListIndex): Unit = js.native
    
    /**
      * Updates the list item at itemIndex to the desired isEnabled state.
      * @param itemIndex Index of the list item
      * @param isEnabled Sets the list item to enabled or disabled.
      */
    def setEnabled(itemIndex: Double, isEnabled: Boolean): Unit = js.native
    
    def singleSelection_=(isSingleSelectionList: Boolean): Unit = js.native
    
    /**
      * @return Whether typeahead is currently matching a user-specified prefix.
      */
    def typeaheadInProgress: Boolean = js.native
    
    /**
      * Given the next desired character from the user, adds it to the typeahead
      * buffer. Then, attempts to find the next option matching the buffer. Wraps
      * around if at the end of options.
      *
      * @param nextChar The next character to add to the prefix buffer.
      * @param startingIndex The index from which to start matching. Defaults to
      *     the currently focused index.
      * @return The index of the matched item.
      */
    def typeaheadMatchItem(nextChar: String): Double = js.native
    def typeaheadMatchItem(nextChar: String, startingIndex: Double): Double = js.native
    
    def vertical_=(value: Boolean): Unit = js.native
    
    def wrapFocus_=(value: Boolean): Unit = js.native
  }
  /* static members */
  object MDCList {
    
    @JSImport("@material/list/component", "MDCList")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCList = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCList]
  }
  
  type MDCListFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[MDCListFoundation], 
    MDCList
  ]
}
