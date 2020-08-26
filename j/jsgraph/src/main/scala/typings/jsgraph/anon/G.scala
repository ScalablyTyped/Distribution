package typings.jsgraph.anon

import typings.jsgraph.mod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait G extends js.Object {
  var g: DirectedGraph = js.native
  var u: String = js.native
}

object G {
  @scala.inline
  def apply(g: DirectedGraph, u: String): G = {
    val __obj = js.Dynamic.literal(g = g.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
    __obj.asInstanceOf[G]
  }
  @scala.inline
  implicit class GOps[Self <: G] (val x: Self) extends AnyVal {
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
    def setG(value: DirectedGraph): Self = this.set("g", value.asInstanceOf[js.Any])
    @scala.inline
    def setU(value: String): Self = this.set("u", value.asInstanceOf[js.Any])
  }
  
}

