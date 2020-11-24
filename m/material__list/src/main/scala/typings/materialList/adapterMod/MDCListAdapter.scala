package typings.materialList.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCListAdapter extends js.Object {
  
  def addClassForElementIndex(index: Double, className: String): Unit = js.native
  
  /**
    * Focuses list item at the index specified.
    */
  def focusItemAtIndex(index: Double): Unit = js.native
  
  /**
    * Returns the attribute value of list item at given `index`.
    */
  def getAttributeForElementIndex(index: Double, attr: String): String | Null = js.native
  
  def getFocusedElementIndex(): Double = js.native
  
  def getListItemCount(): Double = js.native
  
  /**
    * @return the primary text content of the list item at index.
    */
  def getPrimaryTextAtIndex(index: Double): String = js.native
  
  /**
    * @return true if checkbox is present at given list item index.
    */
  def hasCheckboxAtIndex(index: Double): Boolean = js.native
  
  /**
    * @return true if radio button is present at given list item index.
    */
  def hasRadioAtIndex(index: Double): Boolean = js.native
  
  /**
    * @return true if checkbox inside a list item is checked.
    */
  def isCheckboxCheckedAtIndex(index: Double): Boolean = js.native
  
  /**
    * @return true when the current focused element is inside list root.
    */
  def isFocusInsideList(): Boolean = js.native
  
  /**
    * @return true if root element is focused.
    */
  def isRootFocused(): Boolean = js.native
  
  /**
    * @param index list item index.
    * @param className the name of the class whose presence is to be checked.
    * @return true if list item at `index` has class `className`.
    */
  def listItemAtIndexHasClass(index: Double, className: String): Boolean = js.native
  
  /**
    * Notifies user action on list item.
    */
  def notifyAction(index: Double): Unit = js.native
  
  def removeClassForElementIndex(index: Double, className: String): Unit = js.native
  
  def setAttributeForElementIndex(index: Double, attribute: String, value: String): Unit = js.native
  
  /**
    * Sets the checked status of checkbox or radio at given list item index.
    */
  def setCheckedCheckboxOrRadioAtIndex(index: Double, isChecked: Boolean): Unit = js.native
  
  /**
    * Sets the tabindex to the value specified for all button/a element children of
    * the list item at the index specified.
    */
  def setTabIndexForListItemChildren(listItemIndex: Double, tabIndexValue: String): Unit = js.native
}
object MDCListAdapter {
  
  @scala.inline
  def apply(
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
    removeClassForElementIndex: (Double, String) => Unit,
    setAttributeForElementIndex: (Double, String, String) => Unit,
    setCheckedCheckboxOrRadioAtIndex: (Double, Boolean) => Unit,
    setTabIndexForListItemChildren: (Double, String) => Unit
  ): MDCListAdapter = {
    val __obj = js.Dynamic.literal(addClassForElementIndex = js.Any.fromFunction2(addClassForElementIndex), focusItemAtIndex = js.Any.fromFunction1(focusItemAtIndex), getAttributeForElementIndex = js.Any.fromFunction2(getAttributeForElementIndex), getFocusedElementIndex = js.Any.fromFunction0(getFocusedElementIndex), getListItemCount = js.Any.fromFunction0(getListItemCount), getPrimaryTextAtIndex = js.Any.fromFunction1(getPrimaryTextAtIndex), hasCheckboxAtIndex = js.Any.fromFunction1(hasCheckboxAtIndex), hasRadioAtIndex = js.Any.fromFunction1(hasRadioAtIndex), isCheckboxCheckedAtIndex = js.Any.fromFunction1(isCheckboxCheckedAtIndex), isFocusInsideList = js.Any.fromFunction0(isFocusInsideList), isRootFocused = js.Any.fromFunction0(isRootFocused), listItemAtIndexHasClass = js.Any.fromFunction2(listItemAtIndexHasClass), notifyAction = js.Any.fromFunction1(notifyAction), removeClassForElementIndex = js.Any.fromFunction2(removeClassForElementIndex), setAttributeForElementIndex = js.Any.fromFunction3(setAttributeForElementIndex), setCheckedCheckboxOrRadioAtIndex = js.Any.fromFunction2(setCheckedCheckboxOrRadioAtIndex), setTabIndexForListItemChildren = js.Any.fromFunction2(setTabIndexForListItemChildren))
    __obj.asInstanceOf[MDCListAdapter]
  }
  
  @scala.inline
  implicit class MDCListAdapterOps[Self <: MDCListAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddClassForElementIndex(value: (Double, String) => Unit): Self = this.set("addClassForElementIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusItemAtIndex(value: Double => Unit): Self = this.set("focusItemAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeForElementIndex(value: (Double, String) => String | Null): Self = this.set("getAttributeForElementIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFocusedElementIndex(value: () => Double): Self = this.set("getFocusedElementIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListItemCount(value: () => Double): Self = this.set("getListItemCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrimaryTextAtIndex(value: Double => String): Self = this.set("getPrimaryTextAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasCheckboxAtIndex(value: Double => Boolean): Self = this.set("hasCheckboxAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasRadioAtIndex(value: Double => Boolean): Self = this.set("hasRadioAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCheckboxCheckedAtIndex(value: Double => Boolean): Self = this.set("isCheckboxCheckedAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFocusInsideList(value: () => Boolean): Self = this.set("isFocusInsideList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRootFocused(value: () => Boolean): Self = this.set("isRootFocused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setListItemAtIndexHasClass(value: (Double, String) => Boolean): Self = this.set("listItemAtIndexHasClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNotifyAction(value: Double => Unit): Self = this.set("notifyAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClassForElementIndex(value: (Double, String) => Unit): Self = this.set("removeClassForElementIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAttributeForElementIndex(value: (Double, String, String) => Unit): Self = this.set("setAttributeForElementIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetCheckedCheckboxOrRadioAtIndex(value: (Double, Boolean) => Unit): Self = this.set("setCheckedCheckboxOrRadioAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTabIndexForListItemChildren(value: (Double, String) => Unit): Self = this.set("setTabIndexForListItemChildren", js.Any.fromFunction2(value))
  }
}
