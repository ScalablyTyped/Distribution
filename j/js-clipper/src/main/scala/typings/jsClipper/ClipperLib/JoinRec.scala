package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinRec extends js.Object {
  var poly1Idx: Double
  var poly2Idx: Double
  var pt1a: IntPoint
  var pt1b: IntPoint
  var pt2a: IntPoint
  var pt2b: IntPoint
}

object JoinRec {
  @scala.inline
  def apply(poly1Idx: Double, poly2Idx: Double, pt1a: IntPoint, pt1b: IntPoint, pt2a: IntPoint, pt2b: IntPoint): JoinRec = {
    val __obj = js.Dynamic.literal(poly1Idx = poly1Idx.asInstanceOf[js.Any], poly2Idx = poly2Idx.asInstanceOf[js.Any], pt1a = pt1a.asInstanceOf[js.Any], pt1b = pt1b.asInstanceOf[js.Any], pt2a = pt2a.asInstanceOf[js.Any], pt2b = pt2b.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinRec]
  }
}

