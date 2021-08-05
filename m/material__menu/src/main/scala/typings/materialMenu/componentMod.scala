package typings.materialMenu

import typings.materialBase.componentMod.MDCComponent
import typings.materialList.componentMod.MDCListFactory
import typings.materialList.typesMod.MDCListIndex
import typings.materialMenu.anon.PartialMDCMenuDistance
import typings.materialMenu.constantsMod.DefaultFocusState
import typings.materialMenu.foundationMod.MDCMenuFoundation
import typings.materialMenuSurface.componentMod.MDCMenuSurfaceFactory
import typings.materialMenuSurface.constantsMod.Corner
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/menu/component", "MDCMenu")
  @js.native
  class MDCMenu protected () extends MDCComponent[MDCMenuFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCMenuFoundation, args: js.Any*) = this()
    
    /**
      * @return The item within the menu at the index specified.
      */
    def getOptionByIndex(index: Double): Element | Null = js.native
    
    /**
      * @param index A menu item's index.
      * @return The primary text within the menu at the index specified.
      */
    def getPrimaryTextAtIndex(index: Double): String = js.native
    
    /**
      * Sets whether the menu has typeahead functionality.
      * @param value Whether typeahead is enabled.
      */
    def hasTypeahead_=(value: Boolean): Unit = js.native
    
    def initialize(): Unit = js.native
    def initialize(menuSurfaceFactory: Unit, listFactory: MDCListFactory): Unit = js.native
    def initialize(menuSurfaceFactory: MDCMenuSurfaceFactory): Unit = js.native
    def initialize(menuSurfaceFactory: MDCMenuSurfaceFactory, listFactory: MDCListFactory): Unit = js.native
    
    /**
      * Return the items within the menu. Note that this only contains the set of elements within
      * the items container that are proper list items, and not supplemental / presentational DOM
      * elements.
      */
    def items: js.Array[Element] = js.native
    
    /**
      * Layout the underlying list element in the case of any dynamic updates
      * to its structure.
      */
    def layout(): Unit = js.native
    
    def open: Boolean = js.native
    def open_=(value: Boolean): Unit = js.native
    
    def quickOpen_=(quickOpen: Boolean): Unit = js.native
    
    /**
      * Retrieves the selected index. Only applicable to select menus.
      * @return The selected index, which is a number for single selection and
      *     radio lists, and an array of numbers for checkbox lists.
      */
    def selectedIndex: MDCListIndex = js.native
    /**
      * Sets the selected index of the list. Only applicable to select menus.
      * @param index The selected index, which is a number for single selection and
      *     radio lists, and an array of numbers for checkbox lists.
      */
    def selectedIndex_=(index: MDCListIndex): Unit = js.native
    
    def setAbsolutePosition(x: Double, y: Double): Unit = js.native
    
    /**
      * @param corner Default anchor corner alignment of top-left menu corner.
      */
    def setAnchorCorner(corner: Corner): Unit = js.native
    
    /**
      * Sets the element that the menu-surface is anchored to.
      */
    def setAnchorElement(element: Element): Unit = js.native
    
    def setAnchorMargin(margin: PartialMDCMenuDistance): Unit = js.native
    
    /**
      * Sets default focus state where the menu should focus every time when menu
      * is opened. Focuses the list root (`DefaultFocusState.LIST_ROOT`) element by
      * default.
      * @param focusState Default focus state.
      */
    def setDefaultFocusState(focusState: DefaultFocusState): Unit = js.native
    
    /**
      * Sets the enabled state to isEnabled for the menu item at the given index.
      * @param index Index of the menu item
      * @param isEnabled The desired enabled state of the menu item.
      */
    def setEnabled(index: Double, isEnabled: Boolean): Unit = js.native
    
    def setFixedPosition(isFixed: Boolean): Unit = js.native
    
    def setIsHoisted(isHoisted: Boolean): Unit = js.native
    
    /**
      * Sets the list item as the selected row at the specified index.
      * @param index Index of list item within menu.
      */
    def setSelectedIndex(index: Double): Unit = js.native
    
    /**
      * Turns on/off the underlying list's single selection mode. Used mainly
      * by select menu.
      *
      * @param singleSelection Whether to enable single selection mode.
      */
    def singleSelection_=(singleSelection: Boolean): Unit = js.native
    
    /**
      * @return Whether typeahead logic is currently matching some user prefix.
      */
    def typeaheadInProgress: Boolean = js.native
    
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
    
    def wrapFocus: Boolean = js.native
    def wrapFocus_=(value: Boolean): Unit = js.native
  }
  /* static members */
  object MDCMenu {
    
    @JSImport("@material/menu/component", "MDCMenu")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): MDCMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCMenu]
  }
  
  type MDCMenuFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCMenuFoundation], MDCMenu]
}
