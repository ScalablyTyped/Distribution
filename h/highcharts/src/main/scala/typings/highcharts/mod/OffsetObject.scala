package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetObject extends js.Object {
  /**
    * Left distance to the page border.
    */
  var left: Double
  /**
    * Top distance to the page border.
    */
  var top: Double
}

object OffsetObject {
  @scala.inline
  def apply(left: Double, top: Double): OffsetObject = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetObject]
  }
}

