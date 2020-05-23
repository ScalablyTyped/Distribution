package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServoSweepOpts extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  var range: js.Array[Double]
  var step: js.UndefOr[Double] = js.undefined
}

object ServoSweepOpts {
  @scala.inline
  def apply(
    range: js.Array[Double],
    interval: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined
  ): ServoSweepOpts = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoSweepOpts]
  }
}

