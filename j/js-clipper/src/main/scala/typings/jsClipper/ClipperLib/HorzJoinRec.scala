package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorzJoinRec extends js.Object {
  var edge: TEdge
  var savedIdx: Double
}

object HorzJoinRec {
  @scala.inline
  def apply(edge: TEdge, savedIdx: Double): HorzJoinRec = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], savedIdx = savedIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorzJoinRec]
  }
}

