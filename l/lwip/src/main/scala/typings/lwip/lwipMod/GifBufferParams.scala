package typings.lwip.lwipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GifBufferParams extends js.Object {
  var colors: js.UndefOr[Double] = js.undefined
  var interlaced: js.UndefOr[Boolean] = js.undefined
  var threshold: Double
  var transparency: js.UndefOr[Boolean | String] = js.undefined
}

object GifBufferParams {
  @scala.inline
  def apply(
    threshold: Double,
    colors: Int | Double = null,
    interlaced: js.UndefOr[Boolean] = js.undefined,
    transparency: Boolean | String = null
  ): GifBufferParams = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(interlaced)) __obj.updateDynamic("interlaced")(interlaced.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[GifBufferParams]
  }
}

