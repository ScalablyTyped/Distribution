package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CA_ extends js.Object {
  var cA: Boolean = js.native
  var pathLen: Double = js.native
}

object CA_ {
  @scala.inline
  def apply(cA: Boolean, pathLen: Double): CA_ = {
    val __obj = js.Dynamic.literal(cA = cA.asInstanceOf[js.Any], pathLen = pathLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[CA_]
  }
  @scala.inline
  implicit class CA_Ops[Self <: CA_] (val x: Self) extends AnyVal {
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
    def setCA(value: Boolean): Self = this.set("cA", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathLen(value: Double): Self = this.set("pathLen", value.asInstanceOf[js.Any])
  }
  
}

