package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofcallControl extends js.Object {
  def call_control(): Double = js.native
}

object TypeofcallControl {
  @scala.inline
  def apply(call_control: () => Double): TypeofcallControl = {
    val __obj = js.Dynamic.literal(call_control = js.Any.fromFunction0(call_control))
    __obj.asInstanceOf[TypeofcallControl]
  }
  @scala.inline
  implicit class TypeofcallControlOps[Self <: TypeofcallControl] (val x: Self) extends AnyVal {
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
    def setCall_control(value: () => Double): Self = this.set("call_control", js.Any.fromFunction0(value))
  }
  
}

