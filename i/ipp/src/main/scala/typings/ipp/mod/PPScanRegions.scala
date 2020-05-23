package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PPScanRegions extends js.Object {
  var `x-dimension`: js.UndefOr[Double] = js.undefined
  var `x-origin`: js.UndefOr[Double] = js.undefined
  var `y-dimension`: js.UndefOr[Double] = js.undefined
  var `y-origin`: js.UndefOr[Double] = js.undefined
}

object PPScanRegions {
  @scala.inline
  def apply(
    `x-dimension`: js.UndefOr[Double] = js.undefined,
    `x-origin`: js.UndefOr[Double] = js.undefined,
    `y-dimension`: js.UndefOr[Double] = js.undefined,
    `y-origin`: js.UndefOr[Double] = js.undefined
  ): PPScanRegions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`x-dimension`)) __obj.updateDynamic("x-dimension")(`x-dimension`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`x-origin`)) __obj.updateDynamic("x-origin")(`x-origin`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`y-dimension`)) __obj.updateDynamic("y-dimension")(`y-dimension`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`y-origin`)) __obj.updateDynamic("y-origin")(`y-origin`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PPScanRegions]
  }
}

