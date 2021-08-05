package typings.materialSelect

import typings.materialMenuSurface.constantsMod.Corner
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCSelectAdapter extends StObject {
    
    /**
      * Activates the bottom line, showing a focused state.
      */
    def activateBottomLine(): Unit
    
    /**
      * Adds class to select anchor element.
      */
    def addClass(className: String): Unit
    
    /**
      * Adds class to the menu element.
      */
    def addMenuClass(className: String): Unit
    
    /**
      * Closes the menu.
      */
    def closeMenu(): Unit
    
    /**
      * Closes notch in outline element, if the outline exists.
      */
    def closeOutline(): Unit
    
    /**
      * Deactivates the bottom line.
      */
    def deactivateBottomLine(): Unit
    
    /**
      * Floats label determined based off of the shouldFloat argument.
      */
    def floatLabel(shouldFloat: Boolean): Unit
    
    /**
      * Focuses the menu item element at the given index.
      */
    def focusMenuItemAtIndex(index: Double): Unit
    
    /**
      * Returns the select anchor element.
      */
    def getAnchorElement(): Element | Null
    
    /**
      * Returns width of label in pixels, if the label exists.
      */
    def getLabelWidth(): Double
    
    /**
      * Returns the number of menu items.
      */
    def getMenuItemCount(): Double
    
    /**
      * Gets the text content of the menu item element at the given index.
      */
    def getMenuItemTextAtIndex(index: Double): String
    
    /**
      * Returns an array representing the VALUE_ATTR attributes of each menu item.
      */
    def getMenuItemValues(): js.Array[String]
    
    /**
      * Gets the given attribute on the select anchor element.
      */
    def getSelectAnchorAttr(attr: String): String | Null
    
    /**
      * Returns the selected index.
      */
    def getSelectedIndex(): Double
    
    /**
      * Returns true if the select anchor element contains the given class name.
      */
    def hasClass(className: String): Boolean
    
    /**
      * Returns true if label exists, false if it doesn't.
      */
    def hasLabel(): Boolean
    
    /**
      * Returns true if outline element exists, false if it doesn't.
      */
    def hasOutline(): Boolean
    
    /**
      * Returns whether the select anchor is focused.
      */
    def isSelectAnchorFocused(): Boolean
    
    /**
      * Returns whether typeahead is in progress in the menu.
      */
    def isTypeaheadInProgress(): Boolean
    
    /**
      * Only implement if outline element exists.
      */
    def notchOutline(labelWidth: Double): Unit
    
    /**
      * Emits a change event when an element is selected.
      */
    def notifyChange(value: String): Unit
    
    /**
      * Opens the menu.
      */
    def openMenu(): Unit
    
    /**
      * Removes a class from the select anchor element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Removes a class from the menu element.
      */
    def removeMenuClass(className: String): Unit
    
    /**
      * Removes the given attribute on the select anchor element.
      */
    def removeSelectAnchorAttr(attr: String): Unit
    
    /**
      * Styles the label as required, if the label exists.
      */
    def setLabelRequired(isRequired: Boolean): Unit
    
    /**
      * Sets the menu anchor corner.
      */
    def setMenuAnchorCorner(anchorCorner: Corner): Unit
    
    /**
      * Sets the menu anchor element.
      */
    def setMenuAnchorElement(anchorEl: Element): Unit
    
    /**
      * Sets whether the menu should wrap focus.
      */
    def setMenuWrapFocus(wrapFocus: Boolean): Unit
    
    /**
      * Sets the line ripple transform origin center.
      */
    def setRippleCenter(normalizedX: Double): Unit
    
    /**
      * Sets the given attribute on the select anchor element.
      */
    def setSelectAnchorAttr(attr: String, value: String): Unit
    
    /**
      * Sets the selected index in the menu.
      */
    def setSelectedIndex(index: Double): Unit
    
    /**
      * Sets the text content of the selectedText element to the given string.
      */
    def setSelectedText(text: String): Unit
    
    /**
      * Adds a character to the list typeahead buffer and returns index of the
      * next item in the list matching the buffer.
      */
    def typeaheadMatchItem(nextChar: String, startingIndex: Double): Double
  }
  object MDCSelectAdapter {
    
    inline def apply(
      activateBottomLine: () => Unit,
      addClass: String => Unit,
      addMenuClass: String => Unit,
      closeMenu: () => Unit,
      closeOutline: () => Unit,
      deactivateBottomLine: () => Unit,
      floatLabel: Boolean => Unit,
      focusMenuItemAtIndex: Double => Unit,
      getAnchorElement: () => Element | Null,
      getLabelWidth: () => Double,
      getMenuItemCount: () => Double,
      getMenuItemTextAtIndex: Double => String,
      getMenuItemValues: () => js.Array[String],
      getSelectAnchorAttr: String => String | Null,
      getSelectedIndex: () => Double,
      hasClass: String => Boolean,
      hasLabel: () => Boolean,
      hasOutline: () => Boolean,
      isSelectAnchorFocused: () => Boolean,
      isTypeaheadInProgress: () => Boolean,
      notchOutline: Double => Unit,
      notifyChange: String => Unit,
      openMenu: () => Unit,
      removeClass: String => Unit,
      removeMenuClass: String => Unit,
      removeSelectAnchorAttr: String => Unit,
      setLabelRequired: Boolean => Unit,
      setMenuAnchorCorner: Corner => Unit,
      setMenuAnchorElement: Element => Unit,
      setMenuWrapFocus: Boolean => Unit,
      setRippleCenter: Double => Unit,
      setSelectAnchorAttr: (String, String) => Unit,
      setSelectedIndex: Double => Unit,
      setSelectedText: String => Unit,
      typeaheadMatchItem: (String, Double) => Double
    ): MDCSelectAdapter = {
      val __obj = js.Dynamic.literal(activateBottomLine = js.Any.fromFunction0(activateBottomLine), addClass = js.Any.fromFunction1(addClass), addMenuClass = js.Any.fromFunction1(addMenuClass), closeMenu = js.Any.fromFunction0(closeMenu), closeOutline = js.Any.fromFunction0(closeOutline), deactivateBottomLine = js.Any.fromFunction0(deactivateBottomLine), floatLabel = js.Any.fromFunction1(floatLabel), focusMenuItemAtIndex = js.Any.fromFunction1(focusMenuItemAtIndex), getAnchorElement = js.Any.fromFunction0(getAnchorElement), getLabelWidth = js.Any.fromFunction0(getLabelWidth), getMenuItemCount = js.Any.fromFunction0(getMenuItemCount), getMenuItemTextAtIndex = js.Any.fromFunction1(getMenuItemTextAtIndex), getMenuItemValues = js.Any.fromFunction0(getMenuItemValues), getSelectAnchorAttr = js.Any.fromFunction1(getSelectAnchorAttr), getSelectedIndex = js.Any.fromFunction0(getSelectedIndex), hasClass = js.Any.fromFunction1(hasClass), hasLabel = js.Any.fromFunction0(hasLabel), hasOutline = js.Any.fromFunction0(hasOutline), isSelectAnchorFocused = js.Any.fromFunction0(isSelectAnchorFocused), isTypeaheadInProgress = js.Any.fromFunction0(isTypeaheadInProgress), notchOutline = js.Any.fromFunction1(notchOutline), notifyChange = js.Any.fromFunction1(notifyChange), openMenu = js.Any.fromFunction0(openMenu), removeClass = js.Any.fromFunction1(removeClass), removeMenuClass = js.Any.fromFunction1(removeMenuClass), removeSelectAnchorAttr = js.Any.fromFunction1(removeSelectAnchorAttr), setLabelRequired = js.Any.fromFunction1(setLabelRequired), setMenuAnchorCorner = js.Any.fromFunction1(setMenuAnchorCorner), setMenuAnchorElement = js.Any.fromFunction1(setMenuAnchorElement), setMenuWrapFocus = js.Any.fromFunction1(setMenuWrapFocus), setRippleCenter = js.Any.fromFunction1(setRippleCenter), setSelectAnchorAttr = js.Any.fromFunction2(setSelectAnchorAttr), setSelectedIndex = js.Any.fromFunction1(setSelectedIndex), setSelectedText = js.Any.fromFunction1(setSelectedText), typeaheadMatchItem = js.Any.fromFunction2(typeaheadMatchItem))
      __obj.asInstanceOf[MDCSelectAdapter]
    }
    
    extension [Self <: MDCSelectAdapter](x: Self) {
      
      inline def setActivateBottomLine(value: () => Unit): Self = StObject.set(x, "activateBottomLine", js.Any.fromFunction0(value))
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddMenuClass(value: String => Unit): Self = StObject.set(x, "addMenuClass", js.Any.fromFunction1(value))
      
      inline def setCloseMenu(value: () => Unit): Self = StObject.set(x, "closeMenu", js.Any.fromFunction0(value))
      
      inline def setCloseOutline(value: () => Unit): Self = StObject.set(x, "closeOutline", js.Any.fromFunction0(value))
      
      inline def setDeactivateBottomLine(value: () => Unit): Self = StObject.set(x, "deactivateBottomLine", js.Any.fromFunction0(value))
      
      inline def setFloatLabel(value: Boolean => Unit): Self = StObject.set(x, "floatLabel", js.Any.fromFunction1(value))
      
      inline def setFocusMenuItemAtIndex(value: Double => Unit): Self = StObject.set(x, "focusMenuItemAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetAnchorElement(value: () => Element | Null): Self = StObject.set(x, "getAnchorElement", js.Any.fromFunction0(value))
      
      inline def setGetLabelWidth(value: () => Double): Self = StObject.set(x, "getLabelWidth", js.Any.fromFunction0(value))
      
      inline def setGetMenuItemCount(value: () => Double): Self = StObject.set(x, "getMenuItemCount", js.Any.fromFunction0(value))
      
      inline def setGetMenuItemTextAtIndex(value: Double => String): Self = StObject.set(x, "getMenuItemTextAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetMenuItemValues(value: () => js.Array[String]): Self = StObject.set(x, "getMenuItemValues", js.Any.fromFunction0(value))
      
      inline def setGetSelectAnchorAttr(value: String => String | Null): Self = StObject.set(x, "getSelectAnchorAttr", js.Any.fromFunction1(value))
      
      inline def setGetSelectedIndex(value: () => Double): Self = StObject.set(x, "getSelectedIndex", js.Any.fromFunction0(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasLabel(value: () => Boolean): Self = StObject.set(x, "hasLabel", js.Any.fromFunction0(value))
      
      inline def setHasOutline(value: () => Boolean): Self = StObject.set(x, "hasOutline", js.Any.fromFunction0(value))
      
      inline def setIsSelectAnchorFocused(value: () => Boolean): Self = StObject.set(x, "isSelectAnchorFocused", js.Any.fromFunction0(value))
      
      inline def setIsTypeaheadInProgress(value: () => Boolean): Self = StObject.set(x, "isTypeaheadInProgress", js.Any.fromFunction0(value))
      
      inline def setNotchOutline(value: Double => Unit): Self = StObject.set(x, "notchOutline", js.Any.fromFunction1(value))
      
      inline def setNotifyChange(value: String => Unit): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1(value))
      
      inline def setOpenMenu(value: () => Unit): Self = StObject.set(x, "openMenu", js.Any.fromFunction0(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveMenuClass(value: String => Unit): Self = StObject.set(x, "removeMenuClass", js.Any.fromFunction1(value))
      
      inline def setRemoveSelectAnchorAttr(value: String => Unit): Self = StObject.set(x, "removeSelectAnchorAttr", js.Any.fromFunction1(value))
      
      inline def setSetLabelRequired(value: Boolean => Unit): Self = StObject.set(x, "setLabelRequired", js.Any.fromFunction1(value))
      
      inline def setSetMenuAnchorCorner(value: Corner => Unit): Self = StObject.set(x, "setMenuAnchorCorner", js.Any.fromFunction1(value))
      
      inline def setSetMenuAnchorElement(value: Element => Unit): Self = StObject.set(x, "setMenuAnchorElement", js.Any.fromFunction1(value))
      
      inline def setSetMenuWrapFocus(value: Boolean => Unit): Self = StObject.set(x, "setMenuWrapFocus", js.Any.fromFunction1(value))
      
      inline def setSetRippleCenter(value: Double => Unit): Self = StObject.set(x, "setRippleCenter", js.Any.fromFunction1(value))
      
      inline def setSetSelectAnchorAttr(value: (String, String) => Unit): Self = StObject.set(x, "setSelectAnchorAttr", js.Any.fromFunction2(value))
      
      inline def setSetSelectedIndex(value: Double => Unit): Self = StObject.set(x, "setSelectedIndex", js.Any.fromFunction1(value))
      
      inline def setSetSelectedText(value: String => Unit): Self = StObject.set(x, "setSelectedText", js.Any.fromFunction1(value))
      
      inline def setTypeaheadMatchItem(value: (String, Double) => Double): Self = StObject.set(x, "typeaheadMatchItem", js.Any.fromFunction2(value))
    }
  }
}
