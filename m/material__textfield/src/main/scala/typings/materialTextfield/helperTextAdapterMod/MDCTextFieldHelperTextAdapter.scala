package typings.materialTextfield.helperTextAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTextFieldHelperTextAdapter extends js.Object {
  /**
    * Adds a class to the helper text element.
    */
  def addClass(className: String): Unit
  /**
    * Returns whether or not the helper text element contains the given class.
    */
  def hasClass(className: String): Boolean
  /**
    * Removes an attribute from the helper text element.
    */
  def removeAttr(attr: String): Unit
  /**
    * Removes a class from the helper text element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets an attribute with a given value on the helper text element.
    */
  def setAttr(attr: String, value: String): Unit
  /**
    * Sets the text content for the helper text element.
    */
  def setContent(content: String): Unit
}

object MDCTextFieldHelperTextAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    hasClass: String => Boolean,
    removeAttr: String => Unit,
    removeClass: String => Unit,
    setAttr: (String, String) => Unit,
    setContent: String => Unit
  ): MDCTextFieldHelperTextAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), hasClass = js.Any.fromFunction1(hasClass), removeAttr = js.Any.fromFunction1(removeAttr), removeClass = js.Any.fromFunction1(removeClass), setAttr = js.Any.fromFunction2(setAttr), setContent = js.Any.fromFunction1(setContent))
  
    __obj.asInstanceOf[MDCTextFieldHelperTextAdapter]
  }
}

