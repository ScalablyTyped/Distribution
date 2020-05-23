package typings.luminoAlgorithm.arrayMod.ArrayExt.slice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `slice` function.
  */
trait IOptions extends js.Object {
  /**
    * The starting index of the slice, inclusive.
    *
    * Negative values are taken as an offset from the end
    * of the array.
    *
    * The default is `0` if `step > 0` else `n - 1`.
    */
  var start: js.UndefOr[Double] = js.undefined
  /**
    * The step value for the slice.
    *
    * This must not be `0`.
    *
    * The default is `1`.
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * The stopping index of the slice, exclusive.
    *
    * Negative values are taken as an offset from the end
    * of the array.
    *
    * The default is `n` if `step > 0` else `-n - 1`.
    */
  var stop: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    start: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    stop: js.UndefOr[Double] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stop)) __obj.updateDynamic("stop")(stop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

