package typings.atMaterialList.adapterMod

import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/list/adapter", "MDCListAdapter")
@js.native
class MDCListAdapter () extends js.Object {
  def addClassForElementIndex(index: Double, className: String): Unit = js.native
  /**
    * Focuses list item at the index specified.
    */
  def focusItemAtIndex(index: Double): Unit = js.native
  /**
    * If the given element has an href, follows the link.
    */
  def followHref(ele: HTMLAnchorElement): Unit = js.native
  def getFocusedElementIndex(): Double = js.native
  def getListItemCount(): Double = js.native
  /**
    * Returns true if checkbox is present at given list item index.
    */
  def hasCheckboxAtIndex(index: Double): Boolean = js.native
  /**
    * Returns true if radio button is present at given list item index.
    */
  def hasRadioAtIndex(index: Double): Boolean = js.native
  /**
    * Returns true if checkbox inside a list item is checked.
    */
  def isCheckboxCheckedAtIndex(index: Double): Boolean = js.native
  /**
    * Returns true when the current focused element is inside list root.
    */
  def isFocusInsideList(): Boolean = js.native
  def removeAttributeForElementIndex(index: Double, attribute: String): Unit = js.native
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
  def setTabIndexForListItemChildren(listItemIndex: Double, tabIndexValue: Double): Unit = js.native
}

