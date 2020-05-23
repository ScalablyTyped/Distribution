package typings.long.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait High extends js.Object {
  var high: Double
  var low: Double
  var unsigned: Boolean
}

object High {
  @scala.inline
  def apply(high: Double, low: Double, unsigned: Boolean): High = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any])
    __obj.asInstanceOf[High]
  }
}

