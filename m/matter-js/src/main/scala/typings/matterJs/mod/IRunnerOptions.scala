package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRunnerOptions extends js.Object {
  /**
    * A `Number` that specifies the time step between updates in milliseconds.
    * If `engine.timing.isFixed` is set to `true`, then `delta` is fixed.
    * If it is `false`, then `delta` can dynamically change to maintain the correct apparent simulation speed.
    *
    * @property delta
    * @type number
    * @default 1000 / 60
    */
  var delta: js.UndefOr[Double] = js.undefined
  /**
    * A flag that specifies whether the runner is running or not.
    * @property enabled
    * @type boolean
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A `Boolean` that specifies if the runner should use a fixed timestep (otherwise it is variable).
    * If timing is fixed, then the apparent simulation speed will change depending on the frame rate (but behaviour will be deterministic).
    * If the timing is variable, then the apparent simulation speed will be constant (approximately, but at the cost of determininism).
    *
    * @property isFixed
    * @type boolean
    * @default false
    */
  var isFixed: js.UndefOr[Boolean] = js.undefined
}

object IRunnerOptions {
  @scala.inline
  def apply(
    delta: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    isFixed: js.UndefOr[Boolean] = js.undefined
  ): IRunnerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delta)) __obj.updateDynamic("delta")(delta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFixed)) __obj.updateDynamic("isFixed")(isFixed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRunnerOptions]
  }
}

