package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashContour extends js.Object {
  var fill: FlashFill
  var interior: Boolean
  var orientation: Double
  def getHalfEdge(): FlashHalfEdge
}

object FlashContour {
  @scala.inline
  def apply(fill: FlashFill, getHalfEdge: () => FlashHalfEdge, interior: Boolean, orientation: Double): FlashContour = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], getHalfEdge = js.Any.fromFunction0(getHalfEdge), interior = interior.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlashContour]
  }
}

