package typings.materialMenu

import typings.materialMenu.typesMod.MDCMenuItemEventDetail
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCMenuAdapter extends StObject {
    
    /**
      * Adds an attribute, with value, to the element at the index provided.
      */
    def addAttributeToElementAtIndex(index: Double, attr: String, value: String): Unit = js.native
    
    /**
      * Adds a class to the element at the index provided.
      */
    def addClassToElementAtIndex(index: Double, className: String): Unit = js.native
    
    /**
      * Closes the menu-surface.
      * @param skipRestoreFocus Whether to skip restoring focus to the previously
      *    focused element after the surface has been closed.
      */
    def closeSurface(): Unit = js.native
    def closeSurface(skipRestoreFocus: Boolean): Unit = js.native
    
    /**
      * @return true if the element contains the className.
      */
    def elementContainsClass(element: Element, className: String): Boolean = js.native
    
    /**
      * Focuses the menu item at given index.
      * @param index Index of the menu item that will be focused every time the menu opens.
      */
    def focusItemAtIndex(index: Double): Unit = js.native
    
    /** Focuses the list root element. */
    def focusListRoot(): Unit = js.native
    
    /**
      * @return Index of the element in the list or -1 if it is not in the list.
      */
    def getElementIndex(element: Element): Double = js.native
    
    /** @return Returns the menu item count. */
    def getMenuItemCount(): Double = js.native
    
    /**
      * @return Returns selected list item index within the same selection group which is
      * a sibling of item at given `index`.
      * @param index Index of the menu item with possible selected sibling.
      */
    def getSelectedSiblingOfItemAtIndex(index: Double): Double = js.native
    
    /**
      * @return Returns true if item at specified index is contained within an `.mdc-menu__selection-group` element.
      * @param index Index of the selectable menu item.
      */
    def isSelectableItemAtIndex(index: Double): Boolean = js.native
    
    /**
      * Emit an event when a menu item is selected.
      */
    def notifySelected(evtData: MDCMenuItemEventDetail): Unit = js.native
    
    /**
      * Removes an attribute from an element at the index provided.
      */
    def removeAttributeFromElementAtIndex(index: Double, attr: String): Unit = js.native
    
    /**
      * Removes a class from the element at the index provided
      */
    def removeClassFromElementAtIndex(index: Double, className: String): Unit = js.native
  }
}
