package typings.materialSelect.helperTextAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSelectHelperTextAdapter extends js.Object {
  /**
    * Adds a class to the helper text element.
    */
  def addClass(className: String): Unit = js.native
  /**
    * Returns whether or not the helper text element contains the given class.
    */
  def hasClass(className: String): Boolean = js.native
  /**
    * Removes an attribute from the helper text element.
    */
  def removeAttr(attr: String): Unit = js.native
  /**
    * Removes a class from the helper text element.
    */
  def removeClass(className: String): Unit = js.native
  /**
    * Sets an attribute with a given value on the helper text element.
    */
  def setAttr(attr: String, value: String): Unit = js.native
  /**
    * Sets the text content for the helper text element.
    */
  def setContent(content: String): Unit = js.native
}

object MDCSelectHelperTextAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    hasClass: String => Boolean,
    removeAttr: String => Unit,
    removeClass: String => Unit,
    setAttr: (String, String) => Unit,
    setContent: String => Unit
  ): MDCSelectHelperTextAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), hasClass = js.Any.fromFunction1(hasClass), removeAttr = js.Any.fromFunction1(removeAttr), removeClass = js.Any.fromFunction1(removeClass), setAttr = js.Any.fromFunction2(setAttr), setContent = js.Any.fromFunction1(setContent))
    __obj.asInstanceOf[MDCSelectHelperTextAdapter]
  }
  @scala.inline
  implicit class MDCSelectHelperTextAdapterOps[Self <: MDCSelectHelperTextAdapter] (val x: Self) extends AnyVal {
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
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveAttr(value: String => Unit): Self = this.set("removeAttr", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAttr(value: (String, String) => Unit): Self = this.set("setAttr", js.Any.fromFunction2(value))
    @scala.inline
    def setSetContent(value: String => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
  }
  
}

