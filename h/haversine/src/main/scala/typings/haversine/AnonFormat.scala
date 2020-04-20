package typings.haversine

import typings.haversine.haversineStrings.`[latCommalon]`
import typings.haversine.haversineStrings.`[lonCommalat]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: `[latCommalon]` | `[lonCommalat]`
}

object AnonFormat {
  @scala.inline
  def apply(format: `[latCommalon]` | `[lonCommalat]`): AnonFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat]
  }
}

