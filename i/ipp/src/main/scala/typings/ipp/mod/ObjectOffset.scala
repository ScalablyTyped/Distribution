package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectOffset extends js.Object {
  var `x-offset`: js.UndefOr[Double] = js.undefined
  var `y-offset`: js.UndefOr[Double] = js.undefined
  var `z-offset`: js.UndefOr[Double] = js.undefined
}

object ObjectOffset {
  @scala.inline
  def apply(
    `x-offset`: js.UndefOr[Double] = js.undefined,
    `y-offset`: js.UndefOr[Double] = js.undefined,
    `z-offset`: js.UndefOr[Double] = js.undefined
  ): ObjectOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`x-offset`)) __obj.updateDynamic("x-offset")(`x-offset`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`y-offset`)) __obj.updateDynamic("y-offset")(`y-offset`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`z-offset`)) __obj.updateDynamic("z-offset")(`z-offset`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOffset]
  }
}

