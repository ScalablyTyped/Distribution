package typings.hapiLab.mod.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions extends js.Object {
  /**
    * Sets all other experiments to skip.
    * 
    * @default false
    */
  val only: js.UndefOr[Boolean] = js.undefined
  /**
    * The expected number of assertions the test must execute.
    */
  val plan: js.UndefOr[Double] = js.undefined
  /**
    * Set the test to be retried a few times when it fails. Can be set to true to used the default number of retries or an exact number of maximum retries.
    *
    * @default false
    */
  val retry: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Sets the entire experiment content to be skipped during execution.
    * 
    * @default false
    */
  val skip: js.UndefOr[Boolean] = js.undefined
  /**
    * Overrides the default test timeout for tests and other timed operations in milliseconds.
    * 
    * @default 2000
    */
  val timeout: js.UndefOr[Double] = js.undefined
}

object TestOptions {
  @scala.inline
  def apply(
    only: js.UndefOr[Boolean] = js.undefined,
    plan: Int | Double = null,
    retry: Double | Boolean = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): TestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions]
  }
}

