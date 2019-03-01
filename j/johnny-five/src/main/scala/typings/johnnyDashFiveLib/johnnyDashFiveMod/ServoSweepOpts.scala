package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServoSweepOpts extends js.Object {
  var interval: js.UndefOr[scala.Double] = js.undefined
  var range: js.Array[scala.Double]
  var step: js.UndefOr[scala.Double] = js.undefined
}

object ServoSweepOpts {
  @scala.inline
  def apply(
    range: js.Array[scala.Double],
    interval: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null
  ): ServoSweepOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("range")(range)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoSweepOpts]
  }
}

