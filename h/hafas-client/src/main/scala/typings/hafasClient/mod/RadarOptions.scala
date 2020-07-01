package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadarOptions extends js.Object {
  /**
    * compute frames for the next n seconds
    * @default 20
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * maximum number of vehicles
    * @default 256
    */
  var results: js.UndefOr[Double] = js.undefined
}

object RadarOptions {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined, results: js.UndefOr[Double] = js.undefined): RadarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarOptions]
  }
}

