package typings.long

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHigh extends js.Object {
  var high: Double
  var low: Double
  var unsigned: Boolean
}

object AnonHigh {
  @scala.inline
  def apply(high: Double, low: Double, unsigned: Boolean): AnonHigh = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHigh]
  }
}

