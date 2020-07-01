package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings to control how circular dependencies are resolved with iterative
  * calculation.
  */
@js.native
trait SchemaIterativeCalculationSettings extends js.Object {
  /**
    * When iterative calculation is enabled and successive results differ by
    * less than this threshold value, the calculation rounds stop.
    */
  var convergenceThreshold: js.UndefOr[Double] = js.native
  /**
    * When iterative calculation is enabled, the maximum number of calculation
    * rounds to perform.
    */
  var maxIterations: js.UndefOr[Double] = js.native
}

object SchemaIterativeCalculationSettings {
  @scala.inline
  def apply(
    convergenceThreshold: js.UndefOr[Double] = js.undefined,
    maxIterations: js.UndefOr[Double] = js.undefined
  ): SchemaIterativeCalculationSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convergenceThreshold)) __obj.updateDynamic("convergenceThreshold")(convergenceThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIterations)) __obj.updateDynamic("maxIterations")(maxIterations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIterativeCalculationSettings]
  }
}

