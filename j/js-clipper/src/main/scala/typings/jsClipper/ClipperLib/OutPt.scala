package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutPt extends js.Object {
  var idx: Double
  var next: OutPt
  var prev: OutPt
  var pt: OutPt
}

object OutPt {
  @scala.inline
  def apply(idx: Double, next: OutPt, prev: OutPt, pt: OutPt): OutPt = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutPt]
  }
}

