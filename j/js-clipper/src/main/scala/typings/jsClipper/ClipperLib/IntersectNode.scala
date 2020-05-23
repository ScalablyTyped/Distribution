package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectNode extends js.Object {
  var edge1: TEdge
  var edge2: TEdge
  var next: TEdge
  var pt: TEdge
}

object IntersectNode {
  @scala.inline
  def apply(edge1: TEdge, edge2: TEdge, next: TEdge, pt: TEdge): IntersectNode = {
    val __obj = js.Dynamic.literal(edge1 = edge1.asInstanceOf[js.Any], edge2 = edge2.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectNode]
  }
}

