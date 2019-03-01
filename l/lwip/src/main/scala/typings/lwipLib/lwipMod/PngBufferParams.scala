package typings
package lwipLib.lwipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PngBufferParams extends js.Object {
  var compression: js.UndefOr[java.lang.String] = js.undefined
  var interlaced: js.UndefOr[scala.Boolean] = js.undefined
  var transparency: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object PngBufferParams {
  @scala.inline
  def apply(
    compression: java.lang.String = null,
    interlaced: js.UndefOr[scala.Boolean] = js.undefined,
    transparency: scala.Boolean | java.lang.String = null
  ): PngBufferParams = {
    val __obj = js.Dynamic.literal()
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (!js.isUndefined(interlaced)) __obj.updateDynamic("interlaced")(interlaced)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[PngBufferParams]
  }
}

