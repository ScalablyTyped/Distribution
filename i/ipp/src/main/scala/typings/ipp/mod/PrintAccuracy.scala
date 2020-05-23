package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintAccuracy extends js.Object {
  var `accuracy-units`: js.UndefOr[AccuracyUnits] = js.undefined
  var `x-accuracy`: js.UndefOr[Double] = js.undefined
  var `y-accuracy`: js.UndefOr[Double] = js.undefined
  var `z-accuracy`: js.UndefOr[Double] = js.undefined
}

object PrintAccuracy {
  @scala.inline
  def apply(
    `accuracy-units`: AccuracyUnits = null,
    `x-accuracy`: js.UndefOr[Double] = js.undefined,
    `y-accuracy`: js.UndefOr[Double] = js.undefined,
    `z-accuracy`: js.UndefOr[Double] = js.undefined
  ): PrintAccuracy = {
    val __obj = js.Dynamic.literal()
    if (`accuracy-units` != null) __obj.updateDynamic("accuracy-units")(`accuracy-units`.asInstanceOf[js.Any])
    if (!js.isUndefined(`x-accuracy`)) __obj.updateDynamic("x-accuracy")(`x-accuracy`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`y-accuracy`)) __obj.updateDynamic("y-accuracy")(`y-accuracy`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`z-accuracy`)) __obj.updateDynamic("z-accuracy")(`z-accuracy`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintAccuracy]
  }
}

