package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectSize extends js.Object {
  var `x-dimension`: js.UndefOr[Double] = js.undefined
  var `y-dimension`: js.UndefOr[Double] = js.undefined
  var `z-dimension`: js.UndefOr[Double] = js.undefined
}

object ObjectSize {
  @scala.inline
  def apply(
    `x-dimension`: js.UndefOr[Double] = js.undefined,
    `y-dimension`: js.UndefOr[Double] = js.undefined,
    `z-dimension`: js.UndefOr[Double] = js.undefined
  ): ObjectSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`x-dimension`)) __obj.updateDynamic("x-dimension")(`x-dimension`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`y-dimension`)) __obj.updateDynamic("y-dimension")(`y-dimension`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`z-dimension`)) __obj.updateDynamic("z-dimension")(`z-dimension`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSize]
  }
}

