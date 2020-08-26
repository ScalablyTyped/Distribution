package typings.materialCheckbox.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCCheckboxAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def forceLayout(): Unit = js.native
  def hasNativeControl(): Boolean = js.native
  def isAttachedToDOM(): Boolean = js.native
  def isChecked(): Boolean = js.native
  def isIndeterminate(): Boolean = js.native
  def removeClass(className: String): Unit = js.native
  def removeNativeControlAttr(attr: String): Unit = js.native
  def setNativeControlAttr(attr: String, value: String): Unit = js.native
  def setNativeControlDisabled(disabled: Boolean): Unit = js.native
}

object MDCCheckboxAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    forceLayout: () => Unit,
    hasNativeControl: () => Boolean,
    isAttachedToDOM: () => Boolean,
    isChecked: () => Boolean,
    isIndeterminate: () => Boolean,
    removeClass: String => Unit,
    removeNativeControlAttr: String => Unit,
    setNativeControlAttr: (String, String) => Unit,
    setNativeControlDisabled: Boolean => Unit
  ): MDCCheckboxAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), forceLayout = js.Any.fromFunction0(forceLayout), hasNativeControl = js.Any.fromFunction0(hasNativeControl), isAttachedToDOM = js.Any.fromFunction0(isAttachedToDOM), isChecked = js.Any.fromFunction0(isChecked), isIndeterminate = js.Any.fromFunction0(isIndeterminate), removeClass = js.Any.fromFunction1(removeClass), removeNativeControlAttr = js.Any.fromFunction1(removeNativeControlAttr), setNativeControlAttr = js.Any.fromFunction2(setNativeControlAttr), setNativeControlDisabled = js.Any.fromFunction1(setNativeControlDisabled))
    __obj.asInstanceOf[MDCCheckboxAdapter]
  }
  @scala.inline
  implicit class MDCCheckboxAdapterOps[Self <: MDCCheckboxAdapter] (val x: Self) extends AnyVal {
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
    def setForceLayout(value: () => Unit): Self = this.set("forceLayout", js.Any.fromFunction0(value))
    @scala.inline
    def setHasNativeControl(value: () => Boolean): Self = this.set("hasNativeControl", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAttachedToDOM(value: () => Boolean): Self = this.set("isAttachedToDOM", js.Any.fromFunction0(value))
    @scala.inline
    def setIsChecked(value: () => Boolean): Self = this.set("isChecked", js.Any.fromFunction0(value))
    @scala.inline
    def setIsIndeterminate(value: () => Boolean): Self = this.set("isIndeterminate", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveNativeControlAttr(value: String => Unit): Self = this.set("removeNativeControlAttr", js.Any.fromFunction1(value))
    @scala.inline
    def setSetNativeControlAttr(value: (String, String) => Unit): Self = this.set("setNativeControlAttr", js.Any.fromFunction2(value))
    @scala.inline
    def setSetNativeControlDisabled(value: Boolean => Unit): Self = this.set("setNativeControlDisabled", js.Any.fromFunction1(value))
  }
  
}

