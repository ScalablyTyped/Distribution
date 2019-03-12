package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbarMethods extends js.Object {
  /**
  	 * Activate item matching provided index.
  	 *
  	 * @param index The index of the item.
  	 * @param activated The activate property value.
  	 */
  def activateItem(index: js.Object, activated: js.Object): scala.Unit
  /**
  	 * Add item to widget item array
  	 *
  	 * @param item The item to be added.
  	 */
  def addItem(item: js.Object): scala.Unit
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit
  def changeLocale(): scala.Unit
  /**
  	 * Deactivate all buttons.
  	 */
  def deactivateAll(): scala.Unit
  /**
  	 * Destroy the widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Disable item matching provided index.
  	 *
  	 * @param index The index of the item.
  	 * @param disabled The disabled property value.
  	 */
  def disableItem(index: js.Object, disabled: js.Object): scala.Unit
  /**
  	 * Gets the item by matching the provided index.
  	 *
  	 * @param index The index of the item.
  	 */
  def getItem(index: js.Object): js.Object
  /**
  	 * Remove the item matching provided index.
  	 *
  	 * @param index The index of the item.
  	 */
  def removeItem(index: js.Object): js.Object
  /**
  	 * Returns the element on which the widget was instantiated
  	 */
  def widget(): scala.Unit
}

object IgToolbarMethods {
  @scala.inline
  def apply(
    activateItem: (js.Object, js.Object) => scala.Unit,
    addItem: js.Object => scala.Unit,
    changeGlobalLanguage: () => scala.Unit,
    changeGlobalRegional: () => scala.Unit,
    changeLocale: () => scala.Unit,
    deactivateAll: () => scala.Unit,
    destroy: () => scala.Unit,
    disableItem: (js.Object, js.Object) => scala.Unit,
    getItem: js.Object => js.Object,
    removeItem: js.Object => js.Object,
    widget: () => scala.Unit
  ): IgToolbarMethods = {
    val __obj = js.Dynamic.literal(activateItem = js.Any.fromFunction2(activateItem), addItem = js.Any.fromFunction1(addItem), changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), deactivateAll = js.Any.fromFunction0(deactivateAll), destroy = js.Any.fromFunction0(destroy), disableItem = js.Any.fromFunction2(disableItem), getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), widget = js.Any.fromFunction0(widget))
  
    __obj.asInstanceOf[IgToolbarMethods]
  }
}

