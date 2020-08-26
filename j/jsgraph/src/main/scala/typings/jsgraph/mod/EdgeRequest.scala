package typings.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeRequest extends js.Object {
  var e: Edge = js.native
  var p: js.Any = js.native
}

object EdgeRequest {
  @scala.inline
  def apply(e: Edge, p: js.Any): EdgeRequest = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeRequest]
  }
  @scala.inline
  implicit class EdgeRequestOps[Self <: EdgeRequest] (val x: Self) extends AnyVal {
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
    def setE(value: Edge): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def setP(value: js.Any): Self = this.set("p", value.asInstanceOf[js.Any])
  }
  
}

