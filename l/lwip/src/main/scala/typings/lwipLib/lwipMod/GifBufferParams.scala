package typings
package lwipLib.lwipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GifBufferParams extends js.Object {
  var colors: js.UndefOr[scala.Double] = js.undefined
  var interlaced: js.UndefOr[scala.Boolean] = js.undefined
  var threshold: scala.Double
  var transparency: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object GifBufferParams {
  @scala.inline
  def apply(
    threshold: scala.Double,
    colors: scala.Int | scala.Double = null,
    interlaced: js.UndefOr[scala.Boolean] = js.undefined,
    transparency: scala.Boolean | java.lang.String = null
  ): GifBufferParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("threshold")(threshold)
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(interlaced)) __obj.updateDynamic("interlaced")(interlaced)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[GifBufferParams]
  }
}

