package typings.materializeCss.commonMod.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Openable extends js.Object {
  var isOpen: Boolean = js.native
  def close(): Unit = js.native
  def open(): Unit = js.native
}

object Openable {
  @scala.inline
  def apply(close: () => Unit, isOpen: Boolean, open: () => Unit): Openable = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Openable]
  }
  @scala.inline
  implicit class OpenableOps[Self <: Openable] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
  }
  
}

