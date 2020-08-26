package typings.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancelable extends js.Object {
  def cancel(): Unit = js.native
  def flush(): Unit = js.native
}

object Cancelable {
  @scala.inline
  def apply(cancel: () => Unit, flush: () => Unit): Cancelable = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush))
    __obj.asInstanceOf[Cancelable]
  }
  @scala.inline
  implicit class CancelableOps[Self <: Cancelable] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
  }
  
}

