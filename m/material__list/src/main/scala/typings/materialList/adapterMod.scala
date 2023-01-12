package typings.materialList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCListAdapter extends StObject {
    
    def addClassForElementIndex(index: Double, className: String): Unit
    
    /**
      * Focuses list item at the index specified.
      */
    def focusItemAtIndex(index: Double): Unit
    
    /**
      * Returns the attribute value of list item at given `index`.
      */
    def getAttributeForElementIndex(index: Double, attr: String): String | Null
    
    def getFocusedElementIndex(): Double
    
    def getListItemCount(): Double
    
    /**
      * @return the primary text content of the list item at index.
      */
    def getPrimaryTextAtIndex(index: Double): String
    
    /**
      * @return true if checkbox is present at given list item index.
      */
    def hasCheckboxAtIndex(index: Double): Boolean
    
    /**
      * @return true if radio button is present at given list item index.
      */
    def hasRadioAtIndex(index: Double): Boolean
    
    /**
      * @return true if checkbox inside a list item is checked.
      */
    def isCheckboxCheckedAtIndex(index: Double): Boolean
    
    /**
      * @return true when the current focused element is inside list root.
      */
    def isFocusInsideList(): Boolean
    
    /**
      * @return true if root element is focused.
      */
    def isRootFocused(): Boolean
    
    /**
      * @param index list item index.
      * @param className the name of the class whose presence is to be checked.
      * @return true if list item at `index` has class `className`.
      */
    def listItemAtIndexHasClass(index: Double, className: String): Boolean
    
    /**
      * Notifies user action on list item.
      */
    def notifyAction(index: Double): Unit
    
    /**
      * Notifies that items at the given indices have changed its
      * selection state through user interaction (e.g. click).
      *
      * This is invoked only for changes caused by user interaction
      * to match with the native `change` event semantics.
      */
    def notifySelectionChange(changedIndices: js.Array[Double]): Unit
    
    def removeClassForElementIndex(index: Double, className: String): Unit
    
    def setAttributeForElementIndex(index: Double, attribute: String, value: String): Unit
    
    /**
      * Sets the checked status of checkbox or radio at given list item index.
      */
    def setCheckedCheckboxOrRadioAtIndex(index: Double, isChecked: Boolean): Unit
    
    /**
      * Sets the tabindex to the value specified for all button/a element children of
      * the list item at the index specified.
      */
    def setTabIndexForListItemChildren(listItemIndex: Double, tabIndexValue: String): Unit
  }
  object MDCListAdapter {
    
    inline def apply(
      addClassForElementIndex: (Double, String) => Unit,
      focusItemAtIndex: Double => Unit,
      getAttributeForElementIndex: (Double, String) => String | Null,
      getFocusedElementIndex: () => Double,
      getListItemCount: () => Double,
      getPrimaryTextAtIndex: Double => String,
      hasCheckboxAtIndex: Double => Boolean,
      hasRadioAtIndex: Double => Boolean,
      isCheckboxCheckedAtIndex: Double => Boolean,
      isFocusInsideList: () => Boolean,
      isRootFocused: () => Boolean,
      listItemAtIndexHasClass: (Double, String) => Boolean,
      notifyAction: Double => Unit,
      notifySelectionChange: js.Array[Double] => Unit,
      removeClassForElementIndex: (Double, String) => Unit,
      setAttributeForElementIndex: (Double, String, String) => Unit,
      setCheckedCheckboxOrRadioAtIndex: (Double, Boolean) => Unit,
      setTabIndexForListItemChildren: (Double, String) => Unit
    ): MDCListAdapter = {
      val __obj = js.Dynamic.literal(addClassForElementIndex = js.Any.fromFunction2(addClassForElementIndex), focusItemAtIndex = js.Any.fromFunction1(focusItemAtIndex), getAttributeForElementIndex = js.Any.fromFunction2(getAttributeForElementIndex), getFocusedElementIndex = js.Any.fromFunction0(getFocusedElementIndex), getListItemCount = js.Any.fromFunction0(getListItemCount), getPrimaryTextAtIndex = js.Any.fromFunction1(getPrimaryTextAtIndex), hasCheckboxAtIndex = js.Any.fromFunction1(hasCheckboxAtIndex), hasRadioAtIndex = js.Any.fromFunction1(hasRadioAtIndex), isCheckboxCheckedAtIndex = js.Any.fromFunction1(isCheckboxCheckedAtIndex), isFocusInsideList = js.Any.fromFunction0(isFocusInsideList), isRootFocused = js.Any.fromFunction0(isRootFocused), listItemAtIndexHasClass = js.Any.fromFunction2(listItemAtIndexHasClass), notifyAction = js.Any.fromFunction1(notifyAction), notifySelectionChange = js.Any.fromFunction1(notifySelectionChange), removeClassForElementIndex = js.Any.fromFunction2(removeClassForElementIndex), setAttributeForElementIndex = js.Any.fromFunction3(setAttributeForElementIndex), setCheckedCheckboxOrRadioAtIndex = js.Any.fromFunction2(setCheckedCheckboxOrRadioAtIndex), setTabIndexForListItemChildren = js.Any.fromFunction2(setTabIndexForListItemChildren))
      __obj.asInstanceOf[MDCListAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCListAdapter] (val x: Self) extends AnyVal {
      
      inline def setAddClassForElementIndex(value: (Double, String) => Unit): Self = StObject.set(x, "addClassForElementIndex", js.Any.fromFunction2(value))
      
      inline def setFocusItemAtIndex(value: Double => Unit): Self = StObject.set(x, "focusItemAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetAttributeForElementIndex(value: (Double, String) => String | Null): Self = StObject.set(x, "getAttributeForElementIndex", js.Any.fromFunction2(value))
      
      inline def setGetFocusedElementIndex(value: () => Double): Self = StObject.set(x, "getFocusedElementIndex", js.Any.fromFunction0(value))
      
      inline def setGetListItemCount(value: () => Double): Self = StObject.set(x, "getListItemCount", js.Any.fromFunction0(value))
      
      inline def setGetPrimaryTextAtIndex(value: Double => String): Self = StObject.set(x, "getPrimaryTextAtIndex", js.Any.fromFunction1(value))
      
      inline def setHasCheckboxAtIndex(value: Double => Boolean): Self = StObject.set(x, "hasCheckboxAtIndex", js.Any.fromFunction1(value))
      
      inline def setHasRadioAtIndex(value: Double => Boolean): Self = StObject.set(x, "hasRadioAtIndex", js.Any.fromFunction1(value))
      
      inline def setIsCheckboxCheckedAtIndex(value: Double => Boolean): Self = StObject.set(x, "isCheckboxCheckedAtIndex", js.Any.fromFunction1(value))
      
      inline def setIsFocusInsideList(value: () => Boolean): Self = StObject.set(x, "isFocusInsideList", js.Any.fromFunction0(value))
      
      inline def setIsRootFocused(value: () => Boolean): Self = StObject.set(x, "isRootFocused", js.Any.fromFunction0(value))
      
      inline def setListItemAtIndexHasClass(value: (Double, String) => Boolean): Self = StObject.set(x, "listItemAtIndexHasClass", js.Any.fromFunction2(value))
      
      inline def setNotifyAction(value: Double => Unit): Self = StObject.set(x, "notifyAction", js.Any.fromFunction1(value))
      
      inline def setNotifySelectionChange(value: js.Array[Double] => Unit): Self = StObject.set(x, "notifySelectionChange", js.Any.fromFunction1(value))
      
      inline def setRemoveClassForElementIndex(value: (Double, String) => Unit): Self = StObject.set(x, "removeClassForElementIndex", js.Any.fromFunction2(value))
      
      inline def setSetAttributeForElementIndex(value: (Double, String, String) => Unit): Self = StObject.set(x, "setAttributeForElementIndex", js.Any.fromFunction3(value))
      
      inline def setSetCheckedCheckboxOrRadioAtIndex(value: (Double, Boolean) => Unit): Self = StObject.set(x, "setCheckedCheckboxOrRadioAtIndex", js.Any.fromFunction2(value))
      
      inline def setSetTabIndexForListItemChildren(value: (Double, String) => Unit): Self = StObject.set(x, "setTabIndexForListItemChildren", js.Any.fromFunction2(value))
    }
  }
}
