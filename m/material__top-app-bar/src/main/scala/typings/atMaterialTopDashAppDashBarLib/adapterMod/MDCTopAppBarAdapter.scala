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

