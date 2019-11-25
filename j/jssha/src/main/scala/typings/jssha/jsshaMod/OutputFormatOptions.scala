package typings.jssha.jsshaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFormatOptions extends js.Object {
  var b64Pad: js.UndefOr[String] = js.undefined
  var outputUpper: js.UndefOr[Boolean] = js.undefined
  var shakeLen: js.UndefOr[Double] = js.undefined
}

object OutputFormatOptions {
  @scala.inline
  def apply(
    b64Pad: String = null,
    outputUpper: js.UndefOr[Boolean] = js.undefined,
    shakeLen: Int | Double = null
  ): OutputFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (b64Pad != null) __obj.updateDynamic("b64Pad")(b64Pad.asInstanceOf[js.Any])
    if (!js.isUndefined(outputUpper)) __obj.updateDynamic("outputUpper")(outputUpper.asInstanceOf[js.Any])
    if (shakeLen != null) __obj.updateDynamic("shakeLen")(shakeLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFormatOptions]
  }
}

