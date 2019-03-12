package typings
package atMaterialTopDashAppDashBarLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTopAppBarAdapter extends js.Object {
  /**
    * Adds a class to the root Element.
    */
  def addClass(className: java.lang.String): scala.Unit
  /**
    * Deregisters an event handler on the navigation icon element for a given event.
    */
  def deregisterNavigationIconInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def deregisterResizeHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterScrollHandler(handler: stdLib.EventListener): scala.Unit
  /**
    * Gets the height of the top app bar.
    */
  def getTopAppBarHeight(): scala.Double
  def getTotalActionItems(): scala.Double
  def getViewportScrollY(): scala.Double
  /**
    * Returns true if the root Element contains the given class.
    */
  def hasClass(className: java.lang.String): scala.Boolean
  /**
    * Emits an event when the navigation icon is clicked.
    */
  def notifyNavigationIconClicked(): scala.Unit
  /**
    * Registers an event handler on the navigation icon element for a given event.
    */
  def registerNavigationIconInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def registerResizeHandler(handler: stdLib.EventListener): scala.Unit
  def registerScrollHandler(handler: stdLib.EventListener): scala.Unit
  /**
    * Removes a class from the root Element.
    */
  def removeClass(className: java.lang.String): scala.Unit
  /**
    * Sets the specified inline style property on the root Element to the given value.
    */
  def setStyle(property: java.lang.String, value: java.lang.String): scala.Unit
}

object MDCTopAppBarAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    deregisterNavigationIconInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    deregisterResizeHandler: stdLib.EventListener => scala.Unit,
    deregisterScrollHandler: stdLib.EventListener => scala.Unit,
    getTopAppBarHeight: () => scala.Double,
    getTotalActionItems: () => scala.Double,
    getViewportScrollY: () => scala.Double,
    hasClass: java.lang.String => scala.Boolean,
    notifyNavigationIconClicked: () => scala.Unit,
    registerNavigationIconInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    registerResizeHandler: stdLib.EventListener => scala.Unit,
    registerScrollHandler: stdLib.EventListener => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    setStyle: (java.lang.String, java.lang.String) => scala.Unit
  ): MDCTopAppBarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterNavigationIconInteractionHandler = js.Any.fromFunction2(deregisterNavigationIconInteractionHandler), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterScrollHandler = js.Any.fromFunction1(deregisterScrollHandler), getTopAppBarHeight = js.Any.fromFunction0(getTopAppBarHeight), getTotalActionItems = js.Any.fromFunction0(getTotalActionItems), getViewportScrollY = js.Any.fromFunction0(getViewportScrollY), hasClass = js.Any.fromFunction1(hasClass), notifyNavigationIconClicked = js.Any.fromFunction0(notifyNavigationIconClicked), registerNavigationIconInteractionHandler = js.Any.fromFunction2(registerNavigationIconInteractionHandler), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerScrollHandler = js.Any.fromFunction1(registerScrollHandler), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle))
  
    __obj.asInstanceOf[MDCTopAppBarAdapter]
  }
}

