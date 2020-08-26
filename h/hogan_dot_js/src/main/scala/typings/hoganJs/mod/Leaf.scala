package typings.hoganJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Leaf extends Token {
  var end: Double = js.native
  var nodes: js.Array[Token] = js.native
}

object Leaf {
  @scala.inline
  def apply(end: Double, nodes: js.Array[Token], tag: String): Leaf = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leaf]
  }
  @scala.inline
  implicit class LeafOps[Self <: Leaf] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: Token*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[Token]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
  
}

