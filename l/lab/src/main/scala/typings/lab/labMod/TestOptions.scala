package typings.lab.labMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions extends ExperimentOptions {
  /** The expected number of assertions to execute */
  var plan: js.UndefOr[Double] = js.undefined
}

object TestOptions {
  @scala.inline
  def apply(
    only: js.UndefOr[Boolean] = js.undefined,
    parallel: js.UndefOr[Boolean] = js.undefined,
    plan: Int | Double = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): TestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only)
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel)
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions]
  }
}

