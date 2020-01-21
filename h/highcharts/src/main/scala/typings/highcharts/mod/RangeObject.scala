package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeObject extends js.Object {
  /**
    * Maximum number of the range.
    */
  var max: Double
  /**
    * Minimum number of the range.
    */
  var min: Double
}

object RangeObject {
  @scala.inline
  def apply(max: Double, min: Double): RangeObject = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeObject]
  }
}

