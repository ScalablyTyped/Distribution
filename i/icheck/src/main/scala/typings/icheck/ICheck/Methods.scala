package typings.icheck.ICheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  /**
    * change input's state to 'checked'
    */
  def check(): Unit = js.native
  /**
    * remove all traces of iCheck
    */
  def destroy(): Unit = js.native
  /**
    * remove 'indeterminate' state
    */
  def determinate(): Unit = js.native
  /**
    * change input's state to 'disabled'
    */
  def disable(): Unit = js.native
  /**
    * remove 'disabled' state
    */
  def enable(): Unit = js.native
  /**
    * change input's state to 'indeterminate'
    */
  def indeterminate(): Unit = js.native
  /**
    * toggle 'checked' state
    */
  def toggle(): Unit = js.native
  /**
    * remove 'checked' state
    */
  def uncheck(): Unit = js.native
  /**
    * apply input changes, which were done outside the plugin
    */
  def update(): Unit = js.native
}

object Methods {
  @scala.inline
  def apply(
    check: () => Unit,
    destroy: () => Unit,
    determinate: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    indeterminate: () => Unit,
    toggle: () => Unit,
    uncheck: () => Unit,
    update: () => Unit
  ): Methods = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), destroy = js.Any.fromFunction0(destroy), determinate = js.Any.fromFunction0(determinate), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), indeterminate = js.Any.fromFunction0(indeterminate), toggle = js.Any.fromFunction0(toggle), uncheck = js.Any.fromFunction0(uncheck), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Methods]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
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
    def setCheck(value: () => Unit): Self = this.set("check", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDeterminate(value: () => Unit): Self = this.set("determinate", js.Any.fromFunction0(value))
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setIndeterminate(value: () => Unit): Self = this.set("indeterminate", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    @scala.inline
    def setUncheck(value: () => Unit): Self = this.set("uncheck", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

