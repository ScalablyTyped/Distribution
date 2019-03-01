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
    addClass: js.Function1[java.lang.String, scala.Unit],
    deregisterNavigationIconInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    deregisterResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    deregisterScrollHandler: js.Function1[stdLib.EventListener, scala.Unit],
    getTopAppBarHeight: js.Function0[scala.Double],
    getTotalActionItems: js.Function0[scala.Double],
    getViewportScrollY: js.Function0[scala.Double],
    hasClass: js.Function1[java.lang.String, scala.Boolean],
    notifyNavigationIconClicked: js.Function0[scala.Unit],
    registerNavigationIconInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    registerResizeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    registerScrollHandler: js.Function1[stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    setStyle: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): MDCTopAppBarAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(addClass)
    __obj.updateDynamic("deregisterNavigationIconInteractionHandler")(deregisterNavigationIconInteractionHandler)
    __obj.updateDynamic("deregisterResizeHandler")(deregisterResizeHandler)
    __obj.updateDynamic("deregisterScrollHandler")(deregisterScrollHandler)
    __obj.updateDynamic("getTopAppBarHeight")(getTopAppBarHeight)
    __obj.updateDynamic("getTotalActionItems")(getTotalActionItems)
    __obj.updateDynamic("getViewportScrollY")(getViewportScrollY)
    __obj.updateDynamic("hasClass")(hasClass)
    __obj.updateDynamic("notifyNavigationIconClicked")(notifyNavigationIconClicked)
    __obj.updateDynamic("registerNavigationIconInteractionHandler")(registerNavigationIconInteractionHandler)
    __obj.updateDynamic("registerResizeHandler")(registerResizeHandler)
    __obj.updateDynamic("registerScrollHandler")(registerScrollHandler)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.updateDynamic("setStyle")(setStyle)
    __obj.asInstanceOf[MDCTopAppBarAdapter]
  }
}

