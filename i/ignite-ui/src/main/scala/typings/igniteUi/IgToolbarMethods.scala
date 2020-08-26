package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgToolbarMethods extends js.Object {
  /**
    * Activate item matching provided index.
    *
    * @param index The index of the item.
    * @param activated The activate property value.
    */
  def activateItem(index: js.Object, activated: js.Object): Unit = js.native
  /**
    * Add item to widget item array
    *
    * @param item The item to be added.
    */
  def addItem(item: js.Object): Unit = js.native
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  def changeLocale(): Unit = js.native
  /**
    * Deactivate all buttons.
    */
  def deactivateAll(): Unit = js.native
  /**
    * Destroy the widget.
    */
  def destroy(): Unit = js.native
  /**
    * Disable item matching provided index.
    *
    * @param index The index of the item.
    * @param disabled The disabled property value.
    */
  def disableItem(index: js.Object, disabled: js.Object): Unit = js.native
  /**
    * Gets the item by matching the provided index.
    *
    * @param index The index of the item.
    */
  def getItem(index: js.Object): js.Object = js.native
  /**
    * Remove the item matching provided index.
    *
    * @param index The index of the item.
    */
  def removeItem(index: js.Object): js.Object = js.native
  /**
    * Returns the element on which the widget was instantiated
    */
  def widget(): Unit = js.native
}

object IgToolbarMethods {
  @scala.inline
  def apply(
    activateItem: (js.Object, js.Object) => Unit,
    addItem: js.Object => Unit,
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    deactivateAll: () => Unit,
    destroy: () => Unit,
    disableItem: (js.Object, js.Object) => Unit,
    getItem: js.Object => js.Object,
    removeItem: js.Object => js.Object,
    widget: () => Unit
  ): IgToolbarMethods = {
    val __obj = js.Dynamic.literal(activateItem = js.Any.fromFunction2(activateItem), addItem = js.Any.fromFunction1(addItem), changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), deactivateAll = js.Any.fromFunction0(deactivateAll), destroy = js.Any.fromFunction0(destroy), disableItem = js.Any.fromFunction2(disableItem), getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgToolbarMethods]
  }
  @scala.inline
  implicit class IgToolbarMethodsOps[Self <: IgToolbarMethods] (val x: Self) extends AnyVal {
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
    def setActivateItem(value: (js.Object, js.Object) => Unit): Self = this.set("activateItem", js.Any.fromFunction2(value))
    @scala.inline
    def setAddItem(value: js.Object => Unit): Self = this.set("addItem", js.Any.fromFunction1(value))
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = this.set("changeGlobalLanguage", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = this.set("changeGlobalRegional", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeLocale(value: () => Unit): Self = this.set("changeLocale", js.Any.fromFunction0(value))
    @scala.inline
    def setDeactivateAll(value: () => Unit): Self = this.set("deactivateAll", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDisableItem(value: (js.Object, js.Object) => Unit): Self = this.set("disableItem", js.Any.fromFunction2(value))
    @scala.inline
    def setGetItem(value: js.Object => js.Object): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveItem(value: js.Object => js.Object): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def setWidget(value: () => Unit): Self = this.set("widget", js.Any.fromFunction0(value))
  }
  
}

