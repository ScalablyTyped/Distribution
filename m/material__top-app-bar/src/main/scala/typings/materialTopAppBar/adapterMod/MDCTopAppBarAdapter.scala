package typings.materialTopAppBar.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTopAppBarAdapter extends js.Object {
  /**
    * Adds a class to the root Element.
    */
  def addClass(className: String): Unit = js.native
  /**
    * Gets the height of the top app bar.
    */
  def getTopAppBarHeight(): Double = js.native
  def getTotalActionItems(): Double = js.native
  def getViewportScrollY(): Double = js.native
  /**
    * Returns true if the root Element contains the given class.
    */
  def hasClass(className: String): Boolean = js.native
  /**
    * Emits an event when the navigation icon is clicked.
    */
  def notifyNavigationIconClicked(): Unit = js.native
  /**
    * Removes a class from the root Element.
    */
  def removeClass(className: String): Unit = js.native
  /**
    * Sets the specified inline style property on the root Element to the given value.
    */
  def setStyle(property: String, value: String): Unit = js.native
}

object MDCTopAppBarAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    getTopAppBarHeight: () => Double,
    getTotalActionItems: () => Double,
    getViewportScrollY: () => Double,
    hasClass: String => Boolean,
    notifyNavigationIconClicked: () => Unit,
    removeClass: String => Unit,
    setStyle: (String, String) => Unit
  ): MDCTopAppBarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getTopAppBarHeight = js.Any.fromFunction0(getTopAppBarHeight), getTotalActionItems = js.Any.fromFunction0(getTotalActionItems), getViewportScrollY = js.Any.fromFunction0(getViewportScrollY), hasClass = js.Any.fromFunction1(hasClass), notifyNavigationIconClicked = js.Any.fromFunction0(notifyNavigationIconClicked), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle))
    __obj.asInstanceOf[MDCTopAppBarAdapter]
  }
  @scala.inline
  implicit class MDCTopAppBarAdapterOps[Self <: MDCTopAppBarAdapter] (val x: Self) extends AnyVal {
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
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTopAppBarHeight(value: () => Double): Self = this.set("getTopAppBarHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTotalActionItems(value: () => Double): Self = this.set("getTotalActionItems", js.Any.fromFunction0(value))
    @scala.inline
    def setGetViewportScrollY(value: () => Double): Self = this.set("getViewportScrollY", js.Any.fromFunction0(value))
    @scala.inline
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifyNavigationIconClicked(value: () => Unit): Self = this.set("notifyNavigationIconClicked", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStyle(value: (String, String) => Unit): Self = this.set("setStyle", js.Any.fromFunction2(value))
  }
  
}

