package typings
package atMaterialTextfieldLib.helperDashTextAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTextFieldHelperTextAdapter extends js.Object {
  /**
    * Adds a class to the helper text element.
    */
  def addClass(className: java.lang.String): scala.Unit
  /**
    * Returns whether or not the helper text element contains the given class.
    */
  def hasClass(className: java.lang.String): scala.Boolean
  /**
    * Removes an attribute from the helper text element.
    */
  def removeAttr(attr: java.lang.String): scala.Unit
  /**
    * Removes a class from the helper text element.
    */
  def removeClass(className: java.lang.String): scala.Unit
  /**
    * Sets an attribute with a given value on the helper text element.
    */
  def setAttr(attr: java.lang.String, value: java.lang.String): scala.Unit
  /**
    * Sets the text content for the helper text element.
    */
  def setContent(content: java.lang.String): scala.Unit
}

object MDCTextFieldHelperTextAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    hasClass: java.lang.String => scala.Boolean,
    removeAttr: java.lang.String => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    setAttr: (java.lang.String, java.lang.String) => scala.Unit,
    setContent: java.lang.String => scala.Unit
  ): MDCTextFieldHelperTextAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), hasClass = js.Any.fromFunction1(hasClass), removeAttr = js.Any.fromFunction1(removeAttr), removeClass = js.Any.fromFunction1(removeClass), setAttr = js.Any.fromFunction2(setAttr), setContent = js.Any.fromFunction1(setContent))
  
    __obj.asInstanceOf[MDCTextFieldHelperTextAdapter]
  }
}

