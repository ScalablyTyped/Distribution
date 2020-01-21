package typings.materialTopAppBar.adapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTopAppBarAdapter extends js.Object {
  /**
    * Adds a class to the root Element.
    */
  def addClass(className: String): Unit
  /**
    * Deregisters an event handler on the navigation icon element for a given event.
    */
  def deregisterNavigationIconInteractionHandler(`type`: String, handler: EventListener): Unit
  def deregisterResizeHandler(handler: EventListener): Unit
  def deregisterScrollHandler(handler: EventListener): Unit
  /**
    * Gets the height of the top app bar.
    */
  def getTopAppBarHeight(): Double
  def getTotalActionItems(): Double
  def getViewportScrollY(): Double
  /**
    * Returns true if the root Element contains the given class.
    */
  def hasClass(className: String): Boolean
  /**
    * Emits an event when the navigation icon is clicked.
    */
  def notifyNavigationIconClicked(): Unit
  /**
    * Registers an event handler on the navigation icon element for a given event.
    */
  def registerNavigationIconInteractionHandler(`type`: String, handler: EventListener): Unit
  def registerResizeHandler(handler: EventListener): Unit
  def registerScrollHandler(handler: EventListener): Unit
  /**
    * Removes a class from the root Element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets the specified inline style property on the root Element to the given value.
    */
  def setStyle(property: String, value: String): Unit
}

object MDCTopAppBarAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterNavigationIconInteractionHandler: (String, EventListener) => Unit,
    deregisterResizeHandler: EventListener => Unit,
    deregisterScrollHandler: EventListener => Unit,
    getTopAppBarHeight: () => Double,
    getTotalActionItems: () => Double,
    getViewportScrollY: () => Double,
    hasClass: String => Boolean,
    notifyNavigationIconClicked: () => Unit,
    registerNavigationIconInteractionHandler: (String, EventListener) => Unit,
    registerResizeHandler: EventListener => Unit,
    registerScrollHandler: EventListener => Unit,
    removeClass: String => Unit,
    setStyle: (String, String) => Unit
  ): MDCTopAppBarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterNavigationIconInteractionHandler = js.Any.fromFunction2(deregisterNavigationIconInteractionHandler), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterScrollHandler = js.Any.fromFunction1(deregisterScrollHandler), getTopAppBarHeight = js.Any.fromFunction0(getTopAppBarHeight), getTotalActionItems = js.Any.fromFunction0(getTotalActionItems), getViewportScrollY = js.Any.fromFunction0(getViewportScrollY), hasClass = js.Any.fromFunction1(hasClass), notifyNavigationIconClicked = js.Any.fromFunction0(notifyNavigationIconClicked), registerNavigationIconInteractionHandler = js.Any.fromFunction2(registerNavigationIconInteractionHandler), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerScrollHandler = js.Any.fromFunction1(registerScrollHandler), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle))
  
    __obj.asInstanceOf[MDCTopAppBarAdapter]
  }
}

