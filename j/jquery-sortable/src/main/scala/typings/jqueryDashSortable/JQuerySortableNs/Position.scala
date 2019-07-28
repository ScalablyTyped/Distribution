package typings.jqueryDashSortable.JQuerySortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var left: Double
  var top: Double
}

object Position {
  @scala.inline
  def apply(left: Double, top: Double): Position = {
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[Position]
  }
}

