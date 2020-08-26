package typings.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge extends js.Object {
  var u: String = js.native
  var v: String = js.native
}

object Edge {
  @scala.inline
  def apply(u: String, v: String): Edge = {
    val __obj = js.Dynamic.literal(u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
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
    def setU(value: String): Self = this.set("u", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

