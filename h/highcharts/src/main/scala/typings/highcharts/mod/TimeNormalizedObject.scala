package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeNormalizedObject extends js.Object {
  /**
    * The count.
    */
  var count: Double
  /**
    * The interval in axis values (ms).
    */
  var unitRange: Double
}

object TimeNormalizedObject {
  @scala.inline
  def apply(count: Double, unitRange: Double): TimeNormalizedObject = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], unitRange = unitRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeNormalizedObject]
  }
}

