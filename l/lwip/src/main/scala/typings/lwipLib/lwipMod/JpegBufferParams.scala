package typings
package lwipLib.lwipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JpegBufferParams extends js.Object {
  var quality: js.UndefOr[scala.Double] = js.undefined
}

object JpegBufferParams {
  @scala.inline
  def apply(quality: scala.Int | scala.Double = null): JpegBufferParams = {
    val __obj = js.Dynamic.literal()
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[JpegBufferParams]
  }
}

