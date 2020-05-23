package typings.lwip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JpegBufferParams extends js.Object {
  var quality: js.UndefOr[Double] = js.undefined
}

object JpegBufferParams {
  @scala.inline
  def apply(quality: js.UndefOr[Double] = js.undefined): JpegBufferParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JpegBufferParams]
  }
}

