package typings.materialNotchedOutline.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCNotchedOutlineAdapter extends js.Object {
  /**
    * Adds a class to the root element.
    */
  def addClass(className: String): Unit
  /**
    * Returns the height of the root element.
    */
  def getHeight(): Double
  /**
    * Returns the idle outline element's computed style value of the given css property `propertyName`.
    * We achieve this via `getComputedStyle(...).getPropertyValue(propertyName)`.
    */
  def getIdleOutlineStyleValue(propertyName: String): String
  /**
    * Returns the width of the root element.
    */
  def getWidth(): Double
  /**
    * Removes a class from the root element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets the "d" attribute of the outline element's SVG path.
    */
  def setOutlinePathAttr(value: String): Unit
}

object MDCNotchedOutlineAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    getHeight: () => Double,
    getIdleOutlineStyleValue: String => String,
    getWidth: () => Double,
    removeClass: String => Unit,
    setOutlinePathAttr: String => Unit
  ): MDCNotchedOutlineAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getHeight = js.Any.fromFunction0(getHeight), getIdleOutlineStyleValue = js.Any.fromFunction1(getIdleOutlineStyleValue), getWidth = js.Any.fromFunction0(getWidth), removeClass = js.Any.fromFunction1(removeClass), setOutlinePathAttr = js.Any.fromFunction1(setOutlinePathAttr))
    __obj.asInstanceOf[MDCNotchedOutlineAdapter]
  }
}

