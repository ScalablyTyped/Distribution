package typings.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentOptions extends js.Object {
  /** Execute only this test/experiment? (false) */
  var only: js.UndefOr[Boolean] = js.undefined
  /** Execute tests in parallel? (false) */
  var parallel: js.UndefOr[Boolean] = js.undefined
  /** Skip execution? (false) */
  var skip: js.UndefOr[Boolean] = js.undefined
  /** Set a specific timeout in milliseconds (2000) */
  var timeout: js.UndefOr[Double] = js.undefined
}

object ExperimentOptions {
  @scala.inline
  def apply(
    only: js.UndefOr[Boolean] = js.undefined,
    parallel: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): ExperimentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentOptions]
  }
}

