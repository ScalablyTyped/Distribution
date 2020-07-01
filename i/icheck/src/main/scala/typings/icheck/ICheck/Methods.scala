package typings.icheck.ICheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /**
    * change input's state to 'checked'
    */
  def check(): Unit
  /**
    * remove all traces of iCheck
    */
  def destroy(): Unit
  /**
    * remove 'indeterminate' state
    */
  def determinate(): Unit
  /**
    * change input's state to 'disabled'
    */
  def disable(): Unit
  /**
    * remove 'disabled' state
    */
  def enable(): Unit
  /**
    * change input's state to 'indeterminate'
    */
  def indeterminate(): Unit
  /**
    * toggle 'checked' state
    */
  def toggle(): Unit
  /**
    * remove 'checked' state
    */
  def uncheck(): Unit
  /**
    * apply input changes, which were done outside the plugin
    */
  def update(): Unit
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
}

