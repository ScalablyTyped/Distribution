package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpua extends js.Object {
  def pua_set_publish(): Double = js.native
  def pua_update_contact(): Double = js.native
}

object Typeofpua {
  @scala.inline
  def apply(pua_set_publish: () => Double, pua_update_contact: () => Double): Typeofpua = {
    val __obj = js.Dynamic.literal(pua_set_publish = js.Any.fromFunction0(pua_set_publish), pua_update_contact = js.Any.fromFunction0(pua_update_contact))
    __obj.asInstanceOf[Typeofpua]
  }
  @scala.inline
  implicit class TypeofpuaOps[Self <: Typeofpua] (val x: Self) extends AnyVal {
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
    def setPua_set_publish(value: () => Double): Self = this.set("pua_set_publish", js.Any.fromFunction0(value))
    @scala.inline
    def setPua_update_contact(value: () => Double): Self = this.set("pua_update_contact", js.Any.fromFunction0(value))
  }
  
}

