package typings
package atMaterialListLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/list/adapter", "MDCListAdapter")
@js.native
class MDCListAdapter () extends js.Object {
  def addClassForElementIndex(index: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
    * Focuses list item at the index specified.
    */
  def focusItemAtIndex(index: scala.Double): scala.Unit = js.native
  /**
    * If the given element has an href, follows the link.
    */
  def followHref(ele: stdLib.HTMLAnchorElement): scala.Unit = js.native
  def getFocusedElementIndex(): scala.Double = js.native
  def getListItemCount(): scala.Double = js.native
  /**
    * Returns true if checkbox is present at given list item index.
    */
  def hasCheckboxAtIndex(index: scala.Double): scala.Boolean = js.native
  /**
    * Returns true if radio button is present at given list item index.
    */
  def hasRadioAtIndex(index: scala.Double): scala.Boolean = js.native
  /**
    * Returns true if checkbox inside a list item is checked.
    */
  def isCheckboxCheckedAtIndex(index: scala.Double): scala.Boolean = js.native
  /**
    * Returns true when the current focused element is inside list root.
    */
  def isFocusInsideList(): scala.Boolean = js.native
  def removeAttributeForElementIndex(index: scala.Double, attribute: java.lang.String): scala.Unit = js.native
  def removeClassForElementIndex(index: scala.Double, className: java.lang.String): scala.Unit = js.native
  def setAttributeForElementIndex(index: scala.Double, attribute: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Sets the checked status of checkbox or radio at given list item index.
    */
  def setCheckedCheckboxOrRadioAtIndex(index: scala.Double, isChecked: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the tabindex to the value specified for all button/a element children of
    * the list item at the index specified.
    */
  def setTabIndexForListItemChildren(listItemIndex: scala.Double, tabIndexValue: scala.Double): scala.Unit = js.native
}

