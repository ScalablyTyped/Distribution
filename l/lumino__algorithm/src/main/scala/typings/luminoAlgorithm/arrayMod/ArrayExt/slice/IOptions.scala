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
  def apply(start: Int | Double = null, step: Int | Double = null, stop: Int | Double = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

