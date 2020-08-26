package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectNode extends js.Object {
  var edge1: TEdge = js.native
  var edge2: TEdge = js.native
  var next: TEdge = js.native
  var pt: TEdge = js.native
}

object IntersectNode {
  @scala.inline
  def apply(edge1: TEdge, edge2: TEdge, next: TEdge, pt: TEdge): IntersectNode = {
    val __obj = js.Dynamic.literal(edge1 = edge1.asInstanceOf[js.Any], edge2 = edge2.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectNode]
  }
  @scala.inline
  implicit class IntersectNodeOps[Self <: IntersectNode] (val x: Self) extends AnyVal {
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
    def setEdge1(value: TEdge): Self = this.set("edge1", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdge2(value: TEdge): Self = this.set("edge2", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: TEdge): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setPt(value: TEdge): Self = this.set("pt", value.asInstanceOf[js.Any])
  }
  
}

