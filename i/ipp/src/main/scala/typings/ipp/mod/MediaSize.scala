package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaSize extends js.Object {
  var `x-dimension`: js.UndefOr[Double] = js.undefined
  var `y-dimension`: js.UndefOr[Double] = js.undefined
}

object MediaSize {
  @scala.inline
  def apply(`x-dimension`: js.UndefOr[Double] = js.undefined, `y-dimension`: js.UndefOr[Double] = js.undefined): MediaSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`x-dimension`)) __obj.updateDynamic("x-dimension")(`x-dimension`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`y-dimension`)) __obj.updateDynamic("y-dimension")(`y-dimension`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSize]
  }
}

