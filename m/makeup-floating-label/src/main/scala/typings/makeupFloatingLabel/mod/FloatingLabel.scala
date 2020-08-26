package typings.makeupFloatingLabel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloatingLabel extends js.Object {
  def refresh(): Unit = js.native
}

object FloatingLabel {
  @scala.inline
  def apply(refresh: () => Unit): FloatingLabel = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[FloatingLabel]
  }
  @scala.inline
  implicit class FloatingLabelOps[Self <: FloatingLabel] (val x: Self) extends AnyVal {
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
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
  }
  
}

