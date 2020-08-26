package typings.jug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VertexStructure extends js.Object {
  var data: VertexData = js.native
  var edge: js.Array[Vertex] = js.native
  var level: Double = js.native
  var parent: Vertex = js.native
}

object VertexStructure {
  @scala.inline
  def apply(data: VertexData, edge: js.Array[Vertex], level: Double, parent: Vertex): VertexStructure = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexStructure]
  }
  @scala.inline
  implicit class VertexStructureOps[Self <: VertexStructure] (val x: Self) extends AnyVal {
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
    def setData(value: VertexData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgeVarargs(value: Vertex*): Self = this.set("edge", js.Array(value :_*))
    @scala.inline
    def setEdge(value: js.Array[Vertex]): Self = this.set("edge", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Vertex): Self = this.set("parent", value.asInstanceOf[js.Any])
  }
  
}

