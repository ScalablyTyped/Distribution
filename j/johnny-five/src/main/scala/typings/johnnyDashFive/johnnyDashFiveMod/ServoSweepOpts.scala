package typings.johnnyDashFive.johnnyDashFiveMod

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
  def apply(range: js.Array[Double], interval: Int | Double = null, step: Int | Double = null): ServoSweepOpts = {
    val __obj = js.Dynamic.literal(range = range)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoSweepOpts]
  }
}

