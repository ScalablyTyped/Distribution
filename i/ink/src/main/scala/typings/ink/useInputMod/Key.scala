package typings.ink.useInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  /**
    * Backspace key was pressed.
    */
  var backspace: Boolean = js.native
  /**
    * Ctrl key was pressed.
    */
  var ctrl: Boolean = js.native
  /**
    * Delete key was pressed.
    */
  var delete: Boolean = js.native
  /**
    * Down arrow key was pressed.
    */
  var downArrow: Boolean = js.native
  /**
    * Escape key was pressed.
    */
  var escape: Boolean = js.native
  /**
    * Left arrow key was pressed.
    */
  var leftArrow: Boolean = js.native
  /**
    * [Meta key](https://en.wikipedia.org/wiki/Meta_key) was pressed.
    */
  var meta: Boolean = js.native
  /**
    * Page Down key was pressed.
    */
  var pageDown: Boolean = js.native
  /**
    * Page Up key was pressed.
    */
  var pageUp: Boolean = js.native
  /**
    * Return (Enter) key was pressed.
    */
  var `return`: Boolean = js.native
  /**
    * Right arrow key was pressed.
    */
  var rightArrow: Boolean = js.native
  /**
    * Shift key was pressed.
    */
  var shift: Boolean = js.native
  /**
    * Tab key was pressed.
    */
  var tab: Boolean = js.native
  /**
    * Up arrow key was pressed.
    */
  var upArrow: Boolean = js.native
}

object Key {
  @scala.inline
  def apply(
    backspace: Boolean,
    ctrl: Boolean,
    delete: Boolean,
    downArrow: Boolean,
    escape: Boolean,
    leftArrow: Boolean,
    meta: Boolean,
    pageDown: Boolean,
    pageUp: Boolean,
    `return`: Boolean,
    rightArrow: Boolean,
    shift: Boolean,
    tab: Boolean,
    upArrow: Boolean
  ): Key = {
    val __obj = js.Dynamic.literal(backspace = backspace.asInstanceOf[js.Any], ctrl = ctrl.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], downArrow = downArrow.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], leftArrow = leftArrow.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pageDown = pageDown.asInstanceOf[js.Any], pageUp = pageUp.asInstanceOf[js.Any], rightArrow = rightArrow.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], upArrow = upArrow.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
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
    def setBackspace(value: Boolean): Self = this.set("backspace", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtrl(value: Boolean): Self = this.set("ctrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: Boolean): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownArrow(value: Boolean): Self = this.set("downArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscape(value: Boolean): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftArrow(value: Boolean): Self = this.set("leftArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: Boolean): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDown(value: Boolean): Self = this.set("pageDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageUp(value: Boolean): Self = this.set("pageUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturn(value: Boolean): Self = this.set("return", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightArrow(value: Boolean): Self = this.set("rightArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift(value: Boolean): Self = this.set("shift", value.asInstanceOf[js.Any])
    @scala.inline
    def setTab(value: Boolean): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpArrow(value: Boolean): Self = this.set("upArrow", value.asInstanceOf[js.Any])
  }
  
}

