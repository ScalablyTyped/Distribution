package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutRec extends js.Object {
  var AppendLink: OutRec
  var FirstLeft: TEdge
  var bottomPt: OutPt
  var idx: Double
  var isHole: Boolean
  var pts: OutPt
}

object OutRec {
  @scala.inline
  def apply(AppendLink: OutRec, FirstLeft: TEdge, bottomPt: OutPt, idx: Double, isHole: Boolean, pts: OutPt): OutRec = {
    val __obj = js.Dynamic.literal(AppendLink = AppendLink.asInstanceOf[js.Any], FirstLeft = FirstLeft.asInstanceOf[js.Any], bottomPt = bottomPt.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], isHole = isHole.asInstanceOf[js.Any], pts = pts.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutRec]
  }
}

