package typings
package atHapiLabLib.atHapiLabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentOptions extends js.Object {
  /** Execute only this test/experiment? (false) */
  var only: js.UndefOr[scala.Boolean] = js.undefined
  /** Execute tests in parallel? (false) */
  var parallel: js.UndefOr[scala.Boolean] = js.undefined
  /** Skip execution? (false) */
  var skip: js.UndefOr[scala.Boolean] = js.undefined
  /** Set a specific timeout in milliseconds (2000) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ExperimentOptions {
  @scala.inline
  def apply(
    only: js.UndefOr[scala.Boolean] = js.undefined,
    parallel: js.UndefOr[scala.Boolean] = js.undefined,
    skip: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): ExperimentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only)
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel)
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentOptions]
  }
}

