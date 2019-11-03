package typings.atMaterialTabDashIndicator.adapterMod

import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabIndicatorAdapter extends js.Object {
  /**
    * Adds the given className to the root element.
    * @param className The className to add
    */
  def addClass(className: String): Unit
  /**
    * Returns the client rect of the content element.
    */
  def computeContentClientRect(): ClientRect
  /**
    * Removes the given className from the root element.
    * @param className The className to remove
    */
  def removeClass(className: String): Unit
  /**
    * Sets a style property of the content element to the passed value
    * @param propName The style property name to set
    * @param value The style property value
    */
  def setContentStyleProperty(propName: String, value: String): Unit
}

object MDCTabIndicatorAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    computeContentClientRect: () => ClientRect,
    removeClass: String => Unit,
    setContentStyleProperty: (String, String) => Unit
  ): MDCTabIndicatorAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), computeContentClientRect = js.Any.fromFunction0(computeContentClientRect), removeClass = js.Any.fromFunction1(removeClass), setContentStyleProperty = js.Any.fromFunction2(setContentStyleProperty))
  
    __obj.asInstanceOf[MDCTabIndicatorAdapter]
  }
}

