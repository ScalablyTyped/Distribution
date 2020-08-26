package typings.jsgraph.anon

import typings.jsgraph.mod.DirectedGraph
import typings.jsgraph.mod.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait E extends js.Object {
  var e: Edge = js.native
  var g: DirectedGraph = js.native
}

object E {
  @scala.inline
  def apply(e: Edge, g: DirectedGraph): E = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
  @scala.inline
  implicit class EOps[Self <: E] (val x: Self) extends AnyVal {
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
    def setG(value: DirectedGraph): Self = this.set("g", value.asInstanceOf[js.Any])
  }
  
}

