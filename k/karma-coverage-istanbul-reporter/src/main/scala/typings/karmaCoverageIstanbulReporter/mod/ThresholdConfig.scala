package typings.karmaCoverageIstanbulReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThresholdConfig extends js.Object {
  /** Thresholds per file. */
  val each: js.UndefOr[ThresholdsEach] = js.undefined
  /**
    * Set to `true` to not fail the test command when thresholds are not met.
    * @default false
    */
  val emitWarning: js.UndefOr[Boolean] = js.undefined
  /** Thresholds for all files. */
  val global: js.UndefOr[Threshold] = js.undefined
}

object ThresholdConfig {
  @scala.inline
  def apply(
    each: ThresholdsEach = null,
    emitWarning: js.UndefOr[Boolean] = js.undefined,
    global: Threshold = null
  ): ThresholdConfig = {
    val __obj = js.Dynamic.literal()
    if (each != null) __obj.updateDynamic("each")(each.asInstanceOf[js.Any])
    if (!js.isUndefined(emitWarning)) __obj.updateDynamic("emitWarning")(emitWarning.get.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThresholdConfig]
  }
}

