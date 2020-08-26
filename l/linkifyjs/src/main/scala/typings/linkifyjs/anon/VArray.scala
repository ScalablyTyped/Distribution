package typings.linkifyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VArray extends js.Object {
  var v: js.Array[V] = js.native
}

object VArray {
  @scala.inline
  def apply(v: js.Array[V]): VArray = {
    val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[VArray]
  }
  @scala.inline
  implicit class VArrayOps[Self <: VArray] (val x: Self) extends AnyVal {
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
    def setVVarargs(value: V*): Self = this.set("v", js.Array(value :_*))
    @scala.inline
    def setV(value: js.Array[V]): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

