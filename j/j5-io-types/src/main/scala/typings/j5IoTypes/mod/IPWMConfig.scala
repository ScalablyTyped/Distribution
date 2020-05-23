package typings.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPWMConfig extends js.Object {
  var frequency: js.UndefOr[Double] = js.undefined
  var pin: Double | String
  var range: js.UndefOr[Double] = js.undefined
}

object IPWMConfig {
  @scala.inline
  def apply(
    pin: Double | String,
    frequency: js.UndefOr[Double] = js.undefined,
    range: js.UndefOr[Double] = js.undefined
  ): IPWMConfig = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPWMConfig]
  }
}

