package typings.lwip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PngBufferParams extends js.Object {
  var compression: js.UndefOr[String] = js.undefined
  var interlaced: js.UndefOr[Boolean] = js.undefined
  var transparency: js.UndefOr[Boolean | String] = js.undefined
}

object PngBufferParams {
  @scala.inline
  def apply(
    compression: String = null,
    interlaced: js.UndefOr[Boolean] = js.undefined,
    transparency: Boolean | String = null
  ): PngBufferParams = {
    val __obj = js.Dynamic.literal()
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(interlaced)) __obj.updateDynamic("interlaced")(interlaced.get.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[PngBufferParams]
  }
}

