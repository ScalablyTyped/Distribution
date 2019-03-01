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
    addClass: js.Function1[java.lang.String, scala.Unit],
    hasClass: js.Function1[java.lang.String, scala.Boolean],
    removeAttr: js.Function1[java.lang.String, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    setAttr: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setContent: js.Function1[java.lang.String, scala.Unit]
  ): MDCTextFieldHelperTextAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(addClass)
    __obj.updateDynamic("hasClass")(hasClass)
    __obj.updateDynamic("removeAttr")(removeAttr)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.updateDynamic("setAttr")(setAttr)
    __obj.updateDynamic("setContent")(setContent)
    __obj.asInstanceOf[MDCTextFieldHelperTextAdapter]
  }
}

